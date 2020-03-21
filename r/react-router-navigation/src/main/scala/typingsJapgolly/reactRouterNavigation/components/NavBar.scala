package typingsJapgolly.reactRouterNavigation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object NavBar {
  def apply(
    props: CardSubViewProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    CardSubViewProps with js.Object, 
    typingsJapgolly.reactRouterNavigation.mod.NavBar, 
    Unit, 
    CardSubViewProps with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRouterNavigation.mod.NavBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps with js.Object])(children: _*)
  }
  @JSImport("react-router-navigation", "NavBar")
  @js.native
  object componentImport extends js.Object
  
}

