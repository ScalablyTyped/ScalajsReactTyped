package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.BulkRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.BulkResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[TDocument, TPartialDocument](params: BulkRequest[TDocument, TPartialDocument]): js.Promise[BulkResponse] = js.native
  def apply[TDocument, TPartialDocument](params: BulkRequest[TDocument, TPartialDocument], options: TransportRequestOptions): js.Promise[BulkResponse] = js.native
  def apply[TDocument, TPartialDocument](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.BulkRequest[TDocument, TPartialDocument]
  ): js.Promise[BulkResponse] = js.native
  def apply[TDocument, TPartialDocument](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.BulkRequest[TDocument, TPartialDocument],
    options: TransportRequestOptions
  ): js.Promise[BulkResponse] = js.native
}
