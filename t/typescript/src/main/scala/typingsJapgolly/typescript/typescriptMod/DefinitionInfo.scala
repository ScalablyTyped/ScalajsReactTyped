package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionInfo extends DocumentSpan {
  var containerKind: ScriptElementKind
  var containerName: String
  var kind: ScriptElementKind
  var name: String
}

object DefinitionInfo {
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: String,
    fileName: String,
    kind: ScriptElementKind,
    name: String,
    textSpan: TextSpan,
    contextSpan: TextSpan = null,
    originalContextSpan: TextSpan = null,
    originalFileName: String = null,
    originalTextSpan: TextSpan = null
  ): DefinitionInfo = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    if (contextSpan != null) __obj.updateDynamic("contextSpan")(contextSpan.asInstanceOf[js.Any])
    if (originalContextSpan != null) __obj.updateDynamic("originalContextSpan")(originalContextSpan.asInstanceOf[js.Any])
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName.asInstanceOf[js.Any])
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfo]
  }
}

