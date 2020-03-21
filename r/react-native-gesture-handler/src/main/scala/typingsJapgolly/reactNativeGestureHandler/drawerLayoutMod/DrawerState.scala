package typingsJapgolly.reactNativeGestureHandler.drawerLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle
  - typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging
  - typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling
*/
trait DrawerState extends js.Object

object DrawerState {
  @scala.inline
  def Dragging: typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging = this.cast("Dragging")
  @scala.inline
  def Idle: typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle = this.cast("Idle")
  @scala.inline
  def Settling: typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling = this.cast("Settling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

