package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.TriviaKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown", "TriviaBase")
@js.native
open class TriviaBase[TKind /* <: TriviaKind */] protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.TriviaBase[TKind] {
  def this(kind: TKind) = this()
}
