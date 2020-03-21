package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.ModuleResolutionHost
import typingsJapgolly.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typingsJapgolly.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/resolution", JSImport.Namespace)
@js.native
object resolutionMod extends js.Object {
  def makeResolutionFunctions(): AnonResolveModuleName = js.native
  def makeResolutionFunctions(
    resolveModuleName: js.UndefOr[scala.Nothing],
    resolveTypeReferenceDirective: ResolveTypeReferenceDirective
  ): AnonResolveModuleName = js.native
  def makeResolutionFunctions(resolveModuleName: ResolveModuleName): AnonResolveModuleName = js.native
  def makeResolutionFunctions(resolveModuleName: ResolveModuleName, resolveTypeReferenceDirective: ResolveTypeReferenceDirective): AnonResolveModuleName = js.native
  type ResolveModuleName = js.Function5[
    /* typescript */ Typeofts, 
    /* moduleName */ String, 
    /* containingFile */ String, 
    /* compilerOptions */ CompilerOptions, 
    /* moduleResolutionHost */ ModuleResolutionHost, 
    ResolvedModuleWithFailedLookupLocations
  ]
  type ResolveTypeReferenceDirective = js.Function5[
    /* typescript */ Typeofts, 
    /* typeDirectiveName */ String, 
    /* containingFile */ String, 
    /* compilerOptions */ CompilerOptions, 
    /* moduleResolutionHost */ ModuleResolutionHost, 
    ResolvedTypeReferenceDirectiveWithFailedLookupLocations
  ]
}

