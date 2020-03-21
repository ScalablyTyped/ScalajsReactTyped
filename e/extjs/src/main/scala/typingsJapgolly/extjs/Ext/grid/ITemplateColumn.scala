package typingsJapgolly.extjs.Ext.grid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplateColumn
  extends typingsJapgolly.extjs.Ext.grid.column.IColumn {
  /** [Method] When defined this will take precedence over the renderer config
  		* @param value Object
  		* @param meta Object
  		* @param record Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_ITemplateColumn: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object ITemplateColumn {
  @scala.inline
  def apply(
    IColumn: typingsJapgolly.extjs.Ext.grid.column.IColumn = null,
    defaultRenderer: (/* value */ js.UndefOr[js.Any], /* meta */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any]) => Callback = null
  ): ITemplateColumn = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(js.Any.fromFunction3((t0: /* value */ js.UndefOr[js.Any], t1: /* meta */ js.UndefOr[js.Any], t2: /* record */ js.UndefOr[js.Any]) => defaultRenderer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ITemplateColumn]
  }
}

