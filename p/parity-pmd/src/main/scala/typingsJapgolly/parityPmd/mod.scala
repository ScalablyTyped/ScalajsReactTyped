package typingsJapgolly.parityPmd

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parity-pmd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(message: PMDMessage): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(message.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def parse(buffer: Buffer): PMDMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any]).asInstanceOf[PMDMessage]
  
  trait PMDMessage extends StObject {
    
    var instrument: js.UndefOr[String] = js.undefined
    
    var messageType: String
    
    var orderNumber: js.UndefOr[Double] = js.undefined
    
    var price: js.UndefOr[Double] = js.undefined
    
    var quantity: js.UndefOr[Double] = js.undefined
    
    var side: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object PMDMessage {
    
    inline def apply(messageType: String): PMDMessage = {
      val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
      __obj.asInstanceOf[PMDMessage]
    }
    
    extension [Self <: PMDMessage](x: Self) {
      
      inline def setInstrument(value: String): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
      
      inline def setInstrumentUndefined: Self = StObject.set(x, "instrument", js.undefined)
      
      inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      inline def setOrderNumber(value: Double): Self = StObject.set(x, "orderNumber", value.asInstanceOf[js.Any])
      
      inline def setOrderNumberUndefined: Self = StObject.set(x, "orderNumber", js.undefined)
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
