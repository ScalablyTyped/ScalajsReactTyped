package typingsJapgolly.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CustomLayouts")
@js.native
class CustomLayouts protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.CustomLayouts_typekey")
  var PowerPointDotCustomLayouts_typekey: CustomLayouts = js.native
  def Add(Index: Double): CustomLayout = js.native
  def Item(Index: js.Any): CustomLayout = js.native
  /** @param number [Index=-1] */
  def Paste(): CustomLayout = js.native
  def Paste(Index: Double): CustomLayout = js.native
}

