package typingsJapgolly.libraCore.admissionControlGrpcPbMod

import typingsJapgolly.grpc.mod.ClientUnaryCall
import typingsJapgolly.grpc.mod.Metadata
import typingsJapgolly.grpc.mod.ServiceError
import typingsJapgolly.libraCore.PartialCallOptions
import typingsJapgolly.libraCore.admissionControlPbMod.SubmitTransactionRequest
import typingsJapgolly.libraCore.admissionControlPbMod.SubmitTransactionResponse
import typingsJapgolly.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest
import typingsJapgolly.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAdmissionControlClient extends js.Object {
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

