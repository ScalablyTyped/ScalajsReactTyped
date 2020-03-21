package typingsJapgolly.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.musicmatch.musicmatchStrings.json
  - typingsJapgolly.musicmatch.musicmatchStrings.xml
*/
trait TFormat extends js.Object

object TFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def json: typingsJapgolly.musicmatch.musicmatchStrings.json = this.cast("json")
  @scala.inline
  def xml: typingsJapgolly.musicmatch.musicmatchStrings.xml = this.cast("xml")
}

