package typingsJapgolly.reachRouter.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reachRouter.mod.History
import typingsJapgolly.reachRouter.mod.LocationProviderProps
import typingsJapgolly.reachRouter.mod.LocationProviderRenderFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocationProvider {
  def apply(
    history: History = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Node | LocationProviderRenderFn = null
  ): UnmountedWithRoot[
    LocationProviderProps, 
    typingsJapgolly.reachRouter.mod.LocationProvider, 
    Unit, 
    LocationProviderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reachRouter.mod.LocationProviderProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reachRouter.mod.LocationProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reachRouter.mod.LocationProviderProps])
  }
  @JSImport("@reach/router", "LocationProvider")
  @js.native
  object componentImport extends js.Object
  
}

