package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ConstructorTypeSyntax")
@js.native
class ConstructorTypeSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ConstructorTypeSyntax {
  def this(
    newKeyword: ISyntaxToken,
    typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
    parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ConstructorTypeSyntax")
@js.native
object ConstructorTypeSyntax extends js.Object {
  def create(
    newKeyword: ISyntaxToken,
    parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
  def create1(`type`: ITypeSyntax): typingsJapgolly.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
}

