package typingsJapgolly.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Columns")
@js.native
class Columns protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Columns_typekey")
  var PowerPointDotColumns_typekey: Columns = js.native
  /** @param number [BeforeColumn=-1] */
  def Add(): Column = js.native
  def Add(BeforeColumn: Double): Column = js.native
  def Item(Index: Double): Column = js.native
}

