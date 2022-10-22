package typingsJapgolly.reactVerticalTimelineComponent.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimelineProps
import typingsJapgolly.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column-left`
import typingsJapgolly.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column-right`
import typingsJapgolly.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column`
import typingsJapgolly.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`2-columns`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VerticalTimeline {
  
  @JSImport("react-vertical-timeline-component", "VerticalTimeline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimeline] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def layout(value: `1-column` | `1-column-left` | `1-column-right` | `2-columns`): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def lineColor(value: String): this.type = set("lineColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VerticalTimeline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VerticalTimelineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
