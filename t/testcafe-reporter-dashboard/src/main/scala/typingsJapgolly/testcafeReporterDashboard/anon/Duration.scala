package typingsJapgolly.testcafeReporterDashboard.anon

import typingsJapgolly.ioTs.mod.BooleanC
import typingsJapgolly.ioTs.mod.BrandC
import typingsJapgolly.ioTs.mod.NumberC
import typingsJapgolly.ioTs.mod.StringC
import typingsJapgolly.ioTs.mod.UndefinedC
import typingsJapgolly.ioTs.mod.UnionC
import typingsJapgolly.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString
import typingsJapgolly.testcafeReporterDashboard.testcafeReporterDashboardInts.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: NumberC
  
  var errorCount: NumberC
  
  var skipped: BooleanC
  
  var testId: BrandC[StringC, MaxLengthString[`10`]]
  
  var unstable: UnionC[js.Tuple2[BooleanC, UndefinedC]]
  
  var uploadId: UnionC[js.Tuple2[StringC, UndefinedC]]
}
object Duration {
  
  inline def apply(
    duration: NumberC,
    errorCount: NumberC,
    skipped: BooleanC,
    testId: BrandC[StringC, MaxLengthString[`10`]],
    unstable: UnionC[js.Tuple2[BooleanC, UndefinedC]],
    uploadId: UnionC[js.Tuple2[StringC, UndefinedC]]
  ): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], unstable = unstable.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: NumberC): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setErrorCount(value: NumberC): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setSkipped(value: BooleanC): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setTestId(value: BrandC[StringC, MaxLengthString[`10`]]): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    inline def setUnstable(value: UnionC[js.Tuple2[BooleanC, UndefinedC]]): Self = StObject.set(x, "unstable", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: UnionC[js.Tuple2[StringC, UndefinedC]]): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
