package typingsJapgolly.markdownItEmoji

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.markdownIt.libMod.PluginSimple
import typingsJapgolly.markdownIt.libMod.PluginWithOptions
import typingsJapgolly.markdownItEmoji.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bareMod extends Shortcut {
  
  @JSImport("markdown-it-emoji/bare", JSImport.Namespace)
  @js.native
  val ^ : PluginSimple | PluginWithOptions[Options] = js.native
  
  type _To = PluginSimple | PluginWithOptions[Options]
  
  /* This means you don't have to write `^`, but can instead just say `bareMod.foo` */
  override def _to: PluginSimple | PluginWithOptions[Options] = ^
}
