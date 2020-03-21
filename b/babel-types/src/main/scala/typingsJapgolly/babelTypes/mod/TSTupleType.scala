package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTupleType
  extends Node
     with TSType {
  var elementTypes: js.Array[TSType]
  @JSName("type")
  var type_TSTupleType: typingsJapgolly.babelTypes.babelTypesStrings.TSTupleType
}

@JSImport("babel-types", "TSTupleType")
@js.native
object TSTupleType extends js.Object {
  def apply(elementTypes: js.Array[TSType]): TSTupleType = js.native
}

