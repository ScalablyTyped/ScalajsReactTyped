package typingsJapgolly.mochaSugarFree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HookFunc = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typingsJapgolly.mochaSugarFree.mod.HookContext, 
    scala.Unit
  ]
  /** Construct a type with the properties of T except for those in type K. */
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type SuiteFunc = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typingsJapgolly.mochaSugarFree.mod.SuiteContext, 
    scala.Unit
  ]
  type TestCase = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typingsJapgolly.mochaSugarFree.mod.TestContext, 
    scala.Unit | js.Thenable[js.Any]
  ]
  type TestCaseWithDone = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typingsJapgolly.mochaSugarFree.mod.TestContextWithDone, 
    scala.Unit
  ]
}
