package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.exceljsStrings.`var`
import typingsJapgolly.exceljs.exceljsStrings.average
import typingsJapgolly.exceljs.exceljsStrings.count
import typingsJapgolly.exceljs.exceljsStrings.countNums
import typingsJapgolly.exceljs.exceljsStrings.custom
import typingsJapgolly.exceljs.exceljsStrings.max
import typingsJapgolly.exceljs.exceljsStrings.min
import typingsJapgolly.exceljs.exceljsStrings.none_
import typingsJapgolly.exceljs.exceljsStrings.stdDev
import typingsJapgolly.exceljs.exceljsStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumnProperties extends js.Object {
  /**
  	  * Switches the filter control in the header
  	  * @default false
  	  */
  var filterButton: js.UndefOr[Boolean] = js.undefined
  /**
  	  * The name of the column, also used in the header
  	  */
  var name: String
  /**
  	  * Optional formula for custom functions
  	  */
  var totalsRowFormula: js.UndefOr[String] = js.undefined
  /**
  	  * Name of the totals function
  	  * @default 'none'
  	  */
  var totalsRowFunction: js.UndefOr[none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom] = js.undefined
  /**
  	  * Label to describe the totals row (first column)
  	  * @default 'Total'
  	  */
  var totalsRowLabel: js.UndefOr[String] = js.undefined
}

object TableColumnProperties {
  @scala.inline
  def apply(
    name: String,
    filterButton: js.UndefOr[Boolean] = js.undefined,
    totalsRowFormula: String = null,
    totalsRowFunction: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom = null,
    totalsRowLabel: String = null
  ): TableColumnProperties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(filterButton)) __obj.updateDynamic("filterButton")(filterButton.asInstanceOf[js.Any])
    if (totalsRowFormula != null) __obj.updateDynamic("totalsRowFormula")(totalsRowFormula.asInstanceOf[js.Any])
    if (totalsRowFunction != null) __obj.updateDynamic("totalsRowFunction")(totalsRowFunction.asInstanceOf[js.Any])
    if (totalsRowLabel != null) __obj.updateDynamic("totalsRowLabel")(totalsRowLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnProperties]
  }
}

