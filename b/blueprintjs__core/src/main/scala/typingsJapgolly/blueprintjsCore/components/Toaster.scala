package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.toasterMod.IToasterProps
import typingsJapgolly.blueprintjsCore.toasterMod.ToasterPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toaster {
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    canEscapeKeyClear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    maxToasts: Int | Double = null,
    position: ToasterPosition = null,
    usePortal: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IToasterProps, typingsJapgolly.blueprintjsCore.mod.Toaster, Unit, IToasterProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(canEscapeKeyClear)) __obj.updateDynamic("canEscapeKeyClear")(canEscapeKeyClear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (maxToasts != null) __obj.updateDynamic("maxToasts")(maxToasts.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.toasterMod.IToasterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.Toaster](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.toasterMod.IToasterProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "Toaster")
  @js.native
  object componentImport extends js.Object
  
}

