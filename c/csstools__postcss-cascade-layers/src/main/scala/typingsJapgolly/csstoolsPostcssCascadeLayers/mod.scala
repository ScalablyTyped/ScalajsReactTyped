package typingsJapgolly.csstoolsPostcssCascadeLayers

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.csstoolsPostcssCascadeLayers.distOptionsMod.pluginOptions
import typingsJapgolly.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@csstools/postcss-cascade-layers", JSImport.Default)
  @js.native
  val default: PluginCreator[pluginOptions] = js.native
  
  type _To = PluginCreator[pluginOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[pluginOptions] = default
}
