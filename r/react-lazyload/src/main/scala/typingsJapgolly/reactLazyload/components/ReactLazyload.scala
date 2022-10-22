package typingsJapgolly.reactLazyload.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazyload.mod.LazyLoadProps
import typingsJapgolly.reactLazyload.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLazyload {
  
  @JSImport("react-lazyload", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNamePrefix(value: String): this.type = set("classNamePrefix", value.asInstanceOf[js.Any])
    
    inline def debounce(value: Double | Boolean): this.type = set("debounce", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double | js.Array[Double]): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def offsetVarargs(value: Double*): this.type = set("offset", js.Array(value*))
    
    inline def once(value: Boolean): this.type = set("once", value.asInstanceOf[js.Any])
    
    inline def overflow(value: Boolean): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: VdomNode): this.type = set("placeholder", value.rawNode.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def placeholderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("placeholder", js.Array(value*))
    
    inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def preventLoading(value: Boolean): this.type = set("preventLoading", value.asInstanceOf[js.Any])
    
    inline def resize(value: Boolean): this.type = set("resize", value.asInstanceOf[js.Any])
    
    inline def scroll(value: Boolean): this.type = set("scroll", value.asInstanceOf[js.Any])
    
    inline def scrollContainer(value: String | org.scalajs.dom.Element): this.type = set("scrollContainer", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def throttle(value: Double | Boolean): this.type = set("throttle", value.asInstanceOf[js.Any])
    
    inline def unmountIfInvisible(value: Boolean): this.type = set("unmountIfInvisible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactLazyload.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LazyLoadProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
