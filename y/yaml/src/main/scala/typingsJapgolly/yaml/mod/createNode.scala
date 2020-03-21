package typingsJapgolly.yaml.mod

import typingsJapgolly.yaml.mod.ast.MapBase
import typingsJapgolly.yaml.mod.ast.Scalar
import typingsJapgolly.yaml.mod.ast.SeqBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "createNode")
@js.native
object createNode extends js.Object {
  def apply(value: js.Any): MapBase | SeqBase | Scalar = js.native
}

