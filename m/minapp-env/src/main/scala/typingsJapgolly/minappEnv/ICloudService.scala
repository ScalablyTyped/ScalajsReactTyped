package typingsJapgolly.minappEnv

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICloudService extends js.Object {
  var name: java.lang.String
  def getAPIs(): StringDictionary[IAPIFunction[_, _]]
}

object ICloudService {
  @scala.inline
  def apply(getAPIs: CallbackTo[StringDictionary[IAPIFunction[js.Any, js.Any]]], name: java.lang.String): ICloudService = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("getAPIs")(getAPIs.toJsFn)
    __obj.asInstanceOf[ICloudService]
  }
}

