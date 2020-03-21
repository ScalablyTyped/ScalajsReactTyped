package typingsJapgolly.senchaTouch.Ext.dataview.component

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListItem extends IDataItem {
  /** [Method] Returns the value of body
  		* @returns Object
  		*/
  var getBody: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of disclosure
  		* @returns Object
  		*/
  var getDisclosure: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of header
  		* @returns Object
  		*/
  var getHeader: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of body
  		* @param body Object The new value.
  		*/
  var setBody: js.UndefOr[js.Function1[/* body */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of disclosure
  		* @param disclosure Object The new value.
  		*/
  var setDisclosure: js.UndefOr[js.Function1[/* disclosure */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of header
  		* @param header Object The new value.
  		*/
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IListItem {
  @scala.inline
  def apply(
    IDataItem: IDataItem = null,
    getBody: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDisclosure: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getHeader: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    setBody: /* body */ js.UndefOr[js.Any] => Callback = null,
    setDisclosure: /* disclosure */ js.UndefOr[js.Any] => Callback = null,
    setHeader: /* header */ js.UndefOr[js.Any] => Callback = null
  ): IListItem = {
    val __obj = js.Dynamic.literal()
    if (IDataItem != null) js.Dynamic.global.Object.assign(__obj, IDataItem)
    getBody.foreach(p => __obj.updateDynamic("getBody")(p.toJsFn))
    getDisclosure.foreach(p => __obj.updateDynamic("getDisclosure")(p.toJsFn))
    getHeader.foreach(p => __obj.updateDynamic("getHeader")(p.toJsFn))
    if (setBody != null) __obj.updateDynamic("setBody")(js.Any.fromFunction1((t0: /* body */ js.UndefOr[js.Any]) => setBody(t0).runNow()))
    if (setDisclosure != null) __obj.updateDynamic("setDisclosure")(js.Any.fromFunction1((t0: /* disclosure */ js.UndefOr[js.Any]) => setDisclosure(t0).runNow()))
    if (setHeader != null) __obj.updateDynamic("setHeader")(js.Any.fromFunction1((t0: /* header */ js.UndefOr[js.Any]) => setHeader(t0).runNow()))
    __obj.asInstanceOf[IListItem]
  }
}

