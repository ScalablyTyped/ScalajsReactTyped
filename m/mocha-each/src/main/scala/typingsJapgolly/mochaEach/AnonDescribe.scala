package typingsJapgolly.mochaEach

import typingsJapgolly.mocha.mod.Context
import typingsJapgolly.mocha.mod.Suite_
import typingsJapgolly.mocha.mod.Test_
import typingsJapgolly.mochaEach.mod.ForEachDescribeDefinition
import typingsJapgolly.mochaEach.mod.ForEachTestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescribe extends js.Object {
  @JSName("describe")
  var describe_Original: ForEachDescribeDefinition = js.native
  @JSName("it")
  var it_Original: ForEachTestFunction = js.native
  def describe(expectation: String): Suite_ = js.native
  def describe(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Suite_ = js.native
  def it(expectation: String): Test_ = js.native
  def it(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Test_ = js.native
}

