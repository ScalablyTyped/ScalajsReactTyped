package typingsJapgolly.amqplib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object amqplibStrings {
  @js.native
  sealed trait expired extends js.Object
  
  @js.native
  sealed trait maxlen extends js.Object
  
  @js.native
  sealed trait rejected extends js.Object
  
  @js.native
  sealed trait timestamp extends js.Object
  
  @scala.inline
  def expired: expired = "expired".asInstanceOf[expired]
  @scala.inline
  def maxlen: maxlen = "maxlen".asInstanceOf[maxlen]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  @scala.inline
  def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
}

