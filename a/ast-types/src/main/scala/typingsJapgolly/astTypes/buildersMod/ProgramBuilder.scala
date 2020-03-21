package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonBody
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgramBuilder extends js.Object {
  def apply(body: js.Array[StatementKind]): Program = js.native
  def from(params: AnonBody): Program = js.native
}

