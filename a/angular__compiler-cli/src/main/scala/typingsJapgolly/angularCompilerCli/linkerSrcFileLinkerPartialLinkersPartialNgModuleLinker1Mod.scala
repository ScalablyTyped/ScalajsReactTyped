package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.ConstantPool
import typingsJapgolly.angularCompiler.mod.R3DeclareNgModuleMetadata
import typingsJapgolly.angularCompiler.mod.R3NgModuleMetadata
import typingsJapgolly.angularCompiler.mod.R3PartialDeclaration
import typingsJapgolly.angularCompilerCli.linkerSrcAstAstValueMod.AstObject
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.LinkedDefinition
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.PartialLinker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerPartialLinkersPartialNgModuleLinker1Mod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_ng_module_linker_1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_ng_module_linker_1", "PartialNgModuleLinkerVersion1")
  @js.native
  open class PartialNgModuleLinkerVersion1[TExpression] protected ()
    extends StObject
       with PartialLinker[TExpression] {
    def this(/**
      * If true then emit the additional declarations, imports, exports, etc in the NgModule
      * definition. These are only used by JIT compilation.
      */
    emitInline: Boolean) = this()
    
    /**
      * If true then emit the additional declarations, imports, exports, etc in the NgModule
      * definition. These are only used by JIT compilation.
      */
    /* private */ var emitInline: Any = js.native
    
    /**
      * Link the partial declaration `metaObj` information to generate a full definition expression.
      *
      * @param metaObj An object that fits one of the `R3DeclareDirectiveMetadata` or
      *     `R3DeclareComponentMetadata` interfaces.
      */
    /* CompleteClass */
    override def linkPartialDeclaration(constantPool: ConstantPool, metaObj: AstObject[R3PartialDeclaration, TExpression]): LinkedDefinition = js.native
  }
  
  inline def toR3NgModuleMeta[TExpression](metaObj: AstObject[R3DeclareNgModuleMetadata, TExpression], supportJit: Boolean): R3NgModuleMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("toR3NgModuleMeta")(metaObj.asInstanceOf[js.Any], supportJit.asInstanceOf[js.Any])).asInstanceOf[R3NgModuleMetadata]
}
