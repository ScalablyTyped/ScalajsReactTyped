package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to listen on objects which allow updating their data.
  *
  * In addition to just get notified when an data update happened, the listener has a chance to veto updates **before** they happen.
  * @see XUpdateBroadcaster
  */
trait XUpdateListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked to check the current data.
    *
    * For a given update process, if one of the XUpdateListeners vetoes the change, the update is canceled, and no further notification happens.
    * @param aEvent An event descriptor specifying the broadcaster of the change.
    * @returns `TRUE` when the update was approved, otherwise `FALSE` .
    */
  def approveUpdate(aEvent: EventObject): Boolean
  
  /**
    * is invoked when an object has finished processing the updates and the data has been successfully written.
    * @param aEvent A event descriptor specifying the broadcaster of the change.
    */
  def updated(aEvent: EventObject): Unit
}
object XUpdateListener {
  
  inline def apply(
    acquire: Callback,
    approveUpdate: EventObject => Boolean,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    updated: EventObject => Callback
  ): XUpdateListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveUpdate = js.Any.fromFunction1(approveUpdate), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, updated = js.Any.fromFunction1((t0: EventObject) => updated(t0).runNow()))
    __obj.asInstanceOf[XUpdateListener]
  }
  
  extension [Self <: XUpdateListener](x: Self) {
    
    inline def setApproveUpdate(value: EventObject => Boolean): Self = StObject.set(x, "approveUpdate", js.Any.fromFunction1(value))
    
    inline def setUpdated(value: EventObject => Callback): Self = StObject.set(x, "updated", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
