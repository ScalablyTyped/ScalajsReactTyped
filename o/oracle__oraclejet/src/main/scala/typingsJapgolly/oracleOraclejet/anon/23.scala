package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23`[K, D] extends StObject {
  
  var datasource: (DataProvider[K, D]) | Null
}
object `23` {
  
  inline def apply[K, D](): `23`[K, D] = {
    val __obj = js.Dynamic.literal(datasource = null)
    __obj.asInstanceOf[`23`[K, D]]
  }
  
  extension [Self <: `23`[?, ?], K, D](x: Self & (`23`[K, D])) {
    
    inline def setDatasource(value: DataProvider[K, D]): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
    
    inline def setDatasourceNull: Self = StObject.set(x, "datasource", null)
  }
}
