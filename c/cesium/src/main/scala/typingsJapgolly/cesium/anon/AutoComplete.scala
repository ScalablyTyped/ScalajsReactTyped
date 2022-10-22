package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Cartesian3
import typingsJapgolly.cesium.mod.Geocoder.DestinationFoundFunction
import typingsJapgolly.cesium.mod.GeocoderService
import typingsJapgolly.cesium.mod.GeocoderViewModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoComplete extends StObject {
  
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  
  var container: org.scalajs.dom.Element | String
  
  var destinationFound: js.UndefOr[DestinationFoundFunction] = js.undefined
  
  var flightDuration: js.UndefOr[Double] = js.undefined
  
  var geocoderServices: js.UndefOr[js.Array[GeocoderService]] = js.undefined
  
  var scene: typingsJapgolly.cesium.mod.Scene
}
object AutoComplete {
  
  inline def apply(container: org.scalajs.dom.Element | String, scene: typingsJapgolly.cesium.mod.Scene): AutoComplete = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoComplete]
  }
  
  extension [Self <: AutoComplete](x: Self) {
    
    inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setContainer(value: org.scalajs.dom.Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setDestinationFound(
      value: (/* viewModel */ GeocoderViewModel, /* destination */ Cartesian3 | typingsJapgolly.cesium.mod.Rectangle) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "destinationFound", js.Any.fromFunction2((t0: /* viewModel */ GeocoderViewModel, t1: /* destination */ Cartesian3 | typingsJapgolly.cesium.mod.Rectangle) => (value(t0, t1)).runNow()))
    
    inline def setDestinationFoundUndefined: Self = StObject.set(x, "destinationFound", js.undefined)
    
    inline def setFlightDuration(value: Double): Self = StObject.set(x, "flightDuration", value.asInstanceOf[js.Any])
    
    inline def setFlightDurationUndefined: Self = StObject.set(x, "flightDuration", js.undefined)
    
    inline def setGeocoderServices(value: js.Array[GeocoderService]): Self = StObject.set(x, "geocoderServices", value.asInstanceOf[js.Any])
    
    inline def setGeocoderServicesUndefined: Self = StObject.set(x, "geocoderServices", js.undefined)
    
    inline def setGeocoderServicesVarargs(value: GeocoderService*): Self = StObject.set(x, "geocoderServices", js.Array(value*))
    
    inline def setScene(value: typingsJapgolly.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
