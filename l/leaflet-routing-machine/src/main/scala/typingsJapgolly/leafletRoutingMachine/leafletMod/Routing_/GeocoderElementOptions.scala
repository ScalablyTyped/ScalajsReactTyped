package typingsJapgolly.leafletRoutingMachine.leafletMod.Routing_

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocoderElementOptions extends StObject {
  
  var autocompleteOptions: js.UndefOr[js.Object] = js.undefined
  
  var createGeocoder: js.UndefOr[js.Function3[/* i */ Double, /* nWps */ Double, /* options */ this.type, Any]] = js.undefined
  
  var geocoderClass: js.UndefOr[js.Function0[String]] = js.undefined
  
  var geocoderPlaceholder: js.UndefOr[
    js.Function3[
      /* i */ Double, 
      /* numberOfWaypoints */ Double, 
      /* geocoderElement */ GeocoderElement_, 
      String
    ]
  ] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var maxGeocoderTolerance: js.UndefOr[Double] = js.undefined
  
  var waypointNameFallback: js.UndefOr[js.Function1[/* latLng */ LatLng_, String]] = js.undefined
}
object GeocoderElementOptions {
  
  inline def apply(): GeocoderElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderElementOptions]
  }
  
  extension [Self <: GeocoderElementOptions](x: Self) {
    
    inline def setAutocompleteOptions(value: js.Object): Self = StObject.set(x, "autocompleteOptions", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteOptionsUndefined: Self = StObject.set(x, "autocompleteOptions", js.undefined)
    
    inline def setCreateGeocoder(value: (/* i */ Double, /* nWps */ Double, GeocoderElementOptions) => Any): Self = StObject.set(x, "createGeocoder", js.Any.fromFunction3(value))
    
    inline def setCreateGeocoderUndefined: Self = StObject.set(x, "createGeocoder", js.undefined)
    
    inline def setGeocoderClass(value: CallbackTo[String]): Self = StObject.set(x, "geocoderClass", value.toJsFn)
    
    inline def setGeocoderClassUndefined: Self = StObject.set(x, "geocoderClass", js.undefined)
    
    inline def setGeocoderPlaceholder(
      value: (/* i */ Double, /* numberOfWaypoints */ Double, /* geocoderElement */ GeocoderElement_) => String
    ): Self = StObject.set(x, "geocoderPlaceholder", js.Any.fromFunction3(value))
    
    inline def setGeocoderPlaceholderUndefined: Self = StObject.set(x, "geocoderPlaceholder", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMaxGeocoderTolerance(value: Double): Self = StObject.set(x, "maxGeocoderTolerance", value.asInstanceOf[js.Any])
    
    inline def setMaxGeocoderToleranceUndefined: Self = StObject.set(x, "maxGeocoderTolerance", js.undefined)
    
    inline def setWaypointNameFallback(value: /* latLng */ LatLng_ => String): Self = StObject.set(x, "waypointNameFallback", js.Any.fromFunction1(value))
    
    inline def setWaypointNameFallbackUndefined: Self = StObject.set(x, "waypointNameFallback", js.undefined)
  }
}
