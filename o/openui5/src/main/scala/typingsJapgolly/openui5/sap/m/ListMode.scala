package typingsJapgolly.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListMode extends js.Object

/**
  * Defines the mode of the list.
  */
@JSGlobal("sap.m.ListMode")
@js.native
object ListMode extends js.Object {
  @js.native
  sealed trait Delete extends ListMode
  
  @js.native
  sealed trait MultiSelect extends ListMode
  
  @js.native
  sealed trait None extends ListMode
  
  @js.native
  sealed trait SingleSelect extends ListMode
  
  @js.native
  sealed trait SingleSelectLeft extends ListMode
  
  @js.native
  sealed trait SingleSelectMaster extends ListMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListMode with Double] = js.native
  /* 0 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 1 */ @js.native
  object MultiSelect extends TopLevel[MultiSelect with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object SingleSelect extends TopLevel[SingleSelect with Double]
  
  /* 4 */ @js.native
  object SingleSelectLeft extends TopLevel[SingleSelectLeft with Double]
  
  /* 5 */ @js.native
  object SingleSelectMaster extends TopLevel[SingleSelectMaster with Double]
  
}

