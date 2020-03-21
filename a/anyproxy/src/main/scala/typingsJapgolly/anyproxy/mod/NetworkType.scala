package typingsJapgolly.anyproxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.anyproxy.anyproxyStrings.http
  - typingsJapgolly.anyproxy.anyproxyStrings.https
*/
trait NetworkType extends js.Object

object NetworkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typingsJapgolly.anyproxy.anyproxyStrings.http = this.cast("http")
  @scala.inline
  def https: typingsJapgolly.anyproxy.anyproxyStrings.https = this.cast("https")
}

