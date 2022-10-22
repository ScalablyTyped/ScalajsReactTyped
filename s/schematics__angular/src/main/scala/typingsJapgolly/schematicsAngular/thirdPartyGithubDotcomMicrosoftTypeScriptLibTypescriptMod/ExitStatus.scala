package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExitStatus extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "ExitStatus")
@js.native
object ExitStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExitStatus & Double] = js.native
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsGenerated
    extends StObject
       with ExitStatus
  /* 2 */ val DiagnosticsPresent_OutputsGenerated: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ExitStatus.DiagnosticsPresent_OutputsGenerated & Double = js.native
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsSkipped
    extends StObject
       with ExitStatus
  /* 1 */ val DiagnosticsPresent_OutputsSkipped: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ExitStatus.DiagnosticsPresent_OutputsSkipped & Double = js.native
  
  @js.native
  sealed trait InvalidProject_OutputsSkipped
    extends StObject
       with ExitStatus
  /* 3 */ val InvalidProject_OutputsSkipped: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ExitStatus.InvalidProject_OutputsSkipped & Double = js.native
  
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkipped
    extends StObject
       with ExitStatus
  /* 4 */ val ProjectReferenceCycle_OutputsSkipped: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ExitStatus.ProjectReferenceCycle_OutputsSkipped & Double = js.native
  
  /** @deprecated Use ProjectReferenceCycle_OutputsSkipped instead. */
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkupped
    extends StObject
       with ExitStatus
  /* 4 */ val ProjectReferenceCycle_OutputsSkupped: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ExitStatus.ProjectReferenceCycle_OutputsSkupped & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with ExitStatus
  /* 0 */ val Success: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ExitStatus.Success & Double = js.native
}
