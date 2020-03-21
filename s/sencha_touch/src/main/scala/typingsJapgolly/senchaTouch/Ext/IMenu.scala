package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenu extends ISheet {
  /** [Method] Only fire the hide event if it is initialized */
  var doSetHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of bottom
  		* @returns Number
  		*/
  @JSName("getBottom")
  var getBottom_IMenu: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of height
  		* @returns String
  		*/
  @JSName("getHeight")
  var getHeight_IMenu: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of left
  		* @returns Number
  		*/
  @JSName("getLeft")
  var getLeft_IMenu: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of right
  		* @returns Number
  		*/
  @JSName("getRight")
  var getRight_IMenu: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of width
  		* @returns String
  		*/
  @JSName("getWidth")
  var getWidth_IMenu: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the value of bottom
  		* @param bottom Number The new value.
  		*/
  @JSName("setBottom")
  var setBottom_IMenu: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of height
  		* @param height String The new value.
  		*/
  @JSName("setHeight")
  var setHeight_IMenu: js.UndefOr[js.Function1[/* height */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of left
  		* @param left Number The new value.
  		*/
  @JSName("setLeft")
  var setLeft_IMenu: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of right
  		* @param right Number The new value.
  		*/
  @JSName("setRight")
  var setRight_IMenu: js.UndefOr[js.Function1[/* right */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of width
  		* @param width String The new value.
  		*/
  @JSName("setWidth")
  var setWidth_IMenu: js.UndefOr[js.Function1[/* width */ js.UndefOr[java.lang.String], Unit]] = js.undefined
}

object IMenu {
  @scala.inline
  def apply(
    ISheet: ISheet = null,
    doSetHidden: js.UndefOr[Callback] = js.undefined,
    getBottom: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getHeight: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getLeft: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getRight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getWidth: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    setBottom: /* bottom */ js.UndefOr[Double] => Callback = null,
    setHeight: /* height */ js.UndefOr[java.lang.String] => Callback = null,
    setLeft: /* left */ js.UndefOr[Double] => Callback = null,
    setRight: /* right */ js.UndefOr[Double] => Callback = null,
    setWidth: /* width */ js.UndefOr[java.lang.String] => Callback = null
  ): IMenu = {
    val __obj = js.Dynamic.literal()
    if (ISheet != null) js.Dynamic.global.Object.assign(__obj, ISheet)
    doSetHidden.foreach(p => __obj.updateDynamic("doSetHidden")(p.toJsFn))
    getBottom.foreach(p => __obj.updateDynamic("getBottom")(p.toJsFn))
    getHeight.foreach(p => __obj.updateDynamic("getHeight")(p.toJsFn))
    getLeft.foreach(p => __obj.updateDynamic("getLeft")(p.toJsFn))
    getRight.foreach(p => __obj.updateDynamic("getRight")(p.toJsFn))
    getWidth.foreach(p => __obj.updateDynamic("getWidth")(p.toJsFn))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1((t0: /* bottom */ js.UndefOr[scala.Double]) => setBottom(t0).runNow()))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[java.lang.String]) => setHeight(t0).runNow()))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1((t0: /* left */ js.UndefOr[scala.Double]) => setLeft(t0).runNow()))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1((t0: /* right */ js.UndefOr[scala.Double]) => setRight(t0).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[java.lang.String]) => setWidth(t0).runNow()))
    __obj.asInstanceOf[IMenu]
  }
}

