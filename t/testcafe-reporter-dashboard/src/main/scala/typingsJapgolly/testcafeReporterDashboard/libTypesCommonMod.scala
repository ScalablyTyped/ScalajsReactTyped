package typingsJapgolly.testcafeReporterDashboard

import typingsJapgolly.ioTs.mod.BrandC
import typingsJapgolly.ioTs.mod.StringC
import typingsJapgolly.ioTs.mod.TypeOf
import typingsJapgolly.ioTs.mod.UndefinedC
import typingsJapgolly.ioTs.mod.UnionC
import typingsJapgolly.testcafeReporterDashboard.testcafeReporterDashboardInts.`100`
import typingsJapgolly.testcafeReporterDashboard.testcafeReporterDashboardInts.`10`
import typingsJapgolly.testcafeReporterDashboard.testcafeReporterDashboardInts.`190`
import typingsJapgolly.testcafeReporterDashboard.testcafeReporterDashboardInts.`300`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesCommonMod {
  
  @JSImport("testcafe-reporter-dashboard/lib/types/common", "AggregateId")
  @js.native
  val AggregateId: BrandC[StringC, MaxLengthString[`190`]] = js.native
  
  @JSImport("testcafe-reporter-dashboard/lib/types/common", "BuildIdSchema")
  @js.native
  val BuildIdSchema: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]] = js.native
  
  trait MaxLengthString[N] extends StObject {
    
    val MaxLengthString: js.Symbol
    
    val length: N
  }
  object MaxLengthString {
    
    @JSImport("testcafe-reporter-dashboard/lib/types/common", "MaxLengthString")
    @js.native
    def apply[N /* <: Double */](len: N): BrandC[StringC, MaxLengthString[N]] = js.native
    
    extension [Self <: MaxLengthString[?], N](x: Self & MaxLengthString[N]) {
      
      inline def setLength(value: N): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthString(value: js.Symbol): Self = StObject.set(x, "MaxLengthString", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("testcafe-reporter-dashboard/lib/types/common", "NameSchema")
  @js.native
  val NameSchema: BrandC[StringC, MaxLengthString[`300`]] = js.native
  
  @JSImport("testcafe-reporter-dashboard/lib/types/common", "ShortIdSchema")
  @js.native
  val ShortIdSchema: BrandC[StringC, MaxLengthString[`10`]] = js.native
  
  type BuildId = TypeOf[UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]]]
  
  type Name = TypeOf[BrandC[StringC, MaxLengthString[`300`]]]
  
  type ShortId = TypeOf[BrandC[StringC, MaxLengthString[`10`]]]
}
