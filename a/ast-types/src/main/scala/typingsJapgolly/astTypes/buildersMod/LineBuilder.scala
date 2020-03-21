package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLeading
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineBuilder extends js.Object {
  def apply(value: String): Line = js.native
  def apply(value: String, leading: Boolean): Line = js.native
  def apply(value: String, leading: Boolean, trailing: Boolean): Line = js.native
  def from(params: AnonLeading): Line = js.native
}

