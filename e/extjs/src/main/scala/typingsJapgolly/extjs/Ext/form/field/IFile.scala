package typingsJapgolly.extjs.Ext.form.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.IElement
import typingsJapgolly.extjs.Ext.button.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFile extends ITrigger {
  /** [Property] (Ext.button.Button) */
  var button: js.UndefOr[IButton] = js.undefined
  /** [Config Option] (Object) */
  var buttonConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var buttonMargin: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var buttonOnly: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var buttonText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var clearOnSubmit: js.UndefOr[Boolean] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  @JSName("extractFileInput")
  var extractFileInput_IFile: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  /** [Property] (Ext.Element) */
  var fileInputEl: js.UndefOr[IElement] = js.undefined
  /** [Method] Gets the markup to be inserted into the subTplMarkup  */
  var getTriggerMarkup: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  @JSName("isFileUpload")
  var isFileUpload_IFile: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IFile: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Overridden to do nothing */
  @JSName("setValue")
  var setValue_IFile: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IFile {
  @scala.inline
  def apply(
    ITrigger: ITrigger = null,
    button: IButton = null,
    buttonConfig: js.Any = null,
    buttonMargin: Int | Double = null,
    buttonOnly: js.UndefOr[Boolean] = js.undefined,
    buttonText: String = null,
    clearOnSubmit: js.UndefOr[Boolean] = js.undefined,
    extractFileInput: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    fileInputEl: IElement = null,
    getTriggerMarkup: js.UndefOr[Callback] = js.undefined,
    isFileUpload: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    setValue: js.UndefOr[Callback] = js.undefined
  ): IFile = {
    val __obj = js.Dynamic.literal()
    if (ITrigger != null) js.Dynamic.global.Object.assign(__obj, ITrigger)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttonConfig != null) __obj.updateDynamic("buttonConfig")(buttonConfig.asInstanceOf[js.Any])
    if (buttonMargin != null) __obj.updateDynamic("buttonMargin")(buttonMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonOnly)) __obj.updateDynamic("buttonOnly")(buttonOnly.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnSubmit)) __obj.updateDynamic("clearOnSubmit")(clearOnSubmit.asInstanceOf[js.Any])
    extractFileInput.foreach(p => __obj.updateDynamic("extractFileInput")(p.toJsFn))
    if (fileInputEl != null) __obj.updateDynamic("fileInputEl")(fileInputEl.asInstanceOf[js.Any])
    getTriggerMarkup.foreach(p => __obj.updateDynamic("getTriggerMarkup")(p.toJsFn))
    isFileUpload.foreach(p => __obj.updateDynamic("isFileUpload")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    setValue.foreach(p => __obj.updateDynamic("setValue")(p.toJsFn))
    __obj.asInstanceOf[IFile]
  }
}

