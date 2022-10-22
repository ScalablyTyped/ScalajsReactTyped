package typingsJapgolly.opentypeJs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table
  extends StObject
     with /* propName */ StringDictionary[Any] {
  
  def encode(): js.Array[Double]
  
  var fields: js.Array[Field]
  
  def sizeOf(): Double
  
  var tableName: String
  
  var tables: js.Array[Table]
}
object Table {
  
  inline def apply(
    encode: CallbackTo[js.Array[Double]],
    fields: js.Array[Field],
    sizeOf: CallbackTo[Double],
    tableName: String,
    tables: js.Array[Table]
  ): Table = {
    val __obj = js.Dynamic.literal(encode = encode.toJsFn, fields = fields.asInstanceOf[js.Any], sizeOf = sizeOf.toJsFn, tableName = tableName.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  extension [Self <: Table](x: Self) {
    
    inline def setEncode(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "encode", value.toJsFn)
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setSizeOf(value: CallbackTo[Double]): Self = StObject.set(x, "sizeOf", value.toJsFn)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTables(value: js.Array[Table]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesVarargs(value: Table*): Self = StObject.set(x, "tables", js.Array(value*))
  }
}
