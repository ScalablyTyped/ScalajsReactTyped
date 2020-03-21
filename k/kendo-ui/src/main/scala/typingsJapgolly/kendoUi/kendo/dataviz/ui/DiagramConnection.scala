package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnection extends js.Object {
  var content: js.UndefOr[DiagramConnectionContent] = js.undefined
  var editable: js.UndefOr[Boolean | DiagramConnectionEditable] = js.undefined
  var endCap: js.UndefOr[String | DiagramConnectionEndCap] = js.undefined
  var from: js.UndefOr[String | DiagramConnectionFrom] = js.undefined
  var fromConnector: js.UndefOr[String] = js.undefined
  var hover: js.UndefOr[DiagramConnectionHover] = js.undefined
  var points: js.UndefOr[js.Array[DiagramConnectionPoint]] = js.undefined
  var selection: js.UndefOr[DiagramConnectionSelection] = js.undefined
  var startCap: js.UndefOr[String | DiagramConnectionStartCap] = js.undefined
  var stroke: js.UndefOr[DiagramConnectionStroke] = js.undefined
  var to: js.UndefOr[String | DiagramConnectionTo] = js.undefined
  var toConnector: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DiagramConnection {
  @scala.inline
  def apply(
    content: DiagramConnectionContent = null,
    editable: Boolean | DiagramConnectionEditable = null,
    endCap: String | DiagramConnectionEndCap = null,
    from: String | DiagramConnectionFrom = null,
    fromConnector: String = null,
    hover: DiagramConnectionHover = null,
    points: js.Array[DiagramConnectionPoint] = null,
    selection: DiagramConnectionSelection = null,
    startCap: String | DiagramConnectionStartCap = null,
    stroke: DiagramConnectionStroke = null,
    to: String | DiagramConnectionTo = null,
    toConnector: String = null,
    `type`: String = null
  ): DiagramConnection = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (endCap != null) __obj.updateDynamic("endCap")(endCap.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (fromConnector != null) __obj.updateDynamic("fromConnector")(fromConnector.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (startCap != null) __obj.updateDynamic("startCap")(startCap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (toConnector != null) __obj.updateDynamic("toConnector")(toConnector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnection]
  }
}

