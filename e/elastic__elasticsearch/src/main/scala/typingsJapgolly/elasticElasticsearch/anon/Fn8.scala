package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.ScriptsPainlessExecuteRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.ScriptsPainlessExecuteResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn8 extends StObject {
  
  def apply[TResult](): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: Unit, options: TransportRequestOptions): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: ScriptsPainlessExecuteRequest): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: ScriptsPainlessExecuteRequest, options: TransportRequestOptions): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest
  ): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest,
    options: TransportRequestOptions
  ): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
}
