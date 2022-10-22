package typingsJapgolly.reactMedia.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMedia.mod.MultiQueryProps
import typingsJapgolly.reactMedia.mod.QueryResults
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMedia {
  
  inline def apply[Q](queries: Q): Builder[Q] = {
    val __props = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
    new Builder[Q](js.Array(this.component, __props.asInstanceOf[MultiQueryProps[Q]]))
  }
  
  @JSImport("react-media", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Q] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: (js.Function1[/* matches */ QueryResults[Q], Node]) | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* matches */ QueryResults[Q] => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def defaultMatches(value: Partial[QueryResults[Q]]): this.type = set("defaultMatches", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* matches */ QueryResults[Q] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* matches */ QueryResults[Q]) => value(t0).runNow()))
    
    inline def render(value: CallbackTo[Node]): this.type = set("render", value.toJsFn)
    
    inline def targetWindow(value: Window): this.type = set("targetWindow", value.asInstanceOf[js.Any])
  }
  
  def withProps[Q](p: MultiQueryProps[Q]): Builder[Q] = new Builder[Q](js.Array(this.component, p.asInstanceOf[js.Any]))
}
