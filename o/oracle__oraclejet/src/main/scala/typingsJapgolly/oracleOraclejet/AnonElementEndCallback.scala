package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.add
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.remove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementEndCallback
  extends /* propName */ StringDictionary[js.Any] {
  var action: add | remove | update
  var element: Element
  def endCallback(): Unit
}

object AnonElementEndCallback {
  @scala.inline
  def apply(
    action: add | remove | update,
    element: Element,
    endCallback: Callback,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonElementEndCallback = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.updateDynamic("endCallback")(endCallback.toJsFn)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonElementEndCallback]
  }
}

