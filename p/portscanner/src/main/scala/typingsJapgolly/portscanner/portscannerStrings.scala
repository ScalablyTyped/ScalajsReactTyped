package typingsJapgolly.portscanner

import typingsJapgolly.portscanner.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object portscannerStrings {
  @js.native
  sealed trait closed extends Status
  
  @js.native
  sealed trait open extends Status
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
}

