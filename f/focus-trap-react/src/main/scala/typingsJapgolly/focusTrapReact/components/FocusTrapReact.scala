package typingsJapgolly.focusTrapReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.focusTrap.mod.Options
import typingsJapgolly.focusTrapReact.mod.Props
import typingsJapgolly.focusTrapReact.mod.^
import typingsJapgolly.react.mod.AllHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FocusTrapReact {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    focusTrapOptions: Options = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (focusTrapOptions != null) __obj.updateDynamic("focusTrapOptions")(focusTrapOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.focusTrapReact.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.focusTrapReact.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.focusTrapReact.mod.Props])(children: _*)
  }
  @JSImport("focus-trap-react", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

