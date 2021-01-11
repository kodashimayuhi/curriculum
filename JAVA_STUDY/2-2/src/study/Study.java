package study;

/**
 * Study.java
 */
class Account {

    // フィールド変数
    private String userName;
    private int id;
    private String password;

    // コンストラクタ
    public Account() {
        this.userName ="hoge";
        this.id =123;
        this.password = "abc123";
    }

    // ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
    // アクセス修飾子:「protected」
    // メソッド名:「printAccountInfo」
    protected void printUserName() {
    	System.out.println("名前は、" +this.userName);
    }
    
    protected void printId() {
    	System.out.println("IDは、" +this.id);
    }
    
    protected void printPassword() {
    	System.out.println("パスワードは、" +this.password);
    }
    


}