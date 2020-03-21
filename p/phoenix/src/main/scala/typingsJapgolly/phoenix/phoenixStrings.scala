package typingsJapgolly.phoenix

import typingsJapgolly.phoenix.mod.BinaryType
import typingsJapgolly.phoenix.mod.ConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object phoenixStrings {
  @js.native
  sealed trait arraybuffer extends BinaryType
  
  @js.native
  sealed trait blob extends BinaryType
  
  @js.native
  sealed trait closed extends ConnectionState
  
  @js.native
  sealed trait closing extends ConnectionState
  
  @js.native
  sealed trait connecting extends ConnectionState
  
  @js.native
  sealed trait open extends ConnectionState
  
  @scala.inline
  def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def closing: closing = "closing".asInstanceOf[closing]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
}

