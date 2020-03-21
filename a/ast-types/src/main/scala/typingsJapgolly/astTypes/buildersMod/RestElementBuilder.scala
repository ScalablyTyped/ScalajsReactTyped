package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTypeAnnotation
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.RestElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestElementBuilder extends js.Object {
  def apply(argument: PatternKind): RestElement = js.native
  def from(params: AnonTypeAnnotation): RestElement = js.native
}

