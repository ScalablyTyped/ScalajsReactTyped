package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSModuleBlock extends Node {
  var body: js.Array[Statement]
  @JSName("type")
  var type_TSModuleBlock: typingsJapgolly.babelTypes.babelTypesStrings.TSModuleBlock
}

@JSImport("babel-types", "TSModuleBlock")
@js.native
object TSModuleBlock extends js.Object {
  def apply(body: js.Array[Statement]): TSModuleBlock = js.native
}

