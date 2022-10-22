package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.ScrollRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.ScrollResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn9 extends StObject {
  
  def apply[TDocument, TAggregations](params: ScrollRequest): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: ScrollRequest, options: TransportRequestOptions): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScrollRequest): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScrollRequest,
    options: TransportRequestOptions
  ): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
}
