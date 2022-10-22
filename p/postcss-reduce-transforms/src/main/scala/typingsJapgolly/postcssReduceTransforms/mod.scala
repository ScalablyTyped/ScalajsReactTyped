package typingsJapgolly.postcssReduceTransforms

import typingsJapgolly.postcss.mod.Plugin
import typingsJapgolly.postcssReduceTransforms.postcssReduceTransformsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @type {import('postcss').PluginCreator<void>}
    * @return {import('postcss').Plugin}
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  
  @JSImport("postcss-reduce-transforms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-reduce-transforms", "postcss")
  @js.native
  val postcss: `true` = js.native
}
