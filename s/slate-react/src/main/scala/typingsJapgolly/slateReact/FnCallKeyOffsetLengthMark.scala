package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Mark
import typingsJapgolly.slate.mod.MarkJSON
import typingsJapgolly.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallKeyOffsetLengthMark extends js.Object {
  def apply(key: String, offset: Double, length: Double, mark: String): Controller = js.native
  def apply(key: String, offset: Double, length: Double, mark: Mark): Controller = js.native
  def apply(key: String, offset: Double, length: Double, mark: MarkJSON): Controller = js.native
  def apply(key: String, offset: Double, length: Double, mark: MarkProperties): Controller = js.native
}

