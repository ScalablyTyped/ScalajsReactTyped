package typingsJapgolly.reCarousel.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reCarousel.mod.CarouselProps
import typingsJapgolly.reCarousel.mod.SiblingFrames
import typingsJapgolly.reCarousel.mod.WidgetProps
import typingsJapgolly.reCarousel.reCarouselStrings.x
import typingsJapgolly.reCarousel.reCarouselStrings.y
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReCarousel {
  
  @JSImport("re-carousel", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def auto(value: Boolean): this.type = set("auto", value.asInstanceOf[js.Any])
    
    inline def axis(value: x | y): this.type = set("axis", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def frames(value: js.Array[Element]): this.type = set("frames", value.asInstanceOf[js.Any])
    
    inline def framesVarargs(value: Element*): this.type = set("frames", js.Array(value*))
    
    inline def interval(value: Double): this.type = set("interval", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def minMove(value: Double): this.type = set("minMove", value.asInstanceOf[js.Any])
    
    inline def onTransitionEnd(value: (/* siblingFrames */ SiblingFrames, /* duration */ Double) => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction2((t0: /* siblingFrames */ SiblingFrames, t1: /* duration */ Double) => (value(t0, t1)).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def widgets(value: js.Array[ComponentType[WidgetProps]]): this.type = set("widgets", value.asInstanceOf[js.Any])
    
    inline def widgetsVarargs(value: ComponentType[WidgetProps]*): this.type = set("widgets", js.Array(value*))
  }
  
  implicit def make(companion: ReCarousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
