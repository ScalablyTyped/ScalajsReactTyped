package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modeless
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.overlay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.push
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoDismiss extends js.Object {
  var autoDismiss: js.UndefOr[focusLoss | none] = js.undefined
  var content: String
  var displayMode: js.UndefOr[push | overlay] = js.undefined
  var edge: js.UndefOr[start | end | top | bottom] = js.undefined
  var modality: js.UndefOr[modal | modeless] = js.undefined
  var selector: String
  var size: js.UndefOr[String] = js.undefined
}

object AnonAutoDismiss {
  @scala.inline
  def apply(
    content: String,
    selector: String,
    autoDismiss: focusLoss | none = null,
    displayMode: push | overlay = null,
    edge: start | end | top | bottom = null,
    modality: modal | modeless = null,
    size: String = null
  ): AnonAutoDismiss = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (modality != null) __obj.updateDynamic("modality")(modality.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoDismiss]
  }
}

