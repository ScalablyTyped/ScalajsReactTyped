package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a filter manager interface for a {@link FilePicker} */
trait XFilterManager
  extends StObject
     with XInterface {
  
  /**
    * Returns the currently selected filter.
    * @returns The name of the selected filter or an empty string if there is no filter or no filter is currently selected.
    */
  var CurrentFilter: String
  
  /**
    * Adds a filter identified by a title.
    * @param aTitle Specifies the name of the filter as shown in the filter box of the {@link FilePicker} dialog.
    * @param aFilter Specifies the extensions of the filter. Multiple filters should be semicolon separated. The semicolon may not be used as character in a f
    * @throws com::sun::star::lang::IllegalArgumentException If a filter with the specified title already exists.
    */
  def appendFilter(aTitle: String, aFilter: String): Unit
  
  /**
    * Returns the currently selected filter.
    * @returns The name of the selected filter or an empty string if there is no filter or no filter is currently selected.
    */
  def getCurrentFilter(): String
  
  /**
    * Sets the current filter.
    * @param aTitle Specifies the name of the filter to be set.
    * @throws com::sun::star::lang::IllegalArgumentException If the specified filter was not found.
    */
  def setCurrentFilter(aTitle: String): Unit
}
object XFilterManager {
  
  inline def apply(
    CurrentFilter: String,
    acquire: Callback,
    appendFilter: (String, String) => Callback,
    getCurrentFilter: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setCurrentFilter: String => Callback
  ): XFilterManager = {
    val __obj = js.Dynamic.literal(CurrentFilter = CurrentFilter.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendFilter = js.Any.fromFunction2((t0: String, t1: String) => (appendFilter(t0, t1)).runNow()), getCurrentFilter = getCurrentFilter.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setCurrentFilter = js.Any.fromFunction1((t0: String) => setCurrentFilter(t0).runNow()))
    __obj.asInstanceOf[XFilterManager]
  }
  
  extension [Self <: XFilterManager](x: Self) {
    
    inline def setAppendFilter(value: (String, String) => Callback): Self = StObject.set(x, "appendFilter", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setCurrentFilter(value: String): Self = StObject.set(x, "CurrentFilter", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentFilter(value: CallbackTo[String]): Self = StObject.set(x, "getCurrentFilter", value.toJsFn)
    
    inline def setSetCurrentFilter(value: String => Callback): Self = StObject.set(x, "setCurrentFilter", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
