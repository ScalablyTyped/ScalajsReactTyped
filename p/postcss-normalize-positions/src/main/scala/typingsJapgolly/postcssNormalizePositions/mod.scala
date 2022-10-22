package typingsJapgolly.postcssNormalizePositions

import typingsJapgolly.postcss.mod.Plugin
import typingsJapgolly.postcssNormalizePositions.postcssNormalizePositionsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @type {import('postcss').PluginCreator<void>}
    * @return {import('postcss').Plugin}
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  
  @JSImport("postcss-normalize-positions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-normalize-positions", "postcss")
  @js.native
  val postcss: `true` = js.native
}
