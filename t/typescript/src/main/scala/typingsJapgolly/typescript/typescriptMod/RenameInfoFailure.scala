package typingsJapgolly.typescript.typescriptMod

import typingsJapgolly.typescript.typescriptNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameInfoFailure extends RenameInfo {
  var canRename: `false`
  var localizedErrorMessage: String
}

object RenameInfoFailure {
  @scala.inline
  def apply(canRename: `false`, localizedErrorMessage: String): RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenameInfoFailure]
  }
}

