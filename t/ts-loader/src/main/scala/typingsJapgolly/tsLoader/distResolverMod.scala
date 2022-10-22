package typingsJapgolly.tsLoader

import typingsJapgolly.tsLoader.tsLoaderBooleans.`false`
import typingsJapgolly.webpack.mod.WebpackOptionsNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResolverMod {
  
  @JSImport("ts-loader/dist/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeResolver(options: WebpackOptionsNormalized): ResolveSync = ^.asInstanceOf[js.Dynamic].applyDynamic("makeResolver")(options.asInstanceOf[js.Any]).asInstanceOf[ResolveSync]
  
  @js.native
  trait ResolveSync extends StObject {
    
    def apply(context: Any, path: String, moduleName: String): String | `false` = js.native
    def apply(path: String, moduleName: String): String | `false` = js.native
  }
}
