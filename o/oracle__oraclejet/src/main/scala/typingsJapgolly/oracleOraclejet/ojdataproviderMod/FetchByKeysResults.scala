package typingsJapgolly.oracleOraclejet.ojdataproviderMod

import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchByKeysResults[K, D] extends StObject {
  
  var fetchParameters: FetchByKeysParameters[K]
  
  var results: Map[K, Item[K, D]]
}
object FetchByKeysResults {
  
  inline def apply[K, D](fetchParameters: FetchByKeysParameters[K], results: Map[K, Item[K, D]]): FetchByKeysResults[K, D] = {
    val __obj = js.Dynamic.literal(fetchParameters = fetchParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysResults[K, D]]
  }
  
  extension [Self <: FetchByKeysResults[?, ?], K, D](x: Self & (FetchByKeysResults[K, D])) {
    
    inline def setFetchParameters(value: FetchByKeysParameters[K]): Self = StObject.set(x, "fetchParameters", value.asInstanceOf[js.Any])
    
    inline def setResults(value: Map[K, Item[K, D]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
