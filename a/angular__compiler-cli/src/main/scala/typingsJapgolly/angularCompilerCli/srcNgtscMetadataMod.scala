package typingsJapgolly.angularCompilerCli

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.BindingPropertyName
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyName
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcResourceRegistryMod.Resource
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "ClassPropertyMapping")
  @js.native
  /* private */ open class ClassPropertyMapping ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping
  /* static members */
  object ClassPropertyMapping {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "ClassPropertyMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Construct a `ClassPropertyMapping` with no entries.
      */
    inline def empty(): typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping]
    
    /**
      * Construct a `ClassPropertyMapping` from a primitive JS object which maps class property names
      * to either binding property names or an array that contains both names, which is used in on-disk
      * metadata formats (e.g. in .d.ts files).
      */
    inline def fromMappedObject(obj: StringDictionary[BindingPropertyName | (js.Tuple2[ClassPropertyName, BindingPropertyName])]): typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMappedObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping]
    
    /**
      * Merge two mappings into one, with class properties from `b` taking precedence over class
      * properties from `a`.
      */
    inline def merge(
      a: typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping,
      b: typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping
    ): typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "CompoundMetadataReader")
  @js.native
  open class CompoundMetadataReader protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcUtilMod.CompoundMetadataReader {
    def this(readers: js.Array[MetadataReader]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "CompoundMetadataRegistry")
  @js.native
  open class CompoundMetadataRegistry protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcRegistryMod.CompoundMetadataRegistry {
    def this(registries: js.Array[MetadataRegistry]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "DtsMetadataReader")
  @js.native
  open class DtsMetadataReader protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcDtsMod.DtsMetadataReader {
    def this(checker: TypeChecker, reflector: ReflectionHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "InjectableClassRegistry")
  @js.native
  open class InjectableClassRegistry protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcRegistryMod.InjectableClassRegistry {
    def this(host: ReflectionHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "LocalMetadataRegistry")
  @js.native
  open class LocalMetadataRegistry ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcRegistryMod.LocalMetadataRegistry
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "MetaKind")
  @js.native
  object MetaKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind & Double] = js.native
    
    /* 0 */ val Directive: typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Directive & Double = js.native
    
    /* 2 */ val NgModule: typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.NgModule & Double = js.native
    
    /* 1 */ val Pipe: typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Pipe & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "ResourceRegistry")
  @js.native
  open class ResourceRegistry ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcResourceRegistryMod.ResourceRegistry
  
  inline def extractDirectiveTypeCheckMeta(
    node: ClassDeclaration[DeclarationNode],
    inputs: typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping,
    reflector: ReflectionHost
  ): DirectiveTypeCheckMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDirectiveTypeCheckMeta")(node.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[DirectiveTypeCheckMeta]
  
  inline def flattenInheritedDirectiveMetadata(reader: MetadataReader, dir: Reference[ClassDeclaration[DeclarationNode]]): DirectiveMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenInheritedDirectiveMetadata")(reader.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[DirectiveMeta]
  
  inline def isExternalResource(resource: Resource): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/metadata/src/resource_registry.ExternalResource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternalResource")(resource.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/metadata/src/resource_registry.ExternalResource */ Boolean]
}
