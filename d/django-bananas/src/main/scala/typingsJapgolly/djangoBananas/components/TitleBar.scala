package typingsJapgolly.djangoBananas.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.djangoBananas.djangoBananasStrings.around
import typingsJapgolly.djangoBananas.djangoBananasStrings.between
import typingsJapgolly.djangoBananas.djangoBananasStrings.center
import typingsJapgolly.djangoBananas.djangoBananasStrings.end
import typingsJapgolly.djangoBananas.djangoBananasStrings.evenly
import typingsJapgolly.djangoBananas.djangoBananasStrings.paper
import typingsJapgolly.djangoBananas.djangoBananasStrings.primary
import typingsJapgolly.djangoBananas.djangoBananasStrings.secondary
import typingsJapgolly.djangoBananas.djangoBananasStrings.start
import typingsJapgolly.djangoBananas.mod.TitleBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TitleBar {
  
  @JSImport("django-bananas", "TitleBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def back(value: Boolean | String): this.type = set("back", value.asInstanceOf[js.Any])
    
    inline def children(value: js.Array[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def color(value: primary | secondary | paper): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def dense(value: Boolean): this.type = set("dense", value.asInstanceOf[js.Any])
    
    inline def justify(value: start | center | end | between | around | evenly): this.type = set("justify", value.asInstanceOf[js.Any])
    
    inline def overrides(value: Any): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TitleBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TitleBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
