package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRadio
  extends StObject
     with ICheckbox {
  
  /** [Method] Returns the selected value if this radio is part of a group other radio fields with the same name in the same FormP
    * @returns String
    */
  var getGroupValue: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Set the matched radio field s status that has the same value as the given string to checked
    * @param value String The value of the radio field to check.
    * @returns Ext.field.Radio The field that is checked.
    */
  var setGroupValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], this.type]] = js.undefined
  
  /** [Method] Sets the value of value
    * @param value Object
    * @returns Ext.field.Radio this
    */
  @JSName("setValue")
  var setValue_IRadio: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], this.type]] = js.undefined
}
object IRadio {
  
  inline def apply(): IRadio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadio]
  }
  
  extension [Self <: IRadio](x: Self) {
    
    inline def setGetGroupValue(value: CallbackTo[String]): Self = StObject.set(x, "getGroupValue", value.toJsFn)
    
    inline def setGetGroupValueUndefined: Self = StObject.set(x, "getGroupValue", js.undefined)
    
    inline def setSetGroupValue(value: /* value */ js.UndefOr[String] => IRadio): Self = StObject.set(x, "setGroupValue", js.Any.fromFunction1(value))
    
    inline def setSetGroupValueUndefined: Self = StObject.set(x, "setGroupValue", js.undefined)
    
    inline def setSetValue(value: /* value */ js.UndefOr[Any] => IRadio): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
  }
}
