package typingsJapgolly.activexAdodb.ADODB.EventHelperTypes

import typingsJapgolly.activexAdodb.ADODB.Command
import typingsJapgolly.activexAdodb.ADODB.Connection
import typingsJapgolly.activexAdodb.ADODB.CursorTypeEnum
import typingsJapgolly.activexAdodb.ADODB.EventStatusEnum
import typingsJapgolly.activexAdodb.ADODB.Field
import typingsJapgolly.activexAdodb.ADODB.LockTypeEnum
import typingsJapgolly.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionWillExecuteParameter extends js.Object {
  var CursorType: CursorTypeEnum = js.native
  var LockType: LockTypeEnum = js.native
  var Options: Double = js.native
  var Source: String = js.native
  var adStatus: EventStatusEnum = js.native
  val pCommand: Command = js.native
  val pConnection: Connection = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

