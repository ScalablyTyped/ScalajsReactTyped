package typingsJapgolly.reactNavigationDrawer.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigationDrawer.resourceSavingSceneMod.Props
import typingsJapgolly.reactNavigationDrawer.resourceSavingSceneMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResourceSavingScene {
  def apply(
    isVisible: Boolean,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any])
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationDrawer.resourceSavingSceneMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationDrawer.resourceSavingSceneMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationDrawer.resourceSavingSceneMod.Props])(children: _*)
  }
  @JSImport("react-navigation-drawer/lib/typescript/src/views/ResourceSavingScene", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

