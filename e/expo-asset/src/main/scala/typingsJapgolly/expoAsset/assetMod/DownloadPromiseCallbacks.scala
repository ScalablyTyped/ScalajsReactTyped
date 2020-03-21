package typingsJapgolly.expoAsset.assetMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadPromiseCallbacks extends js.Object {
  def reject(error: js.Error): Unit
  def resolve(): Unit
}

object DownloadPromiseCallbacks {
  @scala.inline
  def apply(reject: js.Error => Callback, resolve: Callback): DownloadPromiseCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: js.Error) => reject(t0).runNow()))
    __obj.updateDynamic("resolve")(resolve.toJsFn)
    __obj.asInstanceOf[DownloadPromiseCallbacks]
  }
}

