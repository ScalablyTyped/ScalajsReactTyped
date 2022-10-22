package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.ConstantPool
import typingsJapgolly.angularCompiler.mod.ParseSourceSpan
import typingsJapgolly.angularCompiler.mod.R3DeclareDirectiveMetadata
import typingsJapgolly.angularCompiler.mod.R3DirectiveMetadata
import typingsJapgolly.angularCompiler.mod.R3PartialDeclaration
import typingsJapgolly.angularCompilerCli.linkerSrcAstAstHostMod.Range
import typingsJapgolly.angularCompilerCli.linkerSrcAstAstValueMod.AstObject
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.LinkedDefinition
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.PartialLinker
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerPartialLinkersPartialDirectiveLinker1Mod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_directive_linker_1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_directive_linker_1", "PartialDirectiveLinkerVersion1")
  @js.native
  open class PartialDirectiveLinkerVersion1[TExpression] protected ()
    extends StObject
       with PartialLinker[TExpression] {
    def this(sourceUrl: AbsoluteFsPath, code: String) = this()
    
    /* private */ var code: Any = js.native
    
    /**
      * Link the partial declaration `metaObj` information to generate a full definition expression.
      *
      * @param metaObj An object that fits one of the `R3DeclareDirectiveMetadata` or
      *     `R3DeclareComponentMetadata` interfaces.
      */
    /* CompleteClass */
    override def linkPartialDeclaration(constantPool: ConstantPool, metaObj: AstObject[R3PartialDeclaration, TExpression]): LinkedDefinition = js.native
    
    /* private */ var sourceUrl: Any = js.native
  }
  
  inline def createSourceSpan(range: Range, code: String, sourceUrl: String): ParseSourceSpan = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceSpan")(range.asInstanceOf[js.Any], code.asInstanceOf[js.Any], sourceUrl.asInstanceOf[js.Any])).asInstanceOf[ParseSourceSpan]
  
  inline def toR3DirectiveMeta[TExpression](
    metaObj: AstObject[R3DeclareDirectiveMetadata, TExpression],
    code: String,
    sourceUrl: AbsoluteFsPath
  ): R3DirectiveMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("toR3DirectiveMeta")(metaObj.asInstanceOf[js.Any], code.asInstanceOf[js.Any], sourceUrl.asInstanceOf[js.Any])).asInstanceOf[R3DirectiveMetadata]
}
