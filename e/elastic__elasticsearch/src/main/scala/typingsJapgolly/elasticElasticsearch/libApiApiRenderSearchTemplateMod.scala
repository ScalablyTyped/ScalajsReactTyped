package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RenderSearchTemplateRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RenderSearchTemplateResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiRenderSearchTemplateMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/render_search_template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[RenderSearchTemplateResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[RenderSearchTemplateResponse]]
  inline def default(params: Unit, options: TransportRequestOptions): js.Promise[RenderSearchTemplateResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RenderSearchTemplateResponse]]
  inline def default(params: RenderSearchTemplateRequest): js.Promise[RenderSearchTemplateResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RenderSearchTemplateResponse]]
  inline def default(params: RenderSearchTemplateRequest, options: TransportRequestOptions): js.Promise[RenderSearchTemplateResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RenderSearchTemplateResponse]]
  inline def default(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RenderSearchTemplateRequest): js.Promise[RenderSearchTemplateResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RenderSearchTemplateResponse]]
  inline def default(
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RenderSearchTemplateRequest,
    options: TransportRequestOptions
  ): js.Promise[RenderSearchTemplateResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RenderSearchTemplateResponse]]
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    extension [Self <: That](x: Self) {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
