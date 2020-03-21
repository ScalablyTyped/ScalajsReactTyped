package typingsJapgolly.winrt.Windows.Media.Protection

import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaProtectionManager extends js.Object {
  var oncomponentloadfailed: js.Any
  var onrebootneeded: js.Any
  var onservicerequested: js.Any
  var properties: IPropertySet
}

object IMediaProtectionManager {
  @scala.inline
  def apply(
    oncomponentloadfailed: js.Any,
    onrebootneeded: js.Any,
    onservicerequested: js.Any,
    properties: IPropertySet
  ): IMediaProtectionManager = {
    val __obj = js.Dynamic.literal(oncomponentloadfailed = oncomponentloadfailed.asInstanceOf[js.Any], onrebootneeded = onrebootneeded.asInstanceOf[js.Any], onservicerequested = onservicerequested.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMediaProtectionManager]
  }
}

