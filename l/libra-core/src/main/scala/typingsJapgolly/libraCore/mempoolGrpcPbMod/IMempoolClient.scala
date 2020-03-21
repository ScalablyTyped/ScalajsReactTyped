package typingsJapgolly.libraCore.mempoolGrpcPbMod

import typingsJapgolly.grpc.mod.ClientUnaryCall
import typingsJapgolly.grpc.mod.Metadata
import typingsJapgolly.grpc.mod.ServiceError
import typingsJapgolly.libraCore.PartialCallOptions
import typingsJapgolly.libraCore.mempoolPbMod.AddTransactionWithValidationRequest
import typingsJapgolly.libraCore.mempoolPbMod.AddTransactionWithValidationResponse
import typingsJapgolly.libraCore.mempoolPbMod.CommitTransactionsRequest
import typingsJapgolly.libraCore.mempoolPbMod.CommitTransactionsResponse
import typingsJapgolly.libraCore.mempoolPbMod.GetBlockRequest
import typingsJapgolly.libraCore.mempoolPbMod.GetBlockResponse
import typingsJapgolly.libraCore.mempoolPbMod.HealthCheckRequest
import typingsJapgolly.libraCore.mempoolPbMod.HealthCheckResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMempoolClient extends js.Object {
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

