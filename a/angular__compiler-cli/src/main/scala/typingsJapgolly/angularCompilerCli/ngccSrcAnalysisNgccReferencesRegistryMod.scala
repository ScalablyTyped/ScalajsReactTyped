package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsCommonSrcReferencesRegistryMod.ReferencesRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcAnalysisNgccReferencesRegistryMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/ngcc_references_registry", "NgccReferencesRegistry")
  @js.native
  open class NgccReferencesRegistry protected ()
    extends StObject
       with ReferencesRegistry {
    def this(host: ReflectionHost) = this()
    
    /**
      * Register one or more references in the registry.
      * @param references A collection of references to register.
      */
    /* CompleteClass */
    override def add(source: DeclarationNode, references: Reference[DeclarationNode]*): Unit = js.native
    
    /**
      * Create and return a mapping for the registered resolved references.
      * @returns A map of reference identifiers to reference declarations.
      */
    def getDeclarationMap(): Map[
        Identifier, 
        typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration]
      ] = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var map: Any = js.native
  }
}
