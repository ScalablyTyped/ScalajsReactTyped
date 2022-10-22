package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsCommonSrcReferencesRegistryMod.ReferencesRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.std.Map
import typingsJapgolly.std.MapConstructor
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SignatureDeclaration
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcAnalysisModuleWithProvidersAnalyzerMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/module_with_providers_analyzer", "ModuleWithProvidersAnalyses")
  @js.native
  val ModuleWithProvidersAnalyses: MapConstructor = js.native
  type ModuleWithProvidersAnalyses = Map[SourceFile, js.Array[ModuleWithProvidersInfo]]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/module_with_providers_analyzer", "ModuleWithProvidersAnalyses")
  @js.native
  /* standard es2015.collection */
  open class ModuleWithProvidersAnalysesCls[K, V] ()
    extends StObject
       with Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/module_with_providers_analyzer", "ModuleWithProvidersAnalyzer")
  @js.native
  open class ModuleWithProvidersAnalyzer protected () extends StObject {
    def this(
      host: NgccReflectionHost,
      typeChecker: TypeChecker,
      referencesRegistry: ReferencesRegistry,
      processDts: Boolean
    ) = this()
    
    def analyzeProgram(program: Program): typingsJapgolly.angularCompilerCli.ngccSrcAnalysisModuleWithProvidersAnalyzerMod.ModuleWithProvidersAnalyses = js.native
    
    /* private */ var evaluator: Any = js.native
    
    /* private */ var getDtsModuleWithProvidersFunction: Any = js.native
    
    /* private */ var getModuleWithProvidersFunctions: Any = js.native
    
    /* private */ var getRootFiles: Any = js.native
    
    /* private */ var host: Any = js.native
    
    /**
      * Parse a function/method node (or its implementation), to see if it returns a
      * `ModuleWithProviders` object.
      * @param name The name of the function.
      * @param node the node to check - this could be a function, a method or a variable declaration.
      * @param implementation the actual function expression if `node` is a variable declaration.
      * @param container the class that contains the function, if it is a method.
      * @returns info about the function if it does return a `ModuleWithProviders` object; `null`
      * otherwise.
      */
    /* private */ var parseForModuleWithProviders: Any = js.native
    
    /* private */ var processDts: Any = js.native
    
    /* private */ var referencesRegistry: Any = js.native
    
    /* private */ var resolveNgModuleReference: Any = js.native
    
    /* private */ var typeChecker: Any = js.native
  }
  
  trait ModuleWithProvidersInfo extends StObject {
    
    /**
      * Declaration of the containing class (if this is a method)
      */
    var container: DeclarationNode | Null
    
    /**
      * The declaration of the function that returns the `ModuleWithProviders` object.
      */
    var declaration: SignatureDeclaration
    
    /**
      * The name of the declared function.
      */
    var name: String
    
    /**
      * The declaration of the class that the `ngModule` property on the `ModuleWithProviders` object
      * refers to.
      */
    var ngModule: Reference[ClassDeclaration[DeclarationNode]]
  }
  object ModuleWithProvidersInfo {
    
    inline def apply(
      declaration: SignatureDeclaration,
      name: String,
      ngModule: Reference[ClassDeclaration[DeclarationNode]]
    ): ModuleWithProvidersInfo = {
      val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ngModule = ngModule.asInstanceOf[js.Any], container = null)
      __obj.asInstanceOf[ModuleWithProvidersInfo]
    }
    
    extension [Self <: ModuleWithProvidersInfo](x: Self) {
      
      inline def setContainer(value: DeclarationNode): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setDeclaration(value: SignatureDeclaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNgModule(value: Reference[ClassDeclaration[DeclarationNode]]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    }
  }
}
