package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distNodesMod.ProseFragment
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.GreaterThanToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Prose")
@js.native
open class Prose protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.Prose {
  def this(greaterThanToken: typingsJapgolly.grammarkdown.distNodesMod.Token[GreaterThanToken]) = this()
  def this(
    greaterThanToken: typingsJapgolly.grammarkdown.distNodesMod.Token[GreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
}
