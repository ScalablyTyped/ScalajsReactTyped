package typingsJapgolly.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  /**
    * The name of the newly active layout - "S", "M", "ML", "L", "XL", "XXL" or "XXXL".
    */
  var layout: js.UndefOr[String] = js.undefined
}
object Layout {
  
  inline def apply(): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layout]
  }
  
  extension [Self <: Layout](x: Self) {
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
