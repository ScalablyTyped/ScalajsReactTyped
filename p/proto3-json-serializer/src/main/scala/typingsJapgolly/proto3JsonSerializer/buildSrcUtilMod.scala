package typingsJapgolly.proto3JsonSerializer

import typingsJapgolly.protobufjs.mod.Enum
import typingsJapgolly.protobufjs.mod.Namespace
import typingsJapgolly.protobufjs.mod.Type
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilMod {
  
  @JSImport("proto3-json-serializer/build/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert(assertion: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFullyQualifiedTypeName(`type`: Enum): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullyQualifiedTypeName")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getFullyQualifiedTypeName(`type`: Namespace): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullyQualifiedTypeName")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getFullyQualifiedTypeName(`type`: Type): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullyQualifiedTypeName")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("proto3-json-serializer/build/src/util", "wrapperTypes")
  @js.native
  val wrapperTypes: Set[String] = js.native
}
