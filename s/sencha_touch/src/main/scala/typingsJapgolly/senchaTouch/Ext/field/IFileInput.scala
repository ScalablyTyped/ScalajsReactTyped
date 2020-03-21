package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInput extends IInput {
  /** [Method] Updated the capture attribute with the  ink capture configuration
  		* @param value Object
  		*/
  var applyCapture: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns the value of accept
  		* @returns Object
  		*/
  var getAccept: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of capture
  		* @returns Object
  		*/
  var getCapture: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the field files
  		* @returns FileList List of the files selected.
  		*/
  var getFiles: js.UndefOr[js.Function0[FileList]] = js.undefined
  /** [Method] Returns the value of multiple
  		* @returns Boolean
  		*/
  var getMultiple: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the field data value
  		* @returns String value The field value.
  		*/
  @JSName("getValue")
  var getValue_IFileInput: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Function) */
  var me: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of accept
  		* @param accept Object The new value.
  		*/
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of capture
  		* @param capture Object The new value.
  		*/
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of multiple
  		* @param multiple Boolean The new value.
  		*/
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  @JSName("setName")
  var setName_IFileInput: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Called when the multiple property is updated  */
  var updateMultiple: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IFileInput {
  @scala.inline
  def apply(
    IInput: IInput = null,
    applyCapture: /* value */ js.UndefOr[js.Any] => Callback = null,
    getAccept: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getCapture: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getFiles: js.UndefOr[CallbackTo[FileList]] = js.undefined,
    getMultiple: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getValue: js.UndefOr[CallbackTo[String]] = js.undefined,
    me: js.Any = null,
    newValue: js.Any = null,
    setAccept: /* accept */ js.UndefOr[js.Any] => Callback = null,
    setCapture: /* capture */ js.UndefOr[js.Any] => Callback = null,
    setMultiple: /* multiple */ js.UndefOr[Boolean] => Callback = null,
    setName: /* name */ js.UndefOr[js.Any] => Callback = null,
    updateMultiple: js.UndefOr[Callback] = js.undefined
  ): IFileInput = {
    val __obj = js.Dynamic.literal()
    if (IInput != null) js.Dynamic.global.Object.assign(__obj, IInput)
    if (applyCapture != null) __obj.updateDynamic("applyCapture")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => applyCapture(t0).runNow()))
    getAccept.foreach(p => __obj.updateDynamic("getAccept")(p.toJsFn))
    getCapture.foreach(p => __obj.updateDynamic("getCapture")(p.toJsFn))
    getFiles.foreach(p => __obj.updateDynamic("getFiles")(p.toJsFn))
    getMultiple.foreach(p => __obj.updateDynamic("getMultiple")(p.toJsFn))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    if (me != null) __obj.updateDynamic("me")(me.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (setAccept != null) __obj.updateDynamic("setAccept")(js.Any.fromFunction1((t0: /* accept */ js.UndefOr[js.Any]) => setAccept(t0).runNow()))
    if (setCapture != null) __obj.updateDynamic("setCapture")(js.Any.fromFunction1((t0: /* capture */ js.UndefOr[js.Any]) => setCapture(t0).runNow()))
    if (setMultiple != null) __obj.updateDynamic("setMultiple")(js.Any.fromFunction1((t0: /* multiple */ js.UndefOr[scala.Boolean]) => setMultiple(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[js.Any]) => setName(t0).runNow()))
    updateMultiple.foreach(p => __obj.updateDynamic("updateMultiple")(p.toJsFn))
    __obj.asInstanceOf[IFileInput]
  }
}

