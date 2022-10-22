package typingsJapgolly.googleMaps.google.maps.localContext

import typingsJapgolly.googleMaps.google.maps.LatLng
import typingsJapgolly.googleMaps.google.maps.LatLngLiteral
import typingsJapgolly.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Provides settings for directions with a {@link
  * google.maps.localContext.LocalContextMapView}.
  */
trait MapDirectionsOptions
  extends StObject
     with MapDirectionsOptionsLiteral {
  
  /**
    * Adds the given listener function to the given event name.
    */
  def addListener(eventName: String, handler: js.Function): MapsEventListener
}
object MapDirectionsOptions {
  
  inline def apply(addListener: (String, js.Function) => MapsEventListener, origin: LatLng | LatLngLiteral): MapDirectionsOptions = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDirectionsOptions]
  }
  
  extension [Self <: MapDirectionsOptions](x: Self) {
    
    inline def setAddListener(value: (String, js.Function) => MapsEventListener): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
  }
}
