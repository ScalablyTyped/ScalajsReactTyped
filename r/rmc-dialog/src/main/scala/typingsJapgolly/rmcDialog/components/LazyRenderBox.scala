package typingsJapgolly.rmcDialog.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcDialog.lazyRenderBoxMod.ILazyRenderBoxPropTypes
import typingsJapgolly.rmcDialog.lazyRenderBoxMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LazyRenderBox {
  def apply(
    className: String = null,
    hiddenClassName: String = null,
    role: String = null,
    style: js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ILazyRenderBoxPropTypes, default, Unit, ILazyRenderBoxPropTypes] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (hiddenClassName != null) __obj.updateDynamic("hiddenClassName")(hiddenClassName.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcDialog.lazyRenderBoxMod.ILazyRenderBoxPropTypes, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcDialog.lazyRenderBoxMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcDialog.lazyRenderBoxMod.ILazyRenderBoxPropTypes])(children: _*)
  }
  @JSImport("rmc-dialog/lib/LazyRenderBox", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

