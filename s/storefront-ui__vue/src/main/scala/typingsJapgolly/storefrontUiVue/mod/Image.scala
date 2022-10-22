package typingsJapgolly.storefrontUiVue.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image
  extends StObject
     with Source {
  
  var alt: String
}
object Image {
  
  inline def apply(alt: String): Image = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
  }
}
