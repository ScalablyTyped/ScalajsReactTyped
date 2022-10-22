package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesTimelineMod.TimelineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Timeline {
  
  inline def apply(items: js.Array[typingsJapgolly.wixStyleReact.distTypesTimelineMod.TimelineItem]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TimelineProps]))
  }
  
  @JSImport("wix-style-react", "Timeline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Timeline] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def gap(value: String): this.type = set("gap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TimelineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
