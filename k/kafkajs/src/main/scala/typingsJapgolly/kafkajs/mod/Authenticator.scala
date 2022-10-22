package typingsJapgolly.kafkajs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authenticator extends StObject {
  
  def authenticate(): js.Promise[Unit]
}
object Authenticator {
  
  inline def apply(authenticate: CallbackTo[js.Promise[Unit]]): Authenticator = {
    val __obj = js.Dynamic.literal(authenticate = authenticate.toJsFn)
    __obj.asInstanceOf[Authenticator]
  }
  
  extension [Self <: Authenticator](x: Self) {
    
    inline def setAuthenticate(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "authenticate", value.toJsFn)
  }
}
