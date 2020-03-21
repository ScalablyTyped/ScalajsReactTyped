package typingsJapgolly.mochaEach

import typingsJapgolly.mocha.Mocha_.SuiteFunction
import typingsJapgolly.mocha.Mocha_.TestFunction
import typingsJapgolly.mocha.mod.Context
import typingsJapgolly.mocha.mod.Suite_
import typingsJapgolly.mocha.mod.Test_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha-each", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * This interface describes the kind of `describe` available from a `forEach` call.
    * The result is almost identical to Mocha's `SuiteFunction` interface.
    */
  @js.native
  trait ForEachDescribeDefinition extends js.Object {
    def apply(expectation: String): Suite_ = js.native
    def apply(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Suite_ = js.native
    def only(expectation: String): Suite_ = js.native
    def only(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Suite_ = js.native
    def skip(expectation: String): Suite_ = js.native
    def skip(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Suite_ = js.native
  }
  
  /**
    * This interface describes the kind of `it` available from a `forEach` call.
    * The result is very similar to Mocha's `TestFunction` interface.
    */
  @js.native
  trait ForEachTestFunction extends js.Object {
    def apply(expectation: String): Test_ = js.native
    def apply(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Test_ = js.native
    def only(expectation: String): Test_ = js.native
    def only(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Test_ = js.native
    def skip(expectation: String): Test_ = js.native
    def skip(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Test_ = js.native
  }
  
  /**
    * This function takes an array collections of parameters to be used in
    * a series of mocha tests, defined using the `it` or `describe` notation common to
    * Mocha.
    */
  def apply(parameters: js.Array[_]): AnonDescribe = js.native
  def apply(parameters: js.Array[_], dIt: TestFunction): AnonDescribe = js.native
  def apply(parameters: js.Array[_], dIt: TestFunction, dDescribe: SuiteFunction): AnonDescribe = js.native
}

