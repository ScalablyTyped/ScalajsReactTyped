package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcAliasMod.AliasingHost
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.ExportScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscScopeSrcDependencyMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope/src/dependency", "MetadataDtsModuleScopeResolver")
  @js.native
  open class MetadataDtsModuleScopeResolver protected ()
    extends StObject
       with DtsModuleScopeResolver {
    /**
      * @param dtsMetaReader a `MetadataReader` which can read metadata from `.d.ts` files.
      */
    def this(dtsMetaReader: MetadataReader) = this()
    def this(dtsMetaReader: MetadataReader, aliasingHost: AliasingHost) = this()
    
    /* private */ var aliasingHost: Any = js.native
    
    /**
      * Cache which holds fully resolved scopes for NgModule classes from .d.ts files.
      */
    /* private */ var cache: Any = js.native
    
    /* private */ var dtsMetaReader: Any = js.native
    
    /* private */ var maybeAlias: Any = js.native
    
    /* CompleteClass */
    override def resolve(ref: Reference[ClassDeclaration[DeclarationNode]]): ExportScope | Null = js.native
  }
  
  trait DtsModuleScopeResolver extends StObject {
    
    def resolve(ref: Reference[ClassDeclaration[DeclarationNode]]): ExportScope | Null
  }
  object DtsModuleScopeResolver {
    
    inline def apply(resolve: Reference[ClassDeclaration[DeclarationNode]] => ExportScope | Null): DtsModuleScopeResolver = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[DtsModuleScopeResolver]
    }
    
    extension [Self <: DtsModuleScopeResolver](x: Self) {
      
      inline def setResolve(value: Reference[ClassDeclaration[DeclarationNode]] => ExportScope | Null): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
