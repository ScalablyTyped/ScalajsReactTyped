package typingsJapgolly.jasmine.jasmine

import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine.stringMatching")
@js.native
object stringMatching extends js.Object {
  def apply(str: String): AsymmetricMatcher[String] = js.native
  def apply(str: RegExp): AsymmetricMatcher[String] = js.native
}

