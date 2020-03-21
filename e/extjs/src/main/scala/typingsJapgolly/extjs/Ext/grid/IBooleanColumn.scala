package typingsJapgolly.extjs.Ext.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBooleanColumn
  extends typingsJapgolly.extjs.Ext.grid.column.IColumn {
  /** [Config Option] (String) */
  var falseText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var trueText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var undefinedText: js.UndefOr[String] = js.undefined
}

object IBooleanColumn {
  @scala.inline
  def apply(
    IColumn: typingsJapgolly.extjs.Ext.grid.column.IColumn = null,
    falseText: String = null,
    trueText: String = null,
    undefinedText: String = null
  ): IBooleanColumn = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (falseText != null) __obj.updateDynamic("falseText")(falseText.asInstanceOf[js.Any])
    if (trueText != null) __obj.updateDynamic("trueText")(trueText.asInstanceOf[js.Any])
    if (undefinedText != null) __obj.updateDynamic("undefinedText")(undefinedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBooleanColumn]
  }
}

