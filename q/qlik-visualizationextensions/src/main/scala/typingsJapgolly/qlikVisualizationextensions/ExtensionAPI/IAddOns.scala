package typingsJapgolly.qlikVisualizationextensions.ExtensionAPI

import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.addons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddOns extends js.Object {
  var uses: addons
}

object IAddOns {
  @scala.inline
  def apply(uses: addons): IAddOns = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAddOns]
  }
}

