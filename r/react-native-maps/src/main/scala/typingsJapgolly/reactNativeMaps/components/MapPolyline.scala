package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapPolylineMod.MapPolylineProps
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapPolyline {
  
  inline def apply(coordinates: js.Array[LatLng]): SharedBuilder_MapPolylineProps_604821574[typingsJapgolly.reactNativeMaps.libMod.MapPolyline] = {
    val __props = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    new SharedBuilder_MapPolylineProps_604821574[typingsJapgolly.reactNativeMaps.libMod.MapPolyline](js.Array(this.component, __props.asInstanceOf[MapPolylineProps]))
  }
  
  @JSImport("react-native-maps/lib", "MapPolyline")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MapPolylineProps): SharedBuilder_MapPolylineProps_604821574[typingsJapgolly.reactNativeMaps.libMod.MapPolyline] = new SharedBuilder_MapPolylineProps_604821574[typingsJapgolly.reactNativeMaps.libMod.MapPolyline](js.Array(this.component, p.asInstanceOf[js.Any]))
}
