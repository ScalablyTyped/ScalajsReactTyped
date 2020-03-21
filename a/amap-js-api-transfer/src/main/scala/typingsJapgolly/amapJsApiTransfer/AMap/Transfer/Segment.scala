package typingsJapgolly.amapJsApiTransfer.AMap.Transfer

import typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.BUS
import typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.METRO_RAIL
import typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.RAILWAY
import typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.SUBWAY
import typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.TAXI
import typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.WALK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiTransfer.AMap.Transfer.WalkSegment
  - typingsJapgolly.amapJsApiTransfer.AMap.Transfer.TaxiSegment
  - typingsJapgolly.amapJsApiTransfer.AMap.Transfer.TransitSegment
  - typingsJapgolly.amapJsApiTransfer.AMap.Transfer.RailwaySegment
*/
trait Segment extends js.Object

object Segment {
  @scala.inline
  def WalkSegment(distance: Double, instruction: String, time: Double, transit: WalkDetails, transit_mode: WALK): Segment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  def TaxiSegment(distance: Double, instruction: String, time: Double, transit: TaxiDetails, transit_mode: TAXI): Segment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  def TransitSegment(
    distance: Double,
    instruction: String,
    time: Double,
    transit: TransitDetails,
    transit_mode: SUBWAY | METRO_RAIL | BUS
  ): Segment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  def RailwaySegment(
    distance: Double,
    instruction: String,
    time: Double,
    transit: RailwayDetails,
    transit_mode: RAILWAY
  ): Segment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Segment]
  }
}

