package typingsJapgolly.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDimension extends js.Object {
  var height: Double
  var width: Double
}

object IDimension {
  @scala.inline
  def apply(height: Double, width: Double): IDimension = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDimension]
  }
}

