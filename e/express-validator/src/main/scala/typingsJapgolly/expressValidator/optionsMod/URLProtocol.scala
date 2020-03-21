package typingsJapgolly.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.expressValidator.expressValidatorStrings.http
  - typingsJapgolly.expressValidator.expressValidatorStrings.https
  - typingsJapgolly.expressValidator.expressValidatorStrings.ftp
*/
trait URLProtocol extends js.Object

object URLProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ftp: typingsJapgolly.expressValidator.expressValidatorStrings.ftp = this.cast("ftp")
  @scala.inline
  def http: typingsJapgolly.expressValidator.expressValidatorStrings.http = this.cast("http")
  @scala.inline
  def https: typingsJapgolly.expressValidator.expressValidatorStrings.https = this.cast("https")
}

