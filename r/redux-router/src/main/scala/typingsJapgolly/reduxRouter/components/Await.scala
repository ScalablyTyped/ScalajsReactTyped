package typingsJapgolly.reduxRouter.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouter.distLibComponentsMod.AwaitProps
import typingsJapgolly.reactRouter.distLibComponentsMod.AwaitResolveRenderFunction
import typingsJapgolly.remixRunRouter.distUtilsMod.TrackedPromise
import typingsJapgolly.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Await {
  
  inline def apply(resolve: TrackedPromise | Any): Builder = {
    val __props = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AwaitProps]))
  }
  
  @JSImport("redux-router", "ReduxRouter.Await")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: Node | AwaitResolveRenderFunction): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* data */ Awaited[Any] => Element): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def errorElement(value: VdomNode): this.type = set("errorElement", value.rawNode.asInstanceOf[js.Any])
    
    inline def errorElementNull: this.type = set("errorElement", null)
    
    inline def errorElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("errorElement", js.Array(value*))
    
    inline def errorElementVdomElement(value: VdomElement): this.type = set("errorElement", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: AwaitProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
