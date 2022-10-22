package typingsJapgolly.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the page that raised the PageRenderComplete event.
  *
  * [Api set:  1.1]
  */
trait PageRenderCompleteEventArgs extends StObject {
  
  /**
    *
    * Gets the name of the page that raised the PageLoad event.
    *
    * [Api set:  1.1]
    */
  var pageName: String
  
  /**
    *
    * Gets the success/failure of the PageRender event.
    *
    * [Api set:  1.1]
    */
  var success: Boolean
}
object PageRenderCompleteEventArgs {
  
  inline def apply(pageName: String, success: Boolean): PageRenderCompleteEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageRenderCompleteEventArgs]
  }
  
  extension [Self <: PageRenderCompleteEventArgs](x: Self) {
    
    inline def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
