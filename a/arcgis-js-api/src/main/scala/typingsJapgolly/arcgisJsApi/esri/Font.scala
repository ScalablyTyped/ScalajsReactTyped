package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`line-through`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.bold
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.bolder
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.italic
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.lighter
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.normal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.oblique
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font
  extends Accessor
     with JSONSupport {
  /**
    * The text decoration.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#decoration)
    *
    * @default none
    */
  var decoration: underline | `line-through` | none = js.native
  /**
    * The font family of the text. The possible values are dependent upon the layer type, and if you working with a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [Labeling guide page](https://developers.arcgis.com/javascript/latest/guide/labeling/index.html) for detailed explanation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family)
    *
    * @default sans-serif
    */
  var family: String = js.native
  /**
    * The font size in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    * > **Known Limitations**  In 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), if the [TextSymbol3DLayer.size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#size) property is set, it will override this [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size)
    *
    * @default 9
    */
  var size: Double = js.native
  /**
    * The text style. Specifies whether a font should be styled: normal, italic, or oblique.
    * > **Known Limitations**  `oblique` is not supported in 2D [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#style)
    *
    * @default normal
    */
  var style: normal | italic | oblique = js.native
  /**
    * The text weight. Specifies the level of boldness.
    * > **Known Limitations**  `bolder` and `lighter` are not supported in 2D [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#weight)
    *
    * @default normal
    */
  var weight: normal | bold | bolder | lighter = js.native
}

@JSGlobal("__esri.Font")
@js.native
object Font extends TopLevel[FontConstructor]

