package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTablePopover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover {
  def apply(
    action: /* args */ js.Any => CallbackTo[js.Any] = null,
    anchorEl: VdomNode = null,
    anchorOrigin: js.Any = null,
    elevation: Int | Double = null,
    onClose: /* args */ js.Any => CallbackTo[js.Any] = null,
    onExited: /* args */ js.Any => CallbackTo[js.Any] = null,
    option: js.UndefOr[Boolean] = js.undefined,
    transformOrigin: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MUIDataTablePopover, js.Any, Unit, MUIDataTablePopover] = {
    val __obj = js.Dynamic.literal()
  
      if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1((t0: /* args */ js.Any) => action(t0).runNow()))
    if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl.rawNode.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* args */ js.Any) => onClose(t0).runNow()))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1((t0: /* args */ js.Any) => onExited(t0).runNow()))
    if (!js.isUndefined(option)) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.muiDatatables.mod.MUIDataTablePopover, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Any](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTablePopover])(children: _*)
  }
  @JSImport("mui-datatables", "Popover")
  @js.native
  object componentImport extends js.Object
  
}

