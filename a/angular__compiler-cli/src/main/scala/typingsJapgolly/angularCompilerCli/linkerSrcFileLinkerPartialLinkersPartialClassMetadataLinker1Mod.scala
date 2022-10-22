package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.ConstantPool
import typingsJapgolly.angularCompiler.mod.R3ClassMetadata
import typingsJapgolly.angularCompiler.mod.R3DeclareClassMetadata
import typingsJapgolly.angularCompiler.mod.R3PartialDeclaration
import typingsJapgolly.angularCompilerCli.linkerSrcAstAstValueMod.AstObject
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.LinkedDefinition
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.PartialLinker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerPartialLinkersPartialClassMetadataLinker1Mod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_class_metadata_linker_1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_class_metadata_linker_1", "PartialClassMetadataLinkerVersion1")
  @js.native
  open class PartialClassMetadataLinkerVersion1[TExpression] ()
    extends StObject
       with PartialLinker[TExpression] {
    
    /**
      * Link the partial declaration `metaObj` information to generate a full definition expression.
      *
      * @param metaObj An object that fits one of the `R3DeclareDirectiveMetadata` or
      *     `R3DeclareComponentMetadata` interfaces.
      */
    /* CompleteClass */
    override def linkPartialDeclaration(constantPool: ConstantPool, metaObj: AstObject[R3PartialDeclaration, TExpression]): LinkedDefinition = js.native
  }
  
  inline def toR3ClassMetadata[TExpression](metaObj: AstObject[R3DeclareClassMetadata, TExpression]): R3ClassMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("toR3ClassMetadata")(metaObj.asInstanceOf[js.Any]).asInstanceOf[R3ClassMetadata]
}
