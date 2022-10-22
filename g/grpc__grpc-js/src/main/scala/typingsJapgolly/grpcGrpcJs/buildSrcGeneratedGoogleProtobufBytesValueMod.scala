package typingsJapgolly.grpcGrpcJs

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGeneratedGoogleProtobufBytesValueMod {
  
  trait BytesValue extends StObject {
    
    var value: js.UndefOr[Buffer | js.typedarray.Uint8Array | String] = js.undefined
  }
  object BytesValue {
    
    inline def apply(): BytesValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BytesValue]
    }
    
    extension [Self <: BytesValue](x: Self) {
      
      inline def setValue(value: Buffer | js.typedarray.Uint8Array | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait BytesValueOutput extends StObject {
    
    var value: Buffer
  }
  object BytesValueOutput {
    
    inline def apply(value: Buffer): BytesValueOutput = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesValueOutput]
    }
    
    extension [Self <: BytesValueOutput](x: Self) {
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
