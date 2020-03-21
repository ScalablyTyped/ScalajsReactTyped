package typingsJapgolly.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.fixed
  - typingsJapgolly.csstype.csstypeStrings.local
  - typingsJapgolly.csstype.csstypeStrings.scroll
*/
trait Attachment
  extends _FinalBgLayer[js.Any]
     with _BackgroundAttachmentProperty
     with _WebkitMaskAttachmentProperty

object Attachment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fixed: typingsJapgolly.csstype.csstypeStrings.fixed = this.cast("fixed")
  @scala.inline
  def local: typingsJapgolly.csstype.csstypeStrings.local = this.cast("local")
  @scala.inline
  def scroll: typingsJapgolly.csstype.csstypeStrings.scroll = this.cast("scroll")
}

