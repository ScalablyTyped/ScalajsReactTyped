package typingsJapgolly.androiduix.android.app

import typingsJapgolly.androiduix.android.content.Context
import typingsJapgolly.androiduix.android.content.DialogInterface
import typingsJapgolly.androiduix.android.content.DialogInterface.OnCancelListener
import typingsJapgolly.androiduix.android.content.DialogInterface.OnDismissListener
import typingsJapgolly.androiduix.android.content.DialogInterface.OnKeyListener
import typingsJapgolly.androiduix.android.content.DialogInterface.OnShowListener
import typingsJapgolly.androiduix.android.os.Bundle
import typingsJapgolly.androiduix.android.os.Handler
import typingsJapgolly.androiduix.android.os.Message
import typingsJapgolly.androiduix.android.view.KeyEvent
import typingsJapgolly.androiduix.android.view.LayoutInflater
import typingsJapgolly.androiduix.android.view.MotionEvent
import typingsJapgolly.androiduix.android.view.View
import typingsJapgolly.androiduix.android.view.ViewGroup.LayoutParams
import typingsJapgolly.androiduix.android.view.Window
import typingsJapgolly.androiduix.android.view.Window.Callback
import typingsJapgolly.androiduix.android.view.WindowManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.Dialog")
@js.native
class Dialog protected ()
  extends DialogInterface
     with Callback
     with typingsJapgolly.androiduix.android.view.KeyEvent.Callback {
  def this(context: Context) = this()
  def this(context: Context, cancelable: Boolean) = this()
  def this(context: Context, cancelable: Boolean, cancelListener: OnCancelListener) = this()
  var mCancelAndDismissTaken: js.Any = js.native
  var mCancelMessage: js.Any = js.native
  var mCancelable: Boolean = js.native
  var mCanceled: js.Any = js.native
  var mContext: Context = js.native
  var mCreated: js.Any = js.native
  var mDecor: View = js.native
  var mDismissAction: js.Any = js.native
  var mDismissMessage: js.Any = js.native
  var mHandler: js.Any = js.native
  var mListenersHandler: js.Any = js.native
  var mOnKeyListener: js.Any = js.native
  var mShowMessage: js.Any = js.native
  var mShowing: js.Any = js.native
  var mWindow: Window = js.native
  var mWindowManager: WindowManager = js.native
  def addContentView(view: View, params: LayoutParams): Unit = js.native
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  /* InferMemberOverrides */
  override def dismiss(): Unit = js.native
  def dismissDialog(): Unit = js.native
  /* CompleteClass */
  override def dispatchGenericMotionEvent(event: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def dispatchKeyEvent(event: KeyEvent): Boolean = js.native
  def dispatchOnCreate(savedInstanceState: Bundle): Unit = js.native
  /* CompleteClass */
  override def dispatchTouchEvent(event: MotionEvent): Boolean = js.native
  def findViewById(id: String): View = js.native
  def getContext(): Context = js.native
  def getCurrentFocus(): View = js.native
  def getLayoutInflater(): LayoutInflater = js.native
  def getWindow(): Window = js.native
  def hide(): Unit = js.native
  def isShowing(): Boolean = js.native
  /* CompleteClass */
  override def onAttachedToWindow(): Unit = js.native
  def onBackPressed(): Unit = js.native
  /* CompleteClass */
  override def onContentChanged(): Unit = js.native
  /* protected */ def onCreate(savedInstanceState: Bundle): Unit = js.native
  /* CompleteClass */
  override def onDetachedFromWindow(): Unit = js.native
  def onGenericMotionEvent(event: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def onKeyDown(keyCode: Double, event: KeyEvent): Boolean = js.native
  /* CompleteClass */
  override def onKeyLongPress(keyCode: Double, event: KeyEvent): Boolean = js.native
  def onKeyMultiple(keyCode: Double, repeatCount: Double, event: KeyEvent): Boolean = js.native
  /* CompleteClass */
  override def onKeyUp(keyCode: Double, event: KeyEvent): Boolean = js.native
  /* protected */ def onStart(): Unit = js.native
  /* protected */ def onStop(): Unit = js.native
  def onTouchEvent(event: MotionEvent): Boolean = js.native
  def onTrackballEvent(event: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def onWindowAttributesChanged(attrs: typingsJapgolly.androiduix.android.view.WindowManager.LayoutParams): Unit = js.native
  /* CompleteClass */
  override def onWindowFocusChanged(hasFocus: Boolean): Unit = js.native
  /* private */ def sendDismissMessage(): js.Any = js.native
  /* private */ def sendShowMessage(): js.Any = js.native
  def setCancelMessage(msg: Message): Unit = js.native
  def setCancelable(flag: Boolean): Unit = js.native
  def setCanceledOnTouchOutside(cancel: Boolean): Unit = js.native
  def setContentView(view: View): Unit = js.native
  def setContentView(view: View, params: LayoutParams): Unit = js.native
  def setDismissMessage(msg: Message): Unit = js.native
  def setOnCancelListener(listener: OnCancelListener): Unit = js.native
  def setOnDismissListener(listener: OnDismissListener): Unit = js.native
  def setOnKeyListener(onKeyListener: OnKeyListener): Unit = js.native
  def setOnShowListener(listener: OnShowListener): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def show(): Unit = js.native
  def takeCancelAndDismissListeners(msg: String, cancel: OnCancelListener, dismiss: OnDismissListener): Boolean = js.native
  def takeKeyEvents(get: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("android.app.Dialog")
@js.native
object Dialog extends js.Object {
  @js.native
  class ListenersHandler protected () extends Handler {
    def this(dialog: Dialog) = this()
    var mDialog: js.Any = js.native
  }
  
  var CANCEL: js.Any = js.native
  var DIALOG_HIERARCHY_TAG: js.Any = js.native
  var DIALOG_SHOWING_TAG: js.Any = js.native
  var DISMISS: js.Any = js.native
  var SHOW: js.Any = js.native
  var TAG: js.Any = js.native
}

