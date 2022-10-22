package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MsearchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MsearchResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn6 extends StObject {
  
  def apply[TDocument, TAggregations](params: MsearchRequest): js.Promise[MsearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: MsearchRequest, options: TransportRequestOptions): js.Promise[MsearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest): js.Promise[MsearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest,
    options: TransportRequestOptions
  ): js.Promise[MsearchResponse[TDocument, TAggregations]] = js.native
}
