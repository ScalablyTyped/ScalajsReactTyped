package typingsJapgolly.chartmogulNode.mod.CustomAttribute

import typingsJapgolly.chartmogulNode.commonMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAttributes extends js.Object {
  var custom: Map
}

object CustomAttributes {
  @scala.inline
  def apply(custom: Map): CustomAttributes = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomAttributes]
  }
}

