package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows locking the input on components. */
trait XBoundControl
  extends StObject
     with XInterface {
  
  /**
    * determines whether the input is currently locked or not.
    * @returns `TRUE` when it is currently locked, otherwise `FALSE` .
    */
  var Lock: Boolean
  
  /**
    * determines whether the input is currently locked or not.
    * @returns `TRUE` when it is currently locked, otherwise `FALSE` .
    */
  def getLock(): Boolean
  
  /**
    * is used for altering the current lock state of the component.
    * @param bLock the new lock state.
    */
  def setLock(bLock: Boolean): Unit
}
object XBoundControl {
  
  inline def apply(
    Lock: Boolean,
    acquire: Callback,
    getLock: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setLock: Boolean => Callback
  ): XBoundControl = {
    val __obj = js.Dynamic.literal(Lock = Lock.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLock = getLock.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setLock = js.Any.fromFunction1((t0: Boolean) => setLock(t0).runNow()))
    __obj.asInstanceOf[XBoundControl]
  }
  
  extension [Self <: XBoundControl](x: Self) {
    
    inline def setGetLock(value: CallbackTo[Boolean]): Self = StObject.set(x, "getLock", value.toJsFn)
    
    inline def setLock(value: Boolean): Self = StObject.set(x, "Lock", value.asInstanceOf[js.Any])
    
    inline def setSetLock(value: Boolean => Callback): Self = StObject.set(x, "setLock", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
