package typingsJapgolly.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for the `ListQuestion`.
  *
  * @template T
  * The type of the answers.
  */
trait ListChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var ListChoiceOptions: typingsJapgolly.inquirer.mod.ListChoiceOptions[T]
}

object ListChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    Choice: typingsJapgolly.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    ListChoiceOptions: ListChoiceOptions[T],
    Separator: typingsJapgolly.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): ListChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], ListChoiceOptions = ListChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListChoiceMap[T]]
  }
}

