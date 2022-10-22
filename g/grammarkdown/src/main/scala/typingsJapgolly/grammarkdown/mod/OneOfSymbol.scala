package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distNodesMod.LexicalSymbol
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OfKeyword
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OneKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "OneOfSymbol")
@js.native
open class OneOfSymbol protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.OneOfSymbol {
  def this(oneKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[OneKeyword]) = this()
  def this(
    oneKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[OfKeyword]
  ) = this()
  def this(
    oneKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: Unit,
    symbols: js.Array[LexicalSymbol]
  ) = this()
  def this(
    oneKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[OfKeyword],
    symbols: js.Array[LexicalSymbol]
  ) = this()
}
