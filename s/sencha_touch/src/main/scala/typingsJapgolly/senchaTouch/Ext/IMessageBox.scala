package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageBox extends ISheet {
  /** [Method] Displays a standard read only message box with an OK button comparable to the basic JavaScript alert prompt
  		* @param title String The title bar text.
  		* @param message String The message box body text.
  		* @param fn Function A callback function which is called when the dialog is dismissed by clicking on the configured buttons.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to: the browser window
  		* @returns Ext.MessageBox this
  		*/
  var alert: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* message */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Config Option] (Array/Object) */
  var buttons: js.UndefOr[js.Any] = js.undefined
  /** [Method] Displays a confirmation message box with Yes and No buttons comparable to JavaScript s confirm
  		* @param title String The title bar text.
  		* @param message String The message box body text.
  		* @param fn Function A callback function which is called when the dialog is dismissed by clicking on the configured buttons.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to: the browser window
  		* @returns Ext.MessageBox this
  		*/
  var confirm: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* message */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var defaultTextHeight: js.UndefOr[Double] = js.undefined
  /** [Method] Returns the value of buttons
  		* @returns Array/Object
  		*/
  var getButtons: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultTextHeight
  		* @returns Number
  		*/
  var getDefaultTextHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of prompt
  		* @returns Object
  		*/
  var getPrompt: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var msg: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var prompt: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of buttons
  		* @param buttons Array/Object The new value.
  		*/
  var setButtons: js.UndefOr[js.Function1[/* buttons */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of defaultTextHeight
  		* @param defaultTextHeight Number The new value.
  		*/
  var setDefaultTextHeight: js.UndefOr[js.Function1[/* defaultTextHeight */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets icon
  		* @param iconCls String A CSS class name or empty string to clear the icon.
  		* @returns Ext.MessageBox this
  		*/
  var setIcon: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Method] Sets the value of iconCls
  		* @param iconCls String The new value.
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of prompt
  		* @param prompt Object The new value.
  		*/
  var setPrompt: js.UndefOr[js.Function1[/* prompt */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		* @returns Ext.MessageBox this
  		*/
  var updateText: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], this.type]] = js.undefined
}

object IMessageBox {
  @scala.inline
  def apply(
    ISheet: ISheet = null,
    alert: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IMessageBox] = null,
    buttons: js.Any = null,
    confirm: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IMessageBox] = null,
    defaultTextHeight: Int | Double = null,
    getButtons: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDefaultTextHeight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getLayout: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getPrompt: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    icon: java.lang.String = null,
    iconCls: java.lang.String = null,
    message: java.lang.String = null,
    msg: java.lang.String = null,
    prompt: js.Any = null,
    setButtons: /* buttons */ js.UndefOr[js.Any] => Callback = null,
    setDefaultTextHeight: /* defaultTextHeight */ js.UndefOr[Double] => Callback = null,
    setIcon: /* iconCls */ js.UndefOr[java.lang.String] => CallbackTo[IMessageBox] = null,
    setIconCls: /* iconCls */ js.UndefOr[java.lang.String] => Callback = null,
    setMessage: /* message */ js.UndefOr[java.lang.String] => Callback = null,
    setPrompt: /* prompt */ js.UndefOr[js.Any] => Callback = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => Callback = null,
    title: java.lang.String = null,
    updateText: /* message */ js.UndefOr[java.lang.String] => CallbackTo[IMessageBox] = null
  ): IMessageBox = {
    val __obj = js.Dynamic.literal()
    if (ISheet != null) js.Dynamic.global.Object.assign(__obj, ISheet)
    if (alert != null) __obj.updateDynamic("alert")(js.Any.fromFunction4((t0: /* title */ js.UndefOr[java.lang.String], t1: /* message */ js.UndefOr[java.lang.String], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => alert(t0, t1, t2, t3).runNow()))
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (confirm != null) __obj.updateDynamic("confirm")(js.Any.fromFunction4((t0: /* title */ js.UndefOr[java.lang.String], t1: /* message */ js.UndefOr[java.lang.String], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => confirm(t0, t1, t2, t3).runNow()))
    if (defaultTextHeight != null) __obj.updateDynamic("defaultTextHeight")(defaultTextHeight.asInstanceOf[js.Any])
    getButtons.foreach(p => __obj.updateDynamic("getButtons")(p.toJsFn))
    getDefaultTextHeight.foreach(p => __obj.updateDynamic("getDefaultTextHeight")(p.toJsFn))
    getLayout.foreach(p => __obj.updateDynamic("getLayout")(p.toJsFn))
    getPrompt.foreach(p => __obj.updateDynamic("getPrompt")(p.toJsFn))
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (setButtons != null) __obj.updateDynamic("setButtons")(js.Any.fromFunction1((t0: /* buttons */ js.UndefOr[js.Any]) => setButtons(t0).runNow()))
    if (setDefaultTextHeight != null) __obj.updateDynamic("setDefaultTextHeight")(js.Any.fromFunction1((t0: /* defaultTextHeight */ js.UndefOr[scala.Double]) => setDefaultTextHeight(t0).runNow()))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1((t0: /* iconCls */ js.UndefOr[java.lang.String]) => setIcon(t0).runNow()))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1((t0: /* iconCls */ js.UndefOr[java.lang.String]) => setIconCls(t0).runNow()))
    if (setMessage != null) __obj.updateDynamic("setMessage")(js.Any.fromFunction1((t0: /* message */ js.UndefOr[java.lang.String]) => setMessage(t0).runNow()))
    if (setPrompt != null) __obj.updateDynamic("setPrompt")(js.Any.fromFunction1((t0: /* prompt */ js.UndefOr[js.Any]) => setPrompt(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateText != null) __obj.updateDynamic("updateText")(js.Any.fromFunction1((t0: /* message */ js.UndefOr[java.lang.String]) => updateText(t0).runNow()))
    __obj.asInstanceOf[IMessageBox]
  }
}

