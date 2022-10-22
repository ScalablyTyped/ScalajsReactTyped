package typingsJapgolly.inquirer.mod

import typingsJapgolly.inquirer.anon.Ui
import typingsJapgolly.inquirer.mod.inquirer.prompts.PromptCollection
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptModule extends PromptModuleBase {
  
  /**
    * Prompts the questions to the user.
    */
  def apply[T /* <: Answers */](questions: QuestionCollection[T]): js.Promise[T] & Ui[T] = js.native
  def apply[T /* <: Answers */](questions: QuestionCollection[T], initialAnswers: Partial[T]): js.Promise[T] & Ui[T] = js.native
  
  /**
    * The prompts of the prompt-module.
    */
  var prompts: PromptCollection = js.native
}
