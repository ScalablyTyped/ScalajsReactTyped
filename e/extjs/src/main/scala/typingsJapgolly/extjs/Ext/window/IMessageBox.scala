package typingsJapgolly.extjs.Ext.window

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageBox extends IWindow {
  /** [Property] (Number) */
  var CANCEL: js.UndefOr[Double] = js.undefined
  /** [Property] (String) */
  var ERROR: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var INFO: js.UndefOr[String] = js.undefined
  /** [Property] (Number) */
  var NO: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var OK: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var OKCANCEL: js.UndefOr[Double] = js.undefined
  /** [Property] (String) */
  var QUESTION: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var WARNING: js.UndefOr[String] = js.undefined
  /** [Property] (Number) */
  var YES: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var YESNO: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var YESNOCANCEL: js.UndefOr[Double] = js.undefined
  /** [Method] Displays a standard read only message box with an OK button comparable to the basic JavaScript alert prompt
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param fn Function The callback function invoked after the message box is closed. See show method for details.
  		* @param scope Object The scope (this reference) in which the callback is executed.
  		* @returns Ext.window.MessageBox this
  		*/
  var alert: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var buttonText: js.UndefOr[js.Any] = js.undefined
  /** [Method] Displays a confirmation message box with Yes and No buttons comparable to JavaScript s confirm
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param fn Function The callback function invoked after the message box is closed. See show method for details.
  		* @param scope Object The scope (this reference) in which the callback is executed.
  		* @returns Ext.window.MessageBox this
  		*/
  var confirm: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Property] (Number) */
  var defaultTextHeight: js.UndefOr[Double] = js.undefined
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @returns Ext.Component this
  		*/
  @JSName("hide")
  var hide_IMessageBox: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Property] (Number) */
  var minProgressWidth: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var minPromptWidth: js.UndefOr[Double] = js.undefined
  /** [Method] Displays a message box with a progress bar
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param progressText String The text to display inside the progress bar
  		* @returns Ext.window.MessageBox this
  		*/
  var progress: js.UndefOr[
    js.Function3[
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* progressText */ js.UndefOr[String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Displays a message box with OK and Cancel buttons prompting the user to enter some text comparable to JavaScript s p
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param fn Function The callback function invoked after the message box is closed. See show method for details.
  		* @param scope Object The scope (this reference) in which the callback is executed.
  		* @param multiline Boolean/Number True to create a multiline textbox using the defaultTextHeight property, or the height in pixels to create the textbox/
  		* @param value String Default value of the text input element
  		* @returns Ext.window.MessageBox this
  		*/
  var prompt: js.UndefOr[
    js.Function6[
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* multiline */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Adds the specified icon to the dialog
  		* @param icon String A CSS classname specifying the icon's background image url, or empty string to clear the icon
  		* @param width Number The width of the icon. If not specified, the default is used
  		* @param height Number The height of the icon. If not specified, the default is used
  		* @returns Ext.window.MessageBox this
  		*/
  @JSName("setIcon")
  var setIcon_IMessageBox: js.UndefOr[
    js.Function3[
      /* icon */ js.UndefOr[String], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Displays a new message box or reinitializes an existing message box based on the config options passed in
  		* @param config Object The following config options are supported:
  		* @returns Ext.window.MessageBox this
  		*/
  @JSName("show")
  var show_IMessageBox: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Updates a progress style message box s text and progress bar
  		* @param value Number Any number between 0 and 1 (e.g., .5)
  		* @param progressText String The progress text to display inside the progress bar.
  		* @param msg String The message box's body text is replaced with the specified string (defaults to undefined so that any existing body text will not get overwritten by default unless a new value is passed in)
  		* @returns Ext.window.MessageBox this
  		*/
  var updateProgress: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[Double], 
      /* progressText */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Displays a message box with an infinitely auto updating progress bar
  		* @param msg String The message box body text
  		* @param title String The title bar text
  		* @param config Object A Ext.ProgressBar.wait config object
  		* @returns Ext.window.MessageBox this
  		*/
  @JSName("wait")
  var wait_FIMessageBox: js.UndefOr[
    js.Function3[
      /* msg */ js.UndefOr[String], 
      /* title */ js.UndefOr[String], 
      /* config */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
}

object IMessageBox {
  @scala.inline
  def apply(
    CANCEL: Int | Double = null,
    ERROR: String = null,
    INFO: String = null,
    IWindow: IWindow = null,
    NO: Int | Double = null,
    OK: Int | Double = null,
    OKCANCEL: Int | Double = null,
    QUESTION: String = null,
    WARNING: String = null,
    YES: Int | Double = null,
    YESNO: Int | Double = null,
    YESNOCANCEL: Int | Double = null,
    alert: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IMessageBox] = null,
    buttonText: js.Any = null,
    confirm: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IMessageBox] = null,
    defaultTextHeight: Int | Double = null,
    hide: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    minProgressWidth: Int | Double = null,
    minPromptWidth: Int | Double = null,
    progress: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* progressText */ js.UndefOr[String]) => CallbackTo[IMessageBox] = null,
    prompt: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* multiline */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => CallbackTo[IMessageBox] = null,
    setIcon: (/* icon */ js.UndefOr[String], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => CallbackTo[IMessageBox] = null,
    show: /* config */ js.UndefOr[js.Any] => CallbackTo[IMessageBox] = null,
    updateProgress: (/* value */ js.UndefOr[Double], /* progressText */ js.UndefOr[String], /* msg */ js.UndefOr[String]) => CallbackTo[IMessageBox] = null,
    wait: (/* msg */ js.UndefOr[String], /* title */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => CallbackTo[IMessageBox] = null
  ): IMessageBox = {
    val __obj = js.Dynamic.literal()
    if (CANCEL != null) __obj.updateDynamic("CANCEL")(CANCEL.asInstanceOf[js.Any])
    if (ERROR != null) __obj.updateDynamic("ERROR")(ERROR.asInstanceOf[js.Any])
    if (INFO != null) __obj.updateDynamic("INFO")(INFO.asInstanceOf[js.Any])
    if (IWindow != null) js.Dynamic.global.Object.assign(__obj, IWindow)
    if (NO != null) __obj.updateDynamic("NO")(NO.asInstanceOf[js.Any])
    if (OK != null) __obj.updateDynamic("OK")(OK.asInstanceOf[js.Any])
    if (OKCANCEL != null) __obj.updateDynamic("OKCANCEL")(OKCANCEL.asInstanceOf[js.Any])
    if (QUESTION != null) __obj.updateDynamic("QUESTION")(QUESTION.asInstanceOf[js.Any])
    if (WARNING != null) __obj.updateDynamic("WARNING")(WARNING.asInstanceOf[js.Any])
    if (YES != null) __obj.updateDynamic("YES")(YES.asInstanceOf[js.Any])
    if (YESNO != null) __obj.updateDynamic("YESNO")(YESNO.asInstanceOf[js.Any])
    if (YESNOCANCEL != null) __obj.updateDynamic("YESNOCANCEL")(YESNOCANCEL.asInstanceOf[js.Any])
    if (alert != null) __obj.updateDynamic("alert")(js.Any.fromFunction4((t0: /* title */ js.UndefOr[java.lang.String], t1: /* msg */ js.UndefOr[java.lang.String], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => alert(t0, t1, t2, t3).runNow()))
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (confirm != null) __obj.updateDynamic("confirm")(js.Any.fromFunction4((t0: /* title */ js.UndefOr[java.lang.String], t1: /* msg */ js.UndefOr[java.lang.String], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => confirm(t0, t1, t2, t3).runNow()))
    if (defaultTextHeight != null) __obj.updateDynamic("defaultTextHeight")(defaultTextHeight.asInstanceOf[js.Any])
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (minProgressWidth != null) __obj.updateDynamic("minProgressWidth")(minProgressWidth.asInstanceOf[js.Any])
    if (minPromptWidth != null) __obj.updateDynamic("minPromptWidth")(minPromptWidth.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction3((t0: /* title */ js.UndefOr[java.lang.String], t1: /* msg */ js.UndefOr[java.lang.String], t2: /* progressText */ js.UndefOr[java.lang.String]) => progress(t0, t1, t2).runNow()))
    if (prompt != null) __obj.updateDynamic("prompt")(js.Any.fromFunction6((t0: /* title */ js.UndefOr[java.lang.String], t1: /* msg */ js.UndefOr[java.lang.String], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* multiline */ js.UndefOr[js.Any], t5: /* value */ js.UndefOr[java.lang.String]) => prompt(t0, t1, t2, t3, t4, t5).runNow()))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction3((t0: /* icon */ js.UndefOr[java.lang.String], t1: /* width */ js.UndefOr[scala.Double], t2: /* height */ js.UndefOr[scala.Double]) => setIcon(t0, t1, t2).runNow()))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => show(t0).runNow()))
    if (updateProgress != null) __obj.updateDynamic("updateProgress")(js.Any.fromFunction3((t0: /* value */ js.UndefOr[scala.Double], t1: /* progressText */ js.UndefOr[java.lang.String], t2: /* msg */ js.UndefOr[java.lang.String]) => updateProgress(t0, t1, t2).runNow()))
    if (wait != null) __obj.updateDynamic("wait")(js.Any.fromFunction3((t0: /* msg */ js.UndefOr[java.lang.String], t1: /* title */ js.UndefOr[java.lang.String], t2: /* config */ js.UndefOr[js.Any]) => wait(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IMessageBox]
  }
}

