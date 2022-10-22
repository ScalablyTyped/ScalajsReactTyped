package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.MetaElementKind
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.AtToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown", "MetaElementBase")
@js.native
open class MetaElementBase[TKind /* <: MetaElementKind */] protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.MetaElementBase[TKind] {
  def this(kind: TKind, atToken: typingsJapgolly.grammarkdown.distNodesMod.Token[AtToken]) = this()
}
