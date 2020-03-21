package typingsJapgolly.proxyLists.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSource_ extends js.Object {
  var homeUrl: String
  def getProxies(options: InternalOptions): GetProxiesEventEmitter
}

object AddSource_ {
  @scala.inline
  def apply(getProxies: InternalOptions => CallbackTo[GetProxiesEventEmitter], homeUrl: String): AddSource_ = {
    val __obj = js.Dynamic.literal(homeUrl = homeUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("getProxies")(js.Any.fromFunction1((t0: typingsJapgolly.proxyLists.mod.InternalOptions) => getProxies(t0).runNow()))
    __obj.asInstanceOf[AddSource_]
  }
}

