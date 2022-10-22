package typingsJapgolly.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllChoiceMap[T /* <: Answers */] extends StObject {
  
  var BaseChoiceMap: typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | ChoiceOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default | SeparatorOptions
  
  var CheckboxChoiceMap: ChoiceOptions | typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default | CheckboxChoiceOptions[T]
  
  var ExpandChoiceMap: ExpandChoiceOptions | ChoiceOptions | typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default
  
  var ListChoiceMap: ChoiceOptions | typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | ListChoiceOptions[T] | SeparatorOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default
}
object AllChoiceMap {
  
  inline def apply[T /* <: Answers */](
    BaseChoiceMap: typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | ChoiceOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default | SeparatorOptions,
    CheckboxChoiceMap: ChoiceOptions | typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default | CheckboxChoiceOptions[T],
    ExpandChoiceMap: ExpandChoiceOptions | ChoiceOptions | typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default,
    ListChoiceMap: ChoiceOptions | typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | ListChoiceOptions[T] | SeparatorOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
  
  extension [Self <: AllChoiceMap[?], T /* <: Answers */](x: Self & AllChoiceMap[T]) {
    
    inline def setBaseChoiceMap(
      value: typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | ChoiceOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default | SeparatorOptions
    ): Self = StObject.set(x, "BaseChoiceMap", value.asInstanceOf[js.Any])
    
    inline def setCheckboxChoiceMap(
      value: ChoiceOptions | typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default | CheckboxChoiceOptions[T]
    ): Self = StObject.set(x, "CheckboxChoiceMap", value.asInstanceOf[js.Any])
    
    inline def setExpandChoiceMap(
      value: ExpandChoiceOptions | ChoiceOptions | typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default
    ): Self = StObject.set(x, "ExpandChoiceMap", value.asInstanceOf[js.Any])
    
    inline def setListChoiceMap(
      value: ChoiceOptions | typingsJapgolly.inquirer.libObjectsChoiceMod.default[T] | ListChoiceOptions[T] | SeparatorOptions | typingsJapgolly.inquirer.libObjectsSeparatorMod.default
    ): Self = StObject.set(x, "ListChoiceMap", value.asInstanceOf[js.Any])
  }
}
