package typingsJapgolly.yaml.mod

import typingsJapgolly.yaml.mod.ast.MapBase
import typingsJapgolly.yaml.mod.ast.Scalar
import typingsJapgolly.yaml.mod.ast.SeqBase
import typingsJapgolly.yaml.yamlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "createNode")
@js.native
object createNode_true extends js.Object {
  def apply(value: js.Any, wrapScalars: `true`): MapBase | SeqBase | Scalar = js.native
  def apply(value: js.Any, wrapScalars: `true`, tag: String): MapBase | SeqBase | Scalar = js.native
}

