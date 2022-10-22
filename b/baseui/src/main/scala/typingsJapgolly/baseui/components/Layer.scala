package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.layerTypesMod.LayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layer {
  
  @JSImport("baseui/layer", "Layer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def host(value: HTMLElement): this.type = set("host", value.asInstanceOf[js.Any])
    
    inline def hostNull: this.type = set("host", null)
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def isHoverLayer(value: Boolean): this.type = set("isHoverLayer", value.asInstanceOf[js.Any])
    
    inline def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    inline def onDocumentClick(value: /* event */ MouseEvent => Any): this.type = set("onDocumentClick", js.Any.fromFunction1(value))
    
    inline def onEscape(value: CallbackTo[Any]): this.type = set("onEscape", value.toJsFn)
    
    inline def onKeyDown(value: /* event */ KeyboardEvent => Any): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    inline def onKeyPress(value: /* event */ KeyboardEvent => Any): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    inline def onKeyUp(value: /* event */ KeyboardEvent => Any): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    inline def onMount(value: CallbackTo[Any]): this.type = set("onMount", value.toJsFn)
    
    inline def onUnmount(value: CallbackTo[Any]): this.type = set("onUnmount", value.toJsFn)
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Layer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
