package typingsJapgolly.reactMdl.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactMdl.mod.SnackbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Snackbar {
  def apply(
    active: Boolean,
    onTimeout: CallbackTo[js.Any],
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    onActionClick: ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.Snackbar with Element] => Callback = null,
    timeout: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SnackbarProps, typingsJapgolly.reactMdl.mod.Snackbar, Unit, SnackbarProps] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onTimeout")(onTimeout.toJsFn)
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.Snackbar with org.scalajs.dom.raw.Element]) => onActionClick(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMdl.mod.SnackbarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMdl.mod.Snackbar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMdl.mod.SnackbarProps])(children: _*)
  }
  @JSImport("react-mdl", "Snackbar")
  @js.native
  object componentImport extends js.Object
  
}

