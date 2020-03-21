package typingsJapgolly.libraCore.mempoolGrpcPbMod

import typingsJapgolly.grpc.mod.ServerUnaryCall
import typingsJapgolly.grpc.mod.handleUnaryCall
import typingsJapgolly.grpc.mod.sendUnaryData
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
trait IMempoolServer extends js.Object {
  @JSName("addTransactionWithValidation")
  var addTransactionWithValidation_Original: handleUnaryCall[AddTransactionWithValidationRequest, AddTransactionWithValidationResponse] = js.native
  @JSName("commitTransactions")
  var commitTransactions_Original: handleUnaryCall[CommitTransactionsRequest, CommitTransactionsResponse] = js.native
  @JSName("getBlock")
  var getBlock_Original: handleUnaryCall[GetBlockRequest, GetBlockResponse] = js.native
  @JSName("healthCheck")
  var healthCheck_Original: handleUnaryCall[HealthCheckRequest, HealthCheckResponse] = js.native
  def addTransactionWithValidation(
    call: ServerUnaryCall[AddTransactionWithValidationRequest],
    callback: sendUnaryData[AddTransactionWithValidationResponse]
  ): Unit = js.native
  def commitTransactions(
    call: ServerUnaryCall[CommitTransactionsRequest],
    callback: sendUnaryData[CommitTransactionsResponse]
  ): Unit = js.native
  def getBlock(call: ServerUnaryCall[GetBlockRequest], callback: sendUnaryData[GetBlockResponse]): Unit = js.native
  def healthCheck(call: ServerUnaryCall[HealthCheckRequest], callback: sendUnaryData[HealthCheckResponse]): Unit = js.native
}

