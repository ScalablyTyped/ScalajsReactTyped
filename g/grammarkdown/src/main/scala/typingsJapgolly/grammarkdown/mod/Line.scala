package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.DefaultKeyword
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.LineKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Line")
@js.native
open class Line protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.Line {
  def this(
    atToken: typingsJapgolly.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[LineKeyword]
  ) = this()
  def this(
    atToken: typingsJapgolly.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[LineKeyword],
    number: typingsJapgolly.grammarkdown.distNodesMod.NumberLiteral
  ) = this()
  def this(
    atToken: typingsJapgolly.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[LineKeyword],
    number: typingsJapgolly.grammarkdown.distNodesMod.Token[DefaultKeyword]
  ) = this()
  def this(
    atToken: typingsJapgolly.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[LineKeyword],
    number: Unit,
    path: typingsJapgolly.grammarkdown.distNodesMod.StringLiteral
  ) = this()
  def this(
    atToken: typingsJapgolly.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[LineKeyword],
    number: typingsJapgolly.grammarkdown.distNodesMod.NumberLiteral,
    path: typingsJapgolly.grammarkdown.distNodesMod.StringLiteral
  ) = this()
  def this(
    atToken: typingsJapgolly.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[LineKeyword],
    number: typingsJapgolly.grammarkdown.distNodesMod.Token[DefaultKeyword],
    path: typingsJapgolly.grammarkdown.distNodesMod.StringLiteral
  ) = this()
}
