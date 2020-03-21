package typingsJapgolly.expect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AsymmetricMatcher = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type AsyncExpectationResult = js.Promise[typingsJapgolly.expect.typesMod.SyncExpectationResult]
  type ExpectationResult = typingsJapgolly.expect.typesMod.SyncExpectationResult | typingsJapgolly.expect.typesMod.AsyncExpectationResult
  type MatchersObject = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.expect.typesMod.RawMatcherFn]
  type PromiseMatcherFn = js.Function1[/* actual */ js.Any, js.Promise[scala.Unit]]
  type Tester = js.Function2[/* a */ js.Any, /* b */ js.Any, js.UndefOr[scala.Boolean]]
  type ThrowingMatcherFn = js.Function1[/* actual */ js.Any, scala.Unit]
}
