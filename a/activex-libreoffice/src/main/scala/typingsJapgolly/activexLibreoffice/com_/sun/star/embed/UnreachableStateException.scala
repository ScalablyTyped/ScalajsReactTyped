package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This exception can be thrown in case specified state can not be reached. */
trait UnreachableStateException
  extends StObject
     with Exception {
  
  /** The current state of the object. */
  var CurrentState: Double
  
  /** The state that could not be reached. */
  var NextState: Double
}
object UnreachableStateException {
  
  inline def apply(Context: XInterface, CurrentState: Double, Message: String, NextState: Double): UnreachableStateException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], CurrentState = CurrentState.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NextState = NextState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnreachableStateException]
  }
  
  extension [Self <: UnreachableStateException](x: Self) {
    
    inline def setCurrentState(value: Double): Self = StObject.set(x, "CurrentState", value.asInstanceOf[js.Any])
    
    inline def setNextState(value: Double): Self = StObject.set(x, "NextState", value.asInstanceOf[js.Any])
  }
}
