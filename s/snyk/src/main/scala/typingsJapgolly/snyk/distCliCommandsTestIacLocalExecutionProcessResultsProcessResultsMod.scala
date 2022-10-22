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

object distCliCommandsTestIacLocalExecutionProcessResultsProcessResultsMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/process-results/process-results", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processResults(
    resultsWithCustomSeverities: js.Array[IacFileScanResult],
    orgPublicId: String,
    iacOrgSettings: IacOrgSettings,
    policy: Unit,
    tags: js.Array[Tag],
    attributes: Unit,
    options: IaCTestFlags,
    projectRoot: String,
    meta: IacOutputMeta
  ): js.Promise[FilteredIssues] = (^.asInstanceOf[js.Dynamic].applyDynamic("processResults")(resultsWithCustomSeverities.asInstanceOf[js.Any], orgPublicId.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FilteredIssues]]
  inline def processResults(
    resultsWithCustomSeverities: js.Array[IacFileScanResult],
    orgPublicId: String,
    iacOrgSettings: IacOrgSettings,
    policy: Unit,
    tags: js.Array[Tag],
    attributes: ProjectAttributes,
    options: IaCTestFlags,
    projectRoot: String,
    meta: IacOutputMeta
  ): js.Promise[FilteredIssues] = (^.asInstanceOf[js.Dynamic].applyDynamic("processResults")(resultsWithCustomSeverities.asInstanceOf[js.Any], orgPublicId.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FilteredIssues]]
  inline def processResults(
    resultsWithCustomSeverities: js.Array[IacFileScanResult],
    orgPublicId: String,
    iacOrgSettings: IacOrgSettings,
    policy: Unit,
    tags: Unit,
    attributes: Unit,
    options: IaCTestFlags,
    projectRoot: String,
    meta: IacOutputMeta
  ): js.Promise[FilteredIssues] = (^.asInstanceOf[js.Dynamic].applyDynamic("processResults")(resultsWithCustomSeverities.asInstanceOf[js.Any], orgPublicId.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FilteredIssues]]
  inline def processResults(
    resultsWithCustomSeverities: js.Array[IacFileScanResult],
    orgPublicId: String,
    iacOrgSettings: IacOrgSettings,
    policy: Unit,
    tags: Unit,
    attributes: ProjectAttributes,
    options: IaCTestFlags,
    projectRoot: String,
    meta: IacOutputMeta
  ): js.Promise[FilteredIssues] = (^.asInstanceOf[js.Dynamic].applyDynamic("processResults")(resultsWithCustomSeverities.asInstanceOf[js.Any], orgPublicId.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FilteredIssues]]
  inline def processResults(
    resultsWithCustomSeverities: js.Array[IacFileScanResult],
    orgPublicId: String,
    iacOrgSettings: IacOrgSettings,
    policy: Policy,
    tags: js.Array[Tag],
    attributes: Unit,
    options: IaCTestFlags,
    projectRoot: String,
    meta: IacOutputMeta
  ): js.Promise[FilteredIssues] = (^.asInstanceOf[js.Dynamic].applyDynamic("processResults")(resultsWithCustomSeverities.asInstanceOf[js.Any], orgPublicId.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FilteredIssues]]
  inline def processResults(
    resultsWithCustomSeverities: js.Array[IacFileScanResult],
    orgPublicId: String,
    iacOrgSettings: IacOrgSettings,
    policy: Policy,
    tags: js.Array[Tag],
    attributes: ProjectAttributes,
    options: IaCTestFlags,
    projectRoot: String,
    meta: IacOutputMeta
  ): js.Promise[FilteredIssues] = (^.asInstanceOf[js.Dynamic].applyDynamic("processResults")(resultsWithCustomSeverities.asInstanceOf[js.Any], orgPublicId.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FilteredIssues]]
  inline def processResults(
    resultsWithCustomSeverities: js.Array[IacFileScanResult],
    orgPublicId: String,
    iacOrgSettings: IacOrgSettings,
    policy: Policy,
    tags: Unit,
    attributes: Unit,
    options: IaCTestFlags,
    projectRoot: String,
    meta: IacOutputMeta
  ): js.Promise[FilteredIssues] = (^.asInstanceOf[js.Dynamic].applyDynamic("processResults")(resultsWithCustomSeverities.asInstanceOf[js.Any], orgPublicId.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FilteredIssues]]
  inline def processResults(
    resultsWithCustomSeverities: js.Array[IacFileScanResult],
    orgPublicId: String,
    iacOrgSettings: IacOrgSettings,
    policy: Policy,
    tags: Unit,
    attributes: ProjectAttributes,
    options: IaCTestFlags,
    projectRoot: String,
    meta: IacOutputMeta
  ): js.Promise[FilteredIssues] = (^.asInstanceOf[js.Dynamic].applyDynamic("processResults")(resultsWithCustomSeverities.asInstanceOf[js.Any], orgPublicId.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FilteredIssues]]
}
