package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPagerItemMod.PagerItemProps
import typingsJapgolly.reactBootstrap.libPagerItemMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PagerItem {
  
  @JSImport("react-bootstrap/lib/PagerItem", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PagerItem.type): SharedBuilder_PagerItemProps2036481918[^] = new SharedBuilder_PagerItemProps2036481918[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PagerItemProps): SharedBuilder_PagerItemProps2036481918[^] = new SharedBuilder_PagerItemProps2036481918[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
