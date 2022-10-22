package typingsJapgolly.hafasClient.mod

import typingsJapgolly.hafasClient.hafasClientStrings.aircraft
import typingsJapgolly.hafasClient.hafasClientStrings.bicycle
import typingsJapgolly.hafasClient.hafasClientStrings.bus
import typingsJapgolly.hafasClient.hafasClientStrings.car
import typingsJapgolly.hafasClient.hafasClientStrings.gondola
import typingsJapgolly.hafasClient.hafasClientStrings.route
import typingsJapgolly.hafasClient.hafasClientStrings.taxi
import typingsJapgolly.hafasClient.hafasClientStrings.train
import typingsJapgolly.hafasClient.hafasClientStrings.walking
import typingsJapgolly.hafasClient.hafasClientStrings.watercraft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A route represents a single set of stations, of a single line.
  */
trait Route extends StObject {
  
  var id: String
  
  var line: String
  
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking
  
  /** stop ids */
  var stops: js.Array[String]
  
  var `type`: route
}
object Route {
  
  inline def apply(
    id: String,
    line: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    stops: js.Array[String]
  ): Route = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("route")
    __obj.asInstanceOf[Route]
  }
  
  extension [Self <: Route](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setMode(value: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[String]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: String*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: route): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
