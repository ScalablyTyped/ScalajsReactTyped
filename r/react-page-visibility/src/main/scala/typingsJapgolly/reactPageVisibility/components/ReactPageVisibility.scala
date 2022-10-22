package typingsJapgolly.reactPageVisibility.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPageVisibility.mod.KnownVisibilityStates
import typingsJapgolly.reactPageVisibility.mod.PageVisibilityProps
import typingsJapgolly.reactPageVisibility.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPageVisibility {
  
  @JSImport("react-page-visibility", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def children(
      value: Node | (js.Function2[/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates, Node])
    ): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction2(value: (/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates) => Node): this.type = set("children", js.Any.fromFunction2(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* isVisible */ Boolean, t1: /* visibilityState */ KnownVisibilityStates) => (value(t0, t1)).runNow()))
  }
  
  implicit def make(companion: ReactPageVisibility.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PageVisibilityProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
