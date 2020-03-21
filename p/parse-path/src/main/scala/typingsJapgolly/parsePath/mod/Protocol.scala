package typingsJapgolly.parsePath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parsePath.parsePathStrings.http
  - typingsJapgolly.parsePath.parsePathStrings.https
  - typingsJapgolly.parsePath.parsePathStrings.ssh
  - typingsJapgolly.parsePath.parsePathStrings.file
  - typingsJapgolly.parsePath.parsePathStrings.git
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def file: typingsJapgolly.parsePath.parsePathStrings.file = this.cast("file")
  @scala.inline
  def git: typingsJapgolly.parsePath.parsePathStrings.git = this.cast("git")
  @scala.inline
  def http: typingsJapgolly.parsePath.parsePathStrings.http = this.cast("http")
  @scala.inline
  def https: typingsJapgolly.parsePath.parsePathStrings.https = this.cast("https")
  @scala.inline
  def ssh: typingsJapgolly.parsePath.parsePathStrings.ssh = this.cast("ssh")
}

