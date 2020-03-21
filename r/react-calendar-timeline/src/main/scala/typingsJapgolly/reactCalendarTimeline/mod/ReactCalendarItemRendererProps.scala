package typingsJapgolly.reactCalendarTimeline.mod

import typingsJapgolly.reactCalendarTimeline.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCalendarItemRendererProps[CustomItem /* <: TimelineItemBase[_] */] extends js.Object {
  var item: CustomItem = js.native
  var itemContext: ItemContext = js.native
  def getItemProps(props: GetItemsProps): AnonKey = js.native
  def getResizeProps(): ItemRendererGetResizePropsReturnType = js.native
  def getResizeProps(propsOverride: GetResizeProps): ItemRendererGetResizePropsReturnType = js.native
}

