package typingsJapgolly.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  var Destination: String
  
  var Driver: js.UndefOr[String] = js.undefined
  
  var Mode: String
  
  var Name: js.UndefOr[String] = js.undefined
  
  var Propagation: String
  
  var RW: Boolean
  
  var Source: String
  
  var Type: String
}
object Destination {
  
  inline def apply(Destination: String, Mode: String, Propagation: String, RW: Boolean, Source: String, Type: String): Destination = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Propagation = Propagation.asInstanceOf[js.Any], RW = RW.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  extension [Self <: Destination](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "Driver", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPropagation(value: String): Self = StObject.set(x, "Propagation", value.asInstanceOf[js.Any])
    
    inline def setRW(value: Boolean): Self = StObject.set(x, "RW", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
