package typingsJapgolly.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SimpleOrientation extends js.Object

@JSGlobal("Windows.Devices.Sensors.SimpleOrientation")
@js.native
object SimpleOrientation extends js.Object {
  @js.native
  sealed trait facedown extends SimpleOrientation
  
  @js.native
  sealed trait faceup extends SimpleOrientation
  
  @js.native
  sealed trait notRotated extends SimpleOrientation
  
  @js.native
  sealed trait rotated180DegreesCounterclockwise extends SimpleOrientation
  
  @js.native
  sealed trait rotated270DegreesCounterclockwise extends SimpleOrientation
  
  @js.native
  sealed trait rotated90DegreesCounterclockwise extends SimpleOrientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SimpleOrientation with Double] = js.native
  /* 5 */ @js.native
  object facedown extends TopLevel[facedown with Double]
  
  /* 4 */ @js.native
  object faceup extends TopLevel[faceup with Double]
  
  /* 0 */ @js.native
  object notRotated extends TopLevel[notRotated with Double]
  
  /* 2 */ @js.native
  object rotated180DegreesCounterclockwise extends TopLevel[rotated180DegreesCounterclockwise with Double]
  
  /* 3 */ @js.native
  object rotated270DegreesCounterclockwise extends TopLevel[rotated270DegreesCounterclockwise with Double]
  
  /* 1 */ @js.native
  object rotated90DegreesCounterclockwise extends TopLevel[rotated90DegreesCounterclockwise with Double]
  
}

