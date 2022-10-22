package typingsJapgolly.reactCountTo.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCountTo.mod.Props
import typingsJapgolly.reactCountTo.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCountTo {
  
  inline def apply(speed: Double, to: Double): Builder = {
    val __props = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-count-to", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def children(value: /* value */ Double => Element): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def digits(value: Double): this.type = set("digits", value.asInstanceOf[js.Any])
    
    inline def easing(value: /* progress */ Double => Double): this.type = set("easing", js.Any.fromFunction1(value))
    
    inline def from(value: Double): this.type = set("from", value.asInstanceOf[js.Any])
    
    inline def onComplete(value: Callback): this.type = set("onComplete", value.toJsFn)
    
    inline def tagName(value: String): this.type = set("tagName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
