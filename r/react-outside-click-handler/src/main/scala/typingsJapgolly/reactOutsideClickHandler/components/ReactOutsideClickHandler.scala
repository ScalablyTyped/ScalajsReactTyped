package typingsJapgolly.reactOutsideClickHandler.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactOutsideClickHandler.mod.Props
import typingsJapgolly.reactOutsideClickHandler.mod.default
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactOutsideClickHandler {
  def apply(
    onOutsideClick: ReactMouseEventFrom[HTMLElement] => Callback,
    disabled: js.UndefOr[Boolean] = js.undefined,
    display: block | flex | `inline` | `inline-block` | contents = null,
    useCapture: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onOutsideClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onOutsideClick(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(useCapture)) __obj.updateDynamic("useCapture")(useCapture.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOutsideClickHandler.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOutsideClickHandler.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOutsideClickHandler.mod.Props])(children: _*)
  }
  @JSImport("react-outside-click-handler", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

