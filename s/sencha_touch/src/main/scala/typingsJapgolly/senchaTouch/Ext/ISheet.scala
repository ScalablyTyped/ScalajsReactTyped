package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISheet extends IPanel {
  /** [Config Option] (String) */
  var enter: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var exit: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of enter
  		* @returns String
  		*/
  var getEnter: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of exit
  		* @returns String
  		*/
  var getExit: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of stretchX
  		* @returns Boolean
  		*/
  var getStretchX: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of stretchY
  		* @returns Boolean
  		*/
  var getStretchY: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Sets the value of enter
  		* @param enter String The new value.
  		*/
  var setEnter: js.UndefOr[js.Function1[/* enter */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of exit
  		* @param exit String The new value.
  		*/
  var setExit: js.UndefOr[js.Function1[/* exit */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of stretchX
  		* @param stretchX Boolean The new value.
  		*/
  var setStretchX: js.UndefOr[js.Function1[/* stretchX */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of stretchY
  		* @param stretchY Boolean The new value.
  		*/
  var setStretchY: js.UndefOr[js.Function1[/* stretchY */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var stretchX: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var stretchY: js.UndefOr[Boolean] = js.undefined
}

object ISheet {
  @scala.inline
  def apply(
    IPanel: IPanel = null,
    enter: java.lang.String = null,
    exit: java.lang.String = null,
    getEnter: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getExit: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getStretchX: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getStretchY: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    setEnter: /* enter */ js.UndefOr[java.lang.String] => Callback = null,
    setExit: /* exit */ js.UndefOr[java.lang.String] => Callback = null,
    setStretchX: /* stretchX */ js.UndefOr[Boolean] => Callback = null,
    setStretchY: /* stretchY */ js.UndefOr[Boolean] => Callback = null,
    stretchX: js.UndefOr[Boolean] = js.undefined,
    stretchY: js.UndefOr[Boolean] = js.undefined
  ): ISheet = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    getEnter.foreach(p => __obj.updateDynamic("getEnter")(p.toJsFn))
    getExit.foreach(p => __obj.updateDynamic("getExit")(p.toJsFn))
    getStretchX.foreach(p => __obj.updateDynamic("getStretchX")(p.toJsFn))
    getStretchY.foreach(p => __obj.updateDynamic("getStretchY")(p.toJsFn))
    if (setEnter != null) __obj.updateDynamic("setEnter")(js.Any.fromFunction1((t0: /* enter */ js.UndefOr[java.lang.String]) => setEnter(t0).runNow()))
    if (setExit != null) __obj.updateDynamic("setExit")(js.Any.fromFunction1((t0: /* exit */ js.UndefOr[java.lang.String]) => setExit(t0).runNow()))
    if (setStretchX != null) __obj.updateDynamic("setStretchX")(js.Any.fromFunction1((t0: /* stretchX */ js.UndefOr[scala.Boolean]) => setStretchX(t0).runNow()))
    if (setStretchY != null) __obj.updateDynamic("setStretchY")(js.Any.fromFunction1((t0: /* stretchY */ js.UndefOr[scala.Boolean]) => setStretchY(t0).runNow()))
    if (!js.isUndefined(stretchX)) __obj.updateDynamic("stretchX")(stretchX.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchY)) __obj.updateDynamic("stretchY")(stretchY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISheet]
  }
}

