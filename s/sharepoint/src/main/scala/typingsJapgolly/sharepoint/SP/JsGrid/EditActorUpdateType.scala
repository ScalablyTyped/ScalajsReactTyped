package typingsJapgolly.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditActorUpdateType extends js.Object

@JSGlobal("SP.JsGrid.EditActorUpdateType")
@js.native
object EditActorUpdateType extends js.Object {
   // 0,
  @js.native
  sealed trait Committed extends EditActorUpdateType
  
   // 1
  @js.native
  sealed trait Uncommitted extends EditActorUpdateType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditActorUpdateType with Double] = js.native
  /* 0 */ @js.native
  object Committed extends TopLevel[Committed with Double]
  
  /* 1 */ @js.native
  object Uncommitted extends TopLevel[Uncommitted with Double]
  
}

