package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITitleBar extends IContainer {
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ITitleBar: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of maxButtonWidth
  		* @returns String
  		*/
  var getMaxButtonWidth: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of titleAlign
  		* @returns String
  		*/
  var getTitleAlign: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var maxButtonWidth: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_ITitleBar: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ITitleBar: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of maxButtonWidth
  		* @param maxButtonWidth String The new value.
  		*/
  var setMaxButtonWidth: js.UndefOr[js.Function1[/* maxButtonWidth */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of minHeight
  		* @param minHeight String The new value.
  		*/
  @JSName("setMinHeight")
  var setMinHeight_ITitleBar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of titleAlign
  		* @param titleAlign String The new value.
  		*/
  var setTitleAlign: js.UndefOr[js.Function1[/* titleAlign */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[java.lang.String] = js.undefined
}

object ITitleBar {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    getCls: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getMaxButtonWidth: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getTitleAlign: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    maxButtonWidth: java.lang.String = null,
    minHeight: java.lang.String = null,
    setCls: /* cls */ js.UndefOr[java.lang.String] => Callback = null,
    setMaxButtonWidth: /* maxButtonWidth */ js.UndefOr[java.lang.String] => Callback = null,
    setMinHeight: /* minHeight */ js.UndefOr[java.lang.String] => Callback = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => Callback = null,
    setTitleAlign: /* titleAlign */ js.UndefOr[java.lang.String] => Callback = null,
    title: java.lang.String = null,
    titleAlign: java.lang.String = null
  ): ITitleBar = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    getCls.foreach(p => __obj.updateDynamic("getCls")(p.toJsFn))
    getMaxButtonWidth.foreach(p => __obj.updateDynamic("getMaxButtonWidth")(p.toJsFn))
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    getTitleAlign.foreach(p => __obj.updateDynamic("getTitleAlign")(p.toJsFn))
    if (maxButtonWidth != null) __obj.updateDynamic("maxButtonWidth")(maxButtonWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => setCls(t0).runNow()))
    if (setMaxButtonWidth != null) __obj.updateDynamic("setMaxButtonWidth")(js.Any.fromFunction1((t0: /* maxButtonWidth */ js.UndefOr[java.lang.String]) => setMaxButtonWidth(t0).runNow()))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1((t0: /* minHeight */ js.UndefOr[java.lang.String]) => setMinHeight(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (setTitleAlign != null) __obj.updateDynamic("setTitleAlign")(js.Any.fromFunction1((t0: /* titleAlign */ js.UndefOr[java.lang.String]) => setTitleAlign(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITitleBar]
  }
}

