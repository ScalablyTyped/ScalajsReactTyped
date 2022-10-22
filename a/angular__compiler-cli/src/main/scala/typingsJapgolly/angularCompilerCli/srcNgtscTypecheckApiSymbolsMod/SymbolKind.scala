package typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolKind extends StObject
@JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api/symbols", "SymbolKind")
@js.native
object SymbolKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolKind & Double] = js.native
  
  @js.native
  sealed trait Binding
    extends StObject
       with SymbolKind
  /* 2 */ val Binding: typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Binding & Double = js.native
  
  @js.native
  sealed trait Directive
    extends StObject
       with SymbolKind
  /* 5 */ val Directive: typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Directive & Double = js.native
  
  @js.native
  sealed trait DomBinding
    extends StObject
       with SymbolKind
  /* 9 */ val DomBinding: typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.DomBinding & Double = js.native
  
  @js.native
  sealed trait Element
    extends StObject
       with SymbolKind
  /* 6 */ val Element: typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Element & Double = js.native
  
  @js.native
  sealed trait Expression
    extends StObject
       with SymbolKind
  /* 8 */ val Expression: typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Expression & Double = js.native
  
  @js.native
  sealed trait Input
    extends StObject
       with SymbolKind
  /* 0 */ val Input: typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Input & Double = js.native
  
  @js.native
  sealed trait Output
    extends StObject
       with SymbolKind
  /* 1 */ val Output: typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Output & Double = js.native
  
  @js.native
  sealed trait Pipe
    extends StObject
       with SymbolKind
  /* 10 */ val Pipe: typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Pipe & Double = js.native
  
  @js.native
  sealed trait Reference
    extends StObject
       with SymbolKind
  /* 3 */ val Reference: typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Reference & Double = js.native
  
  @js.native
  sealed trait Template
    extends StObject
       with SymbolKind
  /* 7 */ val Template: typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Template & Double = js.native
  
  @js.native
  sealed trait Variable
    extends StObject
       with SymbolKind
  /* 4 */ val Variable: typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Variable & Double = js.native
}
