package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A network error specifying a name resolution failure. */
trait InteractiveNetworkResolveNameException
  extends StObject
     with ClassifiedInteractionRequest {
  
  /** The server name for which resolution failed. */
  var Server: String
}
object InteractiveNetworkResolveNameException {
  
  inline def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Server: String): InteractiveNetworkResolveNameException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveNetworkResolveNameException]
  }
  
  extension [Self <: InteractiveNetworkResolveNameException](x: Self) {
    
    inline def setServer(value: String): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
  }
}
