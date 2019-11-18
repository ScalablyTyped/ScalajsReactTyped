package typingsJapgolly.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DepthDataAccuracy extends js.Object

@JSImport("expo/build/AR", "DepthDataAccuracy")
@js.native
object DepthDataAccuracy extends js.Object {
  @js.native
  sealed trait Absolute extends DepthDataAccuracy
  
  @js.native
  sealed trait Relative extends DepthDataAccuracy
  
  /* "AVDepthDataAccuracyAbsolute" */ val Absolute: typingsJapgolly.expo.buildARMod.DepthDataAccuracy.Absolute with String = js.native
  /* "AVDepthDataAccuracyRelative" */ val Relative: typingsJapgolly.expo.buildARMod.DepthDataAccuracy.Relative with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DepthDataAccuracy with String] = js.native
}

