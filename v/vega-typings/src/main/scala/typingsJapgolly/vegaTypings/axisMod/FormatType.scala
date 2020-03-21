package typingsJapgolly.vegaTypings.axisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.number
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.time
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.utc
*/
trait FormatType extends js.Object

object FormatType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def number: typingsJapgolly.vegaTypings.vegaTypingsStrings.number = this.cast("number")
  @scala.inline
  def time: typingsJapgolly.vegaTypings.vegaTypingsStrings.time = this.cast("time")
  @scala.inline
  def utc: typingsJapgolly.vegaTypings.vegaTypingsStrings.utc = this.cast("utc")
}

