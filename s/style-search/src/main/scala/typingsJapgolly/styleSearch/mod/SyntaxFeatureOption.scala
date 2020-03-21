package typingsJapgolly.styleSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.styleSearch.styleSearchStrings.skip
  - typingsJapgolly.styleSearch.styleSearchStrings.check
  - typingsJapgolly.styleSearch.styleSearchStrings.only
*/
trait SyntaxFeatureOption extends js.Object

object SyntaxFeatureOption {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def check: typingsJapgolly.styleSearch.styleSearchStrings.check = this.cast("check")
  @scala.inline
  def only: typingsJapgolly.styleSearch.styleSearchStrings.only = this.cast("only")
  @scala.inline
  def skip: typingsJapgolly.styleSearch.styleSearchStrings.skip = this.cast("skip")
}

