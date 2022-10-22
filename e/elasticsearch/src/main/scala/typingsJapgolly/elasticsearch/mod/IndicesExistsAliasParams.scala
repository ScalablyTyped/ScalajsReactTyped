package typingsJapgolly.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesExistsAliasParams
  extends StObject
     with IndicesExistsParams {
  
  var name: NameList
}
object IndicesExistsAliasParams {
  
  inline def apply(index: NameList, name: NameList): IndicesExistsAliasParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesExistsAliasParams]
  }
  
  extension [Self <: IndicesExistsAliasParams](x: Self) {
    
    inline def setName(value: NameList): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
