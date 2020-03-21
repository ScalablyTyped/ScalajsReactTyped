package typingsJapgolly.angularCompiler.t2ApiMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetBinder[D /* <: DirectiveMeta */] extends js.Object {
  def bind(target: Target): BoundTarget[D]
}

object TargetBinder {
  @scala.inline
  def apply[D /* <: DirectiveMeta */](bind: Target => CallbackTo[BoundTarget[D]]): TargetBinder[D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.t2ApiMod.Target) => bind(t0).runNow()))
    __obj.asInstanceOf[TargetBinder[D]]
  }
}

