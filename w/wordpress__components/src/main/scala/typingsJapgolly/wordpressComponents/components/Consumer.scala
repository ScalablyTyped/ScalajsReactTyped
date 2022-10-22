package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.wordpressComponents.slotFillContextMod.SlotFillContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Consumer {
  
  inline def apply(children: SlotFillContext => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[SlotFillContext]]))
  }
  
  @JSImport("@wordpress/components/slot-fill", "Consumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[SlotFillContext]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
