package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherSearchTemplateRequestBody extends StObject {
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var params: js.UndefOr[Record[String, Any]] = js.undefined
  
  var profile: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
}
object WatcherSearchTemplateRequestBody {
  
  inline def apply(): WatcherSearchTemplateRequestBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherSearchTemplateRequestBody]
  }
  
  extension [Self <: WatcherSearchTemplateRequestBody](x: Self) {
    
    inline def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
