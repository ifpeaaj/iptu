package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcularServlet")

public class CalcularIPTUServlet extends HttpServlet {
	private static final long serialVersionUID = -1859137075195215814L;
	
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String imovel = request.getParameter("imovel");
		String baseCalculo = request.getParameter("baseCalculo");
		double baseC =  Double.parseDouble(baseCalculo);
		String valorDesc = request.getParameter("valorDesc");
		double valorD =  Double.parseDouble(valorDesc);
		double valorFinal=0;
		

		if(imovel.equals("Residencial")){
		
		if(baseC <= 95450){
			valorFinal = (baseC*0.6/100)-valorD;
			
			
		}else
			
			if(baseC > 95450 && baseC <= 238626){
				
				double valorFaixa1 = 95450*0.6/100;
				double sobra6 = baseC-95450;
				valorFinal = valorFaixa1+((sobra6*0.7/100)-valorD);
			
		}else
			
			if(baseC > 238626 && baseC <= 417596){
				
				double valorFaixa2 = 238626*0.7/100;
				double sobra6 = baseC-95450;
				double sobra7 = baseC-238626;
				double sobra67 = sobra6+sobra7;
				valorFinal = valorFaixa2+((sobra67*0.75/100)-valorD);

			}else
				
				if(baseC > 417596 && baseC <= 715879){
					
					double valorFaixa3 = 417596*0.75/100;
					double sobra6 = baseC-95450;
					double sobra7 = baseC-238626;
					double sobra8 = baseC-417596;
					
					double sobra678 = sobra6+sobra7+sobra8;
					valorFinal = valorFaixa3+((sobra678*0.80/100)-valorD);



				}else
					
					if(baseC > 715879 && baseC <= 954505){
						
						double valorFaixa4 = 715879*0.80/100;
						double sobra6 = baseC-95450;
						double sobra7 = baseC-238626;
						double sobra8 = baseC-417596;
						double sobra9 = baseC-715879;
						
						double sobra6789 = sobra6+sobra7+sobra8+sobra9;
						valorFinal = valorFaixa4+((sobra6789*0.85/100)-valorD);
				
				}else
				
					if(baseC > 954505 && baseC <= 1193131){
						
						double valorFaixa5 = 954505*0.85/100;
						double sobra6 = baseC-95450;
						double sobra7 = baseC-238626;
						double sobra8 = baseC-417596;
						double sobra9 = baseC-715879;
						double sobra10 = baseC-954505;
						
						double sobra678910 = sobra6+sobra7+sobra8+sobra9+sobra10;
						valorFinal = valorFaixa5+((sobra678910*0.90/100)-valorD);
					
				}else
					
					if(baseC > 1193131 && baseC <= 999999999){
						
						double valorFaixa6 = 1193131*0.90/100;
						double sobra6 = baseC-95450;
						double sobra7 = baseC-238626;
						double sobra8 = baseC-417596;
						double sobra9 = baseC-715879;
						double sobra10 = baseC-954505;
						double sobra11 = baseC-1193131;
						
						double sobra67891011 = sobra6+sobra7+sobra8+sobra9+sobra10+sobra11;
						valorFinal = valorFaixa6+((sobra67891011*1.0/100)-valorD);
	
					}
						
						PrintWriter out = response.getWriter();
						out.println("<html>");
						out.println("<body>");
						out.println("O VALOR DO IMOVEL É: "+valorFinal);
						out.println("</body>");
						out.println("</html>");
		}
		
		if(imovel.equals("Não-Residencial")){
			
			if(baseC <= 35793){
				valorFinal = (baseC*1.2/100)-valorD;
				
				
			}else
				
				if(baseC > 35793 && baseC <= 119313){
					
					double valorFaixa1 = 35793*1.2/100;
					double sobraA = baseC-35793;
					valorFinal = valorFaixa1+((sobraA*1.3/100)-valorD);
				
			}else
				
				if(baseC > 119313 && baseC <= 596565){
					
					double valorFaixa2 = 119313*1.3/100;
					double sobraA = baseC-35793;
					double sobraB = baseC-119313;
					double sobraAB = sobraA+sobraB;
					valorFinal = valorFaixa2+((sobraAB*1.4/100)-valorD);

				}else
					
					if(baseC > 596565 && baseC <= 1193131){
						
						double valorFaixa3 = 596565*1.4/100;
						double sobraA = baseC-35793;
						double sobraB = baseC-119313;
						double sobraC = baseC-1193131;
						
						double sobraABC = sobraA+sobraB+sobraC;
						valorFinal = valorFaixa3+((sobraABC*1.5/100)-valorD);



					}else
						
						if(baseC > 1193131 && baseC <= 999999999){
							
							double valorFaixa4 = 1193131*1.50/100;
							double sobraA = baseC-35793;
							double sobraB = baseC-119313;
							double sobraC = baseC-1193131;
							double sobraD = baseC-999999999;
							
							double sobraABCD = sobraA+sobraB+sobraC+sobraD;
							valorFinal = valorFaixa4+((sobraABCD*1.6/100)-valorD);
					
					}
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("O VALOR DO IMOVEL É: "+valorFinal);
			out.println("</body>");
			out.println("</html>");
		
	}
if(imovel.equals("Territorial")){
			
			if(baseC <= 47724){
				valorFinal = (baseC*1.0/100)-valorD;
				
				
			}else
				
				if(baseC > 47724 && baseC <= 357939){
					
					double valorFaixa1 = 47724*1.0/100;
					double sobra0 = baseC-47724;
					valorFinal = valorFaixa1+((sobra0*1.6/100)-valorD);
				
			}else
				
				if(baseC > 357939 && baseC <= 715879){
					
					double valorFaixa2 = 357939*1.6/100;
					double sobra0 = baseC-47724;
					double sobra1 = baseC-357939;
					double sobra01 = sobra0+sobra1;
					valorFinal = valorFaixa2+((sobra01*2.0/100)-valorD);

				}else
					
					if(baseC > 715879 && baseC <= 1193131){
						
						double valorFaixa3 = 715879*2.0/100;
						double sobra0 = baseC-47724;
						double sobra1 = baseC-357939;
						double sobra2 = baseC-715879;
						
						double sobra012 = sobra0+sobra1+sobra2;
						valorFinal = valorFaixa3+((sobra012*2.5/100)-valorD);



					}else
						
						if(baseC > 1193131 && baseC <= 999999999){
							
							double valorFaixa4 = 1193131*2.5/100;
							double sobra0 = baseC-47724;
							double sobra1 = baseC-357939;
							double sobra2 = baseC-715879;
							double sobra3 = baseC-999999999;
							
							double sobra0123 = sobra0+sobra1+sobra2+sobra3;
							valorFinal = valorFaixa4+((sobra0123*3.0/100)-valorD);
					
					}
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("O VALOR DO IMOVEL É: "+valorFinal);
			out.println("<a href='index.html'>Voltar<a/>");
			out.println("</body>");
			out.println("</html>");
		
		
	}
}
}
