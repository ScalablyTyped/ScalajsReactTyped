package typingsJapgolly.leaflet.global.L

import typingsJapgolly.leaflet.mod.TileLayerOptions
import typingsJapgolly.leaflet.mod.TileLayer_.WMS
import typingsJapgolly.leaflet.mod.WMSOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileLayer {
  
  inline def apply(urlTemplate: String): typingsJapgolly.leaflet.mod.TileLayer_ = ^.asInstanceOf[js.Dynamic].apply(urlTemplate.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.TileLayer_]
  inline def apply(urlTemplate: String, options: TileLayerOptions): typingsJapgolly.leaflet.mod.TileLayer_ = (^.asInstanceOf[js.Dynamic].apply(urlTemplate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.TileLayer_]
  
  @JSGlobal("L.tileLayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def wms(baseUrl: String): WMS = ^.asInstanceOf[js.Dynamic].applyDynamic("wms")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[WMS]
  inline def wms(baseUrl: String, options: WMSOptions): WMS = (^.asInstanceOf[js.Dynamic].applyDynamic("wms")(baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WMS]
}
