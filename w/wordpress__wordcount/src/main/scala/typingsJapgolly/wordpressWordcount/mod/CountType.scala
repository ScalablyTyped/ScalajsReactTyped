package typingsJapgolly.wordpressWordcount.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wordpressWordcount.wordpressWordcountStrings.words
  - typingsJapgolly.wordpressWordcount.wordpressWordcountStrings.characters_excluding_spaces
  - typingsJapgolly.wordpressWordcount.wordpressWordcountStrings.characters_including_spaces
*/
trait CountType extends js.Object

object CountType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def characters_excluding_spaces: typingsJapgolly.wordpressWordcount.wordpressWordcountStrings.characters_excluding_spaces = this.cast("characters_excluding_spaces")
  @scala.inline
  def characters_including_spaces: typingsJapgolly.wordpressWordcount.wordpressWordcountStrings.characters_including_spaces = this.cast("characters_including_spaces")
  @scala.inline
  def words: typingsJapgolly.wordpressWordcount.wordpressWordcountStrings.words = this.cast("words")
}

