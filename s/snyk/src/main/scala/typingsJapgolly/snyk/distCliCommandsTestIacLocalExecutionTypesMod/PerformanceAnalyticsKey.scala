package typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PerformanceAnalyticsKey extends StObject
@JSImport("snyk/dist/cli/commands/test/iac/local-execution/types", "PerformanceAnalyticsKey")
@js.native
object PerformanceAnalyticsKey extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PerformanceAnalyticsKey & String] = js.native
  
  @js.native
  sealed trait CacheCleanup
    extends StObject
       with PerformanceAnalyticsKey
  /* "cache-cleanup-ms" */ val CacheCleanup: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.CacheCleanup & String = js.native
  
  @js.native
  sealed trait CustomSeverities
    extends StObject
       with PerformanceAnalyticsKey
  /* "custom-severities-ms" */ val CustomSeverities: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.CustomSeverities & String = js.native
  
  @js.native
  sealed trait FileLoading
    extends StObject
       with PerformanceAnalyticsKey
  /* "file-loading-ms" */ val FileLoading: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.FileLoading & String = js.native
  
  @js.native
  sealed trait FileParsing
    extends StObject
       with PerformanceAnalyticsKey
  /* "file-parsing-ms" */ val FileParsing: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.FileParsing & String = js.native
  
  @js.native
  sealed trait FileScanning
    extends StObject
       with PerformanceAnalyticsKey
  /* "file-scanning-ms" */ val FileScanning: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.FileScanning & String = js.native
  
  @js.native
  sealed trait InitLocalCache
    extends StObject
       with PerformanceAnalyticsKey
  /* "cache-init-ms" */ val InitLocalCache: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.InitLocalCache & String = js.native
  
  @js.native
  sealed trait OrgSettings
    extends StObject
       with PerformanceAnalyticsKey
  /* "org-settings-ms" */ val OrgSettings: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.OrgSettings & String = js.native
  
  @js.native
  sealed trait ResultFormatting
    extends StObject
       with PerformanceAnalyticsKey
  /* "results-formatting-ms" */ val ResultFormatting: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.ResultFormatting & String = js.native
  
  @js.native
  sealed trait Total
    extends StObject
       with PerformanceAnalyticsKey
  /* "total-iac-ms" */ val Total: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.Total & String = js.native
  
  @js.native
  sealed trait UsageTracking
    extends StObject
       with PerformanceAnalyticsKey
  /* "usage-tracking-ms" */ val UsageTracking: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.UsageTracking & String = js.native
}
