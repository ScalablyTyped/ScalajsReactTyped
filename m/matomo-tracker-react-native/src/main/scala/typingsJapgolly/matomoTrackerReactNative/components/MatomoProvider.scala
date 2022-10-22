package typingsJapgolly.matomoTrackerReactNative.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.matomoTrackerReactNative.mod.MatomoProviderProps
import typingsJapgolly.matomoTrackerReactNative.mod.MatomoTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MatomoProvider {
  
  inline def apply(instance: MatomoTracker): Default[js.Object] = {
    val __props = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[MatomoProviderProps]))
  }
  
  @JSImport("matomo-tracker-react-native", "MatomoProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MatomoProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
