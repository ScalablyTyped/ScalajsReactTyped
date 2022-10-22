package typingsJapgolly.grommet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.es6ComponentsInfiniteScrollMod.InfiniteScrollProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InfiniteScroll {
  
  @JSImport("grommet/es6", "InfiniteScroll")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: Node | js.Function): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[String | Double | Element | (Record[String, Any])]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: (String | Double | Element | (Record[String, Any]))*): this.type = set("items", js.Array(value*))
    
    inline def onMore(value: Callback): this.type = set("onMore", value.toJsFn)
    
    inline def renderMarker(value: /* marker */ Element => Element): this.type = set("renderMarker", js.Any.fromFunction1(value))
    
    inline def replace(value: Boolean): this.type = set("replace", value.asInstanceOf[js.Any])
    
    inline def show(value: Double): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InfiniteScroll.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InfiniteScrollProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
