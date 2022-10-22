package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MsearchTemplateRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MsearchTemplateResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn7 extends StObject {
  
  def apply[TDocument, TAggregations](params: MsearchTemplateRequest): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: MsearchTemplateRequest, options: TransportRequestOptions): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchTemplateRequest): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchTemplateRequest,
    options: TransportRequestOptions
  ): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
}
