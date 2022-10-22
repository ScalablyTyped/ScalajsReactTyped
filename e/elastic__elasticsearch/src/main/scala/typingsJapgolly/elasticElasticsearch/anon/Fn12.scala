package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TermvectorsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TermvectorsResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn12 extends StObject {
  
  def apply[TDocument](params: TermvectorsRequest[TDocument]): js.Promise[TermvectorsResponse] = js.native
  def apply[TDocument](params: TermvectorsRequest[TDocument], options: TransportRequestOptions): js.Promise[TermvectorsResponse] = js.native
  def apply[TDocument](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermvectorsRequest[TDocument]
  ): js.Promise[TermvectorsResponse] = js.native
  def apply[TDocument](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermvectorsRequest[TDocument],
    options: TransportRequestOptions
  ): js.Promise[TermvectorsResponse] = js.native
}
