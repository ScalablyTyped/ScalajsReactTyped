package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "IndexSignatureSyntax")
@js.native
class IndexSignatureSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax {
  def this(
    openBracketToken: ISyntaxToken,
    parameter: typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "IndexSignatureSyntax")
@js.native
object IndexSignatureSyntax extends js.Object {
  def create(
    openBracketToken: ISyntaxToken,
    parameter: typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax,
    closeBracketToken: ISyntaxToken
  ): typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
  def create1(parameter: typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax): typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
}

