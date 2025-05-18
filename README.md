
Projeto voltado a matéria Programação Orientada a Objetos. <br/>
# PhysicLab

**PhysicLab** é um conjunto de mini‑simuladores desenvolvidos em **Java 17** + **JavaFX** para tornar o estudo de Física no Ensino Fundamental mais visual, interativo e cativante.

> “Aprender Física é mais fácil quando podemos *ver* as leis em ação.”

---

## ✨ Principais recursos

| Tema                          | O que o simulador faz                                                                                                                                   |
|-------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Movimento retilíneo (MRU)** | Calcula **S = S₀ + v t**, plota o gráfico **espaço × tempo** e exibe a **velocidade média** em tempo real.                                              |
| **Queda livre (MRUV)**        | Resolve **v = v₀ + g t** e **h = h₀ + v₀ t + ½ g t²**; exibe gráficos **velocidade × tempo** e **altura × tempo**, além dos valores numéricos instantâneos. |

Em todos os módulos, as **equações de MRU e MRUV são resolvidas automaticamente** sempre que o usuário altera os parâmetros, e os **gráficos** são atualizados instantaneamente.

---

## 🖥️ Tecnologias & requisitos

- **Java 17** (projeto Maven — arquivo `pom.xml` incluído)  
- **JavaFX 19** (adicionada via Maven Central)

### Execução rápida

```bash
git clone https://github.com/<usuario>/PhysicLab.git
cd PhysicLab
mvn clean javafx:run

