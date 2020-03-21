package typingsJapgolly.baseui.popoverMod

import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.baseui.AnonArrowOffset
import typingsJapgolly.baseui.SharedStylePropsArgchildrArrowOffset
import typingsJapgolly.baseui.layerMod.NormalizedOffsets
import typingsJapgolly.baseui.layerMod.PopperDataObject
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/popover", "Popover")
@js.native
class Popover ()
  extends Component[PopoverProps, PopoverPrivateState, js.Any] {
  def addDomEvents(): Unit = js.native
  def animateIn(): Unit = js.native
  def animateOut(): Unit = js.native
  def clearTimers(): Unit = js.native
  def getAnchorFromChildren(): Node = js.native
  def getAnchorIdAttr(): String | Null = js.native
  def getAnchorProps(): js.Object = js.native
  def getDefaultState(props: PopoverProps): AnonArrowOffset = js.native
  def getPopoverBodyProps(): js.Object = js.native
  def getPopoverIdAttr(): String | Null = js.native
  def getSharedProps(): SharedStylePropsArgchildrArrowOffset = js.native
  def init(prevProps: PopoverProps, prevState: PopoverPrivateState): Unit = js.native
  def isAccessibilityTypeMenu(): Boolean = js.native
  def isAccessibilityTypeTooltip(): Boolean = js.native
  def isClickTrigger(): Boolean = js.native
  def isHoverTrigger(): Boolean = js.native
  def onAnchorClick(e: Event_): Unit = js.native
  def onAnchorMouseEnter(): Unit = js.native
  def onAnchorMouseLeave(): Unit = js.native
  def onDocumentClick(evt: MouseEvent): Unit = js.native
  def onKeyPress(evt: KeyboardEvent): Unit = js.native
  def onPopoverMouseEnter(): Unit = js.native
  def onPopoverMouseLeave(): Unit = js.native
  def onPopperUpdate(normalizedOffsets: NormalizedOffsets, data: PopperDataObject): Unit = js.native
  def removeDomEvents(): Unit = js.native
  def renderAnchor(): Node = js.native
  def renderPopover(): Node = js.native
  def triggerOnMouseEnter(): Unit = js.native
  def triggerOnMouseEnterWithDelay(): Unit = js.native
  def triggerOnMouseLeave(): Unit = js.native
  def triggerOnMouseLeaveWithDelay(): Unit = js.native
}

