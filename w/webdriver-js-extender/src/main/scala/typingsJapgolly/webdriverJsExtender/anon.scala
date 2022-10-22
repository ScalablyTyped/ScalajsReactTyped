package typingsJapgolly.webdriverJsExtender

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Altitude extends StObject {
    
    var altitude: Double
    
    var latitude: Double
    
    var longitude: Double
  }
  object Altitude {
    
    inline def apply(altitude: Double, latitude: Double, longitude: Double): Altitude = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Altitude]
    }
    
    extension [Self <: Altitude](x: Self) {
      
      inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefineCommand extends StObject {
    
    def defineCommand(name: String, method: String, path: String): Unit
  }
  object DefineCommand {
    
    inline def apply(defineCommand: (String, String, String) => Callback): DefineCommand = {
      val __obj = js.Dynamic.literal(defineCommand = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (defineCommand(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[DefineCommand]
    }
    
    extension [Self <: DefineCommand](x: Self) {
      
      inline def setDefineCommand(value: (String, String, String) => Callback): Self = StObject.set(x, "defineCommand", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    }
  }
}
