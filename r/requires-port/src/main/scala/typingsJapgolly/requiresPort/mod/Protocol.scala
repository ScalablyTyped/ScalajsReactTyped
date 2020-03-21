package typingsJapgolly.requiresPort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.requiresPort.requiresPortStrings.http
  - typingsJapgolly.requiresPort.requiresPortStrings.https
  - typingsJapgolly.requiresPort.requiresPortStrings.ws
  - typingsJapgolly.requiresPort.requiresPortStrings.wss
  - typingsJapgolly.requiresPort.requiresPortStrings.ftp
  - typingsJapgolly.requiresPort.requiresPortStrings.gopher
  - typingsJapgolly.requiresPort.requiresPortStrings.file
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def file: typingsJapgolly.requiresPort.requiresPortStrings.file = this.cast("file")
  @scala.inline
  def ftp: typingsJapgolly.requiresPort.requiresPortStrings.ftp = this.cast("ftp")
  @scala.inline
  def gopher: typingsJapgolly.requiresPort.requiresPortStrings.gopher = this.cast("gopher")
  @scala.inline
  def http: typingsJapgolly.requiresPort.requiresPortStrings.http = this.cast("http")
  @scala.inline
  def https: typingsJapgolly.requiresPort.requiresPortStrings.https = this.cast("https")
  @scala.inline
  def ws: typingsJapgolly.requiresPort.requiresPortStrings.ws = this.cast("ws")
  @scala.inline
  def wss: typingsJapgolly.requiresPort.requiresPortStrings.wss = this.cast("wss")
}

