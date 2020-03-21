package typingsJapgolly.postcss

import typingsJapgolly.postcss.mod.Processor
import typingsJapgolly.postcss.mod.TransformCallback
import typingsJapgolly.postcss.mod._AcceptedPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostcss extends _AcceptedPlugin {
  var postcss: TransformCallback | Processor
}

object AnonPostcss {
  @scala.inline
  def apply(postcss: TransformCallback | Processor): AnonPostcss = {
    val __obj = js.Dynamic.literal(postcss = postcss.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPostcss]
  }
}

