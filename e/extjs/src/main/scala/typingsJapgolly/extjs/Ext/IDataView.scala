package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.view.IAbstractView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataView extends IAbstractView {
  /** [Method] Un highlights the currently highlighted item if any  */
  var clearHighlight: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Focuses a node in the view
  		* @param rec Ext.data.Model The record associated to the node that is to be focused.
  		*/
  var focusNode: js.UndefOr[js.Function1[/* rec */ js.UndefOr[IModel], Unit]] = js.undefined
  /** [Method] Highlights a given item in the View
  		* @param item HTMLElement The item to highlight
  		*/
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var mouseOverOutBuffer: js.UndefOr[Double] = js.undefined
}

object IDataView {
  @scala.inline
  def apply(
    IAbstractView: IAbstractView = null,
    clearHighlight: js.UndefOr[Callback] = js.undefined,
    focusNode: /* rec */ js.UndefOr[IModel] => Callback = null,
    highlightItem: /* item */ js.UndefOr[HTMLElement] => Callback = null,
    mouseOverOutBuffer: Int | Double = null
  ): IDataView = {
    val __obj = js.Dynamic.literal()
    if (IAbstractView != null) js.Dynamic.global.Object.assign(__obj, IAbstractView)
    clearHighlight.foreach(p => __obj.updateDynamic("clearHighlight")(p.toJsFn))
    if (focusNode != null) __obj.updateDynamic("focusNode")(js.Any.fromFunction1((t0: /* rec */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => focusNode(t0).runNow()))
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => highlightItem(t0).runNow()))
    if (mouseOverOutBuffer != null) __obj.updateDynamic("mouseOverOutBuffer")(mouseOverOutBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataView]
  }
}

