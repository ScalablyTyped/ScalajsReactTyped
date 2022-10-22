package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.UpdateRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.UpdateResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn13 extends StObject {
  
  def apply[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument]): js.Promise[UpdateResponse[TDocumentR]] = js.native
  def apply[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument], options: TransportRequestOptions): js.Promise[UpdateResponse[TDocumentR]] = js.native
  def apply[TDocument, TPartialDocument, TDocumentR](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument]
  ): js.Promise[UpdateResponse[TDocumentR]] = js.native
  def apply[TDocument, TPartialDocument, TDocumentR](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument],
    options: TransportRequestOptions
  ): js.Promise[UpdateResponse[TDocumentR]] = js.native
}
