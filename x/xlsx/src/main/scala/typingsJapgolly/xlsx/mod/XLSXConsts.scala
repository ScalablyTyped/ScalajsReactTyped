package typingsJapgolly.xlsx.mod

import typingsJapgolly.xlsx.xlsxNumbers.`0`
import typingsJapgolly.xlsx.xlsxNumbers.`1`
import typingsJapgolly.xlsx.xlsxNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLSXConsts extends js.Object {
  /** Visibility: Hidden */
  var SHEET_HIDDEN: `1`
  /** Visibility: Very Hidden */
  var SHEET_VERYHIDDEN: `2`
  /* --- Sheet Visibility --- */
  /** Visibility: Visible */
  var SHEET_VISIBLE: `0`
}

object XLSXConsts {
  @scala.inline
  def apply(SHEET_HIDDEN: `1`, SHEET_VERYHIDDEN: `2`, SHEET_VISIBLE: `0`): XLSXConsts = {
    val __obj = js.Dynamic.literal(SHEET_HIDDEN = SHEET_HIDDEN.asInstanceOf[js.Any], SHEET_VERYHIDDEN = SHEET_VERYHIDDEN.asInstanceOf[js.Any], SHEET_VISIBLE = SHEET_VISIBLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XLSXConsts]
  }
}

