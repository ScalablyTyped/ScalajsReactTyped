package typingsJapgolly.googleCloudTextToSpeech.anon

import typingsJapgolly.proto3JsonSerializer.buildSrcToproto3jsonMod.ToProto3JSONOptions
import typingsJapgolly.proto3JsonSerializer.buildSrcTypesMod.JSONValue
import typingsJapgolly.protobufjs.mod.Message
import typingsJapgolly.protobufjs.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofserializer extends StObject {
  
  def fromProto3JSON(`type`: Type, json: JSONValue): Message[js.Object] | Null = js.native
  
  def toProto3JSON(obj: Message[js.Object]): JSONValue = js.native
  def toProto3JSON(obj: Message[js.Object], options: ToProto3JSONOptions): JSONValue = js.native
}
