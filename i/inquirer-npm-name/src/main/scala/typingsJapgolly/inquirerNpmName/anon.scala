package typingsJapgolly.inquirerNpmName

import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.PromptFunction
import typingsJapgolly.inquirer.mod.QuestionCollection
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Prompt extends StObject {
    
    def prompt[T /* <: Answers */](questions: QuestionCollection[T]): js.Promise[T]
    def prompt[T /* <: Answers */](questions: QuestionCollection[T], initialAnswers: Partial[T]): js.Promise[T]
    @JSName("prompt")
    var prompt_Original: PromptFunction
  }
  object Prompt {
    
    inline def apply(
      prompt: (/* questions */ QuestionCollection[Answers], /* initialAnswers */ js.UndefOr[Partial[Answers]]) => js.Promise[Answers]
    ): Prompt = {
      val __obj = js.Dynamic.literal(prompt = js.Any.fromFunction2(prompt))
      __obj.asInstanceOf[Prompt]
    }
    
    extension [Self <: Prompt](x: Self) {
      
      inline def setPrompt(
        value: (/* questions */ QuestionCollection[Answers], /* initialAnswers */ js.UndefOr[Partial[Answers]]) => js.Promise[Answers]
      ): Self = StObject.set(x, "prompt", js.Any.fromFunction2(value))
    }
  }
}
