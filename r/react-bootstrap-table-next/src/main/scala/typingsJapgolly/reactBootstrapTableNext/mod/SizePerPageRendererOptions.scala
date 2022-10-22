package typingsJapgolly.reactBootstrapTableNext.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactBootstrapTableNext.anon.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizePerPageRendererOptions extends StObject {
  
  /**
    * current size per page
    */
  var currSizePerPage: String
  
  /**
    * call it when you need to change size per page
    */
  def onSizePerPageChange(page: Double): Unit
  
  /**
    * dropdown options
    */
  var options: js.Array[Page]
}
object SizePerPageRendererOptions {
  
  inline def apply(currSizePerPage: String, onSizePerPageChange: Double => Callback, options: js.Array[Page]): SizePerPageRendererOptions = {
    val __obj = js.Dynamic.literal(currSizePerPage = currSizePerPage.asInstanceOf[js.Any], onSizePerPageChange = js.Any.fromFunction1((t0: Double) => onSizePerPageChange(t0).runNow()), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizePerPageRendererOptions]
  }
  
  extension [Self <: SizePerPageRendererOptions](x: Self) {
    
    inline def setCurrSizePerPage(value: String): Self = StObject.set(x, "currSizePerPage", value.asInstanceOf[js.Any])
    
    inline def setOnSizePerPageChange(value: Double => Callback): Self = StObject.set(x, "onSizePerPageChange", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setOptions(value: js.Array[Page]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Page*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
