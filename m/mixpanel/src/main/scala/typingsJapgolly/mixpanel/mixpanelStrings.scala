package typingsJapgolly.mixpanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mixpanelStrings {
  @js.native
  sealed trait cookie extends js.Object
  
  @js.native
  sealed trait localStorage extends js.Object
  
  @scala.inline
  def cookie: cookie = "cookie".asInstanceOf[cookie]
  @scala.inline
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
}

