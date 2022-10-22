package typingsJapgolly.rcTooltip.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTooltip.esPopupMod.ContentProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popup {
  
  @JSImport("rc-tooltip", "Popup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def arrowContent(value: VdomNode): this.type = set("arrowContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def arrowContentNull: this.type = set("arrowContent", null)
    
    inline def arrowContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("arrowContent", js.Array(value*))
    
    inline def arrowContentVdomElement(value: VdomElement): this.type = set("arrowContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def children(value: js.Function0[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenCallbackTo(value: CallbackTo[Node]): this.type = set("children", value.toJsFn)
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def overlayInnerStyle(value: CSSProperties): this.type = set("overlayInnerStyle", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Popup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
