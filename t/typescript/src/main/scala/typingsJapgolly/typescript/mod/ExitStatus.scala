package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExitStatus extends StObject
@JSImport("typescript", "ExitStatus")
@js.native
object ExitStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExitStatus & Double] = js.native
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsGenerated
    extends StObject
       with ExitStatus
  /* 2 */ val DiagnosticsPresent_OutputsGenerated: typingsJapgolly.typescript.mod.ExitStatus.DiagnosticsPresent_OutputsGenerated & Double = js.native
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsSkipped
    extends StObject
       with ExitStatus
  /* 1 */ val DiagnosticsPresent_OutputsSkipped: typingsJapgolly.typescript.mod.ExitStatus.DiagnosticsPresent_OutputsSkipped & Double = js.native
  
  @js.native
  sealed trait InvalidProject_OutputsSkipped
    extends StObject
       with ExitStatus
  /* 3 */ val InvalidProject_OutputsSkipped: typingsJapgolly.typescript.mod.ExitStatus.InvalidProject_OutputsSkipped & Double = js.native
  
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkipped
    extends StObject
       with ExitStatus
  /* 4 */ val ProjectReferenceCycle_OutputsSkipped: typingsJapgolly.typescript.mod.ExitStatus.ProjectReferenceCycle_OutputsSkipped & Double = js.native
  
  /** @deprecated Use ProjectReferenceCycle_OutputsSkipped instead. */
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkupped
    extends StObject
       with ExitStatus
  /* 4 */ val ProjectReferenceCycle_OutputsSkupped: typingsJapgolly.typescript.mod.ExitStatus.ProjectReferenceCycle_OutputsSkupped & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with ExitStatus
  /* 0 */ val Success: typingsJapgolly.typescript.mod.ExitStatus.Success & Double = js.native
}
