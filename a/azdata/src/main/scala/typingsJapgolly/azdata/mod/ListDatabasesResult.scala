package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatabasesResult extends StObject {
  
  var databaseNames: js.Array[String]
  
  var databases: js.UndefOr[js.Array[DatabaseInfo]] = js.undefined
}
object ListDatabasesResult {
  
  inline def apply(databaseNames: js.Array[String]): ListDatabasesResult = {
    val __obj = js.Dynamic.literal(databaseNames = databaseNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatabasesResult]
  }
  
  extension [Self <: ListDatabasesResult](x: Self) {
    
    inline def setDatabaseNames(value: js.Array[String]): Self = StObject.set(x, "databaseNames", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNamesVarargs(value: String*): Self = StObject.set(x, "databaseNames", js.Array(value*))
    
    inline def setDatabases(value: js.Array[DatabaseInfo]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "databases", js.undefined)
    
    inline def setDatabasesVarargs(value: DatabaseInfo*): Self = StObject.set(x, "databases", js.Array(value*))
  }
}
