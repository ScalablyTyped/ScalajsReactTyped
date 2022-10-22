package typingsJapgolly.victoryCore.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryCore.esTypesCallbacksMod.CallbackArgs
import typingsJapgolly.victoryCore.esTypesCallbacksMod.NumberOrCallback
import typingsJapgolly.victoryCore.esTypesCallbacksMod.StringOrCallback
import typingsJapgolly.victoryCore.esVictoryLabelVictoryLabelMod.OriginType
import typingsJapgolly.victoryCore.esVictoryPrimitivesLineSegmentMod.LineSegmentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineSegment {
  
  @JSImport("victory-core/es", "LineSegment")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: StringOrCallback): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelFunction1(value: /* args */ CallbackArgs => String): this.type = set("ariaLabel", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clipPath(value: String): this.type = set("clipPath", value.asInstanceOf[js.Any])
    
    inline def data(value: Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def datum(value: Any): this.type = set("datum", value.asInstanceOf[js.Any])
    
    inline def desc(value: String | js.Function): this.type = set("desc", value.asInstanceOf[js.Any])
    
    inline def disableInlineStyles(value: Boolean): this.type = set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    inline def events(value: js.Object): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def id(value: Double | String | js.Function): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def index(value: Double | String): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def lineComponent(value: VdomElement): this.type = set("lineComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def origin(value: OriginType): this.type = set("origin", value.asInstanceOf[js.Any])
    
    inline def polar(value: Boolean): this.type = set("polar", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def scale(value: Any): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def shapeRendering(value: String): this.type = set("shapeRendering", value.asInstanceOf[js.Any])
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: NumberOrCallback): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tabIndexFunction1(value: /* args */ CallbackArgs => Double): this.type = set("tabIndex", js.Any.fromFunction1(value))
    
    inline def transform(value: String): this.type = set("transform", value.asInstanceOf[js.Any])
    
    inline def x1(value: Double): this.type = set("x1", value.asInstanceOf[js.Any])
    
    inline def x2(value: Double): this.type = set("x2", value.asInstanceOf[js.Any])
    
    inline def y1(value: Double): this.type = set("y1", value.asInstanceOf[js.Any])
    
    inline def y2(value: Double): this.type = set("y2", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LineSegment.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LineSegmentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
