package typingsJapgolly.domHelpers

import typingsJapgolly.domHelpers.domHelpersBooleans.`false`
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Element
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/isWindow", JSImport.Namespace)
@js.native
object isWindowMod extends js.Object {
  def default(node: Document_): Window_ | `false` = js.native
  def default(node: Element): Window_ | `false` = js.native
  def default(node: Window_): Window_ | `false` = js.native
}

