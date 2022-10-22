package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.ConstantPool
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.LinkedDefinition
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerTranslatorMod.Translator
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcApiAstFactoryMod.AstFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerEmitScopesEmitScopeMod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/emit_scopes/emit_scope", "EmitScope")
  @js.native
  open class EmitScope[TStatement, TExpression] protected () extends StObject {
    def this(
      ngImport: TExpression,
      translator: Translator[TStatement, TExpression],
      factory: AstFactory[TStatement, TExpression]
    ) = this()
    
    val constantPool: ConstantPool = js.native
    
    /* private */ val factory: Any = js.native
    
    /**
      * Return any constant statements that are shared between all uses of this `EmitScope`.
      */
    def getConstantStatements(): js.Array[TStatement] = js.native
    
    /* protected */ val ngImport: TExpression = js.native
    
    /**
      * Translate the given Output AST definition expression into a generic `TExpression`.
      *
      * Use a `LinkerImportGenerator` to handle any imports in the definition.
      */
    def translateDefinition(definition: LinkedDefinition): TExpression = js.native
    
    /* protected */ val translator: Translator[TStatement, TExpression] = js.native
    
    /* private */ var wrapInIifeWithStatements: Any = js.native
  }
}
