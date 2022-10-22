package typingsJapgolly.activexLibreoffice.com_.sun.star.deployment

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link DeploymentException} reflects a deployment error.
  * @since OOo 2.0
  */
trait DeploymentException
  extends StObject
     with Exception {
  
  /** reflects the cause of the error. Commonly an exception. */
  var Cause: Any
}
object DeploymentException {
  
  inline def apply(Cause: Any, Context: XInterface, Message: String): DeploymentException = {
    val __obj = js.Dynamic.literal(Cause = Cause.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentException]
  }
  
  extension [Self <: DeploymentException](x: Self) {
    
    inline def setCause(value: Any): Self = StObject.set(x, "Cause", value.asInstanceOf[js.Any])
  }
}
