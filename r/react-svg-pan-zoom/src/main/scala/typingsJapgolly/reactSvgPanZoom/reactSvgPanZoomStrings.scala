package typingsJapgolly.reactSvgPanZoom

import typingsJapgolly.reactSvgPanZoom.mod.Mode
import typingsJapgolly.reactSvgPanZoom.mod.Tool
import typingsJapgolly.reactSvgPanZoom.mod.ToolbarPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactSvgPanZoomStrings {
  @js.native
  sealed trait auto extends Tool
  
  @js.native
  sealed trait bottom extends ToolbarPosition
  
  @js.native
  sealed trait center extends js.Object
  
  @js.native
  sealed trait idle extends Mode
  
  @js.native
  sealed trait left extends ToolbarPosition
  
  @js.native
  sealed trait none
    extends Tool
       with ToolbarPosition
  
  @js.native
  sealed trait pan extends Tool
  
  @js.native
  sealed trait panning extends Mode
  
  @js.native
  sealed trait right extends ToolbarPosition
  
  @js.native
  sealed trait top extends ToolbarPosition
  
  @js.native
  sealed trait `zoom-in` extends Tool
  
  @js.native
  sealed trait `zoom-out` extends Tool
  
  @js.native
  sealed trait zooming extends Mode
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def pan: pan = "pan".asInstanceOf[pan]
  @scala.inline
  def panning: panning = "panning".asInstanceOf[panning]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def `zoom-in`: `zoom-in` = "zoom-in".asInstanceOf[`zoom-in`]
  @scala.inline
  def `zoom-out`: `zoom-out` = "zoom-out".asInstanceOf[`zoom-out`]
  @scala.inline
  def zooming: zooming = "zooming".asInstanceOf[zooming]
}

