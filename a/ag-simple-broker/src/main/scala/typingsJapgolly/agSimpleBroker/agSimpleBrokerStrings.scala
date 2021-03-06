package typingsJapgolly.agSimpleBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object agSimpleBrokerStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait publish extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait subscribe extends js.Object
  
  @js.native
  sealed trait unsubscribe extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def publish: publish = "publish".asInstanceOf[publish]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  @scala.inline
  def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
}

