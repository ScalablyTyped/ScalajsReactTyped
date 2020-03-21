package typingsJapgolly.zfont

import typingsJapgolly.zfont.mod.zdogAugmentingMod.TextAlign
import typingsJapgolly.zfont.mod.zdogAugmentingMod.TextBaseline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object zfontStrings {
  @js.native
  sealed trait bottom extends TextBaseline
  
  @js.native
  sealed trait center extends TextAlign
  
  @js.native
  sealed trait left extends TextAlign
  
  @js.native
  sealed trait middle extends TextBaseline
  
  @js.native
  sealed trait right extends TextAlign
  
  @js.native
  sealed trait top extends TextBaseline
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}

