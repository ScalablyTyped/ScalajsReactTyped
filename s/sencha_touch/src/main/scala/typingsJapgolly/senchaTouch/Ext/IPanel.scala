package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel extends IContainer {
  /** [Config Option] (Number/Boolean/String) */
  var bodyBorder: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/Boolean/String) */
  var bodyMargin: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/Boolean/String) */
  var bodyPadding: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of bodyBorder
  		* @returns Number/Boolean/String
  		*/
  var getBodyBorder: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of bodyMargin
  		* @returns Number/Boolean/String
  		*/
  var getBodyMargin: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of bodyPadding
  		* @returns Number/Boolean/String
  		*/
  var getBodyPadding: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of bodyBorder
  		* @param bodyBorder Number/Boolean/String The new value.
  		*/
  var setBodyBorder: js.UndefOr[js.Function1[/* bodyBorder */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of bodyMargin
  		* @param bodyMargin Number/Boolean/String The new value.
  		*/
  var setBodyMargin: js.UndefOr[js.Function1[/* bodyMargin */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of bodyPadding
  		* @param bodyPadding Number/Boolean/String The new value.
  		*/
  var setBodyPadding: js.UndefOr[js.Function1[/* bodyPadding */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    bodyBorder: js.Any = null,
    bodyMargin: js.Any = null,
    bodyPadding: js.Any = null,
    getBodyBorder: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBodyMargin: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBodyPadding: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    setBodyBorder: /* bodyBorder */ js.UndefOr[js.Any] => Callback = null,
    setBodyMargin: /* bodyMargin */ js.UndefOr[js.Any] => Callback = null,
    setBodyPadding: /* bodyPadding */ js.UndefOr[js.Any] => Callback = null
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (bodyBorder != null) __obj.updateDynamic("bodyBorder")(bodyBorder.asInstanceOf[js.Any])
    if (bodyMargin != null) __obj.updateDynamic("bodyMargin")(bodyMargin.asInstanceOf[js.Any])
    if (bodyPadding != null) __obj.updateDynamic("bodyPadding")(bodyPadding.asInstanceOf[js.Any])
    getBodyBorder.foreach(p => __obj.updateDynamic("getBodyBorder")(p.toJsFn))
    getBodyMargin.foreach(p => __obj.updateDynamic("getBodyMargin")(p.toJsFn))
    getBodyPadding.foreach(p => __obj.updateDynamic("getBodyPadding")(p.toJsFn))
    if (setBodyBorder != null) __obj.updateDynamic("setBodyBorder")(js.Any.fromFunction1((t0: /* bodyBorder */ js.UndefOr[js.Any]) => setBodyBorder(t0).runNow()))
    if (setBodyMargin != null) __obj.updateDynamic("setBodyMargin")(js.Any.fromFunction1((t0: /* bodyMargin */ js.UndefOr[js.Any]) => setBodyMargin(t0).runNow()))
    if (setBodyPadding != null) __obj.updateDynamic("setBodyPadding")(js.Any.fromFunction1((t0: /* bodyPadding */ js.UndefOr[js.Any]) => setBodyPadding(t0).runNow()))
    __obj.asInstanceOf[IPanel]
  }
}

