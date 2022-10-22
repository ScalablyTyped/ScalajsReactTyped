package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ImportKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Import")
@js.native
open class Import protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.Import {
  def this(
    atToken: typingsJapgolly.grammarkdown.distNodesMod.Token[AtToken],
    importKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[ImportKeyword]
  ) = this()
  def this(
    atToken: typingsJapgolly.grammarkdown.distNodesMod.Token[AtToken],
    importKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[ImportKeyword],
    path: typingsJapgolly.grammarkdown.distNodesMod.StringLiteral
  ) = this()
}
