package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This exception is thrown to indicate that the creation of a UCB content failed.
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait ContentCreationException
  extends StObject
     with Exception {
  
  /** An error code. */
  var eError: ContentCreationError
}
object ContentCreationException {
  
  inline def apply(Context: XInterface, Message: String, eError: ContentCreationError): ContentCreationException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], eError = eError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentCreationException]
  }
  
  extension [Self <: ContentCreationException](x: Self) {
    
    inline def setEError(value: ContentCreationError): Self = StObject.set(x, "eError", value.asInstanceOf[js.Any])
  }
}
