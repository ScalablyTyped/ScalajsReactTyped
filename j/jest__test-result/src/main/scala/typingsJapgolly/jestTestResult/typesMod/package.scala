package typingsJapgolly.jestTestResult

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Bytes = scala.Double
  type CodeCoverageFormatter = js.Function2[
    /* coverage */ js.UndefOr[typingsJapgolly.istanbulLibCoverage.mod.CoverageMapData | scala.Null], 
    /* reporter */ typingsJapgolly.jestTestResult.typesMod.CodeCoverageReporter, 
    js.UndefOr[(typingsJapgolly.std.Record[java.lang.String, js.Any]) | scala.Null]
  ]
  type CodeCoverageReporter = js.Any
  type Milliseconds = scala.Double
}
