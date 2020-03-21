package typingsJapgolly.feedparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.feedparser.feedparserStrings.atom
  - typingsJapgolly.feedparser.feedparserStrings.rss
  - typingsJapgolly.feedparser.feedparserStrings.rdf
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def atom: typingsJapgolly.feedparser.feedparserStrings.atom = this.cast("atom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rdf: typingsJapgolly.feedparser.feedparserStrings.rdf = this.cast("rdf")
  @scala.inline
  def rss: typingsJapgolly.feedparser.feedparserStrings.rss = this.cast("rss")
}

