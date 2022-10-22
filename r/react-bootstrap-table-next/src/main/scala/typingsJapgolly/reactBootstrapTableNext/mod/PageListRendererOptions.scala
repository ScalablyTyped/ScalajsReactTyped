package typingsJapgolly.reactBootstrapTableNext.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactBootstrapTableNext.anon.Active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageListRendererOptions extends StObject {
  
  /**
    * call it when you need to change page
    */
  def onPageChange(page: Double, sizePerPage: Double): Unit
  
  /**
    * current page
    */
  var pages: js.Array[Active]
}
object PageListRendererOptions {
  
  inline def apply(onPageChange: (Double, Double) => Callback, pages: js.Array[Active]): PageListRendererOptions = {
    val __obj = js.Dynamic.literal(onPageChange = js.Any.fromFunction2((t0: Double, t1: Double) => (onPageChange(t0, t1)).runNow()), pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageListRendererOptions]
  }
  
  extension [Self <: PageListRendererOptions](x: Self) {
    
    inline def setOnPageChange(value: (Double, Double) => Callback): Self = StObject.set(x, "onPageChange", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setPages(value: js.Array[Active]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: Active*): Self = StObject.set(x, "pages", js.Array(value*))
  }
}
