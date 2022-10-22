package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlClearCursorRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlClearCursorResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlDeleteAsyncRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlDeleteAsyncResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlGetAsyncRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlGetAsyncResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlGetAsyncStatusRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlGetAsyncStatusResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlQueryRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlQueryResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlTranslateRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SqlTranslateResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiSqlMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/sql", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Sql {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Sql extends StObject {
    
    def clearCursor(params: SqlClearCursorRequest): js.Promise[SqlClearCursorResponse] = js.native
    def clearCursor(params: SqlClearCursorRequest, options: TransportRequestOptions): js.Promise[SqlClearCursorResponse] = js.native
    def clearCursor(params: SqlClearCursorRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlClearCursorResponse, Any]] = js.native
    def clearCursor(params: SqlClearCursorRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlClearCursorResponse] = js.native
    def clearCursor(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlClearCursorRequest): js.Promise[SqlClearCursorResponse] = js.native
    def clearCursor(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlClearCursorRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlClearCursorResponse] = js.native
    def clearCursor(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlClearCursorRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlClearCursorResponse, Any]] = js.native
    def clearCursor(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlClearCursorRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlClearCursorResponse] = js.native
    
    def deleteAsync(params: SqlDeleteAsyncRequest): js.Promise[SqlDeleteAsyncResponse] = js.native
    def deleteAsync(params: SqlDeleteAsyncRequest, options: TransportRequestOptions): js.Promise[SqlDeleteAsyncResponse] = js.native
    def deleteAsync(params: SqlDeleteAsyncRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlDeleteAsyncResponse, Any]] = js.native
    def deleteAsync(params: SqlDeleteAsyncRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlDeleteAsyncResponse] = js.native
    def deleteAsync(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlDeleteAsyncRequest): js.Promise[SqlDeleteAsyncResponse] = js.native
    def deleteAsync(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlDeleteAsyncRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlDeleteAsyncResponse] = js.native
    def deleteAsync(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlDeleteAsyncRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlDeleteAsyncResponse, Any]] = js.native
    def deleteAsync(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlDeleteAsyncRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlDeleteAsyncResponse] = js.native
    
    def getAsync(params: SqlGetAsyncRequest): js.Promise[SqlGetAsyncResponse] = js.native
    def getAsync(params: SqlGetAsyncRequest, options: TransportRequestOptions): js.Promise[SqlGetAsyncResponse] = js.native
    def getAsync(params: SqlGetAsyncRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlGetAsyncResponse, Any]] = js.native
    def getAsync(params: SqlGetAsyncRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlGetAsyncResponse] = js.native
    def getAsync(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncRequest): js.Promise[SqlGetAsyncResponse] = js.native
    def getAsync(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlGetAsyncResponse] = js.native
    def getAsync(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlGetAsyncResponse, Any]] = js.native
    def getAsync(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlGetAsyncResponse] = js.native
    
    def getAsyncStatus(params: SqlGetAsyncStatusRequest): js.Promise[SqlGetAsyncStatusResponse] = js.native
    def getAsyncStatus(params: SqlGetAsyncStatusRequest, options: TransportRequestOptions): js.Promise[SqlGetAsyncStatusResponse] = js.native
    def getAsyncStatus(params: SqlGetAsyncStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlGetAsyncStatusResponse, Any]] = js.native
    def getAsyncStatus(params: SqlGetAsyncStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlGetAsyncStatusResponse] = js.native
    def getAsyncStatus(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncStatusRequest): js.Promise[SqlGetAsyncStatusResponse] = js.native
    def getAsyncStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlGetAsyncStatusResponse] = js.native
    def getAsyncStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlGetAsyncStatusResponse, Any]] = js.native
    def getAsyncStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlGetAsyncStatusResponse] = js.native
    
    def query(): js.Promise[SqlQueryResponse] = js.native
    def query(params: Unit, options: TransportRequestOptions): js.Promise[SqlQueryResponse] = js.native
    def query(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlQueryResponse, Any]] = js.native
    def query(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlQueryResponse] = js.native
    def query(params: SqlQueryRequest): js.Promise[SqlQueryResponse] = js.native
    def query(params: SqlQueryRequest, options: TransportRequestOptions): js.Promise[SqlQueryResponse] = js.native
    def query(params: SqlQueryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlQueryResponse, Any]] = js.native
    def query(params: SqlQueryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlQueryResponse] = js.native
    def query(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlQueryRequest): js.Promise[SqlQueryResponse] = js.native
    def query(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlQueryRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlQueryResponse] = js.native
    def query(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlQueryRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlQueryResponse, Any]] = js.native
    def query(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlQueryRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlQueryResponse] = js.native
    
    def translate(params: SqlTranslateRequest): js.Promise[SqlTranslateResponse] = js.native
    def translate(params: SqlTranslateRequest, options: TransportRequestOptions): js.Promise[SqlTranslateResponse] = js.native
    def translate(params: SqlTranslateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlTranslateResponse, Any]] = js.native
    def translate(params: SqlTranslateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlTranslateResponse] = js.native
    def translate(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlTranslateRequest): js.Promise[SqlTranslateResponse] = js.native
    def translate(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlTranslateRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlTranslateResponse] = js.native
    def translate(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlTranslateRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlTranslateResponse, Any]] = js.native
    def translate(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlTranslateRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlTranslateResponse] = js.native
    
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
