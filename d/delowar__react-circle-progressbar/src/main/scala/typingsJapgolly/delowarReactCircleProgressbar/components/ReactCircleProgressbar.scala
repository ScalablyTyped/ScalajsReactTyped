package typingsJapgolly.delowarReactCircleProgressbar.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.delowarReactCircleProgressbar.mod.Gradient
import typingsJapgolly.delowarReactCircleProgressbar.mod.ProgressProps
import typingsJapgolly.delowarReactCircleProgressbar.mod.Shadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCircleProgressbar {
  
  @JSImport("@delowar/react-circle-progressbar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def bgShadow(value: Shadow): this.type = set("bgShadow", value.asInstanceOf[js.Any])
    
    inline def borderBgWidth(value: Double | String): this.type = set("borderBgWidth", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double | String): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def emptyColor(value: String): this.type = set("emptyColor", value.asInstanceOf[js.Any])
    
    inline def fillColor(value: String): this.type = set("fillColor", value.asInstanceOf[js.Any])
    
    inline def gradient(value: Gradient): this.type = set("gradient", value.asInstanceOf[js.Any])
    
    inline def isBgShadow(value: Boolean): this.type = set("isBgShadow", value.asInstanceOf[js.Any])
    
    inline def isGradient(value: Boolean): this.type = set("isGradient", value.asInstanceOf[js.Any])
    
    inline def isShadow(value: Boolean): this.type = set("isShadow", value.asInstanceOf[js.Any])
    
    inline def linecap(value: String): this.type = set("linecap", value.asInstanceOf[js.Any])
    
    inline def onViewport(value: /* element */ Element => Unit | Null): this.type = set("onViewport", js.Any.fromFunction1(value))
    
    inline def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    inline def shadow(value: Shadow): this.type = set("shadow", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def transition(value: Double): this.type = set("transition", value.asInstanceOf[js.Any])
    
    inline def viewport(value: Boolean): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactCircleProgressbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProgressProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
