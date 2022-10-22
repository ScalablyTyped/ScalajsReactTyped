package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** returns the handout master page for this document */
trait XHandoutMasterSupplier
  extends StObject
     with XInterface {
  
  /** returns the {@link DrawPage} . */
  val HandoutMasterPage: XDrawPage
  
  /** returns the {@link DrawPage} . */
  def getHandoutMasterPage(): XDrawPage
}
object XHandoutMasterSupplier {
  
  inline def apply(
    HandoutMasterPage: XDrawPage,
    acquire: Callback,
    getHandoutMasterPage: CallbackTo[XDrawPage],
    queryInterface: `type` => Any,
    release: Callback
  ): XHandoutMasterSupplier = {
    val __obj = js.Dynamic.literal(HandoutMasterPage = HandoutMasterPage.asInstanceOf[js.Any], acquire = acquire.toJsFn, getHandoutMasterPage = getHandoutMasterPage.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XHandoutMasterSupplier]
  }
  
  extension [Self <: XHandoutMasterSupplier](x: Self) {
    
    inline def setGetHandoutMasterPage(value: CallbackTo[XDrawPage]): Self = StObject.set(x, "getHandoutMasterPage", value.toJsFn)
    
    inline def setHandoutMasterPage(value: XDrawPage): Self = StObject.set(x, "HandoutMasterPage", value.asInstanceOf[js.Any])
  }
}
