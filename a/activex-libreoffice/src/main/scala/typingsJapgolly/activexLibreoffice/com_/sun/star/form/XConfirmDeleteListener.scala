package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdb.RowChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to register a component for confirming deletions of rows in a {@link com.sun.star.form.component.DataForm} .
  * @see XConfirmDeleteBroadcaster
  */
trait XConfirmDeleteListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when the current record of a database form will be deleted.
    * @param aEvent A descriptor specifying the deletion request.
    * @returns `TRUE` when the row can be deleted, otherwise `FALSE` .
    */
  def confirmDelete(aEvent: RowChangeEvent): Boolean
}
object XConfirmDeleteListener {
  
  inline def apply(
    acquire: Callback,
    confirmDelete: RowChangeEvent => Boolean,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XConfirmDeleteListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, confirmDelete = js.Any.fromFunction1(confirmDelete), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XConfirmDeleteListener]
  }
  
  extension [Self <: XConfirmDeleteListener](x: Self) {
    
    inline def setConfirmDelete(value: RowChangeEvent => Boolean): Self = StObject.set(x, "confirmDelete", js.Any.fromFunction1(value))
  }
}
