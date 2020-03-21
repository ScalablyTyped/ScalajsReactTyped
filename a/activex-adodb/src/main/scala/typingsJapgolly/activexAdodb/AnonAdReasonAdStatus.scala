package typingsJapgolly.activexAdodb

import typingsJapgolly.activexAdodb.ADODB.EventReasonEnum
import typingsJapgolly.activexAdodb.ADODB.EventStatusEnum
import typingsJapgolly.activexAdodb.ADODB.Field
import typingsJapgolly.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdReasonAdStatus extends js.Object {
  val adReason: EventReasonEnum = js.native
  var adStatus: EventStatusEnum = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

