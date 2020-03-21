package typingsJapgolly.extjs.Ext.grid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateColumn
  extends typingsJapgolly.extjs.Ext.grid.column.IColumn {
  /** [Method] When defined this will take precedence over the renderer config
  		* @param value Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_IDateColumn: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
}

object IDateColumn {
  @scala.inline
  def apply(
    IColumn: typingsJapgolly.extjs.Ext.grid.column.IColumn = null,
    defaultRenderer: /* value */ js.UndefOr[js.Any] => Callback = null,
    format: String = null
  ): IDateColumn = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => defaultRenderer(t0).runNow()))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateColumn]
  }
}

