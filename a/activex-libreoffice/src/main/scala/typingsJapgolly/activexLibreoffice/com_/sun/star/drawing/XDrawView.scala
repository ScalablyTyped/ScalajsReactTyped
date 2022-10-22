package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is implemented by views that display {@link DrawPages} or {@link MasterPages} . */
trait XDrawView
  extends StObject
     with XInterface {
  
  /**
    * returns the current page.
    * @returns the {@link DrawPage} or {@link MasterPage} that is currently displayed.
    */
  var CurrentPage: XDrawPage
  
  /**
    * returns the current page.
    * @returns the {@link DrawPage} or {@link MasterPage} that is currently displayed.
    */
  def getCurrentPage(): XDrawPage
  
  /**
    * changes the current page.
    * @param xPage this {@link DrawPage} or {@link MasterPage} will be displayed inside this view.
    */
  def setCurrentPage(xPage: XDrawPage): Unit
}
object XDrawView {
  
  inline def apply(
    CurrentPage: XDrawPage,
    acquire: Callback,
    getCurrentPage: CallbackTo[XDrawPage],
    queryInterface: `type` => Any,
    release: Callback,
    setCurrentPage: XDrawPage => Callback
  ): XDrawView = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCurrentPage = getCurrentPage.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setCurrentPage = js.Any.fromFunction1((t0: XDrawPage) => setCurrentPage(t0).runNow()))
    __obj.asInstanceOf[XDrawView]
  }
  
  extension [Self <: XDrawView](x: Self) {
    
    inline def setCurrentPage(value: XDrawPage): Self = StObject.set(x, "CurrentPage", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentPage(value: CallbackTo[XDrawPage]): Self = StObject.set(x, "getCurrentPage", value.toJsFn)
    
    inline def setSetCurrentPage(value: XDrawPage => Callback): Self = StObject.set(x, "setCurrentPage", js.Any.fromFunction1((t0: XDrawPage) => value(t0).runNow()))
  }
}
