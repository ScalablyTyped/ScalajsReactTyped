package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.maximMazurokGapiClientBooks.anon.LayerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsSummary extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  var layers: js.UndefOr[js.Array[LayerId]] = js.undefined
}
object AnnotationsSummary {
  
  inline def apply(): AnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsSummary]
  }
  
  extension [Self <: AnnotationsSummary](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLayers(value: js.Array[LayerId]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: LayerId*): Self = StObject.set(x, "layers", js.Array(value*))
  }
}
