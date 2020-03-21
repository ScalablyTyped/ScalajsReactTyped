package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLeading
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockBuilder extends js.Object {
  def apply(value: String): Block = js.native
  def apply(value: String, leading: Boolean): Block = js.native
  def apply(value: String, leading: Boolean, trailing: Boolean): Block = js.native
  def from(params: AnonLeading): Block = js.native
}

