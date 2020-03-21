package typingsJapgolly.extjs.Ext.grid.locking

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.grid.header.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderContainer extends IContainer {
  /** [Method] This is the function which all other column access methods are based upon Return the full column set for the whole Lo
  		* @returns Array
  		*/
  @JSName("getGridColumns")
  var getGridColumns_IHeaderContainer: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th  */
  @JSName("getRefItems")
  var getRefItems_IHeaderContainer: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IHeaderContainer {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    getGridColumns: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getRefItems: js.UndefOr[Callback] = js.undefined
  ): IHeaderContainer = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    getGridColumns.foreach(p => __obj.updateDynamic("getGridColumns")(p.toJsFn))
    getRefItems.foreach(p => __obj.updateDynamic("getRefItems")(p.toJsFn))
    __obj.asInstanceOf[IHeaderContainer]
  }
}

