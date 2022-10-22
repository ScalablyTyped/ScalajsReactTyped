package typingsJapgolly.hafasClient.mod

import typingsJapgolly.hafasClient.hafasClientStrings.aircraft
import typingsJapgolly.hafasClient.hafasClientStrings.bicycle
import typingsJapgolly.hafasClient.hafasClientStrings.bus
import typingsJapgolly.hafasClient.hafasClientStrings.car
import typingsJapgolly.hafasClient.hafasClientStrings.gondola
import typingsJapgolly.hafasClient.hafasClientStrings.schedule
import typingsJapgolly.hafasClient.hafasClientStrings.taxi
import typingsJapgolly.hafasClient.hafasClientStrings.train
import typingsJapgolly.hafasClient.hafasClientStrings.walking
import typingsJapgolly.hafasClient.hafasClientStrings.watercraft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * There are many ways to format schedules of public transport routes.
  * This one tries to balance the amount of data and consumability.
  * It is specifically geared towards urban public transport, with frequent trains and homogenous travels.
  */
trait Schedule extends StObject {
  
  var id: String
  
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking
  
  var route: String
  
  var sequence: js.Array[ArrivalDeparture]
  
  /** array of Unix timestamps */
  var starts: js.Array[String]
  
  var `type`: schedule
}
object Schedule {
  
  inline def apply(
    id: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    route: String,
    sequence: js.Array[ArrivalDeparture],
    starts: js.Array[String]
  ): Schedule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], starts = starts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("schedule")
    __obj.asInstanceOf[Schedule]
  }
  
  extension [Self <: Schedule](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMode(value: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: js.Array[ArrivalDeparture]): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceVarargs(value: ArrivalDeparture*): Self = StObject.set(x, "sequence", js.Array(value*))
    
    inline def setStarts(value: js.Array[String]): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    inline def setStartsVarargs(value: String*): Self = StObject.set(x, "starts", js.Array(value*))
    
    inline def setType(value: schedule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
