package typingsJapgolly.klaw

import typingsJapgolly.klaw.mod.Event
import typingsJapgolly.klaw.mod.QueueMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object klawStrings {
  @js.native
  sealed trait close extends Event
  
  @js.native
  sealed trait data extends Event
  
  @js.native
  sealed trait end extends Event
  
  @js.native
  sealed trait error extends Event
  
  @js.native
  sealed trait pop extends QueueMethod
  
  @js.native
  sealed trait readable extends Event
  
  @js.native
  sealed trait shift extends QueueMethod
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def pop: pop = "pop".asInstanceOf[pop]
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
  @scala.inline
  def shift: shift = "shift".asInstanceOf[shift]
}

