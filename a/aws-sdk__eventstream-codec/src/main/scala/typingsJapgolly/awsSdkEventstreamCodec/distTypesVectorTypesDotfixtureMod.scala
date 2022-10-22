package typingsJapgolly.awsSdkEventstreamCodec

import typingsJapgolly.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.failure
import typingsJapgolly.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.success
import typingsJapgolly.awsSdkEventstreamCodec.distTypesMessageMod.Message
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVectorTypesDotfixtureMod {
  
  trait NegativeTestVector
    extends StObject
       with TestVector {
    
    var encoded: js.typedarray.Uint8Array
    
    var expectation: failure
  }
  object NegativeTestVector {
    
    inline def apply(encoded: js.typedarray.Uint8Array): NegativeTestVector = {
      val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], expectation = "failure")
      __obj.asInstanceOf[NegativeTestVector]
    }
    
    extension [Self <: NegativeTestVector](x: Self) {
      
      inline def setEncoded(value: js.typedarray.Uint8Array): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
      
      inline def setExpectation(value: failure): Self = StObject.set(x, "expectation", value.asInstanceOf[js.Any])
    }
  }
  
  trait PositiveTestVector
    extends StObject
       with TestVector {
    
    var decoded: Message
    
    var encoded: js.typedarray.Uint8Array
    
    var expectation: success
  }
  object PositiveTestVector {
    
    inline def apply(decoded: Message, encoded: js.typedarray.Uint8Array): PositiveTestVector = {
      val __obj = js.Dynamic.literal(decoded = decoded.asInstanceOf[js.Any], encoded = encoded.asInstanceOf[js.Any], expectation = "success")
      __obj.asInstanceOf[PositiveTestVector]
    }
    
    extension [Self <: PositiveTestVector](x: Self) {
      
      inline def setDecoded(value: Message): Self = StObject.set(x, "decoded", value.asInstanceOf[js.Any])
      
      inline def setEncoded(value: js.typedarray.Uint8Array): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
      
      inline def setExpectation(value: success): Self = StObject.set(x, "expectation", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkEventstreamCodec.distTypesVectorTypesDotfixtureMod.NegativeTestVector
    - typingsJapgolly.awsSdkEventstreamCodec.distTypesVectorTypesDotfixtureMod.PositiveTestVector
  */
  trait TestVector extends StObject
  object TestVector {
    
    inline def NegativeTestVector(encoded: js.typedarray.Uint8Array): typingsJapgolly.awsSdkEventstreamCodec.distTypesVectorTypesDotfixtureMod.NegativeTestVector = {
      val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], expectation = "failure")
      __obj.asInstanceOf[typingsJapgolly.awsSdkEventstreamCodec.distTypesVectorTypesDotfixtureMod.NegativeTestVector]
    }
    
    inline def PositiveTestVector(decoded: Message, encoded: js.typedarray.Uint8Array): typingsJapgolly.awsSdkEventstreamCodec.distTypesVectorTypesDotfixtureMod.PositiveTestVector = {
      val __obj = js.Dynamic.literal(decoded = decoded.asInstanceOf[js.Any], encoded = encoded.asInstanceOf[js.Any], expectation = "success")
      __obj.asInstanceOf[typingsJapgolly.awsSdkEventstreamCodec.distTypesVectorTypesDotfixtureMod.PositiveTestVector]
    }
  }
  
  type TestVectors = Record[String, TestVector]
}
