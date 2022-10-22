package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorMod.ImportManager
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTransformSrcUtilsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addImports(importManager: ImportManager, sf: SourceFile): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("addImports")(importManager.asInstanceOf[js.Any], sf.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
  inline def addImports(importManager: ImportManager, sf: SourceFile, extraStatements: js.Array[Statement]): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("addImports")(importManager.asInstanceOf[js.Any], sf.asInstanceOf[js.Any], extraStatements.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
}
