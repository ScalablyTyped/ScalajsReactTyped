package typingsJapgolly.nodeBarion.mod

import typingsJapgolly.nodeBarion.anon.PartialBankTransferReques
import typingsJapgolly.nodeBarion.anon.PartialCancelAuthorizatio
import typingsJapgolly.nodeBarion.anon.PartialCapturePaymentRequ
import typingsJapgolly.nodeBarion.anon.PartialCompletePaymentReq
import typingsJapgolly.nodeBarion.anon.PartialEmailTransferReque
import typingsJapgolly.nodeBarion.anon.PartialFinishReservationR
import typingsJapgolly.nodeBarion.anon.PartialGetAccountsRequest
import typingsJapgolly.nodeBarion.anon.PartialGetPaymentStateReq
import typingsJapgolly.nodeBarion.anon.PartialPaymentRefundReque
import typingsJapgolly.nodeBarion.anon.PartialStartPaymentReques
import typingsJapgolly.nodeBarion.anon.PartialStatementDownloadR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Barion extends StObject {
  
  def bankTransfer(options: PartialBankTransferReques): js.Promise[Any] = js.native
  def bankTransfer(
    options: PartialBankTransferReques,
    callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
  
  def cancelAuthorizedPayment(options: PartialCancelAuthorizatio): js.Promise[Any] = js.native
  def cancelAuthorizedPayment(
    options: PartialCancelAuthorizatio,
    callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
  
  def captureAuthorizedPayment(options: PartialCapturePaymentRequ): js.Promise[Any] = js.native
  def captureAuthorizedPayment(
    options: PartialCapturePaymentRequ,
    callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
  
  def completePayment(options: PartialCompletePaymentReq): js.Promise[Any] = js.native
  def completePayment(
    options: PartialCompletePaymentReq,
    callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
  
  def downloadStatement(options: PartialStatementDownloadR): js.Promise[Any] = js.native
  def downloadStatement(
    options: PartialStatementDownloadR,
    callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
  
  def emailTransfer(options: PartialEmailTransferReque): js.Promise[Any] = js.native
  def emailTransfer(
    options: PartialEmailTransferReque,
    callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
  
  def finishReservation(options: PartialFinishReservationR): js.Promise[Any] = js.native
  def finishReservation(
    options: PartialFinishReservationR,
    callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
  
  def getAccounts(options: PartialGetAccountsRequest): js.Promise[Any] = js.native
  def getAccounts(
    options: PartialGetAccountsRequest,
    callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
  
  def getPaymentState(options: PartialGetPaymentStateReq): js.Promise[Any] = js.native
  def getPaymentState(
    options: PartialGetPaymentStateReq,
    callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
  
  def refundPayment(options: PartialPaymentRefundReque): js.Promise[Any] = js.native
  def refundPayment(
    options: PartialPaymentRefundReque,
    callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
  
  def startPayment(options: PartialStartPaymentReques): js.Promise[Any] = js.native
  def startPayment(
    options: PartialStartPaymentReques,
    callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
}
