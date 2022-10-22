package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to page through the document in steps of the displayed size. */
trait XScreenCursor
  extends StObject
     with XInterface {
  
  /** scrolls the view forward by one visible page. */
  def screenDown(): Boolean
  
  /** scrolls the view backward by one visible page. */
  def screenUp(): Boolean
}
object XScreenCursor {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    screenDown: CallbackTo[Boolean],
    screenUp: CallbackTo[Boolean]
  ): XScreenCursor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, screenDown = screenDown.toJsFn, screenUp = screenUp.toJsFn)
    __obj.asInstanceOf[XScreenCursor]
  }
  
  extension [Self <: XScreenCursor](x: Self) {
    
    inline def setScreenDown(value: CallbackTo[Boolean]): Self = StObject.set(x, "screenDown", value.toJsFn)
    
    inline def setScreenUp(value: CallbackTo[Boolean]): Self = StObject.set(x, "screenUp", value.toJsFn)
  }
}
