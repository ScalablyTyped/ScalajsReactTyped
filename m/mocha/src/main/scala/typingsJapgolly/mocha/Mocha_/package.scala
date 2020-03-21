package typingsJapgolly.mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Mocha_ {
  /**
    * Async callback function used for tests and hooks.
    */
  type AsyncFunc = js.ThisFunction0[/* this */ typingsJapgolly.mocha.Mocha_.Context, js.Thenable[js.Any]]
  type Done = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  /**
    * Callback function used for tests and hooks.
    */
  type Func = js.ThisFunction1[
    /* this */ typingsJapgolly.mocha.Mocha_.Context, 
    /* done */ typingsJapgolly.mocha.Mocha_.Done, 
    scala.Unit
  ]
  /** @deprecated use `Mocha.Stats` instead. */
  type IStats = typingsJapgolly.mocha.Mocha_.Stats
  /**
    * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
    * nested suites. Indicates this suite should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @returns [bdd] `Suite`
    * @returns [tdd] `void`
    */
  type PendingSuiteFunction = js.Function2[
    /* title */ java.lang.String, 
    /* fn */ js.ThisFunction0[/* this */ typingsJapgolly.mocha.Mocha_.Suite_, scala.Unit], 
    typingsJapgolly.mocha.Mocha_.Suite_ | scala.Unit
  ]
  type TestInterface = js.Function1[/* suite */ typingsJapgolly.mocha.Mocha_.Suite_, scala.Unit]
}
