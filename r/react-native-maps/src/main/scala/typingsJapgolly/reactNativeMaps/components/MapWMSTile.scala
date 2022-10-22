package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapWMSTileMod.MapWMSTileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapWMSTile {
  
  inline def apply(urlTemplate: String): SharedBuilder_MapWMSTileProps1157068472[typingsJapgolly.reactNativeMaps.libMod.MapWMSTile] = {
    val __props = js.Dynamic.literal(urlTemplate = urlTemplate.asInstanceOf[js.Any])
    new SharedBuilder_MapWMSTileProps1157068472[typingsJapgolly.reactNativeMaps.libMod.MapWMSTile](js.Array(this.component, __props.asInstanceOf[MapWMSTileProps]))
  }
  
  @JSImport("react-native-maps/lib", "MapWMSTile")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MapWMSTileProps): SharedBuilder_MapWMSTileProps1157068472[typingsJapgolly.reactNativeMaps.libMod.MapWMSTile] = new SharedBuilder_MapWMSTileProps1157068472[typingsJapgolly.reactNativeMaps.libMod.MapWMSTile](js.Array(this.component, p.asInstanceOf[js.Any]))
}
