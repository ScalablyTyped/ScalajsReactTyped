package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLeading
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.CommentBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentBlockBuilder extends js.Object {
  def apply(value: String): CommentBlock = js.native
  def apply(value: String, leading: Boolean): CommentBlock = js.native
  def apply(value: String, leading: Boolean, trailing: Boolean): CommentBlock = js.native
  def from(params: AnonLeading): CommentBlock = js.native
}

