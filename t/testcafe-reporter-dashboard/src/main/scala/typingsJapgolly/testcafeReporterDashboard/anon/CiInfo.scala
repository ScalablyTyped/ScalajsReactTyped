package typingsJapgolly.testcafeReporterDashboard.anon

import typingsJapgolly.ioTs.mod.ArrayC
import typingsJapgolly.ioTs.mod.BrandC
import typingsJapgolly.ioTs.mod.ExactC
import typingsJapgolly.ioTs.mod.NumberC
import typingsJapgolly.ioTs.mod.PartialC
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

trait CiInfo extends StObject {
  
  var buildId: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]]
  
  var ciInfo: UnionC[js.Tuple2[UndefinedC, ReadonlyC[ExactC[PartialC[Author]]]]]
  
  var startTime: DateFromISOStringC
  
  var taskStructure: ArrayC[ReadonlyC[ExactC[TypeC[Fixture]]]]
  
  var testCount: NumberC
  
  var userAgents: ArrayC[StringC]
}
object CiInfo {
  
  inline def apply(
    buildId: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]],
    ciInfo: UnionC[js.Tuple2[UndefinedC, ReadonlyC[ExactC[PartialC[Author]]]]],
    startTime: DateFromISOStringC,
    taskStructure: ArrayC[ReadonlyC[ExactC[TypeC[Fixture]]]],
    testCount: NumberC,
    userAgents: ArrayC[StringC]
  ): CiInfo = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], ciInfo = ciInfo.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], taskStructure = taskStructure.asInstanceOf[js.Any], testCount = testCount.asInstanceOf[js.Any], userAgents = userAgents.asInstanceOf[js.Any])
    __obj.asInstanceOf[CiInfo]
  }
  
  extension [Self <: CiInfo](x: Self) {
    
    inline def setBuildId(value: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]]): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setCiInfo(value: UnionC[js.Tuple2[UndefinedC, ReadonlyC[ExactC[PartialC[Author]]]]]): Self = StObject.set(x, "ciInfo", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: DateFromISOStringC): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTaskStructure(value: ArrayC[ReadonlyC[ExactC[TypeC[Fixture]]]]): Self = StObject.set(x, "taskStructure", value.asInstanceOf[js.Any])
    
    inline def setTestCount(value: NumberC): Self = StObject.set(x, "testCount", value.asInstanceOf[js.Any])
    
    inline def setUserAgents(value: ArrayC[StringC]): Self = StObject.set(x, "userAgents", value.asInstanceOf[js.Any])
  }
}
