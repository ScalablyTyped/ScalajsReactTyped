package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error related to locking operations.
  *
  * Various meaningful errors are derived from this exception.
  * @since OOo 3.3
  */
trait InteractiveLockingException
  extends StObject
     with ClassifiedInteractionRequest {
  
  /** The Url of the resource this exception is related to. */
  var Url: String
}
object InteractiveLockingException {
  
  inline def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Url: String): InteractiveLockingException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveLockingException]
  }
  
  extension [Self <: InteractiveLockingException](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
