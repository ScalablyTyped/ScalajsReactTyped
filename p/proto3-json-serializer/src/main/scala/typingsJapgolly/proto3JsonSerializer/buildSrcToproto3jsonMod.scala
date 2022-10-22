package typingsJapgolly.proto3JsonSerializer

import typingsJapgolly.proto3JsonSerializer.buildSrcTypesMod.JSONValue
import typingsJapgolly.protobufjs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcToproto3jsonMod {
  
  @JSImport("proto3-json-serializer/build/src/toproto3json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toProto3JSON(obj: Message[js.Object]): JSONValue = ^.asInstanceOf[js.Dynamic].applyDynamic("toProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[JSONValue]
  inline def toProto3JSON(obj: Message[js.Object], options: ToProto3JSONOptions): JSONValue = (^.asInstanceOf[js.Dynamic].applyDynamic("toProto3JSON")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONValue]
  
  trait ToProto3JSONOptions extends StObject {
    
    var numericEnums: Boolean
  }
  object ToProto3JSONOptions {
    
    inline def apply(numericEnums: Boolean): ToProto3JSONOptions = {
      val __obj = js.Dynamic.literal(numericEnums = numericEnums.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToProto3JSONOptions]
    }
    
    extension [Self <: ToProto3JSONOptions](x: Self) {
      
      inline def setNumericEnums(value: Boolean): Self = StObject.set(x, "numericEnums", value.asInstanceOf[js.Any])
    }
  }
}
