package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerEmitScopesEmitScopeMod.EmitScope
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerTranslatorMod.Translator
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcApiAstFactoryMod.AstFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerEmitScopesLocalEmitScopeMod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/emit_scopes/local_emit_scope", "LocalEmitScope")
  @js.native
  open class LocalEmitScope[TStatement, TExpression] protected () extends EmitScope[TStatement, TExpression] {
    def this(
      ngImport: TExpression,
      translator: Translator[TStatement, TExpression],
      factory: AstFactory[TStatement, TExpression]
    ) = this()
  }
}
