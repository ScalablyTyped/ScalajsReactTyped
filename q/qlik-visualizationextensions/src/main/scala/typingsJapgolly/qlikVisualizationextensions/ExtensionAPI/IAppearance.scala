package typingsJapgolly.qlikVisualizationextensions.ExtensionAPI

import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppearance extends js.Object {
  var items: js.Any
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var uses: settings
}

object IAppearance {
  @scala.inline
  def apply(items: js.Any, uses: settings, max: Int | Double = null, min: Int | Double = null): IAppearance = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], uses = uses.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAppearance]
  }
}

