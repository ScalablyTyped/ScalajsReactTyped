package typingsJapgolly.amapJsApiRiding

import typingsJapgolly.amapJsApiRiding.AMap.Riding.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object amapJsApiRidingStrings {
  @js.native
  sealed trait complete extends SearchStatus
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends SearchStatus
  
  @js.native
  sealed trait no_data extends SearchStatus
  
  @js.native
  sealed trait start extends js.Object
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}

