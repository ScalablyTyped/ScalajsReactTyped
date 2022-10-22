package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.NgModuleMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.PipeMeta
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataSrcDtsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/dts", "DtsMetadataReader")
  @js.native
  open class DtsMetadataReader protected ()
    extends StObject
       with MetadataReader {
    def this(checker: TypeChecker, reflector: ReflectionHost) = this()
    
    /* private */ var checker: Any = js.native
    
    /* CompleteClass */
    override def getDirectiveMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): DirectiveMeta | Null = js.native
    
    /* CompleteClass */
    override def getNgModuleMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): NgModuleMeta | Null = js.native
    
    /* CompleteClass */
    override def getPipeMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): PipeMeta | Null = js.native
    
    /* private */ var reflector: Any = js.native
  }
}
