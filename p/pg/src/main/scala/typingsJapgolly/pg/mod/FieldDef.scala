package typingsJapgolly.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldDef extends StObject {
  
  var columnID: Double
  
  var dataTypeID: Double
  
  var dataTypeModifier: Double
  
  var dataTypeSize: Double
  
  var format: String
  
  var name: String
  
  var tableID: Double
}
object FieldDef {
  
  inline def apply(
    columnID: Double,
    dataTypeID: Double,
    dataTypeModifier: Double,
    dataTypeSize: Double,
    format: String,
    name: String,
    tableID: Double
  ): FieldDef = {
    val __obj = js.Dynamic.literal(columnID = columnID.asInstanceOf[js.Any], dataTypeID = dataTypeID.asInstanceOf[js.Any], dataTypeModifier = dataTypeModifier.asInstanceOf[js.Any], dataTypeSize = dataTypeSize.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tableID = tableID.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDef]
  }
  
  extension [Self <: FieldDef](x: Self) {
    
    inline def setColumnID(value: Double): Self = StObject.set(x, "columnID", value.asInstanceOf[js.Any])
    
    inline def setDataTypeID(value: Double): Self = StObject.set(x, "dataTypeID", value.asInstanceOf[js.Any])
    
    inline def setDataTypeModifier(value: Double): Self = StObject.set(x, "dataTypeModifier", value.asInstanceOf[js.Any])
    
    inline def setDataTypeSize(value: Double): Self = StObject.set(x, "dataTypeSize", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTableID(value: Double): Self = StObject.set(x, "tableID", value.asInstanceOf[js.Any])
  }
}
