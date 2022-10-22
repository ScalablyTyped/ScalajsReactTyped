package typingsJapgolly.bmapgl.BMapGL

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusLine extends StObject {
  
  var company: String
  
  var endTime: String
  
  def getBusStation(i: Double): BusStation
  
  def getNumBusStations(): String
  
  def getPath(): js.Array[Point]
  
  def getPolyline(): Polyline
  
  var name: String
  
  var startTime: String
}
object BusLine {
  
  inline def apply(
    company: String,
    endTime: String,
    getBusStation: Double => BusStation,
    getNumBusStations: CallbackTo[String],
    getPath: CallbackTo[js.Array[Point]],
    getPolyline: CallbackTo[Polyline],
    name: String,
    startTime: String
  ): BusLine = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], getBusStation = js.Any.fromFunction1(getBusStation), getNumBusStations = getNumBusStations.toJsFn, getPath = getPath.toJsFn, getPolyline = getPolyline.toJsFn, name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusLine]
  }
  
  extension [Self <: BusLine](x: Self) {
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setGetBusStation(value: Double => BusStation): Self = StObject.set(x, "getBusStation", js.Any.fromFunction1(value))
    
    inline def setGetNumBusStations(value: CallbackTo[String]): Self = StObject.set(x, "getNumBusStations", value.toJsFn)
    
    inline def setGetPath(value: CallbackTo[js.Array[Point]]): Self = StObject.set(x, "getPath", value.toJsFn)
    
    inline def setGetPolyline(value: CallbackTo[Polyline]): Self = StObject.set(x, "getPolyline", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
