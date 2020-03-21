package typingsJapgolly.cypress.Chai_

import typingsJapgolly.std.Error
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Throw extends js.Object {
  def apply(): Assertion = js.native
  def apply(constructor: js.Function): Assertion = js.native
  def apply(constructor: js.Function, expected: String): Assertion = js.native
  def apply(constructor: js.Function, expected: String, message: String): Assertion = js.native
  def apply(constructor: js.Function, expected: RegExp): Assertion = js.native
  def apply(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
  def apply(constructor: Error): Assertion = js.native
  def apply(constructor: Error, expected: String): Assertion = js.native
  def apply(constructor: Error, expected: String, message: String): Assertion = js.native
  def apply(constructor: Error, expected: RegExp): Assertion = js.native
  def apply(constructor: Error, expected: RegExp, message: String): Assertion = js.native
  def apply(expected: String): Assertion = js.native
  def apply(expected: String, message: String): Assertion = js.native
  def apply(expected: RegExp): Assertion = js.native
  def apply(expected: RegExp, message: String): Assertion = js.native
}

