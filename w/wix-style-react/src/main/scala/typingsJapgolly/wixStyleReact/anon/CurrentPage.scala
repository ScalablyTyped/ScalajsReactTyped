package typingsJapgolly.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentPage extends StObject {
  
  var currentPage: Double
  
  var lastPage: Double
}
object CurrentPage {
  
  inline def apply(currentPage: Double, lastPage: Double): CurrentPage = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], lastPage = lastPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentPage]
  }
  
  extension [Self <: CurrentPage](x: Self) {
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setLastPage(value: Double): Self = StObject.set(x, "lastPage", value.asInstanceOf[js.Any])
  }
}
