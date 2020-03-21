package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.menuMod.NestedMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NestedMenus {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NestedMenuProps, typingsJapgolly.baseui.menuMod.NestedMenus, Unit, NestedMenuProps] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.menuMod.NestedMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.menuMod.NestedMenus](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.menuMod.NestedMenuProps])(children: _*)
  }
  @JSImport("baseui/menu", "NestedMenus")
  @js.native
  object componentImport extends js.Object
  
}

