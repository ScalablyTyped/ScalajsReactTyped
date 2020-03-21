package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusLine extends js.Object {
  var company: String
  var endTime: String
  var name: String
  var startTime: String
  def getBusStation(i: Double): BusStation
  def getNumBusStations(): String
  def getPath(): js.Array[Point]
  def getPolyline(): Polyline
}

object BusLine {
  @scala.inline
  def apply(
    company: String,
    endTime: String,
    getBusStation: Double => CallbackTo[BusStation],
    getNumBusStations: CallbackTo[String],
    getPath: CallbackTo[js.Array[Point]],
    getPolyline: CallbackTo[Polyline],
    name: String,
    startTime: String
  ): BusLine = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.updateDynamic("getBusStation")(js.Any.fromFunction1((t0: scala.Double) => getBusStation(t0).runNow()))
    __obj.updateDynamic("getNumBusStations")(getNumBusStations.toJsFn)
    __obj.updateDynamic("getPath")(getPath.toJsFn)
    __obj.updateDynamic("getPolyline")(getPolyline.toJsFn)
    __obj.asInstanceOf[BusLine]
  }
}

