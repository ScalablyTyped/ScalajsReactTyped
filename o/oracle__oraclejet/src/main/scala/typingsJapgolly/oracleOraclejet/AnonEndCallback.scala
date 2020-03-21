package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.close
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndCallback
  extends /* propName */ StringDictionary[js.Any] {
  var action: open | close
  var element: Element
  def endCallback(): Unit
}

object AnonEndCallback {
  @scala.inline
  def apply(
    action: open | close,
    element: Element,
    endCallback: Callback,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonEndCallback = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.updateDynamic("endCallback")(endCallback.toJsFn)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonEndCallback]
  }
}

