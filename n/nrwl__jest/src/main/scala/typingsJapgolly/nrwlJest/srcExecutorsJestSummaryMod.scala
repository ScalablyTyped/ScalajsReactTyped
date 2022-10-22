package typingsJapgolly.nrwlJest

import typingsJapgolly.jestTestResult.mod.AggregatedResult
import typingsJapgolly.nrwlJest.anon.CurrentTestCases
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExecutorsJestSummaryMod {
  
  @JSImport("@nrwl/jest/src/executors/jest/summary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSummary(aggregatedResults: AggregatedResult): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSummary")(aggregatedResults.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSummary(aggregatedResults: AggregatedResult, options: CurrentTestCases): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSummary")(aggregatedResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
