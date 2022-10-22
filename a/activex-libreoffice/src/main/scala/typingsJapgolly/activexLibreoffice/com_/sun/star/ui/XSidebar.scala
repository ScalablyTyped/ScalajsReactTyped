package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface of the sidebar that allows its elements like panels to eg request layouts. */
trait XSidebar extends StObject {
  
  /**
    * Request layout of the sidebar. Call this method when one of the panels wants to change its size due to late initilization or different content after a
    * context change.
    */
  def requestLayout(): Unit
}
object XSidebar {
  
  inline def apply(requestLayout: Callback): XSidebar = {
    val __obj = js.Dynamic.literal(requestLayout = requestLayout.toJsFn)
    __obj.asInstanceOf[XSidebar]
  }
  
  extension [Self <: XSidebar](x: Self) {
    
    inline def setRequestLayout(value: Callback): Self = StObject.set(x, "requestLayout", value.toJsFn)
  }
}
