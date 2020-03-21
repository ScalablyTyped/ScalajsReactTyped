package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeQuery
  extends Node
     with TSType {
  var exprName: TSEntityName
  @JSName("type")
  var type_TSTypeQuery: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeQuery
}

@JSImport("babel-types", "TSTypeQuery")
@js.native
object TSTypeQuery extends js.Object {
  def apply(exprName: TSEntityName): TSTypeQuery = js.native
}

