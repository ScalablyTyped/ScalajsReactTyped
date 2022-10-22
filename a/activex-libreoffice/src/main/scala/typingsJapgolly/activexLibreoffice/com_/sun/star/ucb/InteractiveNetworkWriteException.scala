package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A network error specifying a write failure. */
trait InteractiveNetworkWriteException
  extends StObject
     with ClassifiedInteractionRequest {
  
  /** Any diagnostic message about the failure (which will typically be an English phrase or sentence). */
  var Diagnostic: String
}
object InteractiveNetworkWriteException {
  
  inline def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Diagnostic: String,
    Message: String
  ): InteractiveNetworkWriteException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Diagnostic = Diagnostic.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveNetworkWriteException]
  }
  
  extension [Self <: InteractiveNetworkWriteException](x: Self) {
    
    inline def setDiagnostic(value: String): Self = StObject.set(x, "Diagnostic", value.asInstanceOf[js.Any])
  }
}
