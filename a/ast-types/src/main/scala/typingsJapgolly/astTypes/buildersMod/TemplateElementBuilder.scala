package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCooked
import typingsJapgolly.astTypes.AnonTail
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TemplateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateElementBuilder extends js.Object {
  def apply(value: AnonCooked, tail: Boolean): TemplateElement = js.native
  def from(params: AnonTail): TemplateElement = js.native
}

