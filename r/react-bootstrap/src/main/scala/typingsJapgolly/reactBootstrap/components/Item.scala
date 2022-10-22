package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPagerItemMod.PagerItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  @JSImport("react-bootstrap/lib/Pager", "Item")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Item.type): SharedBuilder_PagerItemProps2036481918[typingsJapgolly.reactBootstrap.libPagerMod.Item] = new SharedBuilder_PagerItemProps2036481918[typingsJapgolly.reactBootstrap.libPagerMod.Item](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PagerItemProps): SharedBuilder_PagerItemProps2036481918[typingsJapgolly.reactBootstrap.libPagerMod.Item] = new SharedBuilder_PagerItemProps2036481918[typingsJapgolly.reactBootstrap.libPagerMod.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
}
