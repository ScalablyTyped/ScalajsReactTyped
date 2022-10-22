package typingsJapgolly.cypress.typesSinonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonSpyCall[TArgs /* <: js.Array[Any] */, TReturnValue]
  extends StObject
     with SinonSpyCallApi[TArgs, TReturnValue] {
  
  /**
    * This property is a convenience for a call’s callback.
    * When the last argument in a call is a Function, then callback will reference that. Otherwise it will be undefined.
    */
  var callback: js.UndefOr[js.Function] = js.native
  
  /**
    * Returns true if the spy call occurred after another spy call.
    * @param call
    */
  def calledAfter(call: SinonSpyCall[Any, Any]): Boolean = js.native
  
  /**
    * Returns true if the spy call occurred before another spy call.
    * @param call
    *
    */
  def calledBefore(call: SinonSpyCall[Any, Any]): Boolean = js.native
  
  /**
    * Exception thrown, if any.
    */
  var exception: Any = js.native
  
  /**
    * This property is a convenience for the first argument of the call.
    */
  var firstArg: Any = js.native
  
  /**
    * This property is a convenience for the last argument of the call.
    */
  var lastArg: Any = js.native
  
  /**
    * Return value.
    */
  var returnValue: TReturnValue = js.native
  
  /**
    * The call’s this value.
    */
  var thisValue: Any = js.native
}
