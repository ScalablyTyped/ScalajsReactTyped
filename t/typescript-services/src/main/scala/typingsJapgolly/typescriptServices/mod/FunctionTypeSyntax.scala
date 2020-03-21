package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionTypeSyntax")
@js.native
class FunctionTypeSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.FunctionTypeSyntax {
  def this(
    typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
    parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionTypeSyntax")
@js.native
object FunctionTypeSyntax extends js.Object {
  def create(
    parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
  def create1(`type`: ITypeSyntax): typingsJapgolly.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
}

