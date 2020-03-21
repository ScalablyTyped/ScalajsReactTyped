package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.clearFixMod.ClearFixProps
import typingsJapgolly.materialUi.clearFixMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClearFix {
  def apply(
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ClearFixProps, default, Unit, ClearFixProps] = {
    val __obj = js.Dynamic.literal()
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.clearFixMod.ClearFixProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.clearFixMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.clearFixMod.ClearFixProps])(children: _*)
  }
  @JSImport("material-ui/internal/ClearFix", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

