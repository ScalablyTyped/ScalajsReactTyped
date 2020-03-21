package typingsJapgolly.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlMode extends js.Object

/** Represents display mode for a control or form */
@JSGlobal("SP.ControlMode")
@js.native
object ControlMode extends js.Object {
  @js.native
  sealed trait displayMode extends ControlMode
  
  @js.native
  sealed trait editMode extends ControlMode
  
  @js.native
  sealed trait invalid extends ControlMode
  
  @js.native
  sealed trait newMode extends ControlMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlMode with Double] = js.native
  /* 1 */ @js.native
  object displayMode extends TopLevel[displayMode with Double]
  
  /* 2 */ @js.native
  object editMode extends TopLevel[editMode with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 3 */ @js.native
  object newMode extends TopLevel[newMode with Double]
  
}

