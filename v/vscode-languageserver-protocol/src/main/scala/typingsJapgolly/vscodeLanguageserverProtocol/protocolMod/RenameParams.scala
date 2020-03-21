package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeLanguageserverTypes.mod.Position
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameParams extends js.Object {
  /**
    * The new name of the symbol. If the given name is not valid the
    * request must return a [ResponseError](#ResponseError) with an
    * appropriate message set.
    */
  var newName: String
  /**
    * The position at which this request was sent.
    */
  var position: Position
  /**
    * The document to rename.
    */
  var textDocument: TextDocumentIdentifier
}

object RenameParams {
  @scala.inline
  def apply(newName: String, position: Position, textDocument: TextDocumentIdentifier): RenameParams = {
    val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenameParams]
  }
}

