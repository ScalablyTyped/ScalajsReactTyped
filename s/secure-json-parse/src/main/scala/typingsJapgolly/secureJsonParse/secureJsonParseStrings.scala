package typingsJapgolly.secureJsonParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object secureJsonParseStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait ignore extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
}

