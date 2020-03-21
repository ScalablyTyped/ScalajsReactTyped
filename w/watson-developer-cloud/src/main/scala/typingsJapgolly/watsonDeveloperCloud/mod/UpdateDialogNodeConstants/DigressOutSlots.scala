package typingsJapgolly.watsonDeveloperCloud.mod.UpdateDialogNodeConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DigressOutSlots extends js.Object

/** Whether the user can digress to top-level nodes while filling out slots. */
@JSImport("watson-developer-cloud/assistant/v1", "UpdateDialogNodeConstants.DigressOutSlots")
@js.native
object DigressOutSlots extends js.Object {
  @js.native
  sealed trait ALLOW_ALL extends DigressOutSlots
  
  @js.native
  sealed trait ALLOW_RETURNING extends DigressOutSlots
  
  @js.native
  sealed trait NOT_ALLOWED extends DigressOutSlots
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DigressOutSlots with String] = js.native
  /* "allow_all" */ @js.native
  object ALLOW_ALL extends TopLevel[ALLOW_ALL with String]
  
  /* "allow_returning" */ @js.native
  object ALLOW_RETURNING extends TopLevel[ALLOW_RETURNING with String]
  
  /* "not_allowed" */ @js.native
  object NOT_ALLOWED extends TopLevel[NOT_ALLOWED with String]
  
}

