package typingsJapgolly.postcssMinifyParams

import typingsJapgolly.browserslist.mod.Options
import typingsJapgolly.postcss.mod.Plugin
import typingsJapgolly.postcssMinifyParams.postcssMinifyParamsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @type {import('postcss').PluginCreator<browserslist.Options>}
    * @param {browserslist.Options} options
    * @return {import('postcss').Plugin}
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("postcss-minify-params", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-minify-params", "postcss")
  @js.native
  val postcss: `true` = js.native
}
