package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.`private`
import typingsJapgolly.babelTypes.babelTypesStrings.`protected`
import typingsJapgolly.babelTypes.babelTypesStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSParameterProperty
  extends Node
     with LVal {
  var accessibility: public | `private` | `protected` | Null
  var parameter: Identifier_ | AssignmentPattern_
  var readonly: Boolean | Null
  @JSName("type")
  var type_TSParameterProperty: typingsJapgolly.babelTypes.babelTypesStrings.TSParameterProperty
}

@JSImport("babel-types", "TSParameterProperty")
@js.native
object TSParameterProperty extends js.Object {
  def apply(parameter: AssignmentPattern_): TSParameterProperty = js.native
  def apply(parameter: Identifier_): TSParameterProperty = js.native
}

