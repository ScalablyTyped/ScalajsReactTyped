package typingsJapgolly.cssHasPseudo

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.cssHasPseudo.anon.Preserve
import typingsJapgolly.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("css-has-pseudo", JSImport.Default)
  @js.native
  val default: PluginCreator[Preserve] = js.native
  
  type _To = PluginCreator[Preserve]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Preserve] = default
}
