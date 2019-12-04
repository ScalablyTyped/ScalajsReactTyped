package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.internalAutoLockScrollingMod.AutoLockScrollingProps
import typingsJapgolly.materialDashUi.internalAutoLockScrollingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoLockScrolling {
  def apply(
    lock: Boolean,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AutoLockScrollingProps, default, Unit, AutoLockScrollingProps] = {
    val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.internalAutoLockScrollingMod.AutoLockScrollingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.internalAutoLockScrollingMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.internalAutoLockScrollingMod.AutoLockScrollingProps])(children: _*)
  }
  @JSImport("material-ui/internal/AutoLockScrolling", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

