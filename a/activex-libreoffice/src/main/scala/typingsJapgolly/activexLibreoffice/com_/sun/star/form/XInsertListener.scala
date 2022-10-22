package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to receive notifications about insertions into a database form.
  *
  * Please do **not** use anymore, this interface is deprecated, and superseded by functionality from the {@link com.sun.star.form.component.DataForm}
  * service, as well as the {@link com.sun.star.sdbc.XRowSetListener} and {@link com.sun.star.sdb.XRowSetApproveListener} interfaces.
  * @deprecated Deprecated
  */
trait XInsertListener
  extends StObject
     with XEventListener {
  
  /** is invoked after a database form has inserted a record to a data source. */
  def inserted(aEvent: EventObject): Unit
  
  /** is invoked when a database form starts inserting a record. */
  def inserting(aEvent: EventObject): Unit
}
object XInsertListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    inserted: EventObject => Callback,
    inserting: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XInsertListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), inserted = js.Any.fromFunction1((t0: EventObject) => inserted(t0).runNow()), inserting = js.Any.fromFunction1((t0: EventObject) => inserting(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInsertListener]
  }
  
  extension [Self <: XInsertListener](x: Self) {
    
    inline def setInserted(value: EventObject => Callback): Self = StObject.set(x, "inserted", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setInserting(value: EventObject => Callback): Self = StObject.set(x, "inserting", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
