package typingsJapgolly.tsutils.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyName extends js.Object {
  var displayName: String
  var symbolName: typingsJapgolly.typescript.mod.String
}

object PropertyName {
  @scala.inline
  def apply(displayName: String, symbolName: typingsJapgolly.typescript.mod.String): PropertyName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropertyName]
  }
}

