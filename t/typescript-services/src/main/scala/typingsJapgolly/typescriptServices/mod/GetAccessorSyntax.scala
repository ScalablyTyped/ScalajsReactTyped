package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "GetAccessorSyntax")
@js.native
class GetAccessorSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
    typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "GetAccessorSyntax")
@js.native
object GetAccessorSyntax extends js.Object {
  def create(
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax = js.native
  def create1(propertyName: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax = js.native
}

