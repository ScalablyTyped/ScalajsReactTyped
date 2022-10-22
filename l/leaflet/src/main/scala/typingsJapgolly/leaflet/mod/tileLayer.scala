package typingsJapgolly.leaflet.mod

import typingsJapgolly.leaflet.mod.TileLayer_.WMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileLayer {
  
  inline def apply(urlTemplate: String): TileLayer_ = ^.asInstanceOf[js.Dynamic].apply(urlTemplate.asInstanceOf[js.Any]).asInstanceOf[TileLayer_]
  inline def apply(urlTemplate: String, options: TileLayerOptions): TileLayer_ = (^.asInstanceOf[js.Dynamic].apply(urlTemplate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TileLayer_]
  
  @JSImport("leaflet", "tileLayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def wms(baseUrl: String): WMS = ^.asInstanceOf[js.Dynamic].applyDynamic("wms")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[WMS]
  inline def wms(baseUrl: String, options: WMSOptions): WMS = (^.asInstanceOf[js.Dynamic].applyDynamic("wms")(baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WMS]
}
