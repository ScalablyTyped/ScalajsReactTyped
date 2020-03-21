package typingsJapgolly.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object visionStrings {
  @js.native
  sealed trait async extends js.Object
  
  @js.native
  sealed trait sync extends js.Object
  
  @scala.inline
  def async: async = "async".asInstanceOf[async]
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
}

