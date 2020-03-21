package typingsJapgolly.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderVariable extends ReaderArgument {
  val kind: String
   // 'Variable';
  val name: String
  val `type`: js.UndefOr[String | Null] = js.undefined
  val variableName: String
}

object ReaderVariable {
  @scala.inline
  def apply(kind: String, name: String, variableName: String, `type`: String = null): ReaderVariable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderVariable]
  }
}

