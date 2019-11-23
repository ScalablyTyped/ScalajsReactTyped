package typingsJapgolly.atStorybookRouter.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atReachRouter.atReachRouterMod.History
import typingsJapgolly.atReachRouter.atReachRouterMod.LocationProviderProps
import typingsJapgolly.atReachRouter.atReachRouterMod.LocationProviderRenderFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocationProvider {
  def apply(
    history: History = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: Node | LocationProviderRenderFn = null
  ): UnmountedWithRoot[
    LocationProviderProps, 
    typingsJapgolly.atStorybookRouter.distRouterMod.LocationProvider, 
    Unit, 
    LocationProviderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atReachRouter.atReachRouterMod.LocationProviderProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.atStorybookRouter.distRouterMod.LocationProvider](js.constructorOf[typingsJapgolly.atStorybookRouter.distRouterMod.LocationProvider])
    f(__obj.asInstanceOf[typingsJapgolly.atReachRouter.atReachRouterMod.LocationProviderProps])
  }
}

