package typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioNodeCreatedEvent extends StObject {
  
  var node: AudioNode
}
object AudioNodeCreatedEvent {
  
  inline def apply(node: AudioNode): AudioNodeCreatedEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioNodeCreatedEvent]
  }
  
  extension [Self <: AudioNodeCreatedEvent](x: Self) {
    
    inline def setNode(value: AudioNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
