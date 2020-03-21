package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridExcelExporterSettingsGridFeatureOptions
  extends /**
	 * Option for GridExcelExporterSettingsGridFeatureOptions
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Indicates whether fixed columns will be applied in the exported table. This is set to none by default, but will change to applied if column fixing feature is defined in the igGrid.
  	 *
  	 *
  	 * Valid values:
  	 * "none" No column fixing will be applied in the excel document.
  	 * "applied" Column fixing will be applied in the excel document.
  	 */
  var columnfixing: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates whether filtering will be applied in the exported table. this is set to none by default, but will change to applied if filtering feature is defined in the igGrid.
  	 *
  	 *
  	 * Valid values:
  	 * "none" No filtering will be applied in the excel document.
  	 * "applied" Filtering will be applied in the excel document.
  	 * "filteredRowsOnly" Filtering will be exported in the excel document.
  	 */
  var filtering: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates whether hidden columns will be removed from the exported table. This is set to none by default, but will change to applied if hiding feature is defined in the igGrid.
  	 *
  	 *
  	 * Valid values:
  	 * "none" All hidden columns will be exported to the excel document.
  	 * "applied" Hidden columns will be exported as hidden in the excel document.
  	 * "visibleColumnsOnly" Only visible columns will be exported.
  	 */
  var hiding: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates whether the rows on the current page or entire data will exported.
  	 *
  	 *
  	 * Valid values:
  	 * "currentPage" Only current page will be exported to the excel document.
  	 * "allRows" All pages will be exported to the excel document.
  	 */
  var paging: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates whether sorting will be applied in the exported table. This is set_ to none by default, but will change to applied if sorting feature is defined in the igGrid.
  	 *
  	 *
  	 * Valid values:
  	 * "none" No sorting will be applied in the excel document.
  	 * "applied" Sorting will be applied in the excel document.
  	 */
  var sorting: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates whether summaries will be added in the exported table. This is set to none by default, but will change to applied if summaries feature is defined in the igGrid.
  	 *
  	 *
  	 * Valid values:
  	 * "none" No summaries will be exported to the excel document.
  	 * "applied" Summaries will be exported to the excel document.
  	 */
  var summaries: js.UndefOr[String] = js.undefined
}

object GridExcelExporterSettingsGridFeatureOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for GridExcelExporterSettingsGridFeatureOptions
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    columnfixing: String = null,
    filtering: String = null,
    hiding: String = null,
    paging: String = null,
    sorting: String = null,
    summaries: String = null
  ): GridExcelExporterSettingsGridFeatureOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnfixing != null) __obj.updateDynamic("columnfixing")(columnfixing.asInstanceOf[js.Any])
    if (filtering != null) __obj.updateDynamic("filtering")(filtering.asInstanceOf[js.Any])
    if (hiding != null) __obj.updateDynamic("hiding")(hiding.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (summaries != null) __obj.updateDynamic("summaries")(summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridExcelExporterSettingsGridFeatureOptions]
  }
}

