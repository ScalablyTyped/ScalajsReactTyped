package typingsJapgolly.reactPopperTooltip

import typingsJapgolly.reactPopperTooltip.typesMod.TriggerTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactPopperTooltipStrings {
  @js.native
  sealed trait click extends TriggerTypes
  
  @js.native
  sealed trait focus extends TriggerTypes
  
  @js.native
  sealed trait hover extends TriggerTypes
  
  @js.native
  sealed trait none extends TriggerTypes
  
  @js.native
  sealed trait `right-click` extends TriggerTypes
  
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  @scala.inline
  def hover: hover = "hover".asInstanceOf[hover]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `right-click`: `right-click` = "right-click".asInstanceOf[`right-click`]
}

