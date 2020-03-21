package typingsJapgolly.jestJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AsyncExpectationResult = js.Promise[typingsJapgolly.jestJasmine2.typesMod.SyncExpectationResult]
  type ExpectationResult = typingsJapgolly.jestJasmine2.typesMod.SyncExpectationResult | typingsJapgolly.jestJasmine2.typesMod.AsyncExpectationResult
  type RawMatcherFn = js.Function3[
    /* expected */ js.Any, 
    /* actual */ js.Any, 
    /* options */ js.UndefOr[js.Any], 
    typingsJapgolly.jestJasmine2.typesMod.ExpectationResult
  ]
}
