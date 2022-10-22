package typingsJapgolly.proto3JsonSerializer

import typingsJapgolly.proto3JsonSerializer.buildSrcToproto3jsonMod.ToProto3JSONOptions
import typingsJapgolly.proto3JsonSerializer.buildSrcTypesMod.JSONValue
import typingsJapgolly.protobufjs.mod.Message
import typingsJapgolly.protobufjs.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proto3-json-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromProto3JSON(`type`: Type, json: JSONValue): Message[js.Object] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromProto3JSON")(`type`.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Message[js.Object] | Null]
  
  inline def toProto3JSON(obj: Message[js.Object]): JSONValue = ^.asInstanceOf[js.Dynamic].applyDynamic("toProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[JSONValue]
  inline def toProto3JSON(obj: Message[js.Object], options: ToProto3JSONOptions): JSONValue = (^.asInstanceOf[js.Dynamic].applyDynamic("toProto3JSON")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONValue]
}
