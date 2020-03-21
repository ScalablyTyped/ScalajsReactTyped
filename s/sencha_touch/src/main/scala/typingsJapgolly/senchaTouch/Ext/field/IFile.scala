package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFile extends IField {
  /** [Config Option] (String) */
  var accept: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var capture: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of accept
  		* @returns String
  		*/
  var getAccept: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of capture
  		* @returns String
  		*/
  var getCapture: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of multiple
  		* @returns Boolean
  		*/
  var getMultiple: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the value of accept
  		* @param accept String The new value.
  		*/
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of capture
  		* @param capture String The new value.
  		*/
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of multiple
  		* @param multiple Boolean The new value.
  		*/
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object IFile {
  @scala.inline
  def apply(
    IField: IField = null,
    accept: String = null,
    capture: String = null,
    getAccept: js.UndefOr[CallbackTo[String]] = js.undefined,
    getCapture: js.UndefOr[CallbackTo[String]] = js.undefined,
    getMultiple: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    setAccept: /* accept */ js.UndefOr[String] => Callback = null,
    setCapture: /* capture */ js.UndefOr[String] => Callback = null,
    setMultiple: /* multiple */ js.UndefOr[Boolean] => Callback = null
  ): IFile = {
    val __obj = js.Dynamic.literal()
    if (IField != null) js.Dynamic.global.Object.assign(__obj, IField)
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    getAccept.foreach(p => __obj.updateDynamic("getAccept")(p.toJsFn))
    getCapture.foreach(p => __obj.updateDynamic("getCapture")(p.toJsFn))
    getMultiple.foreach(p => __obj.updateDynamic("getMultiple")(p.toJsFn))
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (setAccept != null) __obj.updateDynamic("setAccept")(js.Any.fromFunction1((t0: /* accept */ js.UndefOr[java.lang.String]) => setAccept(t0).runNow()))
    if (setCapture != null) __obj.updateDynamic("setCapture")(js.Any.fromFunction1((t0: /* capture */ js.UndefOr[java.lang.String]) => setCapture(t0).runNow()))
    if (setMultiple != null) __obj.updateDynamic("setMultiple")(js.Any.fromFunction1((t0: /* multiple */ js.UndefOr[scala.Boolean]) => setMultiple(t0).runNow()))
    __obj.asInstanceOf[IFile]
  }
}

