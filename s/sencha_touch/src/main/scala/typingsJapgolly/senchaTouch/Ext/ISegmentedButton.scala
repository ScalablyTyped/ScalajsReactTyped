package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISegmentedButton extends IContainer {
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
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
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
      /* button */ js.UndefOr[js.Any], 
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
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    allowDepress: js.UndefOr[Boolean] = js.undefined,
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    allowToggle: js.UndefOr[Boolean] = js.undefined,
    applyItems: js.UndefOr[Callback] = js.undefined,
    getAllowDepress: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAllowMultiple: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAllowToggle: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getLayout: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getPressed: js.UndefOr[Callback] = js.undefined,
    getPressedButtons: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getPressedCls: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    isPressed: /* button */ js.UndefOr[IButton] => CallbackTo[Boolean] = null,
    pressedButtons: Array = null,
    pressedCls: java.lang.String = null,
    setAllowDepress: /* allowDepress */ js.UndefOr[Boolean] => Callback = null,
    setAllowMultiple: /* allowMultiple */ js.UndefOr[Boolean] => Callback = null,
    setAllowToggle: /* allowToggle */ js.UndefOr[Boolean] => Callback = null,
    setPressed: (/* button */ js.UndefOr[js.Any], /* pressed */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean]) => Callback = null,
    setPressedButtons: /* pressedButtons */ js.UndefOr[Array] => Callback = null,
    setPressedCls: /* pressedCls */ js.UndefOr[java.lang.String] => Callback = null
  ): ISegmentedButton = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(allowDepress)) __obj.updateDynamic("allowDepress")(allowDepress.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple.asInstanceOf[js.Any])
    if (!js.isUndefined(allowToggle)) __obj.updateDynamic("allowToggle")(allowToggle.asInstanceOf[js.Any])
    applyItems.foreach(p => __obj.updateDynamic("applyItems")(p.toJsFn))
    getAllowDepress.foreach(p => __obj.updateDynamic("getAllowDepress")(p.toJsFn))
    getAllowMultiple.foreach(p => __obj.updateDynamic("getAllowMultiple")(p.toJsFn))
    getAllowToggle.foreach(p => __obj.updateDynamic("getAllowToggle")(p.toJsFn))
    getLayout.foreach(p => __obj.updateDynamic("getLayout")(p.toJsFn))
    getPressed.foreach(p => __obj.updateDynamic("getPressed")(p.toJsFn))
    getPressedButtons.foreach(p => __obj.updateDynamic("getPressedButtons")(p.toJsFn))
    getPressedCls.foreach(p => __obj.updateDynamic("getPressedCls")(p.toJsFn))
    if (isPressed != null) __obj.updateDynamic("isPressed")(js.Any.fromFunction1((t0: /* button */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.IButton]) => isPressed(t0).runNow()))
    if (pressedButtons != null) __obj.updateDynamic("pressedButtons")(pressedButtons.asInstanceOf[js.Any])
    if (pressedCls != null) __obj.updateDynamic("pressedCls")(pressedCls.asInstanceOf[js.Any])
    if (setAllowDepress != null) __obj.updateDynamic("setAllowDepress")(js.Any.fromFunction1((t0: /* allowDepress */ js.UndefOr[scala.Boolean]) => setAllowDepress(t0).runNow()))
    if (setAllowMultiple != null) __obj.updateDynamic("setAllowMultiple")(js.Any.fromFunction1((t0: /* allowMultiple */ js.UndefOr[scala.Boolean]) => setAllowMultiple(t0).runNow()))
    if (setAllowToggle != null) __obj.updateDynamic("setAllowToggle")(js.Any.fromFunction1((t0: /* allowToggle */ js.UndefOr[scala.Boolean]) => setAllowToggle(t0).runNow()))
    if (setPressed != null) __obj.updateDynamic("setPressed")(js.Any.fromFunction3((t0: /* button */ js.UndefOr[js.Any], t1: /* pressed */ js.UndefOr[scala.Boolean], t2: /* suppressEvents */ js.UndefOr[scala.Boolean]) => setPressed(t0, t1, t2).runNow()))
    if (setPressedButtons != null) __obj.updateDynamic("setPressedButtons")(js.Any.fromFunction1((t0: /* pressedButtons */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setPressedButtons(t0).runNow()))
    if (setPressedCls != null) __obj.updateDynamic("setPressedCls")(js.Any.fromFunction1((t0: /* pressedCls */ js.UndefOr[java.lang.String]) => setPressedCls(t0).runNow()))
    __obj.asInstanceOf[ISegmentedButton]
  }
}

