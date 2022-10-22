package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SearchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SearchResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn10 extends StObject {
  
  def apply[TDocument, TAggregations](): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: Unit, options: TransportRequestOptions): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: SearchRequest): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: SearchRequest, options: TransportRequestOptions): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchRequest): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchRequest,
    options: TransportRequestOptions
  ): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
}
