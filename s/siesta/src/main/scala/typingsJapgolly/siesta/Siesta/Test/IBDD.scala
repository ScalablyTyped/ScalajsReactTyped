package typingsJapgolly.siesta.Siesta.Test

import typingsJapgolly.siesta.Siesta.Test.BDD.Expectation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait IBDD extends js.Object {
  def any(clsConstructor: js.Function): js.Any = js.native
  def ddescribe(name: String, code: js.Function): Unit = js.native
  def ddescribe(name: String, code: js.Function, timeout: Double): Unit = js.native
  def describe(name: String, code: js.Function): Unit = js.native
  def describe(name: String, code: js.Function, timeout: Double): Unit = js.native
  def expect(value: js.Any): Expectation = js.native
  def iit(name: String, code: js.Function): Unit = js.native
  def iit(name: String, code: js.Function, timeout: Double): Unit = js.native
  def it(name: String, code: js.Function): Unit = js.native
  def it(name: String, code: js.Function, timeout: Double): Unit = js.native
  def xdescribe(name: String, code: js.Function): Unit = js.native
  def xdescribe(name: String, code: js.Function, timeout: Double): Unit = js.native
  def xit(name: String, code: js.Function): Unit = js.native
  def xit(name: String, code: js.Function, timeout: Double): Unit = js.native
}

