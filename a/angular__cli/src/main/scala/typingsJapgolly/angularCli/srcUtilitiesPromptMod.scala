package typingsJapgolly.angularCli

import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.ListChoiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilitiesPromptMod {
  
  @JSImport("@angular/cli/src/utilities/prompt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def askConfirmation(message: String, defaultResponse: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("askConfirmation")(message.asInstanceOf[js.Any], defaultResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def askConfirmation(message: String, defaultResponse: Boolean, noTTYResponse: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("askConfirmation")(message.asInstanceOf[js.Any], defaultResponse.asInstanceOf[js.Any], noTTYResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def askQuestion(message: String, choices: js.Array[ListChoiceOptions[Answers]], defaultResponseIndex: Double): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("askQuestion")(message.asInstanceOf[js.Any], choices.asInstanceOf[js.Any], defaultResponseIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  inline def askQuestion(
    message: String,
    choices: js.Array[ListChoiceOptions[Answers]],
    defaultResponseIndex: Double,
    noTTYResponse: String
  ): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("askQuestion")(message.asInstanceOf[js.Any], choices.asInstanceOf[js.Any], defaultResponseIndex.asInstanceOf[js.Any], noTTYResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
}
