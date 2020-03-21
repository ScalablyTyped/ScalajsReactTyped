package typingsJapgolly.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettingsConnectionDataSource extends js.Object {
  /** Specifies the method name which is used to get updated connectors from client side to the server side
    * @Default {null}
    */
  var crudAction: js.UndefOr[DataSourceSettingsConnectionDataSourceCrudAction] = js.undefined
  /** Specifies the custom fields to get the updated data from client side to the server side
    * @Default {[]}
    */
  var customFields: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets the datasource for the connection datasource settings items.
    * @Default {null}
    */
  var dataSource: js.UndefOr[String] = js.undefined
  /** Sets the unique id of the connection data source item
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.undefined
  /** Sets the source node of the connection data source item
    * @Default {null}
    */
  var sourceNode: js.UndefOr[String] = js.undefined
  /** Sets the sourcePointX value of the connection data source item
    * @Default {null}
    */
  var sourcePointX: js.UndefOr[String] = js.undefined
  /** Sets the sourcePointY value of the connection data source item
    * @Default {null}
    */
  var sourcePointY: js.UndefOr[String] = js.undefined
  /** Sets the target node of the connection data source item
    * @Default {null}
    */
  var targetNode: js.UndefOr[String] = js.undefined
  /** Sets the targetPoint-x value of the connection data source item
    * @Default {null}
    */
  var targetPointX: js.UndefOr[String] = js.undefined
  /** Sets the targetPoint-y value of the connection data source item
    * @Default {null}
    */
  var targetPointY: js.UndefOr[String] = js.undefined
}

object DataSourceSettingsConnectionDataSource {
  @scala.inline
  def apply(
    crudAction: DataSourceSettingsConnectionDataSourceCrudAction = null,
    customFields: js.Array[_] = null,
    dataSource: String = null,
    id: String = null,
    sourceNode: String = null,
    sourcePointX: String = null,
    sourcePointY: String = null,
    targetNode: String = null,
    targetPointX: String = null,
    targetPointY: String = null
  ): DataSourceSettingsConnectionDataSource = {
    val __obj = js.Dynamic.literal()
    if (crudAction != null) __obj.updateDynamic("crudAction")(crudAction.asInstanceOf[js.Any])
    if (customFields != null) __obj.updateDynamic("customFields")(customFields.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode.asInstanceOf[js.Any])
    if (sourcePointX != null) __obj.updateDynamic("sourcePointX")(sourcePointX.asInstanceOf[js.Any])
    if (sourcePointY != null) __obj.updateDynamic("sourcePointY")(sourcePointY.asInstanceOf[js.Any])
    if (targetNode != null) __obj.updateDynamic("targetNode")(targetNode.asInstanceOf[js.Any])
    if (targetPointX != null) __obj.updateDynamic("targetPointX")(targetPointX.asInstanceOf[js.Any])
    if (targetPointY != null) __obj.updateDynamic("targetPointY")(targetPointY.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSettingsConnectionDataSource]
  }
}

