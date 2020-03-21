package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameterDeclaration extends Node {
  var params: js.Array[TSTypeParameter]
  @JSName("type")
  var type_TSTypeParameterDeclaration: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeParameterDeclaration
}

@JSImport("babel-types", "TSTypeParameterDeclaration")
@js.native
object TSTypeParameterDeclaration extends js.Object {
  def apply(params: js.Array[TSTypeParameter]): TSTypeParameterDeclaration = js.native
}

