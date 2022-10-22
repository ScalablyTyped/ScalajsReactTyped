package typingsJapgolly.tabris.anon

import typingsJapgolly.tabris.tabrisStrings.biometricsNotEnrolled
import typingsJapgolly.tabris.tabrisStrings.canceled
import typingsJapgolly.tabris.tabrisStrings.credentialsNotEnrolled
import typingsJapgolly.tabris.tabrisStrings.error
import typingsJapgolly.tabris.tabrisStrings.limitExceeded
import typingsJapgolly.tabris.tabrisStrings.lockout
import typingsJapgolly.tabris.tabrisStrings.success
import typingsJapgolly.tabris.tabrisStrings.userCanceled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var message: String
  
  var status: success | canceled | userCanceled | limitExceeded | lockout | biometricsNotEnrolled | credentialsNotEnrolled | error
}
object Message {
  
  inline def apply(
    message: String,
    status: success | canceled | userCanceled | limitExceeded | lockout | biometricsNotEnrolled | credentialsNotEnrolled | error
  ): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: success | canceled | userCanceled | limitExceeded | lockout | biometricsNotEnrolled | credentialsNotEnrolled | error
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
