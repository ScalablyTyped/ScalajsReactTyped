package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SetAccessorSyntax")
@js.native
class SetAccessorSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.SetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SetAccessorSyntax")
@js.native
object SetAccessorSyntax extends js.Object {
  def create(
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.SetAccessorSyntax = js.native
  def create1(propertyName: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.SetAccessorSyntax = js.native
}

