package typingsJapgolly.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalParameterHintOptions extends js.Object {
  val cycle: Boolean
  val enabled: Boolean
}

object InternalParameterHintOptions {
  @scala.inline
  def apply(cycle: Boolean, enabled: Boolean): InternalParameterHintOptions = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InternalParameterHintOptions]
  }
}

