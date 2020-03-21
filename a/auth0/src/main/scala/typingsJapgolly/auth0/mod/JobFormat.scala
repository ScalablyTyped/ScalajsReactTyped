package typingsJapgolly.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.auth0.auth0Strings.csv
  - typingsJapgolly.auth0.auth0Strings.json
*/
trait JobFormat extends js.Object

object JobFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def csv: typingsJapgolly.auth0.auth0Strings.csv = this.cast("csv")
  @scala.inline
  def json: typingsJapgolly.auth0.auth0Strings.json = this.cast("json")
}

