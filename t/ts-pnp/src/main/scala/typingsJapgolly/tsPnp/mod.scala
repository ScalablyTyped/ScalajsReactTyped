package typingsJapgolly.tsPnp

import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.ModuleResolutionHost
import typingsJapgolly.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typingsJapgolly.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-pnp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveModuleName(
    moduleName: String,
    containingFile: String,
    options: CompilerOptions,
    moduleResolutionHost: ModuleResolutionHost,
    realResolveModuleName: js.Function4[
      /* moduleName */ String, 
      /* containingFile */ String, 
      /* options */ CompilerOptions, 
      /* moduleResolutionHost */ ModuleResolutionHost, 
      ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    ]
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], moduleResolutionHost.asInstanceOf[js.Any], realResolveModuleName.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
  
  inline def resolveModuleName_ResolvedModuleWithFailedLookupLocations(
    moduleName: String,
    containingFile: String,
    options: CompilerOptions,
    moduleResolutionHost: ModuleResolutionHost,
    realResolveModuleName: js.Function4[
      /* moduleName */ String, 
      /* containingFile */ String, 
      /* options */ CompilerOptions, 
      /* moduleResolutionHost */ ResolvedModuleWithFailedLookupLocations, 
      ResolvedModuleWithFailedLookupLocations
    ]
  ): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], moduleResolutionHost.asInstanceOf[js.Any], realResolveModuleName.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
}
