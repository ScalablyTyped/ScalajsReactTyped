package typingsJapgolly.jsdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsdomStrings {
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait dangerously extends js.Object
  
  @js.native
  sealed trait jsdomError extends js.Object
  
  @js.native
  sealed trait memory extends js.Object
  
  @js.native
  sealed trait `outside-only` extends js.Object
  
  @js.native
  sealed trait usable extends js.Object
  
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def dangerously: dangerously = "dangerously".asInstanceOf[dangerously]
  @scala.inline
  def jsdomError: jsdomError = "jsdomError".asInstanceOf[jsdomError]
  @scala.inline
  def memory: memory = "memory".asInstanceOf[memory]
  @scala.inline
  def `outside-only`: `outside-only` = "outside-only".asInstanceOf[`outside-only`]
  @scala.inline
  def usable: usable = "usable".asInstanceOf[usable]
}

