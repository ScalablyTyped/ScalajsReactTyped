package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.wordpressComponents.disabledMod.Disabled.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Disabled {
  
  object Consumer {
    
    inline def apply(children: Boolean => Node): Default[js.Object] = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[Boolean]]))
    }
    
    @JSImport("@wordpress/components", "Disabled.Consumer")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: ConsumerProps[Boolean]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@wordpress/components", "Disabled")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Disabled.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
