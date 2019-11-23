package typingsJapgolly.typescript.typescriptMod

import typingsJapgolly.typescript.typescriptNumbers.`false`
import typingsJapgolly.typescript.typescriptNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typescript.typescriptMod.RenameInfoSuccess
  - typings.typescript.typescriptMod.RenameInfoFailure
*/
trait RenameInfo extends js.Object

object RenameInfo {
  @scala.inline
  def RenameInfoSuccess(
    canRename: `true`,
    displayName: String,
    fullDisplayName: String,
    kind: ScriptElementKind,
    kindModifiers: String,
    triggerSpan: TextSpan,
    fileToRename: String = null
  ): RenameInfo = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    if (fileToRename != null) __obj.updateDynamic("fileToRename")(fileToRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfo]
  }
  @scala.inline
  def RenameInfoFailure(canRename: `false`, localizedErrorMessage: String): RenameInfo = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenameInfo]
  }
}

