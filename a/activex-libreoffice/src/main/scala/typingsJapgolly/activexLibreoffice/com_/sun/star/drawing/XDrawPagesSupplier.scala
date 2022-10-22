package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** must be supported to provide access to a multi-page drawing-layer. */
trait XDrawPagesSupplier
  extends StObject
     with XInterface {
  
  /** @returns an indexed container with the service {@link DrawPages} . */
  val DrawPages: XDrawPages
  
  /** @returns an indexed container with the service {@link DrawPages} . */
  def getDrawPages(): XDrawPages
}
object XDrawPagesSupplier {
  
  inline def apply(
    DrawPages: XDrawPages,
    acquire: Callback,
    getDrawPages: CallbackTo[XDrawPages],
    queryInterface: `type` => Any,
    release: Callback
  ): XDrawPagesSupplier = {
    val __obj = js.Dynamic.literal(DrawPages = DrawPages.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDrawPages = getDrawPages.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDrawPagesSupplier]
  }
  
  extension [Self <: XDrawPagesSupplier](x: Self) {
    
    inline def setDrawPages(value: XDrawPages): Self = StObject.set(x, "DrawPages", value.asInstanceOf[js.Any])
    
    inline def setGetDrawPages(value: CallbackTo[XDrawPages]): Self = StObject.set(x, "getDrawPages", value.toJsFn)
  }
}
