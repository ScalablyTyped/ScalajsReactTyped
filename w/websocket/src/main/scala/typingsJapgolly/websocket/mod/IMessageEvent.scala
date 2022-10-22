package typingsJapgolly.websocket.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageEvent extends StObject {
  
  var data: String | Buffer | js.typedarray.ArrayBuffer
}
object IMessageEvent {
  
  inline def apply(data: String | Buffer | js.typedarray.ArrayBuffer): IMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageEvent]
  }
  
  extension [Self <: IMessageEvent](x: Self) {
    
    inline def setData(value: String | Buffer | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
