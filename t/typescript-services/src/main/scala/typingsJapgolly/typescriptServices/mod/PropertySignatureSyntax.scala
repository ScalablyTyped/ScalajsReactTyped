package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PropertySignatureSyntax")
@js.native
class PropertySignatureSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.PropertySignatureSyntax {
  def this(
    propertyName: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "PropertySignatureSyntax")
@js.native
object PropertySignatureSyntax extends js.Object {
  def create(propertyName: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.PropertySignatureSyntax = js.native
  def create1(propertyName: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.PropertySignatureSyntax = js.native
}

