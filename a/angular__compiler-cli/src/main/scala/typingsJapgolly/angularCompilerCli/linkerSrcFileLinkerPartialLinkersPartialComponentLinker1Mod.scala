package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.ConstantPool
import typingsJapgolly.angularCompiler.mod.R3PartialDeclaration
import typingsJapgolly.angularCompilerCli.linkerSrcAstAstValueMod.AstObject
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerGetSourceFileMod.GetSourceFileFn
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.LinkedDefinition
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.PartialLinker
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerPartialLinkersPartialComponentLinker1Mod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_component_linker_1", "PartialComponentLinkerVersion1")
  @js.native
  open class PartialComponentLinkerVersion1[TStatement, TExpression] protected ()
    extends StObject
       with PartialLinker[TExpression] {
    def this(getSourceFile: GetSourceFileFn, sourceUrl: AbsoluteFsPath, code: String) = this()
    
    /* private */ var code: Any = js.native
    
    /* private */ val getSourceFile: Any = js.native
    
    /**
      * Update the range to remove the start and end chars, which should be quotes around the template.
      */
    /* private */ var getTemplateInfo: Any = js.native
    
    /**
      * Link the partial declaration `metaObj` information to generate a full definition expression.
      *
      * @param metaObj An object that fits one of the `R3DeclareDirectiveMetadata` or
      *     `R3DeclareComponentMetadata` interfaces.
      */
    /* CompleteClass */
    override def linkPartialDeclaration(constantPool: ConstantPool, metaObj: AstObject[R3PartialDeclaration, TExpression]): LinkedDefinition = js.native
    
    /* private */ var sourceUrl: Any = js.native
    
    /* private */ var templateFromPartialCode: Any = js.native
    
    /**
      * This function derives the `R3ComponentMetadata` from the provided AST object.
      */
    /* private */ var toR3ComponentMeta: Any = js.native
    
    /* private */ var tryExternalTemplate: Any = js.native
  }
}
