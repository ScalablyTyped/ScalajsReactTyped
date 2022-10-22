package typingsJapgolly.snyk

import typingsJapgolly.snyk.anon.FilteredIssues
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileScanResult
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacOrgSettings
import typingsJapgolly.snyk.distLibPolicyFindAndLoadPolicyMod.Policy
import typingsJapgolly.snyk.distLibTypesMod.IacOutputMeta
import typingsJapgolly.snyk.distLibTypesMod.ProjectAttributes
import typingsJapgolly.snyk.distLibTypesMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionProcessResultsMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/process-results", "SingleGroupResultsProcessor")
  @js.native
  open class SingleGroupResultsProcessor protected ()
    extends StObject
       with ResultsProcessor {
    def this(
      projectRoot: String,
      orgPublicId: String,
      iacOrgSettings: IacOrgSettings,
      options: IaCTestFlags,
      meta: IacOutputMeta
    ) = this()
    
    /* private */ var iacOrgSettings: Any = js.native
    
    /* private */ var meta: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var orgPublicId: Any = js.native
    
    /* private */ var projectRoot: Any = js.native
  }
  
  @js.native
  trait ResultsProcessor extends StObject {
    
    def processResults(resultsWithCustomSeverities: js.Array[IacFileScanResult]): js.Promise[FilteredIssues] = js.native
    def processResults(resultsWithCustomSeverities: js.Array[IacFileScanResult], policy: Unit, tags: js.Array[Tag]): js.Promise[FilteredIssues] = js.native
    def processResults(
      resultsWithCustomSeverities: js.Array[IacFileScanResult],
      policy: Unit,
      tags: js.Array[Tag],
      attributes: ProjectAttributes
    ): js.Promise[FilteredIssues] = js.native
    def processResults(
      resultsWithCustomSeverities: js.Array[IacFileScanResult],
      policy: Unit,
      tags: Unit,
      attributes: ProjectAttributes
    ): js.Promise[FilteredIssues] = js.native
    def processResults(resultsWithCustomSeverities: js.Array[IacFileScanResult], policy: Policy): js.Promise[FilteredIssues] = js.native
    def processResults(resultsWithCustomSeverities: js.Array[IacFileScanResult], policy: Policy, tags: js.Array[Tag]): js.Promise[FilteredIssues] = js.native
    def processResults(
      resultsWithCustomSeverities: js.Array[IacFileScanResult],
      policy: Policy,
      tags: js.Array[Tag],
      attributes: ProjectAttributes
    ): js.Promise[FilteredIssues] = js.native
    def processResults(
      resultsWithCustomSeverities: js.Array[IacFileScanResult],
      policy: Policy,
      tags: Unit,
      attributes: ProjectAttributes
    ): js.Promise[FilteredIssues] = js.native
  }
}
