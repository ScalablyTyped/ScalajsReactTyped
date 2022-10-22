package typingsJapgolly.proto3JsonSerializer

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcBytesMod {
  
  @JSImport("proto3-json-serializer/build/src/bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bytesFromProto3JSON(json: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesFromProto3JSON")(json.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def bytesToProto3JSON(obj: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def bytesToProto3JSON(obj: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
