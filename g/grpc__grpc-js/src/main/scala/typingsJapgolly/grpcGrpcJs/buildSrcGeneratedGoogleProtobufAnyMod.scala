package typingsJapgolly.grpcGrpcJs

import typingsJapgolly.grpcGrpcJs.anon.Typeurl
import typingsJapgolly.grpcProtoLoader.mod.AnyExtension
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGeneratedGoogleProtobufAnyMod {
  
  type Any = AnyExtension | Typeurl
  
  trait AnyOutput extends StObject {
    
    var type_url: String
    
    var value: Buffer
  }
  object AnyOutput {
    
    inline def apply(type_url: String, value: Buffer): AnyOutput = {
      val __obj = js.Dynamic.literal(type_url = type_url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnyOutput]
    }
    
    extension [Self <: AnyOutput](x: Self) {
      
      inline def setType_url(value: String): Self = StObject.set(x, "type_url", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
