import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static class Pessoa{
        private String nome;
        private int idade;
        private String cpf;
        
        public Pessoa(String nome, int idade, String cpf) {
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void exibirDados(){
            System.out.println("\nNome: " + this.nome);
            System.out.println("Idade: " + this.idade);
            System.out.println("CPF: " + this.cpf);
        }
    }

    public static class Aluno extends Pessoa{
        private int matricula;
        private String curso;
        
        public Aluno(String nome, int idade, String cpf, int matricula, String curso) {
            super(nome, idade, cpf);
            this.matricula = matricula;
            this.curso = curso;
        }

        public int getMatricula() {
            return matricula;
        }
        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }
        public String getCurso() {
            return curso;
        }
        public void setCurso(String curso) {
            this.curso = curso;
        }

        public void exibirDados(){
            super.exibirDados();
            System.out.println("Matrícula: " + this.matricula);
            System.out.println("Curso: " + this.curso);
        }
    }

    public static class Professor extends Pessoa{
        private int salario;
        private String disciplina;
        
        public Professor(String nome, int idade, String cpf, int salario, String disciplina) {
            super(nome, idade, cpf);
            this.salario = salario;
            this.disciplina = disciplina;
        }

        public int getSalario() {
            return salario;
        }
        public void setSalario(int salario) {
            this.salario = salario;
        }
        public String getDisciplina() {
            return disciplina;
        }
        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }

        public void exibirDados(){
            super.exibirDados();
            System.out.println("Salário: " + this.salario);
            System.out.println("Disciplina: " + this.disciplina);
        }
    }

    public static class Funcionario extends Pessoa{
        private String cargo;
        private String setor;
        
        public Funcionario(String nome, int idade, String cpf, String cargo, String setor) {
            super(nome, idade, cpf);
            this.cargo = cargo;
            this.setor = setor;
        }

        public String getCargo() {
            return cargo;
        }
        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
        public String getSetor() {
            return setor;
        }
        public void setSetor(String setor) {
            this.setor = setor;
        }

        public void exibirDados(){
            super.exibirDados();
            System.out.println("Cargo: " + this.cargo);
            System.out.println("Setor: " + this.setor);
        }
    }

    public static class Curso{
        private String nome;
        private String codigo;
        private String professorResponsavel;
        private List<Aluno> listAluno = new ArrayList<>();

        public Curso(String nome, String codigo, String professorResponsavel) {
            this.nome = nome;
            this.codigo = codigo;
            this.professorResponsavel = professorResponsavel;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getCodigo() {
            return codigo;
        }
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
        public String getProfessorResponsavel() {
            return professorResponsavel;
        }
        public void setProfessorResponsavel(String professorResponsavel) {
            this.professorResponsavel = professorResponsavel;
        }

        public void adicionarAluno(Aluno aluno){
            this.listAluno.add(aluno);
        }
        
        public void removerAluno(Aluno aluno){
            this.listAluno.remove(aluno);
        }

        public void listarAlunos(){
            for(Aluno aluno : listAluno){
                System.out.println("Nome: " + aluno);
            }
        }

    }
    public static void main(String[] args) throws Exception {
        boolean check = true;
        while(check){
            try(Scanner ler = new Scanner(System.in)){
                System.out.println("Digite a opção desejada: ");
                int option = ler.nextInt();
            }
            switch (option) {
                case 1:
                    
                    break;
            
                default:    
                    System.out.println("Valor digitado inválido");
                    break;
            }
        }
    }
}
