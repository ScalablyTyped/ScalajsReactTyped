package typingsJapgolly.monacoEditor.mod.worker

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMirrorModel extends js.Object {
  val uri: Uri
  val version: Double
  def getValue(): String
}

object IMirrorModel {
  @scala.inline
  def apply(getValue: CallbackTo[String], uri: Uri, version: Double): IMirrorModel = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.asInstanceOf[IMirrorModel]
  }
}

