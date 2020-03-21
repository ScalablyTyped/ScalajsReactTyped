package typingsJapgolly.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.linear
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.pow
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.sqrt
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.log
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.symlog
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.time
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.utc
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.sequential
*/
trait QuantScaleType extends js.Object

object QuantScaleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linear: typingsJapgolly.vegaTypings.vegaTypingsStrings.linear = this.cast("linear")
  @scala.inline
  def log: typingsJapgolly.vegaTypings.vegaTypingsStrings.log = this.cast("log")
  @scala.inline
  def pow: typingsJapgolly.vegaTypings.vegaTypingsStrings.pow = this.cast("pow")
  @scala.inline
  def sequential: typingsJapgolly.vegaTypings.vegaTypingsStrings.sequential = this.cast("sequential")
  @scala.inline
  def sqrt: typingsJapgolly.vegaTypings.vegaTypingsStrings.sqrt = this.cast("sqrt")
  @scala.inline
  def symlog: typingsJapgolly.vegaTypings.vegaTypingsStrings.symlog = this.cast("symlog")
  @scala.inline
  def time: typingsJapgolly.vegaTypings.vegaTypingsStrings.time = this.cast("time")
  @scala.inline
  def utc: typingsJapgolly.vegaTypings.vegaTypingsStrings.utc = this.cast("utc")
}

