package typingsJapgolly.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordColumn extends StObject {
  
  /**
    * Reference to the data element in the streaming input or the reference data source. This element is required if the RecordFormatType is JSON.
    */
  var Mapping: js.UndefOr[RecordColumnMapping] = js.undefined
  
  /**
    * Name of the column created in the in-application input stream or reference table.
    */
  var Name: RecordColumnName
  
  /**
    * Type of column created in the in-application input stream or reference table.
    */
  var SqlType: RecordColumnSqlType
}
object RecordColumn {
  
  inline def apply(Name: RecordColumnName, SqlType: RecordColumnSqlType): RecordColumn = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SqlType = SqlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordColumn]
  }
  
  extension [Self <: RecordColumn](x: Self) {
    
    inline def setMapping(value: RecordColumnMapping): Self = StObject.set(x, "Mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "Mapping", js.undefined)
    
    inline def setName(value: RecordColumnName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSqlType(value: RecordColumnSqlType): Self = StObject.set(x, "SqlType", value.asInstanceOf[js.Any])
  }
}
