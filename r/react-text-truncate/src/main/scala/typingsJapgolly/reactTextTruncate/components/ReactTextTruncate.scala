package typingsJapgolly.reactTextTruncate.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTextTruncate.mod.TextTruncateProps
import typingsJapgolly.reactTextTruncate.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTextTruncate {
  
  @JSImport("react-text-truncate", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    inline def element(value: String): this.type = set("element", value.asInstanceOf[js.Any])
    
    inline def line(value: Double | Boolean): this.type = set("line", value.asInstanceOf[js.Any])
    
    inline def maxCalculateTimes(value: Double): this.type = set("maxCalculateTimes", value.asInstanceOf[js.Any])
    
    inline def onCalculated(value: Callback): this.type = set("onCalculated", value.toJsFn)
    
    inline def onToggled(value: /* truncated */ Boolean => Callback): this.type = set("onToggled", js.Any.fromFunction1((t0: /* truncated */ Boolean) => value(t0).runNow()))
    
    inline def onTruncated(value: Callback): this.type = set("onTruncated", value.toJsFn)
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def textElement(value: VdomNode): this.type = set("textElement", value.rawNode.asInstanceOf[js.Any])
    
    inline def textElementNull: this.type = set("textElement", null)
    
    inline def textElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("textElement", js.Array(value*))
    
    inline def textElementVdomElement(value: VdomElement): this.type = set("textElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def textTruncateChild(value: VdomNode): this.type = set("textTruncateChild", value.rawNode.asInstanceOf[js.Any])
    
    inline def textTruncateChildNull: this.type = set("textTruncateChild", null)
    
    inline def textTruncateChildVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("textTruncateChild", js.Array(value*))
    
    inline def textTruncateChildVdomElement(value: VdomElement): this.type = set("textTruncateChild", value.rawElement.asInstanceOf[js.Any])
    
    inline def truncateText(value: String): this.type = set("truncateText", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactTextTruncate.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextTruncateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
