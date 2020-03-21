package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialUi.MaterialUI.SnackbarProps
import typingsJapgolly.materialUi.snackbarMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Snackbar {
  def apply(
    open: Boolean,
    action: VdomNode = null,
    autoHideDuration: Int | Double = null,
    bodyStyle: CSSProperties = null,
    className: String = null,
    contentStyle: CSSProperties = null,
    message: VdomNode = null,
    onActionClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onRequestClose: /* reason */ String => Callback = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SnackbarProps, default, Unit, SnackbarProps] = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
  
      if (action != null) __obj.updateDynamic("action")(action.rawNode.asInstanceOf[js.Any])
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onActionClick(t0).runNow()))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1((t0: /* reason */ java.lang.String) => onRequestClose(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.SnackbarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.snackbarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.SnackbarProps])(children: _*)
  }
  @JSImport("material-ui/Snackbar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

