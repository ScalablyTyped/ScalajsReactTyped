package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MtermvectorsResponse extends StObject {
  
  var docs: js.Array[MtermvectorsTermVectorsResult]
}
object MtermvectorsResponse {
  
  inline def apply(docs: js.Array[MtermvectorsTermVectorsResult]): MtermvectorsResponse = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MtermvectorsResponse]
  }
  
  extension [Self <: MtermvectorsResponse](x: Self) {
    
    inline def setDocs(value: js.Array[MtermvectorsTermVectorsResult]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsVarargs(value: MtermvectorsTermVectorsResult*): Self = StObject.set(x, "docs", js.Array(value*))
  }
}
