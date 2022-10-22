package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TasksCancelRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TasksCancelResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TasksGetRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TasksGetResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TasksListRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TasksListResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiTasksMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/tasks", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Tasks {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Tasks extends StObject {
    
    def cancel(): js.Promise[TasksCancelResponse] = js.native
    def cancel(params: Unit, options: TransportRequestOptions): js.Promise[TasksCancelResponse] = js.native
    def cancel(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TasksCancelResponse, Any]] = js.native
    def cancel(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[TasksCancelResponse] = js.native
    def cancel(params: TasksCancelRequest): js.Promise[TasksCancelResponse] = js.native
    def cancel(params: TasksCancelRequest, options: TransportRequestOptions): js.Promise[TasksCancelResponse] = js.native
    def cancel(params: TasksCancelRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TasksCancelResponse, Any]] = js.native
    def cancel(params: TasksCancelRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TasksCancelResponse] = js.native
    def cancel(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksCancelRequest): js.Promise[TasksCancelResponse] = js.native
    def cancel(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksCancelRequest,
      options: TransportRequestOptions
    ): js.Promise[TasksCancelResponse] = js.native
    def cancel(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksCancelRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TasksCancelResponse, Any]] = js.native
    def cancel(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksCancelRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TasksCancelResponse] = js.native
    
    def get(params: TasksGetRequest): js.Promise[TasksGetResponse] = js.native
    def get(params: TasksGetRequest, options: TransportRequestOptions): js.Promise[TasksGetResponse] = js.native
    def get(params: TasksGetRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TasksGetResponse, Any]] = js.native
    def get(params: TasksGetRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TasksGetResponse] = js.native
    def get(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksGetRequest): js.Promise[TasksGetResponse] = js.native
    def get(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksGetRequest,
      options: TransportRequestOptions
    ): js.Promise[TasksGetResponse] = js.native
    def get(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksGetRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TasksGetResponse, Any]] = js.native
    def get(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksGetRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TasksGetResponse] = js.native
    
    def list(): js.Promise[TasksListResponse] = js.native
    def list(params: Unit, options: TransportRequestOptions): js.Promise[TasksListResponse] = js.native
    def list(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TasksListResponse, Any]] = js.native
    def list(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[TasksListResponse] = js.native
    def list(params: TasksListRequest): js.Promise[TasksListResponse] = js.native
    def list(params: TasksListRequest, options: TransportRequestOptions): js.Promise[TasksListResponse] = js.native
    def list(params: TasksListRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TasksListResponse, Any]] = js.native
    def list(params: TasksListRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TasksListResponse] = js.native
    def list(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksListRequest): js.Promise[TasksListResponse] = js.native
    def list(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksListRequest,
      options: TransportRequestOptions
    ): js.Promise[TasksListResponse] = js.native
    def list(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksListRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TasksListResponse, Any]] = js.native
    def list(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TasksListRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TasksListResponse] = js.native
    
    var transport: Transport = js.native
  }
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    extension [Self <: That](x: Self) {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
