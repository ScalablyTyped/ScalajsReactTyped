package typingsJapgolly.postcssAttributeCaseInsensitive

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-attribute-case-insensitive", JSImport.Default)
  @js.native
  val default: PluginCreator[scala.Nothing] = js.native
  
  type _To = PluginCreator[scala.Nothing]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[scala.Nothing] = default
}
