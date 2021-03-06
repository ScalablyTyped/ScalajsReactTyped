package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileExtensionInfo extends js.Object {
  var extension: java.lang.String
  var isMixedContent: Boolean
  var scriptKind: js.UndefOr[ScriptKind] = js.undefined
}

object FileExtensionInfo {
  @scala.inline
  def apply(extension: java.lang.String, isMixedContent: Boolean, scriptKind: ScriptKind = null): FileExtensionInfo = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], isMixedContent = isMixedContent.asInstanceOf[js.Any])
    if (scriptKind != null) __obj.updateDynamic("scriptKind")(scriptKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileExtensionInfo]
  }
}

