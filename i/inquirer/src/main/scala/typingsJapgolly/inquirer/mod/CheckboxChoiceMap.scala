package typingsJapgolly.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for the `CheckboxQuestion`.
  *
  * @template T
  * The type of the answers.
  */
trait CheckboxChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var CheckboxChoiceOptions: typingsJapgolly.inquirer.mod.CheckboxChoiceOptions[T]
}

object CheckboxChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    CheckboxChoiceOptions: CheckboxChoiceOptions[T],
    Choice: typingsJapgolly.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typingsJapgolly.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): CheckboxChoiceMap[T] = {
    val __obj = js.Dynamic.literal(CheckboxChoiceOptions = CheckboxChoiceOptions.asInstanceOf[js.Any], Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckboxChoiceMap[T]]
  }
}

