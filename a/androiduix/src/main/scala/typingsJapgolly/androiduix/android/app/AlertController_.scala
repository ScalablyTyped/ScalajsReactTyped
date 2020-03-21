package typingsJapgolly.androiduix.android.app

import typingsJapgolly.androiduix.android.content.Context
import typingsJapgolly.androiduix.android.content.DialogInterface
import typingsJapgolly.androiduix.android.graphics.drawable.Drawable
import typingsJapgolly.androiduix.android.os.Message
import typingsJapgolly.androiduix.android.view.KeyEvent
import typingsJapgolly.androiduix.android.view.View
import typingsJapgolly.androiduix.android.view.View.OnClickListener
import typingsJapgolly.androiduix.android.view.Window
import typingsJapgolly.androiduix.android.widget.Button
import typingsJapgolly.androiduix.android.widget.ListView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.AlertController")
@js.native
class AlertController_ protected () extends js.Object {
  def this(context: Context, di: DialogInterface, window: Window) = this()
  var mAdapter: js.Any = js.native
  var mAlertDialogLayout: js.Any = js.native
  var mButtonHandler: OnClickListener = js.native
  var mButtonNegative: js.Any = js.native
  var mButtonNegativeMessage: js.Any = js.native
  var mButtonNegativeText: js.Any = js.native
  var mButtonNeutral: js.Any = js.native
  var mButtonNeutralMessage: js.Any = js.native
  var mButtonNeutralText: js.Any = js.native
  var mButtonPositive: js.Any = js.native
  var mButtonPositiveMessage: js.Any = js.native
  var mButtonPositiveText: js.Any = js.native
  var mCheckedItem: js.Any = js.native
  var mContext: js.Any = js.native
  var mCustomTitleView: js.Any = js.native
  var mDialogInterface: js.Any = js.native
  var mForceInverseBackground: js.Any = js.native
  var mHandler: js.Any = js.native
  var mIcon: js.Any = js.native
  var mIconView: js.Any = js.native
  var mListItemLayout: js.Any = js.native
  var mListLayout: js.Any = js.native
  var mListView: js.Any = js.native
  var mMessage: js.Any = js.native
  var mMessageView: js.Any = js.native
  var mMultiChoiceItemLayout: js.Any = js.native
  var mScrollView: js.Any = js.native
  var mSingleChoiceItemLayout: js.Any = js.native
  var mTitle: js.Any = js.native
  var mTitleView: js.Any = js.native
  var mView: js.Any = js.native
  var mViewSpacingBottom: js.Any = js.native
  var mViewSpacingLeft: js.Any = js.native
  var mViewSpacingRight: js.Any = js.native
  var mViewSpacingSpecified: js.Any = js.native
  var mViewSpacingTop: js.Any = js.native
  var mWindow: js.Any = js.native
  /* private */ def centerButton(button: js.Any): js.Any = js.native
  def getButton(whichButton: Double): Button = js.native
  def getListView(): ListView = js.native
  def installContent(): Unit = js.native
  def onKeyDown(keyCode: Double, event: KeyEvent): Boolean = js.native
  def onKeyUp(keyCode: Double, event: KeyEvent): Boolean = js.native
  /* private */ def setBackground(
    topPanel: js.Any,
    contentPanel: js.Any,
    customPanel: js.Any,
    hasButtons: js.Any,
    hasTitle: js.Any,
    buttonPanel: js.Any
  ): js.Any = js.native
  def setButton(
    whichButton: Double,
    text: String,
    listener: typingsJapgolly.androiduix.android.content.DialogInterface.OnClickListener,
    msg: Message
  ): Unit = js.native
  def setCustomTitle(customTitleView: View): Unit = js.native
  def setIcon(icon: Drawable): Unit = js.native
  def setInverseBackgroundForced(forceInverseBackground: Boolean): Unit = js.native
  def setMessage(message: String): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def setView(view: View): Unit = js.native
  def setView(view: View, viewSpacingLeft: Double): Unit = js.native
  def setView(view: View, viewSpacingLeft: Double, viewSpacingTop: Double): Unit = js.native
  def setView(view: View, viewSpacingLeft: Double, viewSpacingTop: Double, viewSpacingRight: Double): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: Double,
    viewSpacingTop: Double,
    viewSpacingRight: Double,
    viewSpacingBottom: Double
  ): Unit = js.native
  /* private */ def setupButtons(): js.Any = js.native
  /* private */ def setupContent(contentPanel: js.Any): js.Any = js.native
  /* private */ def setupTitle(topPanel: js.Any): js.Any = js.native
  /* private */ def setupView(): js.Any = js.native
}

