package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.imageRollNativeMod.ImageRollProps
import typingsJapgolly.antdMobileRn.imageRollNativeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImageRollDotnative {
  def apply(
    onCancel: Callback,
    onSelected: js.Object => Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ImageRollProps, default, Unit, ImageRollProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onSelected")(js.Any.fromFunction1((t0: js.Object) => onSelected(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.imageRollNativeMod.ImageRollProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.imageRollNativeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.imageRollNativeMod.ImageRollProps])(children: _*)
  }
  @JSImport("antd-mobile-rn/lib/image-picker/ImageRoll.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

