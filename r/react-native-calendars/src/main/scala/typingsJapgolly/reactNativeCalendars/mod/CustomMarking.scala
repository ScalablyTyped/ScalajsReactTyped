package typingsJapgolly.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomMarking
  extends StObject
     with Marking {
  
  var customStyles: MarkedDateCustomStyles
}
object CustomMarking {
  
  inline def apply(customStyles: MarkedDateCustomStyles): CustomMarking = {
    val __obj = js.Dynamic.literal(customStyles = customStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMarking]
  }
  
  extension [Self <: CustomMarking](x: Self) {
    
    inline def setCustomStyles(value: MarkedDateCustomStyles): Self = StObject.set(x, "customStyles", value.asInstanceOf[js.Any])
  }
}
