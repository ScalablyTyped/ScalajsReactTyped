package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.GetRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.GetResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn1 extends StObject {
  
  def apply[TDocument](params: GetRequest): js.Promise[GetResponse[TDocument]] = js.native
  def apply[TDocument](params: GetRequest, options: TransportRequestOptions): js.Promise[GetResponse[TDocument]] = js.native
  def apply[TDocument](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetRequest): js.Promise[GetResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetRequest,
    options: TransportRequestOptions
  ): js.Promise[GetResponse[TDocument]] = js.native
}
