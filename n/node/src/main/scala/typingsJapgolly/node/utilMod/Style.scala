package typingsJapgolly.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.nodeStrings.special
  - typingsJapgolly.node.nodeStrings.number
  - typingsJapgolly.node.nodeStrings.bigint
  - typingsJapgolly.node.nodeStrings.boolean
  - typingsJapgolly.node.nodeStrings.undefined
  - typingsJapgolly.node.nodeStrings.`null`
  - typingsJapgolly.node.nodeStrings.string
  - typingsJapgolly.node.nodeStrings.symbol
  - typingsJapgolly.node.nodeStrings.date
  - typingsJapgolly.node.nodeStrings.regexp
  - typingsJapgolly.node.nodeStrings.module
*/
trait Style extends js.Object

object Style {
  @scala.inline
  def bigint: typingsJapgolly.node.nodeStrings.bigint = this.cast("bigint")
  @scala.inline
  def boolean: typingsJapgolly.node.nodeStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsJapgolly.node.nodeStrings.date = this.cast("date")
  @scala.inline
  def module: typingsJapgolly.node.nodeStrings.module = this.cast("module")
  @scala.inline
  def `null`: typingsJapgolly.node.nodeStrings.`null` = this.cast("null")
  @scala.inline
  def number: typingsJapgolly.node.nodeStrings.number = this.cast("number")
  @scala.inline
  def regexp: typingsJapgolly.node.nodeStrings.regexp = this.cast("regexp")
  @scala.inline
  def special: typingsJapgolly.node.nodeStrings.special = this.cast("special")
  @scala.inline
  def string: typingsJapgolly.node.nodeStrings.string = this.cast("string")
  @scala.inline
  def symbol: typingsJapgolly.node.nodeStrings.symbol = this.cast("symbol")
  @scala.inline
  def undefined: typingsJapgolly.node.nodeStrings.undefined = this.cast("undefined")
}

