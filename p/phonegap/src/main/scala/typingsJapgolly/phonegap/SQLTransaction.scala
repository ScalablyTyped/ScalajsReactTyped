package typingsJapgolly.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SQLTransaction extends StObject {
  
  def executeSql(sql: String): SQLResultSet
}
object SQLTransaction {
  
  inline def apply(executeSql: String => SQLResultSet): SQLTransaction = {
    val __obj = js.Dynamic.literal(executeSql = js.Any.fromFunction1(executeSql))
    __obj.asInstanceOf[SQLTransaction]
  }
  
  extension [Self <: SQLTransaction](x: Self) {
    
    inline def setExecuteSql(value: String => SQLResultSet): Self = StObject.set(x, "executeSql", js.Any.fromFunction1(value))
  }
}
