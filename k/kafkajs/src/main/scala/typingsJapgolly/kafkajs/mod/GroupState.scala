package typingsJapgolly.kafkajs.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupState extends StObject {
  
  var metadata: Buffer
  
  var name: String
}
object GroupState {
  
  inline def apply(metadata: Buffer, name: String): GroupState = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupState]
  }
  
  extension [Self <: GroupState](x: Self) {
    
    inline def setMetadata(value: Buffer): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
