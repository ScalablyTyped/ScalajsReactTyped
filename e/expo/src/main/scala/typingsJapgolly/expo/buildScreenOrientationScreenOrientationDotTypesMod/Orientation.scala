package typingsJapgolly.expo.buildScreenOrientationScreenOrientationDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSImport("expo/build/ScreenOrientation/ScreenOrientation.types", "Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait LANDSCAPE extends Orientation
  
  @js.native
  sealed trait LANDSCAPE_LEFT extends Orientation
  
  @js.native
  sealed trait LANDSCAPE_RIGHT extends Orientation
  
  @js.native
  sealed trait PORTRAIT extends Orientation
  
  @js.native
  sealed trait PORTRAIT_DOWN extends Orientation
  
  @js.native
  sealed trait PORTRAIT_UP extends Orientation
  
  @js.native
  sealed trait UNKNOWN extends Orientation
  
  /* "LANDSCAPE" */ val LANDSCAPE: typingsJapgolly.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.LANDSCAPE with String = js.native
  /* "LANDSCAPE_LEFT" */ val LANDSCAPE_LEFT: typingsJapgolly.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.LANDSCAPE_LEFT with String = js.native
  /* "LANDSCAPE_RIGHT" */ val LANDSCAPE_RIGHT: typingsJapgolly.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.LANDSCAPE_RIGHT with String = js.native
  /* "PORTRAIT" */ val PORTRAIT: typingsJapgolly.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.PORTRAIT with String = js.native
  /* "PORTRAIT_DOWN" */ val PORTRAIT_DOWN: typingsJapgolly.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.PORTRAIT_DOWN with String = js.native
  /* "PORTRAIT_UP" */ val PORTRAIT_UP: typingsJapgolly.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.PORTRAIT_UP with String = js.native
  /* "UNKNOWN" */ val UNKNOWN: typingsJapgolly.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.UNKNOWN with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orientation with String] = js.native
}

