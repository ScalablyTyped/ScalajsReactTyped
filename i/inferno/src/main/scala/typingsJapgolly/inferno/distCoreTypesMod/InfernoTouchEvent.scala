package typingsJapgolly.inferno.distCoreTypesMod

import org.scalajs.dom.TouchList
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.std.Event because Already inherited
- typingsJapgolly.std.UIEvent because var conflicts: cancelBubble, currentTarget, returnValue. Inlined detail, which, view, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent
- typingsJapgolly.std.TouchEvent because var conflicts: cancelBubble, currentTarget, returnValue. Inlined metaKey, touches, shiftKey, altKey, changedTouches, ctrlKey, targetTouches */ @js.native
trait InfernoTouchEvent[T]
  extends StObject
     with SemiSyntheticEvent[T] {
  
  /* standard dom */
  val altKey: Boolean = js.native
  
  /* standard dom */
  val changedTouches: TouchList = js.native
  
  /* standard dom */
  val ctrlKey: Boolean = js.native
  
  /* standard dom */
  val detail: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  def initUIEvent(typeArg: String): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean, viewArg: Window): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean, viewArg: Window, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean, viewArg: Null, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean, viewArg: Unit, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: Window): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: Window, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: Null, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: Unit, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: Window): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: Window, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: Null, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: Unit, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Window): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Window, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Null, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Unit, detailArg: Double): Unit = js.native
  
  /* standard dom */
  val metaKey: Boolean = js.native
  
  /* standard dom */
  val shiftKey: Boolean = js.native
  
  /* standard dom */
  val targetTouches: TouchList = js.native
  
  /* standard dom */
  val touches: TouchList = js.native
  
  /* standard dom */
  val view: Window | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  val which: Double = js.native
}
