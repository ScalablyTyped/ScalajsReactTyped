package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IndexedComponent
import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcContextMod.IndexingContext
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIndexerSrcTransformMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer/src/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateAnalysis(context: IndexingContext): Map[DeclarationNode, IndexedComponent] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAnalysis")(context.asInstanceOf[js.Any]).asInstanceOf[Map[DeclarationNode, IndexedComponent]]
}
