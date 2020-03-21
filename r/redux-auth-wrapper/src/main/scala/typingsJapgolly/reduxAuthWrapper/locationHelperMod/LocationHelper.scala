package typingsJapgolly.reduxAuthWrapper.locationHelperMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.history.mod.LocationDescriptorObject
import typingsJapgolly.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationHelper[Props] extends js.Object {
  def createRedirectLoc(props: Props, redirectPath: String): LocationDescriptorObject[LocationState]
  def getRedirectQueryParam(props: Props): String
}

object LocationHelper {
  @scala.inline
  def apply[Props](
    createRedirectLoc: (Props, String) => CallbackTo[LocationDescriptorObject[LocationState]],
    getRedirectQueryParam: Props => CallbackTo[String]
  ): LocationHelper[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createRedirectLoc")(js.Any.fromFunction2((t0: Props, t1: java.lang.String) => createRedirectLoc(t0, t1).runNow()))
    __obj.updateDynamic("getRedirectQueryParam")(js.Any.fromFunction1((t0: Props) => getRedirectQueryParam(t0).runNow()))
    __obj.asInstanceOf[LocationHelper[Props]]
  }
}

