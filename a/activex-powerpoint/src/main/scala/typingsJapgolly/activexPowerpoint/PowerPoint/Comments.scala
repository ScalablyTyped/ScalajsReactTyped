package typingsJapgolly.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Comments")
@js.native
class Comments protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Comments_typekey")
  var PowerPointDotComments_typekey: Comments = js.native
  def Add(Left: Double, Top: Double, Author: String, AuthorInitials: String, Text: String): Comment = js.native
  def Item(Index: Double): Comment = js.native
}

