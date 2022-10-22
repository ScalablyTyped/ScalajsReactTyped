package typingsJapgolly.zetapushJs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptions
  extends StObject
     with Options {
  
  def authentication(): AbstractHandshake
}
object ClientOptions {
  
  inline def apply(authentication: CallbackTo[AbstractHandshake], sandboxId: String): ClientOptions = {
    val __obj = js.Dynamic.literal(authentication = authentication.toJsFn, sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  extension [Self <: ClientOptions](x: Self) {
    
    inline def setAuthentication(value: CallbackTo[AbstractHandshake]): Self = StObject.set(x, "authentication", value.toJsFn)
  }
}
