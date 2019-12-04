package typingsJapgolly.reactDashNavigationDashStack.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderBackButtonWebMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BackButtonWeb {
  def apply(
    tintColor: String,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[Props, MountedWithRawType[Props, js.Object, RawMounted[Props, js.Object]]] = {
    val __obj = js.Dynamic.literal(tintColor = tintColor.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderBackButtonWebMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderBackButtonWebMod.Props])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/Header/BackButtonWeb", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

