package typingsJapgolly.easyXapiSupertest

import typingsJapgolly.std.Error
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("assert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AssertionError () extends Error {
    def this(options: AnonActual) = this()
    var actual: js.Any = js.native
    var expected: js.Any = js.native
    var generatedMessage: Boolean = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var operator: String = js.native
  }
  
  def apply(value: js.Any): Unit = js.native
  def apply(value: js.Any, message: String): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def fail(): Unit = js.native
  def fail(actual: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): Unit = js.native
  def ifError(value: js.Any): Unit = js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any, message: String): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def ok(value: js.Any): Unit = js.native
  def ok(value: js.Any, message: String): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  @js.native
  object doesNotThrow extends js.Object {
    def apply(block: js.Function): Unit = js.native
    def apply(block: js.Function, error: js.Function): Unit = js.native
    def apply(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
    def apply(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
    def apply(block: js.Function, error: js.Function, message: String): Unit = js.native
    def apply(block: js.Function, error: RegExp): Unit = js.native
    def apply(block: js.Function, error: RegExp, message: String): Unit = js.native
    def apply(block: js.Function, message: String): Unit = js.native
  }
  
  @js.native
  object throws extends js.Object {
    def apply(block: js.Function): Unit = js.native
    def apply(block: js.Function, error: js.Function): Unit = js.native
    def apply(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
    def apply(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
    def apply(block: js.Function, error: js.Function, message: String): Unit = js.native
    def apply(block: js.Function, error: RegExp): Unit = js.native
    def apply(block: js.Function, error: RegExp, message: String): Unit = js.native
    def apply(block: js.Function, message: String): Unit = js.native
  }
  
}

