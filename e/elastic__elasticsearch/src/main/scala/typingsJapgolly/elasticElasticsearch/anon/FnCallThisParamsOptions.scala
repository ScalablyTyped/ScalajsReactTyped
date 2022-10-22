package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CreateRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CreateResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisParamsOptions extends StObject {
  
  def apply[TDocument](params: CreateRequest[TDocument]): js.Promise[CreateResponse] = js.native
  def apply[TDocument](params: CreateRequest[TDocument], options: TransportRequestOptions): js.Promise[CreateResponse] = js.native
  def apply[TDocument](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CreateRequest[TDocument]): js.Promise[CreateResponse] = js.native
  def apply[TDocument](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CreateRequest[TDocument],
    options: TransportRequestOptions
  ): js.Promise[CreateResponse] = js.native
}
