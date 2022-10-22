package typingsJapgolly.proto3JsonSerializer

import typingsJapgolly.proto3JsonSerializer.buildSrcTypesMod.FromObjectValue
import typingsJapgolly.proto3JsonSerializer.buildSrcTypesMod.JSONValue
import typingsJapgolly.protobufjs.mod.Enum
import typingsJapgolly.protobufjs.mod.Message
import typingsJapgolly.protobufjs.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFromproto3jsonMod {
  
  @JSImport("proto3-json-serializer/build/src/fromproto3json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromProto3JSON(`type`: Type, json: JSONValue): Message[js.Object] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromProto3JSON")(`type`.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Message[js.Object] | Null]
  
  inline def fromProto3JSONToInternalRepresentation(`type`: String, json: JSONValue): FromObjectValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromProto3JSONToInternalRepresentation")(`type`.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[FromObjectValue]
  inline def fromProto3JSONToInternalRepresentation(`type`: Enum, json: JSONValue): FromObjectValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromProto3JSONToInternalRepresentation")(`type`.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[FromObjectValue]
  inline def fromProto3JSONToInternalRepresentation(`type`: Type, json: JSONValue): FromObjectValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromProto3JSONToInternalRepresentation")(`type`.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[FromObjectValue]
}
