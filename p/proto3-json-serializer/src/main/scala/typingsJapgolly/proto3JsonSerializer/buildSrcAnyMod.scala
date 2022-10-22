package typingsJapgolly.proto3JsonSerializer

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.proto3JsonSerializer.anon.Typeurl
import typingsJapgolly.proto3JsonSerializer.anon.Value
import typingsJapgolly.proto3JsonSerializer.buildSrcToproto3jsonMod.ToProto3JSONOptions
import typingsJapgolly.proto3JsonSerializer.buildSrcTypesMod.JSONObject
import typingsJapgolly.proto3JsonSerializer.buildSrcTypesMod.JSONValue
import typingsJapgolly.protobufjs.mod.Message
import typingsJapgolly.protobufjs.mod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAnyMod {
  
  @JSImport("proto3-json-serializer/build/src/any", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def googleProtobufAnyFromProto3JSON(root: Root, json: JSONValue): Typeurl | Value = (^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufAnyFromProto3JSON")(root.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Typeurl | Value]
  
  inline def googleProtobufAnyToProto3JSON(obj: Message[js.Object] & Any): JSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufAnyToProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[JSONObject]
  inline def googleProtobufAnyToProto3JSON(obj: Message[js.Object] & Any, options: ToProto3JSONOptions): JSONObject = (^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufAnyToProto3JSON")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONObject]
  
  trait Any extends StObject {
    
    var type_url: String
    
    var value: Buffer | js.typedarray.Uint8Array
  }
  object Any {
    
    inline def apply(type_url: String, value: Buffer | js.typedarray.Uint8Array): Any = {
      val __obj = js.Dynamic.literal(type_url = type_url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Any]
    }
    
    extension [Self <: Any](x: Self) {
      
      inline def setType_url(value: String): Self = StObject.set(x, "type_url", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
