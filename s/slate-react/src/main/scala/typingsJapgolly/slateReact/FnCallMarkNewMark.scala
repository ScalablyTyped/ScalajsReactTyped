package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Mark
import typingsJapgolly.slate.mod.MarkJSON
import typingsJapgolly.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallMarkNewMark extends js.Object {
  def apply(mark: String, newMark: String): Controller = js.native
  def apply(mark: String, newMark: Mark): Controller = js.native
  def apply(mark: String, newMark: MarkJSON): Controller = js.native
  def apply(mark: String, newMark: MarkProperties): Controller = js.native
  def apply(mark: MarkJSON, newMark: String): Controller = js.native
  def apply(mark: MarkJSON, newMark: Mark): Controller = js.native
  def apply(mark: MarkJSON, newMark: MarkJSON): Controller = js.native
  def apply(mark: MarkJSON, newMark: MarkProperties): Controller = js.native
  def apply(mark: MarkProperties, newMark: String): Controller = js.native
  def apply(mark: MarkProperties, newMark: Mark): Controller = js.native
  def apply(mark: MarkProperties, newMark: MarkJSON): Controller = js.native
  def apply(mark: MarkProperties, newMark: MarkProperties): Controller = js.native
  def apply(mark: Mark, newMark: String): Controller = js.native
  def apply(mark: Mark, newMark: Mark): Controller = js.native
  def apply(mark: Mark, newMark: MarkJSON): Controller = js.native
  def apply(mark: Mark, newMark: MarkProperties): Controller = js.native
}

