package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MgetRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MgetResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn5 extends StObject {
  
  def apply[TDocument](): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: Unit, options: TransportRequestOptions): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: MgetRequest): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: MgetRequest, options: TransportRequestOptions): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetRequest): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetRequest,
    options: TransportRequestOptions
  ): js.Promise[MgetResponse[TDocument]] = js.native
}
