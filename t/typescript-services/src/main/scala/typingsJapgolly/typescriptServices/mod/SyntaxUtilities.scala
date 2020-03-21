package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IModuleElementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxUtilities")
@js.native
class SyntaxUtilities ()
  extends typingsJapgolly.typescriptServices.TypeScript.SyntaxUtilities

/* static members */
@JSImport("typescript-services", "SyntaxUtilities")
@js.native
object SyntaxUtilities extends js.Object {
  def containsToken(list: ISyntaxList, kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def getExportKeyword(moduleElement: IModuleElementSyntax): ISyntaxToken = js.native
  def getToken(list: ISyntaxList, kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  def hasExportKeyword(moduleElement: IModuleElementSyntax): Boolean = js.native
  def isAmbientDeclarationSyntax(positionNode: typingsJapgolly.typescriptServices.TypeScript.PositionedNode): Boolean = js.native
  def isAngleBracket(positionedElement: typingsJapgolly.typescriptServices.TypeScript.PositionedElement): Boolean = js.native
}

