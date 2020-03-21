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

/* Inlined std.Required<exceljs.exceljs.TableColumnProperties> */
trait TableColumn extends js.Object {
  var filterButton: Boolean
  var name: String
  var totalsRowFormula: String
  var totalsRowFunction: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom
  var totalsRowLabel: String
}

object TableColumn {
  @scala.inline
  def apply(
    filterButton: Boolean,
    name: String,
    totalsRowFormula: String,
    totalsRowFunction: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom,
    totalsRowLabel: String
  ): TableColumn = {
    val __obj = js.Dynamic.literal(filterButton = filterButton.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], totalsRowFormula = totalsRowFormula.asInstanceOf[js.Any], totalsRowFunction = totalsRowFunction.asInstanceOf[js.Any], totalsRowLabel = totalsRowLabel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableColumn]
  }
}

