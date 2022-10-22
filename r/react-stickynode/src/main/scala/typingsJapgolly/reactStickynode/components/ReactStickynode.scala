package typingsJapgolly.reactStickynode.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactStickynode.mod.Props
import typingsJapgolly.reactStickynode.mod.Status
import typingsJapgolly.reactStickynode.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactStickynode {
  
  @JSImport("react-stickynode", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def activeClass(value: String): this.type = set("activeClass", value.asInstanceOf[js.Any])
    
    inline def bottomBoundary(value: Double | String): this.type = set("bottomBoundary", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | (js.Function1[/* status */ Status, Node])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* status */ Status => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def enableTransforms(value: Boolean): this.type = set("enableTransforms", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def innerActiveClass(value: String): this.type = set("innerActiveClass", value.asInstanceOf[js.Any])
    
    inline def innerClass(value: String): this.type = set("innerClass", value.asInstanceOf[js.Any])
    
    inline def innerZ(value: Double | String): this.type = set("innerZ", value.asInstanceOf[js.Any])
    
    inline def onStateChange(value: /* status */ Status => Callback): this.type = set("onStateChange", js.Any.fromFunction1((t0: /* status */ Status) => value(t0).runNow()))
    
    inline def releasedClass(value: String): this.type = set("releasedClass", value.asInstanceOf[js.Any])
    
    inline def shouldFreeze(value: CallbackTo[Boolean]): this.type = set("shouldFreeze", value.toJsFn)
    
    inline def top(value: Double | String): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactStickynode.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
