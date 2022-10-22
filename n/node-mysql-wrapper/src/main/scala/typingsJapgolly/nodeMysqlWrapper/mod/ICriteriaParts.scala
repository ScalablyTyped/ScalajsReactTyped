package typingsJapgolly.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICriteriaParts extends StObject {
  
  var noDatabaseProperties: js.Array[String]
  
  var rawCriteriaObject: Any
  
  def selectFromClause[T](_table: Table[T]): String
  
  var tables: js.Array[TableToSearchPart]
  
  var whereClause: String
}
object ICriteriaParts {
  
  inline def apply(
    noDatabaseProperties: js.Array[String],
    rawCriteriaObject: Any,
    selectFromClause: Table[Any] => String,
    tables: js.Array[TableToSearchPart],
    whereClause: String
  ): ICriteriaParts = {
    val __obj = js.Dynamic.literal(noDatabaseProperties = noDatabaseProperties.asInstanceOf[js.Any], rawCriteriaObject = rawCriteriaObject.asInstanceOf[js.Any], selectFromClause = js.Any.fromFunction1(selectFromClause), tables = tables.asInstanceOf[js.Any], whereClause = whereClause.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICriteriaParts]
  }
  
  extension [Self <: ICriteriaParts](x: Self) {
    
    inline def setNoDatabaseProperties(value: js.Array[String]): Self = StObject.set(x, "noDatabaseProperties", value.asInstanceOf[js.Any])
    
    inline def setNoDatabasePropertiesVarargs(value: String*): Self = StObject.set(x, "noDatabaseProperties", js.Array(value*))
    
    inline def setRawCriteriaObject(value: Any): Self = StObject.set(x, "rawCriteriaObject", value.asInstanceOf[js.Any])
    
    inline def setSelectFromClause(value: Table[Any] => String): Self = StObject.set(x, "selectFromClause", js.Any.fromFunction1(value))
    
    inline def setTables(value: js.Array[TableToSearchPart]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesVarargs(value: TableToSearchPart*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setWhereClause(value: String): Self = StObject.set(x, "whereClause", value.asInstanceOf[js.Any])
  }
}
