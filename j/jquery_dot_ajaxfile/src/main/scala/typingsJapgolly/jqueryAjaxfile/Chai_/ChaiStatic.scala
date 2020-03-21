package typingsJapgolly.jqueryAjaxfile.Chai_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiStatic extends js.Object {
  @JSName("assert")
  var assert_Original: AssertStatic = js.native
  var config: Config = js.native
  @JSName("expect")
  var expect_Original: ExpectStatic = js.native
  /**
    * @param expression Expression to test for truthiness.
    * @param message Message to display on error.
    */
  def assert(expression: js.Any): Unit = js.native
  def assert(expression: js.Any, message: String): Unit = js.native
  def expect(target: js.Any): Assertion = js.native
  def expect(target: js.Any, message: String): Assertion = js.native
  def should(): Should = js.native
  /**
    * Provides a way to extend the internals of Chai
    */
  def use(fn: js.Function2[/* chai */ js.Any, /* utils */ js.Any, Unit]): js.Any = js.native
}

