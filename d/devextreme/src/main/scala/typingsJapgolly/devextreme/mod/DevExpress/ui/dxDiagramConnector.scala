package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.devextremeStrings.connector
import typingsJapgolly.devextreme.devextremeStrings.shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDiagramConnector extends dxDiagramItem {
  /** Specifies the connector's start node key. */
  var fromKey: js.UndefOr[js.Any] = js.undefined
  /** Specifies the connector's text. */
  var texts: js.UndefOr[js.Array[String]] = js.undefined
  /** Specifies the connector's end node key. */
  var toKey: js.UndefOr[js.Any] = js.undefined
}

object dxDiagramConnector {
  @scala.inline
  def apply(
    dataItem: js.Any = null,
    fromKey: js.Any = null,
    id: String = null,
    itemType: shape | connector = null,
    texts: js.Array[String] = null,
    toKey: js.Any = null
  ): dxDiagramConnector = {
    val __obj = js.Dynamic.literal()
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem.asInstanceOf[js.Any])
    if (fromKey != null) __obj.updateDynamic("fromKey")(fromKey.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (toKey != null) __obj.updateDynamic("toKey")(toKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDiagramConnector]
  }
}

