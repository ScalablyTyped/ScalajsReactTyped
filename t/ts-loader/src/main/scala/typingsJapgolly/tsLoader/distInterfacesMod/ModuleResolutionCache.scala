package typingsJapgolly.tsLoader.distInterfacesMod

import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.ResolvedModuleWithFailedLookupLocations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleResolutionCache
  extends StObject
     with typingsJapgolly.typescript.mod.ModuleResolutionCache {
  
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def clear(): Unit = js.native
  
  var directoryToModuleNameMap: CacheWithRedirects[Map[String, ResolvedModuleWithFailedLookupLocations]] = js.native
  
  var moduleNameToDirectoryMap: CacheWithRedirects[PerModuleNameCache] = js.native
}
