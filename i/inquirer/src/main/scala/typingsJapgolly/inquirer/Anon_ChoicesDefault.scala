package typingsJapgolly.inquirer

import typingsJapgolly.inquirer.inquirerMod.Answers
import typingsJapgolly.inquirer.inquirerMod.ChoiceCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChoicesDefault[T /* <: Answers */] extends js.Object {
  /**
    * The choices of the question.
    */
  var choices: ChoiceCollection[T]
  /**
    * The default value of the question.
    */
  var default: js.Any
  /**
    * The message to show to the user.
    */
  var message: String
  /**
    * The type of the question.
    */
  var `type`: String
}

object Anon_ChoicesDefault {
  @scala.inline
  def apply[T /* <: Answers */](choices: ChoiceCollection[T], default: js.Any, message: String, `type`: String): Anon_ChoicesDefault[T] = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChoicesDefault[T]]
  }
}

