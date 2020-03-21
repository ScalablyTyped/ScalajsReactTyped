package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.typescriptStrings.camelCase
import typingsJapgolly.typescript.typescriptStrings.exact
import typingsJapgolly.typescript.typescriptStrings.prefix
import typingsJapgolly.typescript.typescriptStrings.substring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToItem extends js.Object {
  var containerKind: ScriptElementKind
  var containerName: java.lang.String
  var fileName: java.lang.String
  var isCaseSensitive: Boolean
  var kind: ScriptElementKind
  var kindModifiers: java.lang.String
  var matchKind: exact | prefix | substring | camelCase
  var name: java.lang.String
  var textSpan: TextSpan
}

object NavigateToItem {
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: java.lang.String,
    fileName: java.lang.String,
    isCaseSensitive: Boolean,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    matchKind: exact | prefix | substring | camelCase,
    name: java.lang.String,
    textSpan: TextSpan
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], isCaseSensitive = isCaseSensitive.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigateToItem]
  }
}

