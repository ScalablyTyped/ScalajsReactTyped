package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpinner
  extends StObject
     with INumber {
  
  /** [Config Option] (Boolean) */
  var accelerateOnTapHold: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var cycle: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var defaultValue: js.UndefOr[Double] = js.undefined
  
  /** [Method] Returns the value of accelerateOnTapHold
    * @returns Boolean
    */
  var getAccelerateOnTapHold: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ISpinner: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of cycle
    * @returns Boolean
    */
  var getCycle: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of defaultValue
    * @returns Number
    */
  var getDefaultValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of groupButtons
    * @returns Boolean
    */
  var getGroupButtons: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var groupButtons: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var increment: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var incrementValue: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of accelerateOnTapHold
    * @param accelerateOnTapHold Boolean The new value.
    */
  var setAccelerateOnTapHold: js.UndefOr[js.Function1[/* accelerateOnTapHold */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ISpinner: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of cycle
    * @param cycle Boolean The new value.
    */
  var setCycle: js.UndefOr[js.Function1[/* cycle */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaultValue
    * @param defaultValue Number The new value.
    */
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of groupButtons
    * @param groupButtons Boolean The new value.
    */
  var setGroupButtons: js.UndefOr[js.Function1[/* groupButtons */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Updates the component configuration
    * @param newComponent Object
    */
  var updateComponent: js.UndefOr[js.Function1[/* newComponent */ js.UndefOr[Any], Unit]] = js.undefined
}
object ISpinner {
  
  inline def apply(): ISpinner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinner]
  }
  
  extension [Self <: ISpinner](x: Self) {
    
    inline def setAccelerateOnTapHold(value: Boolean): Self = StObject.set(x, "accelerateOnTapHold", value.asInstanceOf[js.Any])
    
    inline def setAccelerateOnTapHoldUndefined: Self = StObject.set(x, "accelerateOnTapHold", js.undefined)
    
    inline def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setGetAccelerateOnTapHold(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAccelerateOnTapHold", value.toJsFn)
    
    inline def setGetAccelerateOnTapHoldUndefined: Self = StObject.set(x, "getAccelerateOnTapHold", js.undefined)
    
    inline def setGetCls(value: CallbackTo[String]): Self = StObject.set(x, "getCls", value.toJsFn)
    
    inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    inline def setGetCycle(value: CallbackTo[Boolean]): Self = StObject.set(x, "getCycle", value.toJsFn)
    
    inline def setGetCycleUndefined: Self = StObject.set(x, "getCycle", js.undefined)
    
    inline def setGetDefaultValue(value: CallbackTo[Double]): Self = StObject.set(x, "getDefaultValue", value.toJsFn)
    
    inline def setGetDefaultValueUndefined: Self = StObject.set(x, "getDefaultValue", js.undefined)
    
    inline def setGetGroupButtons(value: CallbackTo[Boolean]): Self = StObject.set(x, "getGroupButtons", value.toJsFn)
    
    inline def setGetGroupButtonsUndefined: Self = StObject.set(x, "getGroupButtons", js.undefined)
    
    inline def setGroupButtons(value: Boolean): Self = StObject.set(x, "groupButtons", value.asInstanceOf[js.Any])
    
    inline def setGroupButtonsUndefined: Self = StObject.set(x, "groupButtons", js.undefined)
    
    inline def setIncrement(value: String): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    inline def setIncrementValue(value: String): Self = StObject.set(x, "incrementValue", value.asInstanceOf[js.Any])
    
    inline def setIncrementValueUndefined: Self = StObject.set(x, "incrementValue", js.undefined)
    
    inline def setSetAccelerateOnTapHold(value: /* accelerateOnTapHold */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAccelerateOnTapHold", js.Any.fromFunction1((t0: /* accelerateOnTapHold */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAccelerateOnTapHoldUndefined: Self = StObject.set(x, "setAccelerateOnTapHold", js.undefined)
    
    inline def setSetCls(value: /* cls */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setCls", js.Any.fromFunction1((t0: /* cls */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    inline def setSetCycle(value: /* cycle */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setCycle", js.Any.fromFunction1((t0: /* cycle */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetCycleUndefined: Self = StObject.set(x, "setCycle", js.undefined)
    
    inline def setSetDefaultValue(value: /* defaultValue */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setDefaultValue", js.Any.fromFunction1((t0: /* defaultValue */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetDefaultValueUndefined: Self = StObject.set(x, "setDefaultValue", js.undefined)
    
    inline def setSetGroupButtons(value: /* groupButtons */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setGroupButtons", js.Any.fromFunction1((t0: /* groupButtons */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetGroupButtonsUndefined: Self = StObject.set(x, "setGroupButtons", js.undefined)
    
    inline def setUpdateComponent(value: /* newComponent */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "updateComponent", js.Any.fromFunction1((t0: /* newComponent */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setUpdateComponentUndefined: Self = StObject.set(x, "updateComponent", js.undefined)
  }
}
