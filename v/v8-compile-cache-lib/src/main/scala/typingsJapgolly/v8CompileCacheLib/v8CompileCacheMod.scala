package typingsJapgolly.v8CompileCacheLib

import typingsJapgolly.v8CompileCacheLib.anon.CacheDir
import typingsJapgolly.v8CompileCacheLib.anon.Uninstall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v8CompileCacheMod {
  
  @JSImport("v8-compile-cache-lib/v8-compile-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def install(): js.UndefOr[Uninstall] = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[js.UndefOr[Uninstall]]
  inline def install(opts: CacheDir): js.UndefOr[Uninstall] = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(opts.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Uninstall]]
}
