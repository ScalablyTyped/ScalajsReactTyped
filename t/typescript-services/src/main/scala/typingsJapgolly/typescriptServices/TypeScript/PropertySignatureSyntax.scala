package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PropertySignatureSyntax")
@js.native
class PropertySignatureSyntax protected () extends SyntaxNode {
  def this(
    propertyName: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var propertyName: ISyntaxToken = js.native
  var questionToken: ISyntaxToken = js.native
  var typeAnnotation: TypeAnnotationSyntax = js.native
  def update(propertyName: ISyntaxToken, questionToken: ISyntaxToken, typeAnnotation: TypeAnnotationSyntax): PropertySignatureSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): PropertySignatureSyntax = js.native
  def withQuestionToken(questionToken: ISyntaxToken): PropertySignatureSyntax = js.native
  def withTypeAnnotation(typeAnnotation: TypeAnnotationSyntax): PropertySignatureSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.PropertySignatureSyntax")
@js.native
object PropertySignatureSyntax extends js.Object {
  def create(propertyName: ISyntaxToken): PropertySignatureSyntax = js.native
  def create1(propertyName: ISyntaxToken): PropertySignatureSyntax = js.native
}

