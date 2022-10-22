package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to receive notifications from an {@link XDynamicResultSet} . */
trait XDynamicResultSetListener
  extends StObject
     with XEventListener {
  
  /**
    * A method used to propagate changes of a result set.
    *
    * In the first notify-call the listener gets two(!) com::sun::star::sdbc::XResultSets and has to hold them. The com::sun::star::sdbc::XResultSets are
    * implementations of the service {@link ContentResultSet} .
    *
    * The notified new {@link com.sun.star.sdbc.XResultSet} will stay valid after returning from this method. The old one will become invalid after
    * returning.
    *
    * While in notify-call the listener is allowed to read from old and new result set, except in the first call, where only the new result set is valid.
    *
    * The Listener is allowed to stay (block) this call, until it really wants to use the new result set. The only situation, where the listener has to
    * return immediately is while it disposes its broadcaster or while it is removing itself as listener (otherwise you deadlock)!!!
    * @param Changes the changes to notify.
    */
  def notify(Changes: ListEvent): Unit
}
object XDynamicResultSetListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    notify_ : ListEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDynamicResultSetListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.updateDynamic("notify")(js.Any.fromFunction1((t0: ListEvent) => notify_(t0).runNow()))
    __obj.asInstanceOf[XDynamicResultSetListener]
  }
  
  extension [Self <: XDynamicResultSetListener](x: Self) {
    
    inline def setNotify_(value: ListEvent => Callback): Self = StObject.set(x, "notify", js.Any.fromFunction1((t0: ListEvent) => value(t0).runNow()))
  }
}
