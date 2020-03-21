package typingsJapgolly.mariasql.mod

import typingsJapgolly.mariasql.mariasqlStrings.abort
import typingsJapgolly.mariasql.mariasqlStrings.end
import typingsJapgolly.mariasql.mariasqlStrings.error
import typingsJapgolly.mariasql.mariasqlStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MariaResult extends js.Object {
  def abort(): Unit = js.native
  def on(signal: String, cb: MariaCallBackVoid): MariaResult = js.native
  @JSName("on")
  def on_abort(signal: abort, cb: MariaCallBackVoid): MariaResult = js.native
  @JSName("on")
  def on_end(signal: end, cb: MariaCallBackInfo): MariaResult = js.native
  @JSName("on")
  def on_error(signal: error, cb: MariaCallBackError): MariaResult = js.native
  @JSName("on")
  def on_row(signal: row, cb: MariaCallBackRow): MariaResult = js.native
}

