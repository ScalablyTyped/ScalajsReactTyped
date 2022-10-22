package typingsJapgolly.azureKustoData

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.axios.mod.AxiosInstance
import typingsJapgolly.axios.mod.AxiosRequestConfig
import typingsJapgolly.azureKustoData.sourceResponseMod.KustoResponseDataSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceClientMod {
  
  @JSImport("azure-kusto-data/source/client", JSImport.Default)
  @js.native
  open class default protected () extends KustoClient {
    def this(kcsb: String) = this()
    def this(kcsb: typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.default) = this()
  }
  
  @js.native
  sealed trait ExecutionType extends StObject
  @JSImport("azure-kusto-data/source/client", "ExecutionType")
  @js.native
  object ExecutionType extends StObject {
    
    @js.native
    sealed trait Ingest
      extends StObject
         with ExecutionType
    
    @js.native
    sealed trait Mgmt
      extends StObject
         with ExecutionType
    
    @js.native
    sealed trait Query
      extends StObject
         with ExecutionType
    
    @js.native
    sealed trait QueryV1
      extends StObject
         with ExecutionType
  }
  
  @JSImport("azure-kusto-data/source/client", "KustoClient")
  @js.native
  open class KustoClient protected () extends StObject {
    def this(kcsb: String) = this()
    def this(kcsb: typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.default) = this()
    
    def _doRequest(
      endpoint: String,
      executionType: ExecutionType,
      headers: StringDictionary[String],
      payload: Any,
      timeout: Double
    ): js.Promise[KustoResponseDataSet] = js.native
    def _doRequest(
      endpoint: String,
      executionType: ExecutionType,
      headers: StringDictionary[String],
      payload: Any,
      timeout: Double,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    
    def _execute(endpoint: String, executionType: ExecutionType, db: String, query: String, stream: Any): js.Promise[KustoResponseDataSet] = js.native
    def _execute(
      endpoint: String,
      executionType: ExecutionType,
      db: String,
      query: String,
      stream: Any,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    def _execute(endpoint: String, executionType: ExecutionType, db: String, query: Null, stream: Any): js.Promise[KustoResponseDataSet] = js.native
    def _execute(
      endpoint: String,
      executionType: ExecutionType,
      db: String,
      query: Null,
      stream: Any,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    def _execute(endpoint: String, executionType: ExecutionType, db: Null, query: String, stream: Any): js.Promise[KustoResponseDataSet] = js.native
    def _execute(
      endpoint: String,
      executionType: ExecutionType,
      db: Null,
      query: String,
      stream: Any,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    def _execute(endpoint: String, executionType: ExecutionType, db: Null, query: Null, stream: Any): js.Promise[KustoResponseDataSet] = js.native
    def _execute(
      endpoint: String,
      executionType: ExecutionType,
      db: Null,
      query: Null,
      stream: Any,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    
    def _getClientTimeout(executionType: ExecutionType): Double = js.native
    def _getClientTimeout(
      executionType: ExecutionType,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): Double = js.native
    
    def _parseResponse(response: Any, executionType: ExecutionType): KustoResponseDataSet = js.native
    def _parseResponse(response: Any, executionType: ExecutionType, properties: Null, status: Double): KustoResponseDataSet = js.native
    def _parseResponse(response: Any, executionType: ExecutionType, properties: Unit, status: Double): KustoResponseDataSet = js.native
    def _parseResponse(
      response: Any,
      executionType: ExecutionType,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): KustoResponseDataSet = js.native
    def _parseResponse(
      response: Any,
      executionType: ExecutionType,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default,
      status: Double
    ): KustoResponseDataSet = js.native
    
    var aadHelper: typingsJapgolly.azureKustoData.sourceSecurityMod.default = js.native
    
    def axiosInstance[T, R, D](config: AxiosRequestConfig[D]): js.Promise[R] = js.native
    def axiosInstance[T, R, D](url: String): js.Promise[R] = js.native
    def axiosInstance[T, R, D](url: String, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
    @JSName("axiosInstance")
    var axiosInstance_Original: AxiosInstance = js.native
    
    var cluster: String = js.native
    
    var connectionString: typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.default = js.native
    
    var defaultDatabase: js.UndefOr[String] = js.native
    
    var endpoints: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in azure-kusto-data.azure-kusto-data/source/client.ExecutionType ]: string} */ js.Any = js.native
    
    def execute(db: String, query: String): js.Promise[KustoResponseDataSet] = js.native
    def execute(
      db: String,
      query: String,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    def execute(db: Null, query: String): js.Promise[KustoResponseDataSet] = js.native
    def execute(
      db: Null,
      query: String,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    
    def executeMgmt(db: String, query: String): js.Promise[KustoResponseDataSet] = js.native
    def executeMgmt(
      db: String,
      query: String,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    def executeMgmt(db: Null, query: String): js.Promise[KustoResponseDataSet] = js.native
    def executeMgmt(
      db: Null,
      query: String,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    
    def executeQuery(db: String, query: String): js.Promise[KustoResponseDataSet] = js.native
    def executeQuery(
      db: String,
      query: String,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    def executeQuery(db: Null, query: String): js.Promise[KustoResponseDataSet] = js.native
    def executeQuery(
      db: Null,
      query: String,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    
    def executeQueryV1(db: String, query: String): js.Promise[KustoResponseDataSet] = js.native
    def executeQueryV1(
      db: String,
      query: String,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    def executeQueryV1(db: Null, query: String): js.Promise[KustoResponseDataSet] = js.native
    def executeQueryV1(
      db: Null,
      query: String,
      properties: typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default
    ): js.Promise[KustoResponseDataSet] = js.native
    
    def executeStreamingIngest(db: String, table: String, stream: Any, streamFormat: Any): js.Promise[KustoResponseDataSet] = js.native
    def executeStreamingIngest(db: String, table: String, stream: Any, streamFormat: Any, mappingName: String): js.Promise[KustoResponseDataSet] = js.native
    def executeStreamingIngest(
      db: String,
      table: String,
      stream: Any,
      streamFormat: Any,
      mappingName: String,
      clientRequestId: String
    ): js.Promise[KustoResponseDataSet] = js.native
    def executeStreamingIngest(
      db: String,
      table: String,
      stream: Any,
      streamFormat: Any,
      mappingName: Null,
      clientRequestId: String
    ): js.Promise[KustoResponseDataSet] = js.native
    def executeStreamingIngest(db: Null, table: String, stream: Any, streamFormat: Any): js.Promise[KustoResponseDataSet] = js.native
    def executeStreamingIngest(db: Null, table: String, stream: Any, streamFormat: Any, mappingName: String): js.Promise[KustoResponseDataSet] = js.native
    def executeStreamingIngest(
      db: Null,
      table: String,
      stream: Any,
      streamFormat: Any,
      mappingName: String,
      clientRequestId: String
    ): js.Promise[KustoResponseDataSet] = js.native
    def executeStreamingIngest(
      db: Null,
      table: String,
      stream: Any,
      streamFormat: Any,
      mappingName: Null,
      clientRequestId: String
    ): js.Promise[KustoResponseDataSet] = js.native
    
    /* private */ var getDb: Any = js.native
  }
}
