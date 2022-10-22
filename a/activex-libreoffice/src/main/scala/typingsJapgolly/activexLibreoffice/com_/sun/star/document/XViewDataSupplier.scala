package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to some properties describing all open views to a document
  *
  * Each view is described by a sequence< ::com::sun::star::beans::PropertyValue >. Through this interface the state of all open views can be retrieved
  * and restored later. These states can also be made persistent so that a document loader can create all views of the correct types and restore their
  * state to the state when the document was saved.
  */
trait XViewDataSupplier
  extends StObject
     with XInterface {
  
  /**
    * retrieve information about currently opened view to restore it later
    * @returns a {@link com.sun.star.container.XIndexAccess} , that gives access to a list of {@link com.sun.star.beans.PropertyValue} for every open view. May
    */
  var ViewData: XIndexAccess
  
  /**
    * retrieve information about currently opened view to restore it later
    * @returns a {@link com.sun.star.container.XIndexAccess} , that gives access to a list of {@link com.sun.star.beans.PropertyValue} for every open view. May
    */
  def getViewData(): XIndexAccess
  
  /**
    * restore all views which will be represented by given data argument
    * @param Data a list of {@link com.sun.star.beans.PropertyValues} with information about last opened views to restore it `NULL` isn't allowed here.
    */
  def setViewData(Data: XIndexAccess): Unit
}
object XViewDataSupplier {
  
  inline def apply(
    ViewData: XIndexAccess,
    acquire: Callback,
    getViewData: CallbackTo[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback,
    setViewData: XIndexAccess => Callback
  ): XViewDataSupplier = {
    val __obj = js.Dynamic.literal(ViewData = ViewData.asInstanceOf[js.Any], acquire = acquire.toJsFn, getViewData = getViewData.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setViewData = js.Any.fromFunction1((t0: XIndexAccess) => setViewData(t0).runNow()))
    __obj.asInstanceOf[XViewDataSupplier]
  }
  
  extension [Self <: XViewDataSupplier](x: Self) {
    
    inline def setGetViewData(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getViewData", value.toJsFn)
    
    inline def setSetViewData(value: XIndexAccess => Callback): Self = StObject.set(x, "setViewData", js.Any.fromFunction1((t0: XIndexAccess) => value(t0).runNow()))
    
    inline def setViewData(value: XIndexAccess): Self = StObject.set(x, "ViewData", value.asInstanceOf[js.Any])
  }
}
