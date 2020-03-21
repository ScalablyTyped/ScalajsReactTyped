package typingsJapgolly.activexAdodb.ADODB.EventHelperTypes

import typingsJapgolly.activexAdodb.ADODB.Command
import typingsJapgolly.activexAdodb.ADODB.Connection
import typingsJapgolly.activexAdodb.ADODB.Error
import typingsJapgolly.activexAdodb.ADODB.EventStatusEnum
import typingsJapgolly.activexAdodb.ADODB.Field
import typingsJapgolly.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionExecuteCompleteParameter extends js.Object {
  val RecordsAffected: Double = js.native
  var adStatus: EventStatusEnum = js.native
  val pCommand: Command = js.native
  val pConnection: Connection = js.native
  val pError: Error = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

