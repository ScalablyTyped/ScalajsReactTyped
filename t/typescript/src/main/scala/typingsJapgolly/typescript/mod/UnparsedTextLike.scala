package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.UnparsedInternalText
import typingsJapgolly.typescript.mod.SyntaxKind.UnparsedText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnparsedTextLike
  extends UnparsedSection
     with UnparsedSourceText {
  @JSName("kind")
  var kind_UnparsedTextLike: UnparsedText | UnparsedInternalText = js.native
}

