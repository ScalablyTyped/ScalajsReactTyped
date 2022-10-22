package typingsJapgolly.cssMinimizerWebpackPlugin

import typingsJapgolly.cssMinimizerWebpackPlugin.mod.InternalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMinifyMod {
  
  @JSImport("css-minimizer-webpack-plugin/types/minify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def minify[T](options: InternalOptions[T]): js.Promise[InternalResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InternalResult]]
  
  inline def transform(options: String): js.Promise[InternalResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InternalResult]]
  
  type InternalResult = typingsJapgolly.cssMinimizerWebpackPlugin.mod.InternalResult
  
  type MinimizedResult = typingsJapgolly.cssMinimizerWebpackPlugin.mod.MinimizedResult
  
  type RawSourceMap = typingsJapgolly.sourceMap.mod.RawSourceMap
}
