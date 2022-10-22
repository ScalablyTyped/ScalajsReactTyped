package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISegmentedButton
  extends StObject
     with IContainer {
  
  /** [Config Option] (Boolean) */
  var allowDepress: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var allowToggle: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] We override initItems so we can check for the pressed config  */
  var applyItems: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the value of allowDepress
    * @returns Boolean
    */
  var getAllowDepress: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of allowMultiple
    * @returns Boolean
    */
  var getAllowMultiple: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of allowToggle
    * @returns Boolean
    */
  var getAllowToggle: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Gets the currently pressed button s */
  var getPressed: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the value of pressedButtons
    * @returns Array
    */
  var getPressedButtons: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of pressedCls
    * @returns String
    */
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns true if a specified Ext Button is pressed
    * @param button Ext.Button The button to check if pressed.
    * @returns Boolean pressed
    */
  var isPressed: js.UndefOr[js.Function1[/* button */ js.UndefOr[IButton], Boolean]] = js.undefined
  
  /** [Config Option] (Array) */
  var pressedButtons: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets the value of allowDepress
    * @param allowDepress Boolean The new value.
    */
  var setAllowDepress: js.UndefOr[js.Function1[/* allowDepress */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of allowMultiple
    * @param allowMultiple Boolean The new value.
    */
  var setAllowMultiple: js.UndefOr[js.Function1[/* allowMultiple */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of allowToggle
    * @param allowToggle Boolean The new value.
    */
  var setAllowToggle: js.UndefOr[js.Function1[/* allowToggle */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Activates a button
    * @param button Number/String/Ext.Button The button to activate.
    * @param pressed Boolean If defined, sets the pressed state of the button, otherwise the pressed state is toggled.
    * @param suppressEvents Boolean true to suppress toggle events during the action. If allowMultiple is true, then setPressed will toggle the button state.
    */
  var setPressed: js.UndefOr[
    js.Function3[
      /* button */ js.UndefOr[Any], 
      /* pressed */ js.UndefOr[Boolean], 
      /* suppressEvents */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Sets the value of pressedButtons
    * @param pressedButtons Array The new value.
    */
  var setPressedButtons: js.UndefOr[js.Function1[/* pressedButtons */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of pressedCls
    * @param pressedCls String The new value.
    */
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
}
object ISegmentedButton {
  
  inline def apply(): ISegmentedButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISegmentedButton]
  }
  
  extension [Self <: ISegmentedButton](x: Self) {
    
    inline def setAllowDepress(value: Boolean): Self = StObject.set(x, "allowDepress", value.asInstanceOf[js.Any])
    
    inline def setAllowDepressUndefined: Self = StObject.set(x, "allowDepress", js.undefined)
    
    inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
    
    inline def setAllowToggle(value: Boolean): Self = StObject.set(x, "allowToggle", value.asInstanceOf[js.Any])
    
    inline def setAllowToggleUndefined: Self = StObject.set(x, "allowToggle", js.undefined)
    
    inline def setApplyItems(value: Callback): Self = StObject.set(x, "applyItems", value.toJsFn)
    
    inline def setApplyItemsUndefined: Self = StObject.set(x, "applyItems", js.undefined)
    
    inline def setGetAllowDepress(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAllowDepress", value.toJsFn)
    
    inline def setGetAllowDepressUndefined: Self = StObject.set(x, "getAllowDepress", js.undefined)
    
    inline def setGetAllowMultiple(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAllowMultiple", value.toJsFn)
    
    inline def setGetAllowMultipleUndefined: Self = StObject.set(x, "getAllowMultiple", js.undefined)
    
    inline def setGetAllowToggle(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAllowToggle", value.toJsFn)
    
    inline def setGetAllowToggleUndefined: Self = StObject.set(x, "getAllowToggle", js.undefined)
    
    inline def setGetLayout(value: CallbackTo[Any]): Self = StObject.set(x, "getLayout", value.toJsFn)
    
    inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
    
    inline def setGetPressed(value: Callback): Self = StObject.set(x, "getPressed", value.toJsFn)
    
    inline def setGetPressedButtons(value: CallbackTo[Array]): Self = StObject.set(x, "getPressedButtons", value.toJsFn)
    
    inline def setGetPressedButtonsUndefined: Self = StObject.set(x, "getPressedButtons", js.undefined)
    
    inline def setGetPressedCls(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getPressedCls", value.toJsFn)
    
    inline def setGetPressedClsUndefined: Self = StObject.set(x, "getPressedCls", js.undefined)
    
    inline def setGetPressedUndefined: Self = StObject.set(x, "getPressed", js.undefined)
    
    inline def setIsPressed(value: /* button */ js.UndefOr[IButton] => Boolean): Self = StObject.set(x, "isPressed", js.Any.fromFunction1(value))
    
    inline def setIsPressedUndefined: Self = StObject.set(x, "isPressed", js.undefined)
    
    inline def setPressedButtons(value: Array): Self = StObject.set(x, "pressedButtons", value.asInstanceOf[js.Any])
    
    inline def setPressedButtonsUndefined: Self = StObject.set(x, "pressedButtons", js.undefined)
    
    inline def setPressedCls(value: java.lang.String): Self = StObject.set(x, "pressedCls", value.asInstanceOf[js.Any])
    
    inline def setPressedClsUndefined: Self = StObject.set(x, "pressedCls", js.undefined)
    
    inline def setSetAllowDepress(value: /* allowDepress */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAllowDepress", js.Any.fromFunction1((t0: /* allowDepress */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAllowDepressUndefined: Self = StObject.set(x, "setAllowDepress", js.undefined)
    
    inline def setSetAllowMultiple(value: /* allowMultiple */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAllowMultiple", js.Any.fromFunction1((t0: /* allowMultiple */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAllowMultipleUndefined: Self = StObject.set(x, "setAllowMultiple", js.undefined)
    
    inline def setSetAllowToggle(value: /* allowToggle */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAllowToggle", js.Any.fromFunction1((t0: /* allowToggle */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAllowToggleUndefined: Self = StObject.set(x, "setAllowToggle", js.undefined)
    
    inline def setSetPressed(
      value: (/* button */ js.UndefOr[Any], /* pressed */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean]) => Callback
    ): Self = StObject.set(x, "setPressed", js.Any.fromFunction3((t0: /* button */ js.UndefOr[Any], t1: /* pressed */ js.UndefOr[Boolean], t2: /* suppressEvents */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetPressedButtons(value: /* pressedButtons */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setPressedButtons", js.Any.fromFunction1((t0: /* pressedButtons */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetPressedButtonsUndefined: Self = StObject.set(x, "setPressedButtons", js.undefined)
    
    inline def setSetPressedCls(value: /* pressedCls */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setPressedCls", js.Any.fromFunction1((t0: /* pressedCls */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetPressedClsUndefined: Self = StObject.set(x, "setPressedCls", js.undefined)
    
    inline def setSetPressedUndefined: Self = StObject.set(x, "setPressed", js.undefined)
  }
}
