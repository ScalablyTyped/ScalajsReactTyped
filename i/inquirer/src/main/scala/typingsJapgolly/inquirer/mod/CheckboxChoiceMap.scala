package typingsJapgolly.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxChoiceMap[T /* <: Answers */]
  extends StObject
     with BaseChoiceMap[T] {
  
  var CheckboxChoiceOptions: typingsJapgolly.inquirer.mod.CheckboxChoiceOptions[T]
}
object CheckboxChoiceMap {
  
  inline def apply[T /* <: Answers */](
    CheckboxChoiceOptions: CheckboxChoiceOptions[T],
    Choice: typingsJapgolly.inquirer.libObjectsChoiceMod.default[T],
    ChoiceOptions: ChoiceOptions,
    Separator: typingsJapgolly.inquirer.libObjectsSeparatorMod.default,
    SeparatorOptions: SeparatorOptions
  ): CheckboxChoiceMap[T] = {
    val __obj = js.Dynamic.literal(CheckboxChoiceOptions = CheckboxChoiceOptions.asInstanceOf[js.Any], Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxChoiceMap[T]]
  }
  
  extension [Self <: CheckboxChoiceMap[?], T /* <: Answers */](x: Self & CheckboxChoiceMap[T]) {
    
    inline def setCheckboxChoiceOptions(value: CheckboxChoiceOptions[T]): Self = StObject.set(x, "CheckboxChoiceOptions", value.asInstanceOf[js.Any])
  }
}
