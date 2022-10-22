package typingsJapgolly.activexAdodb

import typingsJapgolly.activexAdodb.ADODB.Command
import typingsJapgolly.activexAdodb.ADODB.Connection
import typingsJapgolly.activexAdodb.ADODB.Field
import typingsJapgolly.activexAdodb.ADODB.Parameter
import typingsJapgolly.activexAdodb.ADODB.Record
import typingsJapgolly.activexAdodb.ADODB.Recordset
import typingsJapgolly.activexAdodb.ADODB.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("ADODB.Command")
  var ADODBDotCommand: Command
  
  @JSName("ADODB.Connection")
  var ADODBDotConnection: Connection
  
  @JSName("ADODB.Parameter")
  var ADODBDotParameter: Parameter
  
  @JSName("ADODB.Record")
  var ADODBDotRecord: Record
  
  @JSName("ADODB.Recordset")
  def ADODBDotRecordset(FieldIndex: String): Field
  @JSName("ADODB.Recordset")
  def ADODBDotRecordset(FieldIndex: Double): Field
  @JSName("ADODB.Recordset")
  var ADODBDotRecordset_Original: Recordset
  
  @JSName("ADODB.Stream")
  var ADODBDotStream: Stream
}
object ActiveXObjectNameMap {
  
  inline def apply(
    ADODBDotCommand: Command,
    ADODBDotConnection: Connection,
    ADODBDotParameter: Parameter,
    ADODBDotRecord: Record,
    ADODBDotRecordset: Recordset,
    ADODBDotStream: Stream
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADODB.Command")(ADODBDotCommand.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Connection")(ADODBDotConnection.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Parameter")(ADODBDotParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Record")(ADODBDotRecord.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Recordset")(ADODBDotRecordset.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Stream")(ADODBDotStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setADODBDotCommand(value: Command): Self = StObject.set(x, "ADODB.Command", value.asInstanceOf[js.Any])
    
    inline def setADODBDotConnection(value: Connection): Self = StObject.set(x, "ADODB.Connection", value.asInstanceOf[js.Any])
    
    inline def setADODBDotParameter(value: Parameter): Self = StObject.set(x, "ADODB.Parameter", value.asInstanceOf[js.Any])
    
    inline def setADODBDotRecord(value: Record): Self = StObject.set(x, "ADODB.Record", value.asInstanceOf[js.Any])
    
    inline def setADODBDotRecordset(value: Recordset): Self = StObject.set(x, "ADODB.Recordset", value.asInstanceOf[js.Any])
    
    inline def setADODBDotStream(value: Stream): Self = StObject.set(x, "ADODB.Stream", value.asInstanceOf[js.Any])
  }
}
