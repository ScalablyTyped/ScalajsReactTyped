package typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyTypes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.EntityReference
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Column
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.EntityRecord
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Filtering
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Linking
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Paging
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.SortStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The structure of a dataset property as it would be passed to a control
		 */
trait DataSet extends js.Object {
  /**
  			 * Adds column to the columnset
  			 * @param name column name to be added to the columnset
  			 * @param entityAlias entity alias for which the column name needs to be added
  			 */
  var addColumn: js.UndefOr[js.Function2[/* name */ String, /* entityAlias */ js.UndefOr[String], Unit]] = js.undefined
  /**
  			 * Set of columns available in this dataset.
  			 */
  var columns: js.Array[Column]
  /**
  			 * True if encountered error while data retrieval
  			 */
  var error: Boolean
  /**
  			 * The error message associated with the last encountered error, if applicable
  			 */
  var errorMessage: String
  /**
  			 * The column filtering for the current query.
  			 */
  var filtering: Filtering
  /**
  			 * Related entity info
  			 */
  var linking: Linking
  /**
  			 * Indicate if the dataset property is in loading state or not
  			 */
  var loading: Boolean
  /**
  			 * Pagination status and actions.
  			 */
  var paging: Paging
  /**
  			 * Map of IDs to the full record object
  			 */
  var records: StringDictionary[EntityRecord]
  /**
  			 * IDs of the records in the dataset, order by the query response result
  			 */
  var sortedRecordIds: js.Array[String]
  /**
  			 * The sorting status for the current query.
  			 */
  var sorting: js.Array[SortStatus]
  /**
  			 * Clear selected record ids list
  			 */
  def clearSelectedRecordIds(): Unit
  /**
  			 * Retrieves all selected record ids
  			 */
  def getSelectedRecordIds(): js.Array[String]
  /**
  			 * Get DataSet target entity logical name
  			 */
  def getTargetEntityType(): String
  /**
  			 * Retrieves the view display name used by the dataset property
  			 */
  def getTitle(): String
  /**
  			 * Gets Id of view used by the dataset property
  			 */
  def getViewId(): String
  /**
  			 * Open dataSet item for a given EntityReference. It will check if there is a command with command button id "Mscrm.OpenRecordItem".
  			 * If there is, it will execute the command, otherwise it will just navigate to the associated form of the entityReference
  			 * @param entityReference entity reference
  			 */
  def openDatasetItem(entityReference: EntityReference): Unit
  /**
  			 * Refreshes the dataset based on filters, sorting, linking, new column. New data will be pushed to control in another 'updateView' cycle.
  			 */
  def refresh(): Unit
  /**
  			 * Set the ids of the selected records
  			 * @ids List of recordId's
  			 */
  def setSelectedRecordIds(ids: js.Array[String]): Unit
}

object DataSet {
  @scala.inline
  def apply(
    clearSelectedRecordIds: Callback,
    columns: js.Array[Column],
    error: Boolean,
    errorMessage: String,
    filtering: Filtering,
    getSelectedRecordIds: CallbackTo[js.Array[String]],
    getTargetEntityType: CallbackTo[String],
    getTitle: CallbackTo[String],
    getViewId: CallbackTo[String],
    linking: Linking,
    loading: Boolean,
    openDatasetItem: EntityReference => Callback,
    paging: Paging,
    records: StringDictionary[EntityRecord],
    refresh: Callback,
    setSelectedRecordIds: js.Array[String] => Callback,
    sortedRecordIds: js.Array[String],
    sorting: js.Array[SortStatus],
    addColumn: (/* name */ String, /* entityAlias */ js.UndefOr[String]) => Callback = null
  ): DataSet = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], filtering = filtering.asInstanceOf[js.Any], linking = linking.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], paging = paging.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], sortedRecordIds = sortedRecordIds.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any])
    __obj.updateDynamic("clearSelectedRecordIds")(clearSelectedRecordIds.toJsFn)
    __obj.updateDynamic("getSelectedRecordIds")(getSelectedRecordIds.toJsFn)
    __obj.updateDynamic("getTargetEntityType")(getTargetEntityType.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getViewId")(getViewId.toJsFn)
    __obj.updateDynamic("openDatasetItem")(js.Any.fromFunction1((t0: typingsJapgolly.powerappsComponentFramework.ComponentFramework.EntityReference) => openDatasetItem(t0).runNow()))
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.updateDynamic("setSelectedRecordIds")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => setSelectedRecordIds(t0).runNow()))
    if (addColumn != null) __obj.updateDynamic("addColumn")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* entityAlias */ js.UndefOr[java.lang.String]) => addColumn(t0, t1).runNow()))
    __obj.asInstanceOf[DataSet]
  }
}

