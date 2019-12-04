package typingsJapgolly.reactDashNavigationDashStack.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.reactMod.ComponentProps
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderTitleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object HeaderTitle {
  def apply(
    props: ComponentProps[js.Any] with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ComponentProps[js.Any] with js.Object, 
    default, 
    Unit, 
    ComponentProps[js.Any] with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.react.reactMod.ComponentProps[js.Any] with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderTitleMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.reactMod.ComponentProps[js.Any] with js.Object])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/Header/HeaderTitle", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

