package typingsJapgolly.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types.
  *
  * @template T
  * The type of the answers.
  */
trait AllChoiceMap[T /* <: Answers */] extends js.Object {
  var BaseChoiceMap: typingsJapgolly.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsJapgolly.inquirer.separatorMod.^ 
  var CheckboxChoiceMap: ChoiceOptions[T] | typingsJapgolly.inquirer.separatorMod.^  | SeparatorOptions | CheckboxChoiceOptions[T] | typingsJapgolly.inquirer.choiceMod.^[T]
  var ExpandChoiceMap: ChoiceOptions[T] | typingsJapgolly.inquirer.separatorMod.^  | SeparatorOptions | ExpandChoiceOptions[T] | typingsJapgolly.inquirer.choiceMod.^[T]
  var ListChoiceMap: ChoiceOptions[T] | typingsJapgolly.inquirer.separatorMod.^  | ListChoiceOptions[T] | SeparatorOptions | typingsJapgolly.inquirer.choiceMod.^[T]
}

object AllChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    BaseChoiceMap: typingsJapgolly.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsJapgolly.inquirer.separatorMod.^ ,
    CheckboxChoiceMap: ChoiceOptions[T] | typingsJapgolly.inquirer.separatorMod.^  | SeparatorOptions | CheckboxChoiceOptions[T] | typingsJapgolly.inquirer.choiceMod.^[T],
    ExpandChoiceMap: ChoiceOptions[T] | typingsJapgolly.inquirer.separatorMod.^  | SeparatorOptions | ExpandChoiceOptions[T] | typingsJapgolly.inquirer.choiceMod.^[T],
    ListChoiceMap: ChoiceOptions[T] | typingsJapgolly.inquirer.separatorMod.^  | ListChoiceOptions[T] | SeparatorOptions | typingsJapgolly.inquirer.choiceMod.^[T]
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
}

