package typingsJapgolly.angularDevkitCore

import typingsJapgolly.angularDevkitCore.srcJsonSchemaInterfaceMod.JsonPointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJsonSchemaPointerMod {
  
  @JSImport("@angular-devkit/core/src/json/schema/pointer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildJsonPointer(fragments: js.Array[String]): JsonPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("buildJsonPointer")(fragments.asInstanceOf[js.Any]).asInstanceOf[JsonPointer]
  
  inline def joinJsonPointer(root: JsonPointer, others: String*): JsonPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("joinJsonPointer")(scala.List(root.asInstanceOf[js.Any]).`++`(others.asInstanceOf[Seq[js.Any]])*).asInstanceOf[JsonPointer]
  
  inline def parseJsonPointer(pointer: JsonPointer): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonPointer")(pointer.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
