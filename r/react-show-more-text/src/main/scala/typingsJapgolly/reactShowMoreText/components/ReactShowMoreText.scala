package typingsJapgolly.reactShowMoreText.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactShowMoreText.mod.ReactShowMoreTextProps
import typingsJapgolly.reactShowMoreText.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactShowMoreText {
  
  @JSImport("react-show-more-text", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def anchorClass(value: String): this.type = set("anchorClass", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def expanded(value: Boolean): this.type = set("expanded", value.asInstanceOf[js.Any])
    
    inline def keepNewLines(value: Boolean): this.type = set("keepNewLines", value.asInstanceOf[js.Any])
    
    inline def less(value: VdomNode): this.type = set("less", value.rawNode.asInstanceOf[js.Any])
    
    inline def lessNull: this.type = set("less", null)
    
    inline def lessVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("less", js.Array(value*))
    
    inline def lessVdomElement(value: VdomElement): this.type = set("less", value.rawElement.asInstanceOf[js.Any])
    
    inline def lines(value: Double): this.type = set("lines", value.asInstanceOf[js.Any])
    
    inline def more(value: VdomNode): this.type = set("more", value.rawNode.asInstanceOf[js.Any])
    
    inline def moreNull: this.type = set("more", null)
    
    inline def moreVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("more", js.Array(value*))
    
    inline def moreVdomElement(value: VdomElement): this.type = set("more", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(value: /* expanded */ Boolean => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* expanded */ Boolean) => value(t0).runNow()))
    
    inline def truncatedEndingComponent(value: VdomNode): this.type = set("truncatedEndingComponent", value.rawNode.asInstanceOf[js.Any])
    
    inline def truncatedEndingComponentNull: this.type = set("truncatedEndingComponent", null)
    
    inline def truncatedEndingComponentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("truncatedEndingComponent", js.Array(value*))
    
    inline def truncatedEndingComponentVdomElement(value: VdomElement): this.type = set("truncatedEndingComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactShowMoreText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactShowMoreTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
