package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelectorDataSourceOptions
  extends /**
	 * Option for IgPivotDataSelectorDataSourceOptions
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the columns of the data source.
  	 */
  var columns: js.UndefOr[String] = js.undefined
  /**
  	 * A list of hierarchy names separated by comma (,). These will be hierarchies in the filters of the data source.
  	 */
  var filters: js.UndefOr[String] = js.undefined
  /**
  	 * Settings for creating an instance of $.ig.OlapFlatDataSource.
  	 */
  var flatDataOptions: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptions] = js.undefined
  /**
  	 * A list of measure names separated by comma (,). These will be the measures of the data source.
  	 */
  var measures: js.UndefOr[String] = js.undefined
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the rows of the data source.
  	 */
  var rows: js.UndefOr[String] = js.undefined
  /**
  	 * Settings for creating an instance of $.ig.OlapXmlaDataSource.
  	 */
  var xmlaOptions: js.UndefOr[IgPivotDataSelectorDataSourceOptionsXmlaOptions] = js.undefined
}

object IgPivotDataSelectorDataSourceOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotDataSelectorDataSourceOptions
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    columns: String = null,
    filters: String = null,
    flatDataOptions: IgPivotDataSelectorDataSourceOptionsFlatDataOptions = null,
    measures: String = null,
    rows: String = null,
    xmlaOptions: IgPivotDataSelectorDataSourceOptionsXmlaOptions = null
  ): IgPivotDataSelectorDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (flatDataOptions != null) __obj.updateDynamic("flatDataOptions")(flatDataOptions.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (xmlaOptions != null) __obj.updateDynamic("xmlaOptions")(xmlaOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptions]
  }
}

