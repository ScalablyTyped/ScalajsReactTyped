package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeAnnotationSyntax")
@js.native
class TypeAnnotationSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax {
  def this(colonToken: ISyntaxToken, `type`: ITypeSyntax, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "TypeAnnotationSyntax")
@js.native
object TypeAnnotationSyntax extends js.Object {
  def create1(`type`: ITypeSyntax): typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax = js.native
}

