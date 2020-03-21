package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IText extends IField {
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  /** [Method] Attempts to forcefully blur input focus for the field
  		* @returns Ext.field.Text This field
  		*/
  var blur: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Attempts to set the field as the active input focus
  		* @returns Ext.field.Text This field
  		*/
  var focus: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the value of autoCapitalize
  		* @returns Boolean
  		*/
  var getAutoCapitalize: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of autoComplete
  		* @returns Boolean
  		*/
  var getAutoComplete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of autoCorrect
  		* @returns Boolean
  		*/
  var getAutoCorrect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of maxLength
  		* @returns Number
  		*/
  var getMaxLength: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of placeHolder
  		* @returns String
  		*/
  var getPlaceHolder: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  @JSName("reset")
  var reset_IText: js.UndefOr[js.Function0[IField]] = js.undefined
  /** [Method] Attempts to forcefully select all the contents of the input field
  		* @returns Ext.field.Text this
  		*/
  var select: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Sets the value of autoCapitalize
  		* @param autoCapitalize Boolean The new value.
  		*/
  var setAutoCapitalize: js.UndefOr[js.Function1[/* autoCapitalize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of autoComplete
  		* @param autoComplete Boolean The new value.
  		*/
  var setAutoComplete: js.UndefOr[js.Function1[/* autoComplete */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of autoCorrect
  		* @param autoCorrect Boolean The new value.
  		*/
  var setAutoCorrect: js.UndefOr[js.Function1[/* autoCorrect */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents Array The new value.
  		*/
  @JSName("setBubbleEvents")
  var setBubbleEvents_IText: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of maxLength
  		* @param maxLength Number The new value.
  		*/
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of placeHolder
  		* @param placeHolder String The new value.
  		*/
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Property] (String/Number) */
  var startValue: js.UndefOr[js.Any] = js.undefined
}

object IText {
  @scala.inline
  def apply(
    IField: IField = null,
    autoCapitalize: js.UndefOr[Boolean] = js.undefined,
    autoComplete: js.UndefOr[Boolean] = js.undefined,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    blur: js.UndefOr[CallbackTo[IText]] = js.undefined,
    focus: js.UndefOr[CallbackTo[IText]] = js.undefined,
    getAutoCapitalize: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAutoComplete: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAutoCorrect: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getMaxLength: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getPlaceHolder: js.UndefOr[CallbackTo[String]] = js.undefined,
    getReadOnly: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    maxLength: Int | Double = null,
    placeHolder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reset: js.UndefOr[CallbackTo[IField]] = js.undefined,
    select: js.UndefOr[CallbackTo[IText]] = js.undefined,
    setAutoCapitalize: /* autoCapitalize */ js.UndefOr[Boolean] => Callback = null,
    setAutoComplete: /* autoComplete */ js.UndefOr[Boolean] => Callback = null,
    setAutoCorrect: /* autoCorrect */ js.UndefOr[Boolean] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[Array] => Callback = null,
    setMaxLength: /* maxLength */ js.UndefOr[Double] => Callback = null,
    setPlaceHolder: /* placeHolder */ js.UndefOr[String] => Callback = null,
    setReadOnly: /* readOnly */ js.UndefOr[Boolean] => Callback = null,
    startValue: js.Any = null
  ): IText = {
    val __obj = js.Dynamic.literal()
    if (IField != null) js.Dynamic.global.Object.assign(__obj, IField)
    if (!js.isUndefined(autoCapitalize)) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autoComplete)) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    blur.foreach(p => __obj.updateDynamic("blur")(p.toJsFn))
    focus.foreach(p => __obj.updateDynamic("focus")(p.toJsFn))
    getAutoCapitalize.foreach(p => __obj.updateDynamic("getAutoCapitalize")(p.toJsFn))
    getAutoComplete.foreach(p => __obj.updateDynamic("getAutoComplete")(p.toJsFn))
    getAutoCorrect.foreach(p => __obj.updateDynamic("getAutoCorrect")(p.toJsFn))
    getMaxLength.foreach(p => __obj.updateDynamic("getMaxLength")(p.toJsFn))
    getPlaceHolder.foreach(p => __obj.updateDynamic("getPlaceHolder")(p.toJsFn))
    getReadOnly.foreach(p => __obj.updateDynamic("getReadOnly")(p.toJsFn))
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    select.foreach(p => __obj.updateDynamic("select")(p.toJsFn))
    if (setAutoCapitalize != null) __obj.updateDynamic("setAutoCapitalize")(js.Any.fromFunction1((t0: /* autoCapitalize */ js.UndefOr[scala.Boolean]) => setAutoCapitalize(t0).runNow()))
    if (setAutoComplete != null) __obj.updateDynamic("setAutoComplete")(js.Any.fromFunction1((t0: /* autoComplete */ js.UndefOr[scala.Boolean]) => setAutoComplete(t0).runNow()))
    if (setAutoCorrect != null) __obj.updateDynamic("setAutoCorrect")(js.Any.fromFunction1((t0: /* autoCorrect */ js.UndefOr[scala.Boolean]) => setAutoCorrect(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setBubbleEvents(t0).runNow()))
    if (setMaxLength != null) __obj.updateDynamic("setMaxLength")(js.Any.fromFunction1((t0: /* maxLength */ js.UndefOr[scala.Double]) => setMaxLength(t0).runNow()))
    if (setPlaceHolder != null) __obj.updateDynamic("setPlaceHolder")(js.Any.fromFunction1((t0: /* placeHolder */ js.UndefOr[java.lang.String]) => setPlaceHolder(t0).runNow()))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1((t0: /* readOnly */ js.UndefOr[scala.Boolean]) => setReadOnly(t0).runNow()))
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IText]
  }
}

