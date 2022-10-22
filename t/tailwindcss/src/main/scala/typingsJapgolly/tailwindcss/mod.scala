package typingsJapgolly.tailwindcss

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.postcss.mod.PluginCreator
import typingsJapgolly.tailwindcss.anon.`0`
import typingsJapgolly.tailwindcss.typesConfigMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tailwindcss", JSImport.Default)
  @js.native
  val default: PluginCreator[String | Config | `0`] = js.native
  
  type _To = PluginCreator[String | Config | `0`]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[String | Config | `0`] = default
}
