package typingsJapgolly.trimblemapsTrimblemapsJs.global.TrimbleMaps

import typingsJapgolly.trimblemapsTrimblemapsJs.anon.Address
import typingsJapgolly.trimblemapsTrimblemapsJs.anon.Dataset
import typingsJapgolly.trimblemapsTrimblemapsJs.mod.Cancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geocoder {
  
  @JSGlobal("TrimbleMaps.Geocoder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def geocode(geocodeOptions: Address): Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(geocodeOptions.asInstanceOf[js.Any]).asInstanceOf[Cancelable]
  
  inline def reverseGeocode(reverseGeocodeOptions: Dataset): Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")(reverseGeocodeOptions.asInstanceOf[js.Any]).asInstanceOf[Cancelable]
}
