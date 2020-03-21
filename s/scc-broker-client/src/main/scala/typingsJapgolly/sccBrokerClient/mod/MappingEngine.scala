package typingsJapgolly.sccBrokerClient.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingEngine extends js.Object {
  def findSite(key: String): String
  def getSites(): js.Array[String]
  def setSites(sites: js.Array[String]): Unit
}

object MappingEngine {
  @scala.inline
  def apply(
    findSite: String => CallbackTo[String],
    getSites: CallbackTo[js.Array[String]],
    setSites: js.Array[String] => Callback
  ): MappingEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findSite")(js.Any.fromFunction1((t0: java.lang.String) => findSite(t0).runNow()))
    __obj.updateDynamic("getSites")(getSites.toJsFn)
    __obj.updateDynamic("setSites")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => setSites(t0).runNow()))
    __obj.asInstanceOf[MappingEngine]
  }
}

