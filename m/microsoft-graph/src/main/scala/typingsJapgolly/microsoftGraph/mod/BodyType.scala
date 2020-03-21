package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.text
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.html
*/
trait BodyType extends js.Object

object BodyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def html: typingsJapgolly.microsoftGraph.microsoftGraphStrings.html = this.cast("html")
  @scala.inline
  def text: typingsJapgolly.microsoftGraph.microsoftGraphStrings.text = this.cast("text")
}

