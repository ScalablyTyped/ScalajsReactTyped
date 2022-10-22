package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.OptionalSymbolKind
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.QuestionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown", "OptionalSymbolBase")
@js.native
open class OptionalSymbolBase[TKind /* <: OptionalSymbolKind */] protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.OptionalSymbolBase[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: typingsJapgolly.grammarkdown.distNodesMod.Token[QuestionToken]) = this()
}
