package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSArrayType
  extends Node
     with TSType {
  var elementType: TSType
  @JSName("type")
  var type_TSArrayType: typingsJapgolly.babelTypes.babelTypesStrings.TSArrayType
}

@JSImport("babel-types", "TSArrayType")
@js.native
object TSArrayType extends js.Object {
  def apply(elementType: TSType): TSArrayType = js.native
}

