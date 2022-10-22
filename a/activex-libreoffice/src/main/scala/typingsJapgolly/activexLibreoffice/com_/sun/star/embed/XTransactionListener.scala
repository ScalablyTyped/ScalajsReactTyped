package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events when a transacted object is committed or reverted. */
trait XTransactionListener
  extends StObject
     with XEventListener {
  
  /** is called after the object is committed. */
  def commited(aEvent: EventObject): Unit
  
  /** is called just before the object is committed. */
  def preCommit(aEvent: EventObject): Unit
  
  /** is called just before the object is reverted. */
  def preRevert(aEvent: EventObject): Unit
  
  /** is called after the object is reverted. */
  def reverted(aEvent: EventObject): Unit
}
object XTransactionListener {
  
  inline def apply(
    acquire: Callback,
    commited: EventObject => Callback,
    disposing: EventObject => Callback,
    preCommit: EventObject => Callback,
    preRevert: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    reverted: EventObject => Callback
  ): XTransactionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, commited = js.Any.fromFunction1((t0: EventObject) => commited(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), preCommit = js.Any.fromFunction1((t0: EventObject) => preCommit(t0).runNow()), preRevert = js.Any.fromFunction1((t0: EventObject) => preRevert(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reverted = js.Any.fromFunction1((t0: EventObject) => reverted(t0).runNow()))
    __obj.asInstanceOf[XTransactionListener]
  }
  
  extension [Self <: XTransactionListener](x: Self) {
    
    inline def setCommited(value: EventObject => Callback): Self = StObject.set(x, "commited", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setPreCommit(value: EventObject => Callback): Self = StObject.set(x, "preCommit", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setPreRevert(value: EventObject => Callback): Self = StObject.set(x, "preRevert", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setReverted(value: EventObject => Callback): Self = StObject.set(x, "reverted", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
