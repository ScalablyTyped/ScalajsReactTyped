package typingsJapgolly.reactLottie.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLottie.mod.EventListener
import typingsJapgolly.reactLottie.mod.LottieProps
import typingsJapgolly.reactLottie.mod.Options
import typingsJapgolly.reactLottie.mod.default
import typingsJapgolly.reactLottie.reactLottieStrings.animation
import typingsJapgolly.reactLottie.reactLottieStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLottie {
  
  inline def apply(options: Options): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LottieProps]))
  }
  
  @JSImport("react-lottie", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def ariaLabel(value: String | animation): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaRole(value: String | button): this.type = set("ariaRole", value.asInstanceOf[js.Any])
    
    inline def direction(value: Double): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def eventListeners(value: js.Array[EventListener]): this.type = set("eventListeners", value.asInstanceOf[js.Any])
    
    inline def eventListenersVarargs(value: EventListener*): this.type = set("eventListeners", js.Array(value*))
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def isClickToPauseDisabled(value: Boolean): this.type = set("isClickToPauseDisabled", value.asInstanceOf[js.Any])
    
    inline def isPaused(value: Boolean): this.type = set("isPaused", value.asInstanceOf[js.Any])
    
    inline def isStopped(value: Boolean): this.type = set("isStopped", value.asInstanceOf[js.Any])
    
    inline def segments(value: js.Array[Double]): this.type = set("segments", value.asInstanceOf[js.Any])
    
    inline def segmentsVarargs(value: Double*): this.type = set("segments", js.Array(value*))
    
    inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LottieProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
