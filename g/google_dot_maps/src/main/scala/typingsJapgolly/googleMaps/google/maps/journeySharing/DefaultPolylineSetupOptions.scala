package typingsJapgolly.googleMaps.google.maps.journeySharing

import typingsJapgolly.googleMaps.google.maps.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * PolylineSetup default options.
  */
trait DefaultPolylineSetupOptions extends StObject {
  
  /**
    * Default polyline options.
    */
  var defaultPolylineOptions: PolylineOptions
  
  /**
    * Default polyline visibility.
    */
  var defaultVisible: Boolean
}
object DefaultPolylineSetupOptions {
  
  inline def apply(defaultPolylineOptions: PolylineOptions, defaultVisible: Boolean): DefaultPolylineSetupOptions = {
    val __obj = js.Dynamic.literal(defaultPolylineOptions = defaultPolylineOptions.asInstanceOf[js.Any], defaultVisible = defaultVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPolylineSetupOptions]
  }
  
  extension [Self <: DefaultPolylineSetupOptions](x: Self) {
    
    inline def setDefaultPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "defaultPolylineOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
  }
}
