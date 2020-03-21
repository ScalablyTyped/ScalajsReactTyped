package typingsJapgolly.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.block
  - typingsJapgolly.csstype.csstypeStrings.`inline`
  - typingsJapgolly.csstype.csstypeStrings.`run-in`
*/
trait DisplayOutside extends _DisplayProperty

object DisplayOutside {
  @scala.inline
  def block: typingsJapgolly.csstype.csstypeStrings.block = this.cast("block")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `inline`: typingsJapgolly.csstype.csstypeStrings.`inline` = this.cast("inline")
  @scala.inline
  def `run-in`: typingsJapgolly.csstype.csstypeStrings.`run-in` = this.cast("run-in")
}

