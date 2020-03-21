package typingsJapgolly.elasticElasticsearch.transportMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportRequestCallback extends js.Object {
  def abort(): Unit
}

object TransportRequestCallback {
  @scala.inline
  def apply(abort: Callback): TransportRequestCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.asInstanceOf[TransportRequestCallback]
  }
}

