public class GCD {
	public int num;
	public GCD(int num){
		this.num = num;
	}
	public int gcodi(int x){
		
		if (this.num == x){
			return x;
		}
		else{
			if(x > this.num){
				x = x - this.num;
				return this.gcodi(x);
			}
			else{
				this.num = this.num - x;
				return this.gcodi(x);
			}
		}
	}
	public static void main(String[] args){
		GCD y = new GCD(20);
		int z = y.gcodi(40);
		System.out.println(z);
	}
}
