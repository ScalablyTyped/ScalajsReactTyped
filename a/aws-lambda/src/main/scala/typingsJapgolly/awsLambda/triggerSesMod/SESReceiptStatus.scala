package typingsJapgolly.awsLambda.triggerSesMod

import typingsJapgolly.awsLambda.awsLambdaStrings.DISABLED
import typingsJapgolly.awsLambda.awsLambdaStrings.FAIL
import typingsJapgolly.awsLambda.awsLambdaStrings.GRAY
import typingsJapgolly.awsLambda.awsLambdaStrings.PASS
import typingsJapgolly.awsLambda.awsLambdaStrings.PROCESSING_FAILED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESReceiptStatus extends StObject {
  
  var status: PASS | FAIL | GRAY | PROCESSING_FAILED | DISABLED
}
object SESReceiptStatus {
  
  inline def apply(status: PASS | FAIL | GRAY | PROCESSING_FAILED | DISABLED): SESReceiptStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESReceiptStatus]
  }
  
  extension [Self <: SESReceiptStatus](x: Self) {
    
    inline def setStatus(value: PASS | FAIL | GRAY | PROCESSING_FAILED | DISABLED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
