package typingsJapgolly.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrPage extends StObject {
  
  var currPage: Double
  
  var currSizePerPage: Double
}
object CurrPage {
  
  inline def apply(currPage: Double, currSizePerPage: Double): CurrPage = {
    val __obj = js.Dynamic.literal(currPage = currPage.asInstanceOf[js.Any], currSizePerPage = currSizePerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrPage]
  }
  
  extension [Self <: CurrPage](x: Self) {
    
    inline def setCurrPage(value: Double): Self = StObject.set(x, "currPage", value.asInstanceOf[js.Any])
    
    inline def setCurrSizePerPage(value: Double): Self = StObject.set(x, "currSizePerPage", value.asInstanceOf[js.Any])
  }
}
