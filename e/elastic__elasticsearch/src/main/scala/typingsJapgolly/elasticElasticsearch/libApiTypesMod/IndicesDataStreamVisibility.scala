package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDataStreamVisibility extends StObject {
  
  var hidden: js.UndefOr[Boolean] = js.undefined
}
object IndicesDataStreamVisibility {
  
  inline def apply(): IndicesDataStreamVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesDataStreamVisibility]
  }
  
  extension [Self <: IndicesDataStreamVisibility](x: Self) {
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
  }
}
