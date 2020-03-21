package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonBodyArray
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSModuleBlockBuilder extends js.Object {
  def apply(body: js.Array[StatementKind]): TSModuleBlock = js.native
  def from(params: AnonBodyArray): TSModuleBlock = js.native
}

