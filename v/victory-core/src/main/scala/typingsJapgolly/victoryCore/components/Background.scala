package typingsJapgolly.victoryCore.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryCore.esTypesCallbacksMod.CallbackArgs
import typingsJapgolly.victoryCore.esTypesCallbacksMod.NumberOrCallback
import typingsJapgolly.victoryCore.esTypesCallbacksMod.StringOrCallback
import typingsJapgolly.victoryCore.esVictoryLabelVictoryLabelMod.OriginType
import typingsJapgolly.victoryCore.esVictoryPrimitivesBackgroundMod.BackgroundProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Background {
  
  @JSImport("victory-core/es", "Background")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: StringOrCallback): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelFunction1(value: /* args */ CallbackArgs => String): this.type = set("ariaLabel", js.Any.fromFunction1(value))
    
    inline def circleComponent(value: VdomElement): this.type = set("circleComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clipPath(value: String): this.type = set("clipPath", value.asInstanceOf[js.Any])
    
    inline def data(value: Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def desc(value: String | js.Function): this.type = set("desc", value.asInstanceOf[js.Any])
    
    inline def disableInlineStyles(value: Boolean): this.type = set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    inline def events(value: js.Object): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def id(value: Double | String | js.Function): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def index(value: Double | String): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def origin(value: OriginType): this.type = set("origin", value.asInstanceOf[js.Any])
    
    inline def polar(value: Boolean): this.type = set("polar", value.asInstanceOf[js.Any])
    
    inline def rectComponent(value: VdomElement): this.type = set("rectComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rx(value: Double): this.type = set("rx", value.asInstanceOf[js.Any])
    
    inline def ry(value: Double): this.type = set("ry", value.asInstanceOf[js.Any])
    
    inline def scale(value: Any): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def shapeRendering(value: String): this.type = set("shapeRendering", value.asInstanceOf[js.Any])
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: NumberOrCallback): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tabIndexFunction1(value: /* args */ CallbackArgs => Double): this.type = set("tabIndex", js.Any.fromFunction1(value))
    
    inline def transform(value: String): this.type = set("transform", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Background.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BackgroundProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
