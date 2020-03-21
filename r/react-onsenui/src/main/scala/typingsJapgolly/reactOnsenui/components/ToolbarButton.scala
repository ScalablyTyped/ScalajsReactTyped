package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameDisabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToolbarButton {
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    modifier: String = null,
    onClick: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameDisabled, 
    typingsJapgolly.reactOnsenui.mod.ToolbarButton, 
    Unit, 
    HTMLAttributesidclassNameDisabled
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameDisabled, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.ToolbarButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameDisabled])(children: _*)
  }
  @JSImport("react-onsenui", "ToolbarButton")
  @js.native
  object componentImport extends js.Object
  
}

