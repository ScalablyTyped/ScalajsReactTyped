package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ParameterSyntax")
@js.native
class ParameterSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax {
  def this(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
    equalsValueClause: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ParameterSyntax")
@js.native
object ParameterSyntax extends js.Object {
  def create(identifier: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax = js.native
  def create1(identifier: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax = js.native
}

