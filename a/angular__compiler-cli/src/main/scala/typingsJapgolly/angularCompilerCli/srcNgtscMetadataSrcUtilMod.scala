package typingsJapgolly.angularCompilerCli

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcReferencesMod.OwningModule
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.NgModuleMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.PipeMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.typescript.mod.TypeChecker
import typingsJapgolly.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/util", "CompoundMetadataReader")
  @js.native
  open class CompoundMetadataReader protected ()
    extends StObject
       with MetadataReader {
    def this(readers: js.Array[MetadataReader]) = this()
    
    /* CompleteClass */
    override def getDirectiveMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): DirectiveMeta | Null = js.native
    
    /* CompleteClass */
    override def getNgModuleMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): NgModuleMeta | Null = js.native
    
    /* CompleteClass */
    override def getPipeMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): PipeMeta | Null = js.native
    
    /* private */ var readers: Any = js.native
  }
  
  inline def extractDirectiveTypeCheckMeta(node: ClassDeclaration[DeclarationNode], inputs: ClassPropertyMapping, reflector: ReflectionHost): DirectiveTypeCheckMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDirectiveTypeCheckMeta")(node.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[DirectiveTypeCheckMeta]
  
  inline def extractReferencesFromType(checker: TypeChecker, `def`: TypeNode): js.Array[Reference[ClassDeclaration[DeclarationNode]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractReferencesFromType")(checker.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Reference[ClassDeclaration[DeclarationNode]]]]
  inline def extractReferencesFromType(checker: TypeChecker, `def`: TypeNode, bestGuessOwningModule: OwningModule): js.Array[Reference[ClassDeclaration[DeclarationNode]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractReferencesFromType")(checker.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], bestGuessOwningModule.asInstanceOf[js.Any])).asInstanceOf[js.Array[Reference[ClassDeclaration[DeclarationNode]]]]
  
  inline def hasInjectableFields(clazz: ClassDeclaration[DeclarationNode], host: ReflectionHost): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasInjectableFields")(clazz.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def readBooleanType(`type`: TypeNode): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readBooleanType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def readStringArrayType(`type`: TypeNode): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStringArrayType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def readStringMapType(`type`: TypeNode): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStringMapType")(`type`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def readStringType(`type`: TypeNode): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readStringType")(`type`.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
