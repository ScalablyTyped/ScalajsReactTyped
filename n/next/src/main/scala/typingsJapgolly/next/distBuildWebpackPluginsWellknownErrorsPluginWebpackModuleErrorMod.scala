package typingsJapgolly.next

import typingsJapgolly.next.distBuildWebpackPluginsWellknownErrorsPluginSimpleWebpackErrorMod.SimpleWebpackError
import typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Compilation
import typingsJapgolly.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsWellknownErrorsPluginWebpackModuleErrorMod {
  
  @JSImport("next/dist/build/webpack/plugins/wellknown-errors-plugin/webpackModuleError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModuleBuildError(compilation: Compilation, input: Any): js.Promise[SimpleWebpackError | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleBuildError")(compilation.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SimpleWebpackError | `false`]]
}
