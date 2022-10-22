package typingsJapgolly.meteor.anon

import typingsJapgolly.meteor.meteorStrings.HandshakeError
import typingsJapgolly.meteor.meteorStrings.ResetPool
import typingsJapgolly.meteor.meteorStrings.ResumableChangeStreamError
import typingsJapgolly.meteor.meteorStrings.RetryableWriteError
import typingsJapgolly.meteor.meteorStrings.TransientTransactionError
import typingsJapgolly.meteor.meteorStrings.UnknownTransactionCommitResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMongoErrorLabel extends StObject {
  
  val HandshakeError: typingsJapgolly.meteor.meteorStrings.HandshakeError
  
  val ResetPool: typingsJapgolly.meteor.meteorStrings.ResetPool
  
  val ResumableChangeStreamError: typingsJapgolly.meteor.meteorStrings.ResumableChangeStreamError
  
  val RetryableWriteError: typingsJapgolly.meteor.meteorStrings.RetryableWriteError
  
  val TransientTransactionError: typingsJapgolly.meteor.meteorStrings.TransientTransactionError
  
  val UnknownTransactionCommitResult: typingsJapgolly.meteor.meteorStrings.UnknownTransactionCommitResult
}
object TypeofMongoErrorLabel {
  
  inline def apply(): TypeofMongoErrorLabel = {
    val __obj = js.Dynamic.literal(HandshakeError = "HandshakeError", ResetPool = "ResetPool", ResumableChangeStreamError = "ResumableChangeStreamError", RetryableWriteError = "RetryableWriteError", TransientTransactionError = "TransientTransactionError", UnknownTransactionCommitResult = "UnknownTransactionCommitResult")
    __obj.asInstanceOf[TypeofMongoErrorLabel]
  }
  
  extension [Self <: TypeofMongoErrorLabel](x: Self) {
    
    inline def setHandshakeError(value: HandshakeError): Self = StObject.set(x, "HandshakeError", value.asInstanceOf[js.Any])
    
    inline def setResetPool(value: ResetPool): Self = StObject.set(x, "ResetPool", value.asInstanceOf[js.Any])
    
    inline def setResumableChangeStreamError(value: ResumableChangeStreamError): Self = StObject.set(x, "ResumableChangeStreamError", value.asInstanceOf[js.Any])
    
    inline def setRetryableWriteError(value: RetryableWriteError): Self = StObject.set(x, "RetryableWriteError", value.asInstanceOf[js.Any])
    
    inline def setTransientTransactionError(value: TransientTransactionError): Self = StObject.set(x, "TransientTransactionError", value.asInstanceOf[js.Any])
    
    inline def setUnknownTransactionCommitResult(value: UnknownTransactionCommitResult): Self = StObject.set(x, "UnknownTransactionCommitResult", value.asInstanceOf[js.Any])
  }
}
