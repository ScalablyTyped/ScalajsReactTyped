package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distNodesMod.LexicalSymbol
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.ButKeyword
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.NotKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "ButNotSymbol")
@js.native
open class ButNotSymbol protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.ButNotSymbol {
  def this(left: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[ButKeyword]) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: Unit,
    notKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[NotKeyword]
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[ButKeyword],
    notKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[NotKeyword]
  ) = this()
  def this(left: LexicalSymbol, butKeyword: Unit, notKeyword: Unit, right: LexicalSymbol) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: Unit,
    notKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[ButKeyword],
    notKeyword: Unit,
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[ButKeyword],
    notKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
}
