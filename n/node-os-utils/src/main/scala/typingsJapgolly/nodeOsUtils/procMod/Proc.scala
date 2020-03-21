package typingsJapgolly.nodeOsUtils.procMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proc extends js.Object {
  def totalProcesses(): js.Promise[Double | String]
  def zombieProcesses(): js.Promise[Double | String]
}

object Proc {
  @scala.inline
  def apply(
    totalProcesses: CallbackTo[js.Promise[Double | String]],
    zombieProcesses: CallbackTo[js.Promise[Double | String]]
  ): Proc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("totalProcesses")(totalProcesses.toJsFn)
    __obj.updateDynamic("zombieProcesses")(zombieProcesses.toJsFn)
    __obj.asInstanceOf[Proc]
  }
}

