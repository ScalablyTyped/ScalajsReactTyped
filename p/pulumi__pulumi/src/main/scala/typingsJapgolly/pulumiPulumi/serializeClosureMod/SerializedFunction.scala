package typingsJapgolly.pulumiPulumi.serializeClosureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedFunction extends js.Object {
  /**
    * The name of the exported module member.
    */
  var exportName: String
  /**
    * The text of a JavaScript module which exports a single name bound to an appropriate value.
    * In the case of a normal function, this value will just be serialized function.  In the case
    * of a factory function this value will be the result of invoking the factory function.
    */
  var text: String
}

object SerializedFunction {
  @scala.inline
  def apply(exportName: String, text: String): SerializedFunction = {
    val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SerializedFunction]
  }
}

