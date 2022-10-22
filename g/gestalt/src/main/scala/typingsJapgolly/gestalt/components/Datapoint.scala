package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.AccessibilityLabelValue
import typingsJapgolly.gestalt.gestaltStrings.auto
import typingsJapgolly.gestalt.gestaltStrings.bad
import typingsJapgolly.gestalt.gestaltStrings.good
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.neutral
import typingsJapgolly.gestalt.mod.BadgeObject
import typingsJapgolly.gestalt.mod.DatapointProps
import typingsJapgolly.gestalt.mod.Indexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Datapoint {
  
  inline def apply(title: String, value: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DatapointProps]))
  }
  
  @JSImport("gestalt", "Datapoint")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def badge(value: BadgeObject): this.type = set("badge", value.asInstanceOf[js.Any])
    
    inline def size(value: md | lg): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def tooltipText(value: String): this.type = set("tooltipText", value.asInstanceOf[js.Any])
    
    inline def tooltipZIndex(value: Indexable): this.type = set("tooltipZIndex", value.asInstanceOf[js.Any])
    
    inline def trend(value: AccessibilityLabelValue): this.type = set("trend", value.asInstanceOf[js.Any])
    
    inline def trendSentiment(value: good | bad | neutral | auto): this.type = set("trendSentiment", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatapointProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
