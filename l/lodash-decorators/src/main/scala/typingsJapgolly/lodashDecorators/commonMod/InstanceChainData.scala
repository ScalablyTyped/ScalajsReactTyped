package typingsJapgolly.lodashDecorators.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceChainData extends js.Object {
  var fns: js.Array[js.Function]
  var isGetter: Boolean
  var isMethod: Boolean
  var isProperty: Boolean
  var isSetter: Boolean
  var properties: js.Array[String]
}

object InstanceChainData {
  @scala.inline
  def apply(
    fns: js.Array[js.Function],
    isGetter: Boolean,
    isMethod: Boolean,
    isProperty: Boolean,
    isSetter: Boolean,
    properties: js.Array[String]
  ): InstanceChainData = {
    val __obj = js.Dynamic.literal(fns = fns.asInstanceOf[js.Any], isGetter = isGetter.asInstanceOf[js.Any], isMethod = isMethod.asInstanceOf[js.Any], isProperty = isProperty.asInstanceOf[js.Any], isSetter = isSetter.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InstanceChainData]
  }
}

