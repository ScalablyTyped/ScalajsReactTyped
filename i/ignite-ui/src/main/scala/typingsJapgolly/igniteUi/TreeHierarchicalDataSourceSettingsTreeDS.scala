package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeHierarchicalDataSourceSettingsTreeDS
  extends /**
	 * Option for TreeHierarchicalDataSourceSettingsTreeDS
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Property name of the array of child data in a hierarchical data source.
  	 */
  var childDataKey: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies a custom function to be called when requesting data to the server - usually when expanding/collapsing record. If set the function should return the encoded URL. It takes as parameters: data record(type: object), expand - (type: bool).
  	 *
  	 */
  var customEncodeUrlFunc: js.UndefOr[js.Function] = js.undefined
  /**
  	 * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
  	 */
  var dataLevelKey: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies a remote URL as a data source, from which data will be retrieved using an AJAX call ($.ajax)
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies if data is loaded on demand from a remote server. Default is false.
  	 */
  var enableRemoteLoadOnDemand: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
  	 */
  var expandedKey: js.UndefOr[String] = js.undefined
  /**
  	 * Configure datasource filtering settings.
  	 */
  var filtering: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSFiltering] = js.undefined
  /**
  	 * Unique identifier used in a self-referencing flat data source. Used with primaryKey to create a relationship among flat data sources.
  	 */
  var foreignKey: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the depth down to which the tree grid would be expanded upon initial render. To expand all rows set value to -1. Default is -1.
  	 */
  var initialExpandDepth: js.UndefOr[Double] = js.undefined
  /**
  	 * If set to TRUE it is expected that the source of data is normalized and transformed(has set dataLevel and expansion state). The source of data is used as flatDataView. Usually used when the paging is remote and paging mode is allLevels, or features are remote(and the processing of the returned result should be made on the server)
  	 *
  	 */
  var initialFlatDataView: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Configure datasource paging settings.
  	 */
  var paging: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSPaging] = js.undefined
  /**
  	 * If true save expansion states in internal list and send it to the server. Applying to one of the main constraint of the REST architecture  Stateless Interactions - client specific data(like expansion states) should NOT be stored on the server
  	 *
  	 */
  var persistExpansionStates: js.UndefOr[Boolean] = js.undefined
  /**
  	 * *** IMPORTANT DEPRECATED *** Use the dataLevelKey option instead.
  	 * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
  	 */
  var propertyDataLevel: js.UndefOr[String] = js.undefined
  /**
  	 * *** IMPORTANT DEPRECATED *** Use the expandedKey option instead.
  	 * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
  	 */
  var propertyExpanded: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies a custom function to be called when the remote request for data has finished.
  	 */
  var requestDataCallback: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Specifies a custom function to be called when the remote request for data has finished with an error.
  	 */
  var requestDataErrorCallback: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Specifies a custom function to be called when the remote request for data has finished successfully.
  	 */
  var requestDataSuccessCallback: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Configure datasource sorting settings.
  	 */
  var sorting: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSSorting] = js.undefined
}

object TreeHierarchicalDataSourceSettingsTreeDS {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for TreeHierarchicalDataSourceSettingsTreeDS
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    childDataKey: String = null,
    customEncodeUrlFunc: js.Function = null,
    dataLevelKey: String = null,
    dataSourceUrl: String = null,
    enableRemoteLoadOnDemand: js.UndefOr[Boolean] = js.undefined,
    expandedKey: String = null,
    filtering: TreeHierarchicalDataSourceSettingsTreeDSFiltering = null,
    foreignKey: String = null,
    initialExpandDepth: Int | Double = null,
    initialFlatDataView: js.UndefOr[Boolean] = js.undefined,
    paging: TreeHierarchicalDataSourceSettingsTreeDSPaging = null,
    persistExpansionStates: js.UndefOr[Boolean] = js.undefined,
    propertyDataLevel: String = null,
    propertyExpanded: String = null,
    requestDataCallback: js.Function = null,
    requestDataErrorCallback: js.Function = null,
    requestDataSuccessCallback: js.Function = null,
    sorting: TreeHierarchicalDataSourceSettingsTreeDSSorting = null
  ): TreeHierarchicalDataSourceSettingsTreeDS = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (childDataKey != null) __obj.updateDynamic("childDataKey")(childDataKey.asInstanceOf[js.Any])
    if (customEncodeUrlFunc != null) __obj.updateDynamic("customEncodeUrlFunc")(customEncodeUrlFunc.asInstanceOf[js.Any])
    if (dataLevelKey != null) __obj.updateDynamic("dataLevelKey")(dataLevelKey.asInstanceOf[js.Any])
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRemoteLoadOnDemand)) __obj.updateDynamic("enableRemoteLoadOnDemand")(enableRemoteLoadOnDemand.asInstanceOf[js.Any])
    if (expandedKey != null) __obj.updateDynamic("expandedKey")(expandedKey.asInstanceOf[js.Any])
    if (filtering != null) __obj.updateDynamic("filtering")(filtering.asInstanceOf[js.Any])
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (initialExpandDepth != null) __obj.updateDynamic("initialExpandDepth")(initialExpandDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(initialFlatDataView)) __obj.updateDynamic("initialFlatDataView")(initialFlatDataView.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (!js.isUndefined(persistExpansionStates)) __obj.updateDynamic("persistExpansionStates")(persistExpansionStates.asInstanceOf[js.Any])
    if (propertyDataLevel != null) __obj.updateDynamic("propertyDataLevel")(propertyDataLevel.asInstanceOf[js.Any])
    if (propertyExpanded != null) __obj.updateDynamic("propertyExpanded")(propertyExpanded.asInstanceOf[js.Any])
    if (requestDataCallback != null) __obj.updateDynamic("requestDataCallback")(requestDataCallback.asInstanceOf[js.Any])
    if (requestDataErrorCallback != null) __obj.updateDynamic("requestDataErrorCallback")(requestDataErrorCallback.asInstanceOf[js.Any])
    if (requestDataSuccessCallback != null) __obj.updateDynamic("requestDataSuccessCallback")(requestDataSuccessCallback.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDS]
  }
}

