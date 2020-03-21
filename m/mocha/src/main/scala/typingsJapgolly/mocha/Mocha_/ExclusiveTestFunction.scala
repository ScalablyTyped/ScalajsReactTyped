package typingsJapgolly.mocha.Mocha_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusiveTestFunction extends js.Object {
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(fn: AsyncFunc): Test_ = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(fn: Func): Test_ = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
    * callback `fn` acting as a thunk. Indicates this test should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(title: String): Test_ = js.native
  def apply(title: String, fn: AsyncFunc): Test_ = js.native
  def apply(title: String, fn: Func): Test_ = js.native
}

