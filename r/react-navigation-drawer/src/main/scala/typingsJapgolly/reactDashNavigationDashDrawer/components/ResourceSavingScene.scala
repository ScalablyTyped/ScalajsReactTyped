package typingsJapgolly.reactDashNavigationDashDrawer.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsResourceSavingSceneMod.Props
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsResourceSavingSceneMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResourceSavingScene {
  def apply(
    isVisible: Boolean,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any])
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsResourceSavingSceneMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsResourceSavingSceneMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsResourceSavingSceneMod.Props])(children: _*)
  }
  @JSImport("react-navigation-drawer/lib/typescript/src/views/ResourceSavingScene", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

