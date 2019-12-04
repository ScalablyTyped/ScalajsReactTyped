package typingsJapgolly.inquirer.inquirerMod

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
  var BaseChoiceMap: typingsJapgolly.inquirer.libObjectsChoiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.^ 
  var CheckboxChoiceMap: typingsJapgolly.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | CheckboxChoiceOptions[T] | typingsJapgolly.inquirer.libObjectsSeparatorMod.^ 
  var ExpandChoiceMap: typingsJapgolly.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ExpandChoiceOptions[T] | ChoiceOptions[T] | typingsJapgolly.inquirer.libObjectsSeparatorMod.^ 
  var ListChoiceMap: typingsJapgolly.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | ListChoiceOptions[T] | typingsJapgolly.inquirer.libObjectsSeparatorMod.^ 
}

object AllChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    BaseChoiceMap: typingsJapgolly.inquirer.libObjectsChoiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.^ ,
    CheckboxChoiceMap: typingsJapgolly.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | CheckboxChoiceOptions[T] | typingsJapgolly.inquirer.libObjectsSeparatorMod.^ ,
    ExpandChoiceMap: typingsJapgolly.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ExpandChoiceOptions[T] | ChoiceOptions[T] | typingsJapgolly.inquirer.libObjectsSeparatorMod.^ ,
    ListChoiceMap: typingsJapgolly.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | ListChoiceOptions[T] | typingsJapgolly.inquirer.libObjectsSeparatorMod.^ 
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
}

