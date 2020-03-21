package typingsJapgolly.androiduix.android.view

import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.androiduix.android.view.KeyEvent.Callback
import typingsJapgolly.androiduix.android.view.KeyEvent.DispatcherState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.KeyEvent")
@js.native
class KeyEvent_ () extends js.Object {
  var _downingKeyEventMap: js.Any = js.native
  var mAction: js.Any = js.native
  var mAltKey: js.Any = js.native
  var mCtrlKey: js.Any = js.native
  var mDownTime: js.Any = js.native
  var mEventTime: js.Any = js.native
  var mFlags: Double = js.native
  var mIsTypingKey: Boolean = js.native
  var mKeyCode: js.Any = js.native
  var mMetaKey: js.Any = js.native
  var mShiftKey: js.Any = js.native
  def dispatch(receiver: Callback): Boolean = js.native
  def dispatch(receiver: Callback, state: DispatcherState): Boolean = js.native
  def dispatch(receiver: Callback, state: DispatcherState, target: js.Any): Boolean = js.native
  def getAction(): Double = js.native
  def getDownTime(): Double = js.native
  def getEventTime(): Double = js.native
  def getKeyCode(): Double = js.native
  def getMetaState(): Double = js.native
  def getRepeatCount(): Double = js.native
  def hasModifiers(modifiers: Double): Boolean = js.native
  def hasNoModifiers(): Boolean = js.native
  def initKeyEvent(keyEvent: KeyboardEvent, action: Double): Unit = js.native
  def isAltPressed(): Boolean = js.native
  def isCanceled(): Boolean = js.native
  def isCtrlPressed(): Boolean = js.native
  def isLongPress(): Boolean = js.native
  def isMetaPressed(): Boolean = js.native
  def isShiftPressed(): Boolean = js.native
  def isTracking(): Boolean = js.native
  def startTracking(): Unit = js.native
}

