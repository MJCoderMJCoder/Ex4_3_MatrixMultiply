package com.matrixmultiply;

/*
 * 两个二维矩阵相乘
 * c[j][m]=∑(k=0~(n-1)) a[j][k]*b[k][m];
 */
public class MatrixMultiply {		//Matrix：矩阵；Multiply：乘；
	
	public static void main(String[] args) {
		int j, k, m ,aH = 2, aL = 3, bL=4, a[][], b[][], c[][];	//声明语句
		a = new int[aH][aL];
		b = new int[aL][bL];
		c = new int[aH][bL];
		//随机产生两个数组的元素
		for(j = 0; j < aH; j++)
			for(k = 0; k < aL; k++) 
				
				/*赋值发生时，必须将赋值运算符右边的表达式的值强制转换为左边变量的类型*/
				a[j][k] = (int)(Math.random()*10);
		
		for(j = 0; j < aL; j++)
			for(k = 0; k < bL; k++) 
				
				/*强制类型转换的语法形式：“(<类型>) (<表达式>)” ，其中圆括号是必要的*/
				b[j][k] = (int)(Math.random()*10);
		System.out.println("a矩阵元素如下：");
		for(j=0; j<aH; j++){
			for(k=0; k<aL; k++)
				System.out.print(a[j][k] + "\t");
			System.out.println("");
		}
		System.out.println("b矩阵元素如下：");
		for(j=0; j<aL; j++){
			for(k=0; k<bL; k++)
				System.out.print(b[j][k] + "\t");
			System.out.println("");
		}
		System.out.println("求出的（c=a*b)矩阵元素如下：");
		for(j=0; j<aH; j++){
			for(m = 0; m < bL; m++){
				for(k=0; k<aL; k++)
					c[j][m] += a[j][k]*b[k][m];		//矩阵相乘计算关键算法
				System.out.print(c[j][m] + "\t\t");
			}
			System.out.println("");
		}
	}
}
