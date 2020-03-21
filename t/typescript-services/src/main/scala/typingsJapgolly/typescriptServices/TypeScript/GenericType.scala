package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.GenericType")
@js.native
class GenericType protected () extends AST {
  def this(name: AST, typeArgumentList: TypeArgumentList) = this()
  var name: AST = js.native
  var typeArgumentList: TypeArgumentList = js.native
  def structuralEquals(ast: GenericType, includingPosition: Boolean): Boolean = js.native
}

