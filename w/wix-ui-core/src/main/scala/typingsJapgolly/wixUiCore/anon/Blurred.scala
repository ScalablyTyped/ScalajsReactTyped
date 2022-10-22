package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blurred extends StObject {
  
  var blurred: Boolean
  
  var escPress: Boolean
}
object Blurred {
  
  inline def apply(blurred: Boolean, escPress: Boolean): Blurred = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], escPress = escPress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blurred]
  }
  
  extension [Self <: Blurred](x: Self) {
    
    inline def setBlurred(value: Boolean): Self = StObject.set(x, "blurred", value.asInstanceOf[js.Any])
    
    inline def setEscPress(value: Boolean): Self = StObject.set(x, "escPress", value.asInstanceOf[js.Any])
  }
}
