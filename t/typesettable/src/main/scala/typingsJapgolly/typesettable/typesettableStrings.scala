package typingsJapgolly.typesettable

import typingsJapgolly.typesettable.svgMod.IAnchor
import typingsJapgolly.typesettable.writerMod.IXAlign
import typingsJapgolly.typesettable.writerMod.IYAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object typesettableStrings {
  @js.native
  sealed trait bottom extends IYAlign
  
  @js.native
  sealed trait center
    extends IXAlign
       with IYAlign
  
  @js.native
  sealed trait end extends IAnchor
  
  @js.native
  sealed trait left extends IXAlign
  
  @js.native
  sealed trait middle extends IAnchor
  
  @js.native
  sealed trait right extends IXAlign
  
  @js.native
  sealed trait start extends IAnchor
  
  @js.native
  sealed trait top extends IYAlign
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}

