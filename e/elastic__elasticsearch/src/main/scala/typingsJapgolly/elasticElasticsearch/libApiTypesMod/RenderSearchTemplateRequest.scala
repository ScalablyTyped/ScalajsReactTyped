package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderSearchTemplateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var file: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var params: js.UndefOr[Record[String, Any]] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
}
object RenderSearchTemplateRequest {
  
  inline def apply(): RenderSearchTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderSearchTemplateRequest]
  }
  
  extension [Self <: RenderSearchTemplateRequest](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
