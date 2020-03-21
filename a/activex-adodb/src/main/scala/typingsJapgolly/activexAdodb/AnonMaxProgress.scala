package typingsJapgolly.activexAdodb

import typingsJapgolly.activexAdodb.ADODB.EventStatusEnum
import typingsJapgolly.activexAdodb.ADODB.Field
import typingsJapgolly.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxProgress extends js.Object {
  val MaxProgress: Double = js.native
  val Progress: Double = js.native
  var adStatus: EventStatusEnum = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

