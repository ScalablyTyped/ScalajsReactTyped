package typingsJapgolly.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioListenerComponentData extends StObject {
  
  var enabled: Boolean
}
object AudioListenerComponentData {
  
  inline def apply(enabled: Boolean): AudioListenerComponentData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListenerComponentData]
  }
  
  extension [Self <: AudioListenerComponentData](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
