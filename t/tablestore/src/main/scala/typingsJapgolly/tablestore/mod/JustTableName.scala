package typingsJapgolly.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JustTableName extends StObject {
  
  var tableName: String
}
object JustTableName {
  
  inline def apply(tableName: String): JustTableName = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustTableName]
  }
  
  extension [Self <: JustTableName](x: Self) {
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
