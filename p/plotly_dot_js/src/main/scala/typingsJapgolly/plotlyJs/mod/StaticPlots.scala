package typingsJapgolly.plotlyJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticPlots extends js.Object {
  def resize(root: Root): Unit
}

object StaticPlots {
  @scala.inline
  def apply(resize: Root => Callback): StaticPlots = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: typingsJapgolly.plotlyJs.mod.Root) => resize(t0).runNow()))
    __obj.asInstanceOf[StaticPlots]
  }
}

