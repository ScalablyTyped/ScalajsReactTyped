package typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Directions extends js.Object

@JSImport("react-native-gesture-handler", "Directions")
@js.native
object Directions extends js.Object {
  @js.native
  sealed trait DOWN extends Directions
  
  @js.native
  sealed trait LEFT extends Directions
  
  @js.native
  sealed trait RIGHT extends Directions
  
  @js.native
  sealed trait UP extends Directions
  
  /* 8 */ val DOWN: typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.Directions.DOWN with Double = js.native
  /* 2 */ val LEFT: typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.Directions.LEFT with Double = js.native
  /* 1 */ val RIGHT: typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.Directions.RIGHT with Double = js.native
  /* 4 */ val UP: typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.Directions.UP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Directions with Double] = js.native
}

