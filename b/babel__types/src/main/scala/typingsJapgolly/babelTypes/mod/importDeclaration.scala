package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "importDeclaration")
@js.native
object importDeclaration extends js.Object {
  def apply(
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    source: StringLiteral_
  ): ImportDeclaration_ = js.native
}

