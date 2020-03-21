package typingsJapgolly.cqrsDomain.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineCommandResult extends js.Object {
  def defineEventStreamsToLoad(cb: defineEventStreamsToLoadHandler): Unit
}

object DefineCommandResult {
  @scala.inline
  def apply(defineEventStreamsToLoad: defineEventStreamsToLoadHandler => Callback): DefineCommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defineEventStreamsToLoad")(js.Any.fromFunction1((t0: typingsJapgolly.cqrsDomain.mod.defineEventStreamsToLoadHandler) => defineEventStreamsToLoad(t0).runNow()))
    __obj.asInstanceOf[DefineCommandResult]
  }
}

