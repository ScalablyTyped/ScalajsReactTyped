package typingsJapgolly.grammarkdown.distNodesMod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ImportKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Import")
@js.native
open class Import protected ()
  extends MetaElementBase[typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Import]
     with MetaElement {
  def this(atToken: Token[AtToken], importKeyword: Token[ImportKeyword]) = this()
  def this(atToken: Token[AtToken], importKeyword: Token[ImportKeyword], path: StringLiteral) = this()
  
  val importKeyword: Token[ImportKeyword] = js.native
  
  val path: js.UndefOr[StringLiteral] = js.native
}
