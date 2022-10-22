package typingsJapgolly.grammarkdown.distNodesMod

import typingsJapgolly.grammarkdown.distTokensMod.ProseFragmentLiteralKind
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "ProseFragmentLiteral")
@js.native
open class ProseFragmentLiteral[TKind /* <: ProseFragmentLiteralKind */] protected ()
  extends Node[SyntaxKind]
     with TextContent {
  def this(kind: SyntaxKind) = this()
  def this(kind: SyntaxKind, text: String) = this()
}
