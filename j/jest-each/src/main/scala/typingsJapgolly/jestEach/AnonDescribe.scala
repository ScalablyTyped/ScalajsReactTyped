package typingsJapgolly.jestEach

import typingsJapgolly.jestTypes.globalMod.EachTestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescribe extends js.Object {
  var describe: AnonCall = js.native
  var it: AnonCall = js.native
  var test: AnonCall = js.native
  def fdescribe(title: String, test: EachTestFn): Unit = js.native
  def fdescribe(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def fit(title: String, test: EachTestFn): Unit = js.native
  def fit(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def xdescribe(title: String, test: EachTestFn): Unit = js.native
  def xdescribe(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def xit(title: String, test: EachTestFn): Unit = js.native
  def xit(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def xtest(title: String, test: EachTestFn): Unit = js.native
  def xtest(title: String, test: EachTestFn, timeout: Double): Unit = js.native
}

