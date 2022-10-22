package typingsJapgolly.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenComponentData extends StObject {
  
  var enabled: Boolean
}
object ScreenComponentData {
  
  inline def apply(enabled: Boolean): ScreenComponentData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenComponentData]
  }
  
  extension [Self <: ScreenComponentData](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
