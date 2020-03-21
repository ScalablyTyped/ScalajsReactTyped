package typingsJapgolly.expressValidator.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.expressValidator.expressValidatorStrings.body
  - typingsJapgolly.expressValidator.expressValidatorStrings.cookies
  - typingsJapgolly.expressValidator.expressValidatorStrings.headers
  - typingsJapgolly.expressValidator.expressValidatorStrings.params
  - typingsJapgolly.expressValidator.expressValidatorStrings.query
*/
trait Location extends js.Object

object Location {
  @scala.inline
  def body: typingsJapgolly.expressValidator.expressValidatorStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cookies: typingsJapgolly.expressValidator.expressValidatorStrings.cookies = this.cast("cookies")
  @scala.inline
  def headers: typingsJapgolly.expressValidator.expressValidatorStrings.headers = this.cast("headers")
  @scala.inline
  def params: typingsJapgolly.expressValidator.expressValidatorStrings.params = this.cast("params")
  @scala.inline
  def query: typingsJapgolly.expressValidator.expressValidatorStrings.query = this.cast("query")
}

