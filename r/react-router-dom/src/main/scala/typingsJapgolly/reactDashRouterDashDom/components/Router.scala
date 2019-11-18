package typingsJapgolly.reactDashRouterDashDom.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.historyMod.History
import typingsJapgolly.history.historyMod.LocationState
import typingsJapgolly.reactDashRouter.reactDashRouterMod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Router {
  def apply(
    history: History[LocationState],
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RouterProps, 
    typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.Router, 
    Unit, 
    RouterProps
  ] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashRouter.reactDashRouterMod.RouterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.Router](js.constructorOf[typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.Router])
    f(__obj.asInstanceOf[typingsJapgolly.reactDashRouter.reactDashRouterMod.RouterProps])(children: _*)
  }
}

