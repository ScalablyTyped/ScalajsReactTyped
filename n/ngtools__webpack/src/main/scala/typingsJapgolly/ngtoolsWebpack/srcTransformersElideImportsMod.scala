package typingsJapgolly.ngtoolsWebpack

import typingsJapgolly.std.Set
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersElideImportsMod {
  
  @JSImport("@ngtools/webpack/src/transformers/elide_imports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def elideImports(
    sourceFile: SourceFile,
    removedNodes: js.Array[Node],
    getTypeChecker: js.Function0[TypeChecker],
    compilerOptions: CompilerOptions
  ): Set[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("elideImports")(sourceFile.asInstanceOf[js.Any], removedNodes.asInstanceOf[js.Any], getTypeChecker.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any])).asInstanceOf[Set[Node]]
}
