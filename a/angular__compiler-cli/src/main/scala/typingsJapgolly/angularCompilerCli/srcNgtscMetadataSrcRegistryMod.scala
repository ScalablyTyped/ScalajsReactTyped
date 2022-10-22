package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.NgModuleMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.PipeMeta
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataSrcRegistryMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/registry", "CompoundMetadataRegistry")
  @js.native
  open class CompoundMetadataRegistry protected ()
    extends StObject
       with MetadataRegistry {
    def this(registries: js.Array[MetadataRegistry]) = this()
    
    /* CompleteClass */
    override def registerDirectiveMetadata(meta: DirectiveMeta): Unit = js.native
    
    /* CompleteClass */
    override def registerNgModuleMetadata(meta: NgModuleMeta): Unit = js.native
    
    /* CompleteClass */
    override def registerPipeMetadata(meta: PipeMeta): Unit = js.native
    
    /* private */ var registries: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/registry", "InjectableClassRegistry")
  @js.native
  open class InjectableClassRegistry protected () extends StObject {
    def this(host: ReflectionHost) = this()
    
    /* private */ var classes: Any = js.native
    
    /* private */ var host: Any = js.native
    
    def isInjectable(declaration: ClassDeclaration[DeclarationNode]): Boolean = js.native
    
    def registerInjectable(declaration: ClassDeclaration[DeclarationNode]): Unit = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/registry", "LocalMetadataRegistry")
  @js.native
  open class LocalMetadataRegistry ()
    extends StObject
       with MetadataRegistry
       with MetadataReader {
    
    /* private */ var directives: Any = js.native
    
    /* CompleteClass */
    override def getDirectiveMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): DirectiveMeta | Null = js.native
    
    /* CompleteClass */
    override def getNgModuleMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): NgModuleMeta | Null = js.native
    
    /* CompleteClass */
    override def getPipeMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): PipeMeta | Null = js.native
    
    /* private */ var ngModules: Any = js.native
    
    /* private */ var pipes: Any = js.native
    
    /* CompleteClass */
    override def registerDirectiveMetadata(meta: DirectiveMeta): Unit = js.native
    
    /* CompleteClass */
    override def registerNgModuleMetadata(meta: NgModuleMeta): Unit = js.native
    
    /* CompleteClass */
    override def registerPipeMetadata(meta: PipeMeta): Unit = js.native
  }
}
