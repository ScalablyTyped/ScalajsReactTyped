package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Inline
import typingsJapgolly.slate.mod.InlineJSON
import typingsJapgolly.slate.mod.InlineProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallInline extends js.Object {
  def apply(`inline`: String): Controller = js.native
  def apply(`inline`: Inline): Controller = js.native
  def apply(`inline`: InlineJSON): Controller = js.native
  def apply(`inline`: InlineProperties): Controller = js.native
}

