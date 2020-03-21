package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLSearch extends js.Object {
  /** This method is used to find and replace all data by workbook in the Spreadsheet.
    * @param {string} Pass the search data.
    * @param {string} Pass the replace data.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with case-sensitive.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with entire cell contents.
    * @returns {void}
    */
  def replaceAllByBook(findData: String, replaceData: String, isCSen: Boolean, isEMatch: Boolean): Unit
  /** This method is used to find and replace all data by sheet in Spreadsheet.
    * @param {string} Pass the search data.
    * @param {string} Pass the replace data.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with case-sensitive.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with entire cell contents.
    * @returns {void}
    */
  def replaceAllBySheet(findData: String, replaceData: String, isCSen: Boolean, isEMatch: Boolean): Unit
}

object XLSearch {
  @scala.inline
  def apply(
    replaceAllByBook: (String, String, Boolean, Boolean) => Callback,
    replaceAllBySheet: (String, String, Boolean, Boolean) => Callback
  ): XLSearch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("replaceAllByBook")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: scala.Boolean, t3: scala.Boolean) => replaceAllByBook(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("replaceAllBySheet")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: scala.Boolean, t3: scala.Boolean) => replaceAllBySheet(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[XLSearch]
  }
}

