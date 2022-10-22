package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRadioGroup
  extends StObject
     with ICheckboxGroup {
  
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  @JSName("checkChange")
  var checkChange_IRadioGroup: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the value of the radio group
    * @param value Object The map from names to values to be set.
    * @returns Ext.form.CheckboxGroup this
    */
  @JSName("setValue")
  var setValue_IRadioGroup: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], ICheckboxGroup]] = js.undefined
}
object IRadioGroup {
  
  inline def apply(): IRadioGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadioGroup]
  }
  
  extension [Self <: IRadioGroup](x: Self) {
    
    inline def setCheckChange(value: Callback): Self = StObject.set(x, "checkChange", value.toJsFn)
    
    inline def setCheckChangeUndefined: Self = StObject.set(x, "checkChange", js.undefined)
    
    inline def setSetValue(value: /* value */ js.UndefOr[Any] => ICheckboxGroup): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
  }
}
