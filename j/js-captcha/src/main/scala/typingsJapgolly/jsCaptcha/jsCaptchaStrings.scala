package typingsJapgolly.jsCaptcha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsCaptchaStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

