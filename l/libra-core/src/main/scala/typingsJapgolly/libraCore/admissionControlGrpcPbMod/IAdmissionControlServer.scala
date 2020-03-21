package typingsJapgolly.libraCore.admissionControlGrpcPbMod

import typingsJapgolly.grpc.mod.ServerUnaryCall
import typingsJapgolly.grpc.mod.handleUnaryCall
import typingsJapgolly.grpc.mod.sendUnaryData
import typingsJapgolly.libraCore.admissionControlPbMod.SubmitTransactionRequest
import typingsJapgolly.libraCore.admissionControlPbMod.SubmitTransactionResponse
import typingsJapgolly.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest
import typingsJapgolly.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAdmissionControlServer extends js.Object {
  @JSName("submitTransaction")
  var submitTransaction_Original: handleUnaryCall[SubmitTransactionRequest, SubmitTransactionResponse] = js.native
  @JSName("updateToLatestLedger")
  var updateToLatestLedger_Original: handleUnaryCall[UpdateToLatestLedgerRequest, UpdateToLatestLedgerResponse] = js.native
  def submitTransaction(
    call: ServerUnaryCall[SubmitTransactionRequest],
    callback: sendUnaryData[SubmitTransactionResponse]
  ): Unit = js.native
  def updateToLatestLedger(
    call: ServerUnaryCall[UpdateToLatestLedgerRequest],
    callback: sendUnaryData[UpdateToLatestLedgerResponse]
  ): Unit = js.native
}

