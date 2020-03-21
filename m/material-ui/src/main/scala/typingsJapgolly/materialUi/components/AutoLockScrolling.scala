package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.autoLockScrollingMod.AutoLockScrollingProps
import typingsJapgolly.materialUi.autoLockScrollingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoLockScrolling {
  def apply(
    lock: Boolean,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AutoLockScrollingProps, default, Unit, AutoLockScrollingProps] = {
    val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.autoLockScrollingMod.AutoLockScrollingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.autoLockScrollingMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.autoLockScrollingMod.AutoLockScrollingProps])(children: _*)
  }
  @JSImport("material-ui/internal/AutoLockScrolling", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

