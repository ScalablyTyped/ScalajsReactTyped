package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.typescriptBooleans.`false`
import typingsJapgolly.typescript.typescriptBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typescript.mod.RenameInfoSuccess
  - typingsJapgolly.typescript.mod.RenameInfoFailure
*/
trait RenameInfo extends js.Object

object RenameInfo {
  @scala.inline
  def RenameInfoSuccess(
    canRename: `true`,
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan,
    fileToRename: java.lang.String = null
  ): RenameInfo = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    if (fileToRename != null) __obj.updateDynamic("fileToRename")(fileToRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfo]
  }
  @scala.inline
  def RenameInfoFailure(canRename: `false`, localizedErrorMessage: java.lang.String): RenameInfo = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenameInfo]
  }
}

