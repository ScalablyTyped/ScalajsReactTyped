package typingsJapgolly.firebaseAppTypes.privateMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformLoggerService extends js.Object {
  def getPlatformInfoString(): String
}

object PlatformLoggerService {
  @scala.inline
  def apply(getPlatformInfoString: CallbackTo[String]): PlatformLoggerService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPlatformInfoString")(getPlatformInfoString.toJsFn)
    __obj.asInstanceOf[PlatformLoggerService]
  }
}

