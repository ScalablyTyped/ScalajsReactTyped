package typingsJapgolly.tsNode.anon

import typingsJapgolly.typescript.mod.ModuleKind.CommonJS
import typingsJapgolly.typescript.mod.ModuleKind.ESNext
import typingsJapgolly.typescript.mod.ModuleResolutionCache
import typingsJapgolly.typescript.mod.ResolvedModuleWithFailedLookupLocations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallModuleNameContainingFileCacheMode extends StObject {
  
  def apply(moduleName: String, containingFile: String, cache: ModuleResolutionCache): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = js.native
  def apply(moduleName: String, containingFile: String, cache: ModuleResolutionCache, mode: CommonJS): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = js.native
  def apply(moduleName: String, containingFile: String, cache: ModuleResolutionCache, mode: ESNext): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = js.native
}
