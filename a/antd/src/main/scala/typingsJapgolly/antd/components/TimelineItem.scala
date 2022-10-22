package typingsJapgolly.antd.components

import typingsJapgolly.antd.libTimelineTimelineItemMod.TimelineItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimelineItem {
  
  @JSImport("antd/lib/timeline/TimelineItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TimelineItem.type): SharedBuilder_TimelineItemProps_1840960613 = new SharedBuilder_TimelineItemProps_1840960613(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimelineItemProps): SharedBuilder_TimelineItemProps_1840960613 = new SharedBuilder_TimelineItemProps_1840960613(js.Array(this.component, p.asInstanceOf[js.Any]))
}
