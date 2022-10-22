package typingsJapgolly.ngPackagr

import typingsJapgolly.ngPackagr.anon.TypeofimportedNgcc
import typingsJapgolly.ngPackagr.libNgPackageNgccCacheMod.NgccProcessingCache
import typingsJapgolly.ngPackagr.libNgPackageNodesMod.EntryPointNode
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.ResolvedModule
import typingsJapgolly.typescript.mod.ResolvedTypeReferenceDirective
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgcNgccProcessorMod {
  
  @JSImport("ng-packagr/lib/ngc/ngcc-processor", "NgccProcessor")
  @js.native
  open class NgccProcessor protected () extends StObject {
    def this(
      compilerNgcc: TypeofimportedNgcc,
      ngccProcessingCache: NgccProcessingCache,
      projectPath: String,
      compilerOptions: CompilerOptions,
      entryPoints: js.Array[EntryPointNode]
    ) = this()
    
    /* private */ var _entryPointsUrl: Any = js.native
    
    /* private */ var _logger: Any = js.native
    
    /* private */ var _nodeModulesDirectory: Any = js.native
    
    /* private */ val compilerNgcc: Any = js.native
    
    /* private */ val compilerOptions: Any = js.native
    
    /* private */ val entryPoints: Any = js.native
    
    /* private */ var findNodeModulesDirectory: Any = js.native
    
    /* private */ val ngccProcessingCache: Any = js.native
    
    /** Process the entire node modules tree. */
    def process(): js.Promise[Unit] = js.native
    
    /** Process a module and its dependencies. */
    def processModule(moduleName: String, resolvedModule: ResolvedModule): Unit = js.native
    def processModule(moduleName: String, resolvedModule: ResolvedTypeReferenceDirective): Unit = js.native
    
    /* private */ val projectPath: Any = js.native
    
    /* private */ val propertiesToConsider: Any = js.native
    
    /* private */ var skipProcessing: Any = js.native
    
    /**
      * Try resolve a package.json file from the resolved .d.ts file.
      */
    /* private */ var tryResolvePackage: Any = js.native
  }
}
