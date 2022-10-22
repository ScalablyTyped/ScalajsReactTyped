package typingsJapgolly.libraCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.grpc.mod.ChannelCredentials
import typingsJapgolly.grpc.mod.Client
import typingsJapgolly.grpc.mod.ClientUnaryCall
import typingsJapgolly.grpc.mod.Metadata
import typingsJapgolly.grpc.mod.MethodDefinition
import typingsJapgolly.grpc.mod.ServerUnaryCall
import typingsJapgolly.grpc.mod.ServiceError
import typingsJapgolly.grpc.mod.handleUnaryCall
import typingsJapgolly.grpc.mod.sendUnaryData
import typingsJapgolly.libraCore.`lib@GeneratedMempoolPbMod`.AddTransactionWithValidationRequest
import typingsJapgolly.libraCore.`lib@GeneratedMempoolPbMod`.AddTransactionWithValidationResponse
import typingsJapgolly.libraCore.`lib@GeneratedMempoolPbMod`.CommitTransactionsRequest
import typingsJapgolly.libraCore.`lib@GeneratedMempoolPbMod`.CommitTransactionsResponse
import typingsJapgolly.libraCore.`lib@GeneratedMempoolPbMod`.GetBlockRequest
import typingsJapgolly.libraCore.`lib@GeneratedMempoolPbMod`.GetBlockResponse
import typingsJapgolly.libraCore.`lib@GeneratedMempoolPbMod`.HealthCheckRequest
import typingsJapgolly.libraCore.`lib@GeneratedMempoolPbMod`.HealthCheckResponse
import typingsJapgolly.libraCore.anon.PartialCallOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `lib@GeneratedMempoolGrpcPbMod` {
  
  @JSImport("libra-core/lib/@/generated/mempool_grpc_pb", "MempoolClient")
  @js.native
  open class MempoolClient protected ()
    extends Client
       with IMempoolClient {
    def this(address: String, credentials: ChannelCredentials) = this()
    def this(address: String, credentials: ChannelCredentials, options: js.Object) = this()
  }
  
  @JSImport("libra-core/lib/@/generated/mempool_grpc_pb", "MempoolService")
  @js.native
  val MempoolService: IMempoolService = js.native
  
  @js.native
  trait IMempoolClient extends StObject {
    
    def addTransactionWithValidation(
      request: AddTransactionWithValidationRequest,
      callback: js.Function2[
          /* error */ ServiceError | Null, 
          /* response */ AddTransactionWithValidationResponse, 
          Unit
        ]
    ): ClientUnaryCall = js.native
    def addTransactionWithValidation(
      request: AddTransactionWithValidationRequest,
      metadata: Metadata,
      callback: js.Function2[
          /* error */ ServiceError | Null, 
          /* response */ AddTransactionWithValidationResponse, 
          Unit
        ]
    ): ClientUnaryCall = js.native
    def addTransactionWithValidation(
      request: AddTransactionWithValidationRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[
          /* error */ ServiceError | Null, 
          /* response */ AddTransactionWithValidationResponse, 
          Unit
        ]
    ): ClientUnaryCall = js.native
    
    def commitTransactions(
      request: CommitTransactionsRequest,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
    ): ClientUnaryCall = js.native
    def commitTransactions(
      request: CommitTransactionsRequest,
      metadata: Metadata,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
    ): ClientUnaryCall = js.native
    def commitTransactions(
      request: CommitTransactionsRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
    ): ClientUnaryCall = js.native
    
    def getBlock(
      request: GetBlockRequest,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
    ): ClientUnaryCall = js.native
    def getBlock(
      request: GetBlockRequest,
      metadata: Metadata,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
    ): ClientUnaryCall = js.native
    def getBlock(
      request: GetBlockRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
    ): ClientUnaryCall = js.native
    
    def healthCheck(
      request: HealthCheckRequest,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
    ): ClientUnaryCall = js.native
    def healthCheck(
      request: HealthCheckRequest,
      metadata: Metadata,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
    ): ClientUnaryCall = js.native
    def healthCheck(
      request: HealthCheckRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
    ): ClientUnaryCall = js.native
  }
  
  trait IMempoolServer extends StObject {
    
    def addTransactionWithValidation(
      call: ServerUnaryCall[AddTransactionWithValidationRequest],
      callback: sendUnaryData[AddTransactionWithValidationResponse]
    ): Unit
    @JSName("addTransactionWithValidation")
    var addTransactionWithValidation_Original: handleUnaryCall[AddTransactionWithValidationRequest, AddTransactionWithValidationResponse]
    
    def commitTransactions(
      call: ServerUnaryCall[CommitTransactionsRequest],
      callback: sendUnaryData[CommitTransactionsResponse]
    ): Unit
    @JSName("commitTransactions")
    var commitTransactions_Original: handleUnaryCall[CommitTransactionsRequest, CommitTransactionsResponse]
    
    def getBlock(call: ServerUnaryCall[GetBlockRequest], callback: sendUnaryData[GetBlockResponse]): Unit
    @JSName("getBlock")
    var getBlock_Original: handleUnaryCall[GetBlockRequest, GetBlockResponse]
    
    def healthCheck(call: ServerUnaryCall[HealthCheckRequest], callback: sendUnaryData[HealthCheckResponse]): Unit
    @JSName("healthCheck")
    var healthCheck_Original: handleUnaryCall[HealthCheckRequest, HealthCheckResponse]
  }
  object IMempoolServer {
    
    inline def apply(
      addTransactionWithValidation: (/* call */ ServerUnaryCall[AddTransactionWithValidationRequest], /* callback */ sendUnaryData[AddTransactionWithValidationResponse]) => Callback,
      commitTransactions: (/* call */ ServerUnaryCall[CommitTransactionsRequest], /* callback */ sendUnaryData[CommitTransactionsResponse]) => Callback,
      getBlock: (/* call */ ServerUnaryCall[GetBlockRequest], /* callback */ sendUnaryData[GetBlockResponse]) => Callback,
      healthCheck: (/* call */ ServerUnaryCall[HealthCheckRequest], /* callback */ sendUnaryData[HealthCheckResponse]) => Callback
    ): IMempoolServer = {
      val __obj = js.Dynamic.literal(addTransactionWithValidation = js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[AddTransactionWithValidationRequest], t1: /* callback */ sendUnaryData[AddTransactionWithValidationResponse]) => (addTransactionWithValidation(t0, t1)).runNow()), commitTransactions = js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[CommitTransactionsRequest], t1: /* callback */ sendUnaryData[CommitTransactionsResponse]) => (commitTransactions(t0, t1)).runNow()), getBlock = js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[GetBlockRequest], t1: /* callback */ sendUnaryData[GetBlockResponse]) => (getBlock(t0, t1)).runNow()), healthCheck = js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[HealthCheckRequest], t1: /* callback */ sendUnaryData[HealthCheckResponse]) => (healthCheck(t0, t1)).runNow()))
      __obj.asInstanceOf[IMempoolServer]
    }
    
    extension [Self <: IMempoolServer](x: Self) {
      
      inline def setAddTransactionWithValidation(
        value: (/* call */ ServerUnaryCall[AddTransactionWithValidationRequest], /* callback */ sendUnaryData[AddTransactionWithValidationResponse]) => Callback
      ): Self = StObject.set(x, "addTransactionWithValidation", js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[AddTransactionWithValidationRequest], t1: /* callback */ sendUnaryData[AddTransactionWithValidationResponse]) => (value(t0, t1)).runNow()))
      
      inline def setCommitTransactions(
        value: (/* call */ ServerUnaryCall[CommitTransactionsRequest], /* callback */ sendUnaryData[CommitTransactionsResponse]) => Callback
      ): Self = StObject.set(x, "commitTransactions", js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[CommitTransactionsRequest], t1: /* callback */ sendUnaryData[CommitTransactionsResponse]) => (value(t0, t1)).runNow()))
      
      inline def setGetBlock(
        value: (/* call */ ServerUnaryCall[GetBlockRequest], /* callback */ sendUnaryData[GetBlockResponse]) => Callback
      ): Self = StObject.set(x, "getBlock", js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[GetBlockRequest], t1: /* callback */ sendUnaryData[GetBlockResponse]) => (value(t0, t1)).runNow()))
      
      inline def setHealthCheck(
        value: (/* call */ ServerUnaryCall[HealthCheckRequest], /* callback */ sendUnaryData[HealthCheckResponse]) => Callback
      ): Self = StObject.set(x, "healthCheck", js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[HealthCheckRequest], t1: /* callback */ sendUnaryData[HealthCheckResponse]) => (value(t0, t1)).runNow()))
    }
  }
  
  /* Inlined parent grpc.grpc.ServiceDefinition<grpc.grpc.UntypedServiceImplementation> */
  trait IMempoolService extends StObject {
    
    var addTransactionWithValidation: IMempoolServiceIAddTransactionWithValidation
    
    var commitTransactions: IMempoolServiceICommitTransactions
    
    var getBlock: IMempoolServiceIGetBlock
    
    var healthCheck: IMempoolServiceIHealthCheck
  }
  object IMempoolService {
    
    inline def apply(
      addTransactionWithValidation: IMempoolServiceIAddTransactionWithValidation,
      commitTransactions: IMempoolServiceICommitTransactions,
      getBlock: IMempoolServiceIGetBlock,
      healthCheck: IMempoolServiceIHealthCheck
    ): IMempoolService = {
      val __obj = js.Dynamic.literal(addTransactionWithValidation = addTransactionWithValidation.asInstanceOf[js.Any], commitTransactions = commitTransactions.asInstanceOf[js.Any], getBlock = getBlock.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMempoolService]
    }
    
    extension [Self <: IMempoolService](x: Self) {
      
      inline def setAddTransactionWithValidation(value: IMempoolServiceIAddTransactionWithValidation): Self = StObject.set(x, "addTransactionWithValidation", value.asInstanceOf[js.Any])
      
      inline def setCommitTransactions(value: IMempoolServiceICommitTransactions): Self = StObject.set(x, "commitTransactions", value.asInstanceOf[js.Any])
      
      inline def setGetBlock(value: IMempoolServiceIGetBlock): Self = StObject.set(x, "getBlock", value.asInstanceOf[js.Any])
      
      inline def setHealthCheck(value: IMempoolServiceIHealthCheck): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMempoolServiceIAddTransactionWithValidation
    extends StObject
       with MethodDefinition[AddTransactionWithValidationRequest, AddTransactionWithValidationResponse]
  object IMempoolServiceIAddTransactionWithValidation {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => AddTransactionWithValidationRequest,
      requestSerialize: AddTransactionWithValidationRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => AddTransactionWithValidationResponse,
      responseSerialize: AddTransactionWithValidationResponse => Buffer,
      responseStream: Boolean
    ): IMempoolServiceIAddTransactionWithValidation = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMempoolServiceIAddTransactionWithValidation]
    }
  }
  
  trait IMempoolServiceICommitTransactions
    extends StObject
       with MethodDefinition[CommitTransactionsRequest, CommitTransactionsResponse]
  object IMempoolServiceICommitTransactions {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => CommitTransactionsRequest,
      requestSerialize: CommitTransactionsRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => CommitTransactionsResponse,
      responseSerialize: CommitTransactionsResponse => Buffer,
      responseStream: Boolean
    ): IMempoolServiceICommitTransactions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMempoolServiceICommitTransactions]
    }
  }
  
  trait IMempoolServiceIGetBlock
    extends StObject
       with MethodDefinition[GetBlockRequest, GetBlockResponse]
  object IMempoolServiceIGetBlock {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => GetBlockRequest,
      requestSerialize: GetBlockRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => GetBlockResponse,
      responseSerialize: GetBlockResponse => Buffer,
      responseStream: Boolean
    ): IMempoolServiceIGetBlock = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMempoolServiceIGetBlock]
    }
  }
  
  trait IMempoolServiceIHealthCheck
    extends StObject
       with MethodDefinition[HealthCheckRequest, HealthCheckResponse]
  object IMempoolServiceIHealthCheck {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => HealthCheckRequest,
      requestSerialize: HealthCheckRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => HealthCheckResponse,
      responseSerialize: HealthCheckResponse => Buffer,
      responseStream: Boolean
    ): IMempoolServiceIHealthCheck = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMempoolServiceIHealthCheck]
    }
  }
}
