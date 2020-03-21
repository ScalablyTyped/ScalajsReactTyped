package typingsJapgolly.reactElemental.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.AlertProps
import typingsJapgolly.reactElemental.mod.AlertSize
import typingsJapgolly.reactElemental.mod.AlertType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Alert {
  def apply(
    message: String | Element,
    title: String,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    size: AlertSize = null,
    style: CSSProperties = null,
    `type`: AlertType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AlertProps, typingsJapgolly.reactElemental.mod.Alert, Unit, AlertProps] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
      if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.asInstanceOf[js.Any])
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactElemental.mod.AlertProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactElemental.mod.Alert](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactElemental.mod.AlertProps])(children: _*)
  }
  @JSImport("react-elemental", "Alert")
  @js.native
  object componentImport extends js.Object
  
}

