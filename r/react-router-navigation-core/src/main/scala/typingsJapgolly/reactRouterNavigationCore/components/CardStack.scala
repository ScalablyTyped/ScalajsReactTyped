package typingsJapgolly.reactRouterNavigationCore.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouterNavigationCore.mod.CardStackProps
import typingsJapgolly.reactRouterNavigationCore.mod.CardsRendererProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardStack {
  
  inline def apply(render: CardsRendererProps => Node): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Builder(js.Array(this.component, __props.asInstanceOf[CardStackProps]))
  }
  
  @JSImport("react-router-navigation-core", "CardStack")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRouterNavigationCore.mod.CardStack] {
    
    inline def children(value: js.Array[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Node*): this.type = set("children", js.Array(value*))
  }
  
  def withProps(p: CardStackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
