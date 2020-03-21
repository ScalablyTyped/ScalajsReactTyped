package typingsJapgolly.activexAdodb

import typingsJapgolly.activexAdodb.ADODB.Command
import typingsJapgolly.activexAdodb.ADODB.Connection
import typingsJapgolly.activexAdodb.ADODB.Field
import typingsJapgolly.activexAdodb.ADODB.Parameter
import typingsJapgolly.activexAdodb.ADODB.Record
import typingsJapgolly.activexAdodb.ADODB.Recordset
import typingsJapgolly.activexAdodb.ADODB.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("ADODB.Command")
  var ADODBDotCommand: Command = js.native
  @JSName("ADODB.Connection")
  var ADODBDotConnection: Connection = js.native
  @JSName("ADODB.Parameter")
  var ADODBDotParameter: Parameter = js.native
  @JSName("ADODB.Record")
  var ADODBDotRecord: Record = js.native
  @JSName("ADODB.Recordset")
  var ADODBDotRecordset_Original: Recordset = js.native
  @JSName("ADODB.Stream")
  var ADODBDotStream: Stream = js.native
  @JSName("ADODB.Recordset")
  def ADODBDotRecordset(FieldIndex: String): Field = js.native
  @JSName("ADODB.Recordset")
  def ADODBDotRecordset(FieldIndex: Double): Field = js.native
}

