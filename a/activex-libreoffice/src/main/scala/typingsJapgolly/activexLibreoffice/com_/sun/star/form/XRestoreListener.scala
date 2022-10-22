package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notifications about data being restored.
  *
  * Such a notification is typically sent when the user cancels updating the current record of a database form without saving the data. After restoring,
  * the user operates on the original data.
  *
  * Please do **not** use anymore, this interface is deprecated, and superseded by functionality from the {@link com.sun.star.form.component.DataForm} and
  * {@link com.sun.star.sdb.RowSet} services
  * @deprecated Deprecated
  */
trait XRestoreListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a modified record has been restored */
  def restored(aEvent: EventObject): Unit
}
object XRestoreListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    restored: EventObject => Callback
  ): XRestoreListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, restored = js.Any.fromFunction1((t0: EventObject) => restored(t0).runNow()))
    __obj.asInstanceOf[XRestoreListener]
  }
  
  extension [Self <: XRestoreListener](x: Self) {
    
    inline def setRestored(value: EventObject => Callback): Self = StObject.set(x, "restored", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
