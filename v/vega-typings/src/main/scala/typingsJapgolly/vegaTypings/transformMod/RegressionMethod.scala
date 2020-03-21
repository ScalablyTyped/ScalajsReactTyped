package typingsJapgolly.vegaTypings.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.linear
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.exp
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.log
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.quad
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.poly
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.pow
*/
trait RegressionMethod extends js.Object

object RegressionMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exp: typingsJapgolly.vegaTypings.vegaTypingsStrings.exp = this.cast("exp")
  @scala.inline
  def linear: typingsJapgolly.vegaTypings.vegaTypingsStrings.linear = this.cast("linear")
  @scala.inline
  def log: typingsJapgolly.vegaTypings.vegaTypingsStrings.log = this.cast("log")
  @scala.inline
  def poly: typingsJapgolly.vegaTypings.vegaTypingsStrings.poly = this.cast("poly")
  @scala.inline
  def pow: typingsJapgolly.vegaTypings.vegaTypingsStrings.pow = this.cast("pow")
  @scala.inline
  def quad: typingsJapgolly.vegaTypings.vegaTypingsStrings.quad = this.cast("quad")
}

