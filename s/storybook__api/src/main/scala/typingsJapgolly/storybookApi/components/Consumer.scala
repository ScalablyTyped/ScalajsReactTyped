package typingsJapgolly.storybookApi.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.storybookApi.mod.Combo
import typingsJapgolly.storybookApi.mod.ManagerConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Consumer {
  
  inline def apply[P](): Builder[P] = {
    val __props = js.Dynamic.literal()
    new Builder[P](js.Array(this.component, __props.asInstanceOf[ManagerConsumerProps[P]]))
  }
  
  @JSImport("@storybook/api", "Consumer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: FunctionComponent[P] | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def filter(value: /* combo */ Combo => P): this.type = set("filter", js.Any.fromFunction1(value))
  }
  
  implicit def make[P](companion: Consumer.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[P](p: ManagerConsumerProps[P]): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
}
