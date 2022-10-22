package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents something that provides a {@link DrawPage} .
  *
  * This interface is provided if the container only supports exactly one {@link DrawPage} . For containers which support multiple {@link DrawPages}
  * interface {@link XDrawPagesSupplier} is supported.
  * @deprecated Deprecated
  */
trait XDrawPageSupplier
  extends StObject
     with XInterface {
  
  /** returns the {@link DrawPage} . */
  val DrawPage: XDrawPage
  
  /** returns the {@link DrawPage} . */
  def getDrawPage(): XDrawPage
}
object XDrawPageSupplier {
  
  inline def apply(
    DrawPage: XDrawPage,
    acquire: Callback,
    getDrawPage: CallbackTo[XDrawPage],
    queryInterface: `type` => Any,
    release: Callback
  ): XDrawPageSupplier = {
    val __obj = js.Dynamic.literal(DrawPage = DrawPage.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDrawPage = getDrawPage.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDrawPageSupplier]
  }
  
  extension [Self <: XDrawPageSupplier](x: Self) {
    
    inline def setDrawPage(value: XDrawPage): Self = StObject.set(x, "DrawPage", value.asInstanceOf[js.Any])
    
    inline def setGetDrawPage(value: CallbackTo[XDrawPage]): Self = StObject.set(x, "getDrawPage", value.toJsFn)
  }
}
