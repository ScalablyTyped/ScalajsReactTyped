package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolidEdges3DProperties extends Edges3DProperties {
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SolidEdges3D.html#type)
    */
  var `type`: js.UndefOr[solid] = js.undefined
}

object SolidEdges3DProperties {
  @scala.inline
  def apply(
    color: Color_ | js.Array[Double] | String = null,
    extensionLength: Double | String = null,
    size: Double | String = null,
    `type`: solid = null
  ): SolidEdges3DProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extensionLength != null) __obj.updateDynamic("extensionLength")(extensionLength.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolidEdges3DProperties]
  }
}

