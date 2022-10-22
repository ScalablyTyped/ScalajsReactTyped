package typingsJapgolly.prismReactRenderer

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.prismReactRenderer.mod.PrismTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesAsteriskMod extends Shortcut {
  
  @JSImport("prism-react-renderer/themes/*", JSImport.Default)
  @js.native
  val default: PrismTheme = js.native
  
  type _To = PrismTheme
  
  /* This means you don't have to write `default`, but can instead just say `themesAsteriskMod.foo` */
  override def _to: PrismTheme = default
}
