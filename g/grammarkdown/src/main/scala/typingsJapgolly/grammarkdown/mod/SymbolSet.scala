package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CloseBraceToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBraceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "SymbolSet")
@js.native
open class SymbolSet protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.SymbolSet {
  def this(openBraceToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBraceToken]) = this()
  def this(
    openBraceToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: js.Array[typingsJapgolly.grammarkdown.distNodesMod.SymbolSpan]
  ) = this()
  def this(
    openBraceToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: js.Array[typingsJapgolly.grammarkdown.distNodesMod.SymbolSpan],
    closeBraceToken: typingsJapgolly.grammarkdown.distNodesMod.Token[CloseBraceToken]
  ) = this()
  def this(
    openBraceToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: Unit,
    closeBraceToken: typingsJapgolly.grammarkdown.distNodesMod.Token[CloseBraceToken]
  ) = this()
}
