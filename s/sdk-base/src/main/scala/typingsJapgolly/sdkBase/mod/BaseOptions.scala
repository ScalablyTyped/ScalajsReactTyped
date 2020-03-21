package typingsJapgolly.sdkBase.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions
  extends /* key */ StringDictionary[js.Any] {
  var initMethod: js.UndefOr[String] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, initMethod: String = null): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (initMethod != null) __obj.updateDynamic("initMethod")(initMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

