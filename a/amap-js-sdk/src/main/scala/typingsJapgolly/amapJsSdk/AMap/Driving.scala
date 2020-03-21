package typingsJapgolly.amapJsSdk.AMap

import typingsJapgolly.amapJsSdk.AnonDestination
import typingsJapgolly.amapJsSdk.AnonExtensions
import typingsJapgolly.amapJsSdk.AnonKeyword
import typingsJapgolly.amapJsSdk.AnonWaypoints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Driving")
@js.native
class Driving () extends EventBindable {
  def this(options: AnonExtensions) = this()
  def clear(): Unit = js.native
  def clearAvoidPolygons(): Unit = js.native
  def clearAvoidRoad(): Unit = js.native
  def getAvlidPolygons(): js.Array[js.Array[LngLat]] = js.native
  def getAvoidRoad(): String = js.native
  def search(origin: LngLat, destination: LngLat): Unit = js.native
  def search(origin: LngLat, destination: LngLat, opts: AnonWaypoints): Unit = js.native
  def search(
    origin: LngLat,
    destination: LngLat,
    opts: AnonWaypoints,
    callback: js.Function2[/* status */ String, /* result */ String | DrivingResult, Unit]
  ): Unit = js.native
  def search(
    point: js.Array[AnonKeyword],
    callback: js.Function2[/* status */ String, /* result */ String | DrivingResult, Unit]
  ): Unit = js.native
  def searchOnAMAP(obj: AnonDestination): Unit = js.native
  def setAvoidPolygons(path: js.Array[js.Array[LngLat]]): Unit = js.native
  def setAvoidRoad(road: String): Unit = js.native
  def setPolicy(policy: DrivingPolicy): Unit = js.native
}

