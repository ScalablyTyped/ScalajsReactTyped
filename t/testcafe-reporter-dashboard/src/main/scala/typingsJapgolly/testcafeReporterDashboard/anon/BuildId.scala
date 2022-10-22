package typingsJapgolly.testcafeReporterDashboard.anon

import typingsJapgolly.ioTs.mod.ArrayC
import typingsJapgolly.ioTs.mod.BrandC
import typingsJapgolly.ioTs.mod.ExactC
import typingsJapgolly.ioTs.mod.NumberC
import typingsJapgolly.ioTs.mod.ReadonlyC
import typingsJapgolly.ioTs.mod.StringC
import typingsJapgolly.ioTs.mod.TypeC
import typingsJapgolly.ioTs.mod.UndefinedC
import typingsJapgolly.ioTs.mod.UnionC
import typingsJapgolly.ioTsTypes.libDateFromISOStringMod.DateFromISOStringC
import typingsJapgolly.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString
import typingsJapgolly.testcafeReporterDashboard.testcafeReporterDashboardInts.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildId extends StObject {
  
  var buildId: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]]
  
  var endTime: DateFromISOStringC
  
  var passed: NumberC
  
  var result: ReadonlyC[ExactC[TypeC[FailedCount]]]
  
  var warnings: ArrayC[StringC]
  
  var warningsUploadId: UnionC[js.Tuple2[StringC, UndefinedC]]
}
object BuildId {
  
  inline def apply(
    buildId: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]],
    endTime: DateFromISOStringC,
    passed: NumberC,
    result: ReadonlyC[ExactC[TypeC[FailedCount]]],
    warnings: ArrayC[StringC],
    warningsUploadId: UnionC[js.Tuple2[StringC, UndefinedC]]
  ): BuildId = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], warningsUploadId = warningsUploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildId]
  }
  
  extension [Self <: BuildId](x: Self) {
    
    inline def setBuildId(value: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]]): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: DateFromISOStringC): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setPassed(value: NumberC): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setResult(value: ReadonlyC[ExactC[TypeC[FailedCount]]]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: ArrayC[StringC]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUploadId(value: UnionC[js.Tuple2[StringC, UndefinedC]]): Self = StObject.set(x, "warningsUploadId", value.asInstanceOf[js.Any])
  }
}
