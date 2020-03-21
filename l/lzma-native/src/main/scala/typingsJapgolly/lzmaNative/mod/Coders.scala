package typingsJapgolly.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.lzmaNative.lzmaNativeStrings.easyEncoder
  - typingsJapgolly.lzmaNative.lzmaNativeStrings.aloneDecoder
  - typingsJapgolly.lzmaNative.lzmaNativeStrings.rawEncoder
  - typingsJapgolly.lzmaNative.lzmaNativeStrings.autoDecoder
  - typingsJapgolly.lzmaNative.lzmaNativeStrings.aloneEncoder
  - typingsJapgolly.lzmaNative.lzmaNativeStrings.streamEncoder
  - typingsJapgolly.lzmaNative.lzmaNativeStrings.streamDecoder
*/
trait Coders extends js.Object

object Coders {
  @scala.inline
  def aloneDecoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.aloneDecoder = this.cast("aloneDecoder")
  @scala.inline
  def aloneEncoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.aloneEncoder = this.cast("aloneEncoder")
  @scala.inline
  def autoDecoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.autoDecoder = this.cast("autoDecoder")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def easyEncoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.easyEncoder = this.cast("easyEncoder")
  @scala.inline
  def rawEncoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.rawEncoder = this.cast("rawEncoder")
  @scala.inline
  def streamDecoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.streamDecoder = this.cast("streamDecoder")
  @scala.inline
  def streamEncoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.streamEncoder = this.cast("streamEncoder")
}

