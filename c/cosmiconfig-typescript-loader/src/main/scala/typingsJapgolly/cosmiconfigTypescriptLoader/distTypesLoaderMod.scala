package typingsJapgolly.cosmiconfigTypescriptLoader

import typingsJapgolly.cosmiconfig.mod.Loader
import typingsJapgolly.tsNode.mod.RegisterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoaderMod {
  
  @JSImport("cosmiconfig-typescript-loader/dist/types/loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TypeScriptLoader(): Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("TypeScriptLoader")().asInstanceOf[Loader]
  inline def TypeScriptLoader(options: RegisterOptions): Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("TypeScriptLoader")(options.asInstanceOf[js.Any]).asInstanceOf[Loader]
}
