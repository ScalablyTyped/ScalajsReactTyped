package typingsJapgolly.blueprintjsPopover2.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsPopover2.libEsmTooltip2ContextMod.Tooltip2ContextState
import typingsJapgolly.blueprintjsPopover2.libEsmTooltip2ContextMod.Tooltip2ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip2Provider {
  
  @JSImport("@blueprintjs/popover2/lib/esm/tooltip2Context", "Tooltip2Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: Node | (js.Function1[/* ctxState */ Tooltip2ContextState, Node])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* ctxState */ Tooltip2ContextState => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def forceDisable(value: Boolean): this.type = set("forceDisable", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tooltip2Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Tooltip2ProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
