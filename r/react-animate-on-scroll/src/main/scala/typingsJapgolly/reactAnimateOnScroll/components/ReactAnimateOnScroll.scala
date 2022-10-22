package typingsJapgolly.reactAnimateOnScroll.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAnimateOnScroll.mod.ScrollAnimationProps
import typingsJapgolly.reactAnimateOnScroll.mod.VisibleType
import typingsJapgolly.reactAnimateOnScroll.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAnimateOnScroll {
  
  @JSImport("react-animate-on-scroll", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def afterAnimatedIn(value: /* visibile */ VisibleType => js.UndefOr[js.Object]): this.type = set("afterAnimatedIn", js.Any.fromFunction1(value))
    
    inline def afterAnimatedOut(value: /* visibile */ VisibleType => js.UndefOr[js.Object]): this.type = set("afterAnimatedOut", js.Any.fromFunction1(value))
    
    inline def animateIn(value: String): this.type = set("animateIn", value.asInstanceOf[js.Any])
    
    inline def animateOnce(value: Boolean): this.type = set("animateOnce", value.asInstanceOf[js.Any])
    
    inline def animateOut(value: String): this.type = set("animateOut", value.asInstanceOf[js.Any])
    
    inline def animatePreScroll(value: Boolean): this.type = set("animatePreScroll", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def initiallyVisible(value: Boolean): this.type = set("initiallyVisible", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def scrollableParentSelector(value: String): this.type = set("scrollableParentSelector", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactAnimateOnScroll.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollAnimationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
