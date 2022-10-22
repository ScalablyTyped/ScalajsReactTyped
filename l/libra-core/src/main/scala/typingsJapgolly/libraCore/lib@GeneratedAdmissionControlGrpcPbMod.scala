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
import typingsJapgolly.libraCore.`lib@GeneratedAdmissionControlPbMod`.SubmitTransactionRequest
import typingsJapgolly.libraCore.`lib@GeneratedAdmissionControlPbMod`.SubmitTransactionResponse
import typingsJapgolly.libraCore.`lib@GeneratedGetWithProofPbMod`.UpdateToLatestLedgerRequest
import typingsJapgolly.libraCore.`lib@GeneratedGetWithProofPbMod`.UpdateToLatestLedgerResponse
import typingsJapgolly.libraCore.anon.PartialCallOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `lib@GeneratedAdmissionControlGrpcPbMod` {
  
  @JSImport("libra-core/lib/@/generated/admission_control_grpc_pb", "AdmissionControlClient")
  @js.native
  open class AdmissionControlClient protected ()
    extends Client
       with IAdmissionControlClient {
    def this(address: String, credentials: ChannelCredentials) = this()
    def this(address: String, credentials: ChannelCredentials, options: js.Object) = this()
  }
  
  @JSImport("libra-core/lib/@/generated/admission_control_grpc_pb", "AdmissionControlService")
  @js.native
  val AdmissionControlService: IAdmissionControlService = js.native
  
  @js.native
  trait IAdmissionControlClient extends StObject {
    
    def submitTransaction(
      request: SubmitTransactionRequest,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
    ): ClientUnaryCall = js.native
    def submitTransaction(
      request: SubmitTransactionRequest,
      metadata: Metadata,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
    ): ClientUnaryCall = js.native
    def submitTransaction(
      request: SubmitTransactionRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
    ): ClientUnaryCall = js.native
    
    def updateToLatestLedger(
      request: UpdateToLatestLedgerRequest,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
    ): ClientUnaryCall = js.native
    def updateToLatestLedger(
      request: UpdateToLatestLedgerRequest,
      metadata: Metadata,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
    ): ClientUnaryCall = js.native
    def updateToLatestLedger(
      request: UpdateToLatestLedgerRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
    ): ClientUnaryCall = js.native
  }
  
  trait IAdmissionControlServer extends StObject {
    
    def submitTransaction(
      call: ServerUnaryCall[SubmitTransactionRequest],
      callback: sendUnaryData[SubmitTransactionResponse]
    ): Unit
    @JSName("submitTransaction")
    var submitTransaction_Original: handleUnaryCall[SubmitTransactionRequest, SubmitTransactionResponse]
    
    def updateToLatestLedger(
      call: ServerUnaryCall[UpdateToLatestLedgerRequest],
      callback: sendUnaryData[UpdateToLatestLedgerResponse]
    ): Unit
    @JSName("updateToLatestLedger")
    var updateToLatestLedger_Original: handleUnaryCall[UpdateToLatestLedgerRequest, UpdateToLatestLedgerResponse]
  }
  object IAdmissionControlServer {
    
    inline def apply(
      submitTransaction: (/* call */ ServerUnaryCall[SubmitTransactionRequest], /* callback */ sendUnaryData[SubmitTransactionResponse]) => Callback,
      updateToLatestLedger: (/* call */ ServerUnaryCall[UpdateToLatestLedgerRequest], /* callback */ sendUnaryData[UpdateToLatestLedgerResponse]) => Callback
    ): IAdmissionControlServer = {
      val __obj = js.Dynamic.literal(submitTransaction = js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[SubmitTransactionRequest], t1: /* callback */ sendUnaryData[SubmitTransactionResponse]) => (submitTransaction(t0, t1)).runNow()), updateToLatestLedger = js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[UpdateToLatestLedgerRequest], t1: /* callback */ sendUnaryData[UpdateToLatestLedgerResponse]) => (updateToLatestLedger(t0, t1)).runNow()))
      __obj.asInstanceOf[IAdmissionControlServer]
    }
    
    extension [Self <: IAdmissionControlServer](x: Self) {
      
      inline def setSubmitTransaction(
        value: (/* call */ ServerUnaryCall[SubmitTransactionRequest], /* callback */ sendUnaryData[SubmitTransactionResponse]) => Callback
      ): Self = StObject.set(x, "submitTransaction", js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[SubmitTransactionRequest], t1: /* callback */ sendUnaryData[SubmitTransactionResponse]) => (value(t0, t1)).runNow()))
      
      inline def setUpdateToLatestLedger(
        value: (/* call */ ServerUnaryCall[UpdateToLatestLedgerRequest], /* callback */ sendUnaryData[UpdateToLatestLedgerResponse]) => Callback
      ): Self = StObject.set(x, "updateToLatestLedger", js.Any.fromFunction2((t0: /* call */ ServerUnaryCall[UpdateToLatestLedgerRequest], t1: /* callback */ sendUnaryData[UpdateToLatestLedgerResponse]) => (value(t0, t1)).runNow()))
    }
  }
  
  /* Inlined parent grpc.grpc.ServiceDefinition<grpc.grpc.UntypedServiceImplementation> */
  trait IAdmissionControlService extends StObject {
    
    var submitTransaction: IAdmissionControlServiceISubmitTransaction
    
    var updateToLatestLedger: IAdmissionControlServiceIUpdateToLatestLedger
  }
  object IAdmissionControlService {
    
    inline def apply(
      submitTransaction: IAdmissionControlServiceISubmitTransaction,
      updateToLatestLedger: IAdmissionControlServiceIUpdateToLatestLedger
    ): IAdmissionControlService = {
      val __obj = js.Dynamic.literal(submitTransaction = submitTransaction.asInstanceOf[js.Any], updateToLatestLedger = updateToLatestLedger.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAdmissionControlService]
    }
    
    extension [Self <: IAdmissionControlService](x: Self) {
      
      inline def setSubmitTransaction(value: IAdmissionControlServiceISubmitTransaction): Self = StObject.set(x, "submitTransaction", value.asInstanceOf[js.Any])
      
      inline def setUpdateToLatestLedger(value: IAdmissionControlServiceIUpdateToLatestLedger): Self = StObject.set(x, "updateToLatestLedger", value.asInstanceOf[js.Any])
    }
  }
  
  trait IAdmissionControlServiceISubmitTransaction
    extends StObject
       with MethodDefinition[SubmitTransactionRequest, SubmitTransactionResponse]
  object IAdmissionControlServiceISubmitTransaction {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => SubmitTransactionRequest,
      requestSerialize: SubmitTransactionRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => SubmitTransactionResponse,
      responseSerialize: SubmitTransactionResponse => Buffer,
      responseStream: Boolean
    ): IAdmissionControlServiceISubmitTransaction = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAdmissionControlServiceISubmitTransaction]
    }
  }
  
  trait IAdmissionControlServiceIUpdateToLatestLedger
    extends StObject
       with MethodDefinition[UpdateToLatestLedgerRequest, UpdateToLatestLedgerResponse]
  object IAdmissionControlServiceIUpdateToLatestLedger {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => UpdateToLatestLedgerRequest,
      requestSerialize: UpdateToLatestLedgerRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => UpdateToLatestLedgerResponse,
      responseSerialize: UpdateToLatestLedgerResponse => Buffer,
      responseStream: Boolean
    ): IAdmissionControlServiceIUpdateToLatestLedger = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAdmissionControlServiceIUpdateToLatestLedger]
    }
  }
}
