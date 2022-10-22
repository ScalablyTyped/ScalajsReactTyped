package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to prevent object internal updates for a certain period to be able to quickly change multiple parts of the objects, where the
  * updates would invalidate each other, anyway.
  */
trait XActionLockable
  extends StObject
     with XInterface {
  
  /** increments the lock count of the object by one. */
  def addActionLock(): Unit
  
  /** @returns `TRUE` if at least one lock exists. */
  def isActionLocked(): Boolean
  
  /** decrements the lock count of the object by one. */
  def removeActionLock(): Unit
  
  /**
    * resets the locking level.
    *
    * This method is used for debugging purposes. The debugging environment of a programming language can reset the locks to allow refreshing of the view if
    * a breakpoint is reached or step execution is used.
    */
  def resetActionLocks(): Double
  
  /**
    * sets the locking level.
    *
    * This method is used for debugging purposes. The programming environment can restore the locking after a break of a debug session.
    */
  def setActionLocks(nLock: Double): Unit
}
object XActionLockable {
  
  inline def apply(
    acquire: Callback,
    addActionLock: Callback,
    isActionLocked: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeActionLock: Callback,
    resetActionLocks: CallbackTo[Double],
    setActionLocks: Double => Callback
  ): XActionLockable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addActionLock = addActionLock.toJsFn, isActionLocked = isActionLocked.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeActionLock = removeActionLock.toJsFn, resetActionLocks = resetActionLocks.toJsFn, setActionLocks = js.Any.fromFunction1((t0: Double) => setActionLocks(t0).runNow()))
    __obj.asInstanceOf[XActionLockable]
  }
  
  extension [Self <: XActionLockable](x: Self) {
    
    inline def setAddActionLock(value: Callback): Self = StObject.set(x, "addActionLock", value.toJsFn)
    
    inline def setIsActionLocked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActionLocked", value.toJsFn)
    
    inline def setRemoveActionLock(value: Callback): Self = StObject.set(x, "removeActionLock", value.toJsFn)
    
    inline def setResetActionLocks(value: CallbackTo[Double]): Self = StObject.set(x, "resetActionLocks", value.toJsFn)
    
    inline def setSetActionLocks(value: Double => Callback): Self = StObject.set(x, "setActionLocks", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
