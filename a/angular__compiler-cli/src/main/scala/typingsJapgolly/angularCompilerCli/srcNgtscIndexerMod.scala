package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IndexedComponent
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIndexerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", "AbsoluteSourceSpan")
  @js.native
  open class AbsoluteSourceSpan protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.AbsoluteSourceSpan {
    def this(start: Double, end: Double) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", "IdentifierKind")
  @js.native
  object IdentifierKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind & Double
      ] = js.native
    
    /* 4 */ val Attribute: typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Attribute & Double = js.native
    
    /* 2 */ val Element: typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Element & Double = js.native
    
    /* 1 */ val Method: typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Method & Double = js.native
    
    /* 0 */ val Property: typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Property & Double = js.native
    
    /* 5 */ val Reference: typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Reference & Double = js.native
    
    /* 3 */ val Template: typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Template & Double = js.native
    
    /* 6 */ val Variable: typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Variable & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", "IndexingContext")
  @js.native
  open class IndexingContext ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcContextMod.IndexingContext
  
  inline def generateAnalysis(context: typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcContextMod.IndexingContext): Map[DeclarationNode, IndexedComponent] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAnalysis")(context.asInstanceOf[js.Any]).asInstanceOf[Map[DeclarationNode, IndexedComponent]]
}
