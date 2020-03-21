package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MethodSignatureSyntax")
@js.native
class MethodSignatureSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax {
  def this(
    propertyName: ISyntaxToken,
    questionToken: ISyntaxToken,
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "MethodSignatureSyntax")
@js.native
object MethodSignatureSyntax extends js.Object {
  def create(
    propertyName: ISyntaxToken,
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
  def create1(propertyName: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
}

