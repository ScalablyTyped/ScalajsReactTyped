package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement
  extends /* propName */ StringDictionary[js.Any] {
  var action: String
  var element: Element
  def endCallback(): Unit
}

object AnonElement {
  @scala.inline
  def apply(
    action: String,
    element: Element,
    endCallback: Callback,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.updateDynamic("endCallback")(endCallback.toJsFn)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonElement]
  }
}

