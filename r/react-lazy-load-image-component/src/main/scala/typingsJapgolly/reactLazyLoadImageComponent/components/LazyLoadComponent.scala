package typingsJapgolly.reactLazyLoadImageComponent.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazyLoadImageComponent.mod.DelayMethod
import typingsJapgolly.reactLazyLoadImageComponent.mod.LazyLoadComponentProps
import typingsJapgolly.reactLazyLoadImageComponent.mod.ScrollPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LazyLoadComponent {
  
  @JSImport("react-lazy-load-image-component", "LazyLoadComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def afterLoad(value: CallbackTo[Any]): this.type = set("afterLoad", value.toJsFn)
    
    inline def beforeLoad(value: CallbackTo[Any]): this.type = set("beforeLoad", value.toJsFn)
    
    inline def delayMethod(value: DelayMethod): this.type = set("delayMethod", value.asInstanceOf[js.Any])
    
    inline def delayTime(value: Double): this.type = set("delayTime", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def scrollPosition(value: ScrollPosition): this.type = set("scrollPosition", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
    
    inline def useIntersectionObserver(value: Boolean): this.type = set("useIntersectionObserver", value.asInstanceOf[js.Any])
    
    inline def visibleByDefault(value: Boolean): this.type = set("visibleByDefault", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LazyLoadComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LazyLoadComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
