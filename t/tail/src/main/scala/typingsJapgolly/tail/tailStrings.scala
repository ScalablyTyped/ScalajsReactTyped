package typingsJapgolly.tail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tailStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait line extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def line: line = "line".asInstanceOf[line]
}

