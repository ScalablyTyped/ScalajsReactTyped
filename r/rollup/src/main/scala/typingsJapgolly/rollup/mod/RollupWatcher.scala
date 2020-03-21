package typingsJapgolly.rollup.mod

import typingsJapgolly.rollup.AnonChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupWatcher extends TypedEventEmitter[AnonChange] {
  def close(): Unit = js.native
}

