package typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawLabelsEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.undefined
  /** returns the label type.
    */
  var labelType: js.UndefOr[String] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[HTMLElement] = js.undefined
  /** returns the current label element.
    */
  var tickElement: js.UndefOr[HTMLElement] = js.undefined
}

object DrawLabelsEventArgs {
  @scala.inline
  def apply(
    Object: js.Any = null,
    labelType: String = null,
    scaleElement: HTMLElement = null,
    tickElement: HTMLElement = null
  ): DrawLabelsEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Object != null) __obj.updateDynamic("Object")(Object.asInstanceOf[js.Any])
    if (labelType != null) __obj.updateDynamic("labelType")(labelType.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement.asInstanceOf[js.Any])
    if (tickElement != null) __obj.updateDynamic("tickElement")(tickElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawLabelsEventArgs]
  }
}

