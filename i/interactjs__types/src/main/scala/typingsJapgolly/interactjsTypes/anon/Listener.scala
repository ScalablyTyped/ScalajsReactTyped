package typingsJapgolly.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listener extends StObject {
  
  def listener(args: Any*): Any
  @JSName("listener")
  var listener_Original: typingsJapgolly.interactjsTypes.coreTypesMod.Listener
  
  var `type`: String
}
object Listener {
  
  inline def apply(listener: typingsJapgolly.interactjsTypes.coreTypesMod.Listener, `type`: String): Listener = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
  
  extension [Self <: Listener](x: Self) {
    
    inline def setListener(value: typingsJapgolly.interactjsTypes.coreTypesMod.Listener): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
