package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesOutlierSettings extends js.Object {
  /** Specifies the shape of the outlier.
    * @Default {circle. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.undefined
  /** Options for customizing the size of the outlier shape.
    */
  var size: js.UndefOr[SeriesOutlierSettingsSize] = js.undefined
}

object SeriesOutlierSettings {
  @scala.inline
  def apply(shape: Shape | String = null, size: SeriesOutlierSettingsSize = null): SeriesOutlierSettings = {
    val __obj = js.Dynamic.literal()
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesOutlierSettings]
  }
}

