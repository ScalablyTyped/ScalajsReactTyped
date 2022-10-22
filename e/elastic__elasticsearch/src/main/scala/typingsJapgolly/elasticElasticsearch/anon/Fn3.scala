package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IndexRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IndexResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn3 extends StObject {
  
  def apply[TDocument](params: IndexRequest[TDocument]): js.Promise[IndexResponse] = js.native
  def apply[TDocument](params: IndexRequest[TDocument], options: TransportRequestOptions): js.Promise[IndexResponse] = js.native
  def apply[TDocument](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexRequest[TDocument]): js.Promise[IndexResponse] = js.native
  def apply[TDocument](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexRequest[TDocument],
    options: TransportRequestOptions
  ): js.Promise[IndexResponse] = js.native
}
