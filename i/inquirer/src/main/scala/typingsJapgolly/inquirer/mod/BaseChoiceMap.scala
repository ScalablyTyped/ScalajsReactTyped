package typingsJapgolly.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for any kind of question.
  *
  * @template T
  * The type of the answers.
  */
trait BaseChoiceMap[T /* <: Answers */] extends js.Object {
  var Choice: typingsJapgolly.inquirer.choiceMod.^[T]
  var ChoiceOptions: typingsJapgolly.inquirer.mod.ChoiceOptions[T]
  var Separator: typingsJapgolly.inquirer.separatorMod.^
  var SeparatorOptions: typingsJapgolly.inquirer.mod.SeparatorOptions
}

object BaseChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    Choice: typingsJapgolly.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typingsJapgolly.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): BaseChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseChoiceMap[T]]
  }
}

