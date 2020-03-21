package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypePredicate
  extends Node
     with TSType {
  var parameterName: Identifier_ | TSThisType
  var typeAnnotation: TSTypeAnnotation
  @JSName("type")
  var type_TSTypePredicate: typingsJapgolly.babelTypes.babelTypesStrings.TSTypePredicate
}

@JSImport("babel-types", "TSTypePredicate")
@js.native
object TSTypePredicate extends js.Object {
  def apply(parameterName: Identifier_, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
  def apply(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
}

