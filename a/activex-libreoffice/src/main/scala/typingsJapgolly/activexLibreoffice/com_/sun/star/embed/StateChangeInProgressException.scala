package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This exception can be thrown in case the object does not allow to call requested functionality currently because the object is changing state. */
trait StateChangeInProgressException
  extends StObject
     with Exception {
  
  /**
    * contains the target state the object tries to reach currently.
    *
    * Contains a value from {@link EmbedStates} constant set.
    */
  var TargetState: Double
}
object StateChangeInProgressException {
  
  inline def apply(Context: XInterface, Message: String, TargetState: Double): StateChangeInProgressException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], TargetState = TargetState.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeInProgressException]
  }
  
  extension [Self <: StateChangeInProgressException](x: Self) {
    
    inline def setTargetState(value: Double): Self = StObject.set(x, "TargetState", value.asInstanceOf[js.Any])
  }
}
