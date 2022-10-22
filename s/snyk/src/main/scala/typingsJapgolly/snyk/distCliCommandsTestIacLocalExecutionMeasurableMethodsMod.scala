package typingsJapgolly.snyk

import typingsJapgolly.snyk.anon.CustomRulesPath
import typingsJapgolly.snyk.anon.FailedScans
import typingsJapgolly.snyk.anon.Severity
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionProcessResultsMod.ResultsProcessor
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionRulesOciRegistryMod.OciRegistry
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.FormattedResult
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileData
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileParsed
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileScanResult
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacOrgSettings
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.ParsingResults
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.RulesOrigin
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.TestMeta
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.TestReturnValue
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionUsageTrackingMod.TrackableResult
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.Record
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionMeasurableMethodsMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/measurable-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyCustomSeverities(scannedFiles: js.Array[IacFileScanResult], customPolicies: Record[String, Severity]): js.Promise[js.Array[IacFileScanResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyCustomSeverities")(scannedFiles.asInstanceOf[js.Any], customPolicies.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[IacFileScanResult]]]
  
  inline def asyncPerformanceAnalyticsDecorator[T /* <: js.Function1[/* repeated */ Any, js.Promise[Any]] */](measurableMethod: T, analyticsKey: PerformanceAnalyticsKey): js.Function1[/* args */ Parameters[T], js.Promise[Awaited[ReturnType[T]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncPerformanceAnalyticsDecorator")(measurableMethod.asInstanceOf[js.Any], analyticsKey.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Parameters[T], js.Promise[Awaited[ReturnType[T]]]]]
  
  inline def cleanLocalCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanLocalCache")().asInstanceOf[Unit]
  
  inline def formatScanResults(
    scanResults: js.Array[IacFileScanResult],
    options: IaCTestFlags,
    meta: TestMeta,
    projectPublicIds: Record[String, String],
    projectRoot: String
  ): js.Array[FormattedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatScanResults")(scanResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], projectPublicIds.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Array[FormattedResult]]
  inline def formatScanResults(
    scanResults: js.Array[IacFileScanResult],
    options: IaCTestFlags,
    meta: TestMeta,
    projectPublicIds: Record[String, String],
    projectRoot: String,
    gitRemoteUrl: String
  ): js.Array[FormattedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatScanResults")(scanResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], projectPublicIds.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], gitRemoteUrl.asInstanceOf[js.Any])).asInstanceOf[js.Array[FormattedResult]]
  
  inline def getIacOrgSettings(): js.Promise[IacOrgSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIacOrgSettings")().asInstanceOf[js.Promise[IacOrgSettings]]
  inline def getIacOrgSettings(publicOrgId: String): js.Promise[IacOrgSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIacOrgSettings")(publicOrgId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IacOrgSettings]]
  
  inline def initLocalCache(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initLocalCache")().asInstanceOf[js.Promise[Unit]]
  inline def initLocalCache(__0: CustomRulesPath): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initLocalCache")(__0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def loadContentForFiles(filePaths: js.Array[String]): js.Promise[js.Array[IacFileData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadContentForFiles")(filePaths.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[IacFileData]]]
  
  inline def localTest(
    resultsProcessor: ResultsProcessor,
    pathToScan: String,
    options: IaCTestFlags,
    iacOrgSettings: IacOrgSettings,
    rulesOrigin: RulesOrigin
  ): js.Promise[TestReturnValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("localTest")(resultsProcessor.asInstanceOf[js.Any], pathToScan.asInstanceOf[js.Any], options.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], rulesOrigin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestReturnValue]]
  
  inline def parseFiles(filesData: js.Array[IacFileData]): js.Promise[ParsingResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFiles")(filesData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsingResults]]
  inline def parseFiles(filesData: js.Array[IacFileData], options: IaCTestFlags): js.Promise[ParsingResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFiles")(filesData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParsingResults]]
  
  inline def performanceAnalyticsDecorator[T /* <: js.Function1[/* repeated */ Any, Any] */](measurableMethod: T, analyticsKey: PerformanceAnalyticsKey): js.Function1[/* args */ Parameters[T], ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("performanceAnalyticsDecorator")(measurableMethod.asInstanceOf[js.Any], analyticsKey.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Parameters[T], ReturnType[T]]]
  
  inline def pull(registry: OciRegistry, repository: String, tag: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("pull")(registry.asInstanceOf[js.Any], repository.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def scanFiles(parsedFiles: js.Array[IacFileParsed]): js.Promise[FailedScans] = ^.asInstanceOf[js.Dynamic].applyDynamic("scanFiles")(parsedFiles.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FailedScans]]
  
  inline def trackUsage(formattedResults: js.Array[TrackableResult]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackUsage")(formattedResults.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.PromiseLike<infer U> ? U : T
    }}}
    */
  @js.native
  trait Awaited[T] extends StObject
}
