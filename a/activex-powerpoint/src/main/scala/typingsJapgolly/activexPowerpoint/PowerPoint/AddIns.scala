package typingsJapgolly.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AddIns")
@js.native
class AddIns protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.AddIns_typekey")
  var PowerPointDotAddIns_typekey: AddIns = js.native
  def Add(FileName: String): AddIn = js.native
  def Item(Index: js.Any): AddIn = js.native
  def Remove(Index: js.Any): Unit = js.native
}

