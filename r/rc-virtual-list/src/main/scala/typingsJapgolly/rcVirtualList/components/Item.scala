package typingsJapgolly.rcVirtualList.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rcVirtualList.esItemMod.ItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  inline def apply(setRef: HTMLElement => Callback): Default[js.Object] = {
    val __props = js.Dynamic.literal(setRef = js.Any.fromFunction1((t0: HTMLElement) => setRef(t0).runNow()))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ItemProps]))
  }
  
  @JSImport("rc-virtual-list/es/Item", "Item")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ItemProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
