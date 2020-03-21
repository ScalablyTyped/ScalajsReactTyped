package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.forkTsCheckerWebpackPlugin.resolutionMod.ResolveModuleName
import typingsJapgolly.forkTsCheckerWebpackPlugin.resolutionMod.ResolveTypeReferenceDirective
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.ModuleResolutionHost
import typingsJapgolly.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typingsJapgolly.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResolveModuleName extends js.Object {
  @JSName("resolveModuleName")
  var resolveModuleName_Original: ResolveModuleName = js.native
  @JSName("resolveTypeReferenceDirective")
  var resolveTypeReferenceDirective_Original: ResolveTypeReferenceDirective = js.native
  def resolveModuleName(
    typescript: Typeofts,
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    moduleResolutionHost: ModuleResolutionHost
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def resolveTypeReferenceDirective(
    typescript: Typeofts,
    typeDirectiveName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    moduleResolutionHost: ModuleResolutionHost
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
}

