package typingsJapgolly.vegaTypings.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.local
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.utc
*/
trait TimeZone extends js.Object

object TimeZone {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def local: typingsJapgolly.vegaTypings.vegaTypingsStrings.local = this.cast("local")
  @scala.inline
  def utc: typingsJapgolly.vegaTypings.vegaTypingsStrings.utc = this.cast("utc")
}

