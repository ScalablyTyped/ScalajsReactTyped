package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeLanguageserverTypes.mod.Position
import typingsJapgolly.vscodeLanguageserverTypes.mod.ReferenceContext
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceParams extends TextDocumentPositionParams {
  var context: ReferenceContext
}

object ReferenceParams {
  @scala.inline
  def apply(context: ReferenceContext, position: Position, textDocument: TextDocumentIdentifier): ReferenceParams = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReferenceParams]
  }
}

