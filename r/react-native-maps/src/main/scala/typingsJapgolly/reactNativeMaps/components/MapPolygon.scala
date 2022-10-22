package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapPolygonMod.MapPolygonProps
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapPolygon {
  
  inline def apply(coordinates: js.Array[LatLng]): SharedBuilder_MapPolygonProps_640393102[typingsJapgolly.reactNativeMaps.libMod.MapPolygon] = {
    val __props = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    new SharedBuilder_MapPolygonProps_640393102[typingsJapgolly.reactNativeMaps.libMod.MapPolygon](js.Array(this.component, __props.asInstanceOf[MapPolygonProps]))
  }
  
  @JSImport("react-native-maps/lib", "MapPolygon")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MapPolygonProps): SharedBuilder_MapPolygonProps_640393102[typingsJapgolly.reactNativeMaps.libMod.MapPolygon] = new SharedBuilder_MapPolygonProps_640393102[typingsJapgolly.reactNativeMaps.libMod.MapPolygon](js.Array(this.component, p.asInstanceOf[js.Any]))
}
