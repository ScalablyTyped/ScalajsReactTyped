package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscImportsSrcFindExportMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/find_export", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findExportedNameOfNode(target: Node, file: SourceFile, reflector: ReflectionHost): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExportedNameOfNode")(target.asInstanceOf[js.Any], file.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
