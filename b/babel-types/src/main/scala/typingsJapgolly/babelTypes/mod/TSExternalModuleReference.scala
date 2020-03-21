package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSExternalModuleReference extends Node {
  var expression: StringLiteral_
  @JSName("type")
  var type_TSExternalModuleReference: typingsJapgolly.babelTypes.babelTypesStrings.TSExternalModuleReference
}

@JSImport("babel-types", "TSExternalModuleReference")
@js.native
object TSExternalModuleReference extends js.Object {
  def apply(expression: StringLiteral_): TSExternalModuleReference = js.native
}

