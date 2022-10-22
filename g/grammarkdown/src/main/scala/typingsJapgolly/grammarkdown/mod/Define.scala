package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.BooleanKind
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.DefaultKeyword
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.DefineKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Define")
@js.native
open class Define protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.Define {
  def this(
    atToken: typingsJapgolly.grammarkdown.distNodesMod.Token[AtToken],
    defineKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[DefineKeyword],
    key: typingsJapgolly.grammarkdown.distNodesMod.Identifier
  ) = this()
  def this(
    atToken: typingsJapgolly.grammarkdown.distNodesMod.Token[AtToken],
    defineKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[DefineKeyword],
    key: typingsJapgolly.grammarkdown.distNodesMod.Identifier,
    valueToken: typingsJapgolly.grammarkdown.distNodesMod.Token[BooleanKind | DefaultKeyword]
  ) = this()
}
