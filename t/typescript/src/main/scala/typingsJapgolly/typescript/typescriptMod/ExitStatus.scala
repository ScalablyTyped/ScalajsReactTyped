package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExitStatus extends js.Object

@JSImport("typescript", "ExitStatus")
@js.native
object ExitStatus extends js.Object {
  @js.native
  sealed trait DiagnosticsPresent_OutputsGenerated extends ExitStatus
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsSkipped extends ExitStatus
  
  @js.native
  sealed trait InvalidProject_OutputsSkipped extends ExitStatus
  
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkipped extends ExitStatus
  
  /** @deprecated Use ProjectReferenceCycle_OutputsSkipped instead. */
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkupped extends ExitStatus
  
  @js.native
  sealed trait Success extends ExitStatus
  
  /* 2 */ val DiagnosticsPresent_OutputsGenerated: typingsJapgolly.typescript.typescriptMod.ExitStatus.DiagnosticsPresent_OutputsGenerated with Double = js.native
  /* 1 */ val DiagnosticsPresent_OutputsSkipped: typingsJapgolly.typescript.typescriptMod.ExitStatus.DiagnosticsPresent_OutputsSkipped with Double = js.native
  /* 3 */ val InvalidProject_OutputsSkipped: typingsJapgolly.typescript.typescriptMod.ExitStatus.InvalidProject_OutputsSkipped with Double = js.native
  /* 4 */ val ProjectReferenceCycle_OutputsSkipped: typingsJapgolly.typescript.typescriptMod.ExitStatus.ProjectReferenceCycle_OutputsSkipped with Double = js.native
  /* 4 */ val ProjectReferenceCycle_OutputsSkupped: typingsJapgolly.typescript.typescriptMod.ExitStatus.ProjectReferenceCycle_OutputsSkupped with Double = js.native
  /* 0 */ val Success: typingsJapgolly.typescript.typescriptMod.ExitStatus.Success with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExitStatus with Double] = js.native
}

