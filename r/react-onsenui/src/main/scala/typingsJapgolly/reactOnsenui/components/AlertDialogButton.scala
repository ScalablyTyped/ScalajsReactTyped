package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameOnClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AlertDialogButton {
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    modifier: String = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameOnClick, 
    typingsJapgolly.reactOnsenui.mod.AlertDialogButton, 
    Unit, 
    HTMLAttributesidclassNameOnClick
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameOnClick, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.AlertDialogButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameOnClick])(children: _*)
  }
  @JSImport("react-onsenui", "AlertDialogButton")
  @js.native
  object componentImport extends js.Object
  
}

