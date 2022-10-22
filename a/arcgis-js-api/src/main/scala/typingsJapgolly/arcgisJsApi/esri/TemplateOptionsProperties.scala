package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`a3-landscape`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`a3-portrait`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`a4-landscape`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`a4-portrait`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`letter-ansi-a-landscape`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`letter-ansi-a-portrait`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`map-only`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`tabloid-ansi-b-landscape`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`tabloid-ansi-b-portrait`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.eps
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.gif
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.pdf
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png32
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png8
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.svg
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.svgz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateOptionsProperties extends StObject {
  
  /**
    * When `false`, the attribution is not displayed on the printout.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#attributionEnabled)
    */
  var attributionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text used for the author if the specified layout contains an author text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#author)
    */
  var author: js.UndefOr[String] = js.undefined
  
  /**
    * The text used for the copyright if the specified layout contains an copyright text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Use this prop to display text fields for custom text elements from the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#customTextElements)
    */
  var customTextElements: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Resolution in dots per inch.
    *
    * @default 96
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#dpi)
    */
  var dpi: js.UndefOr[String] = js.undefined
  
  /**
    * This property only applies when the [layout](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout) value is `map-only`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#fileName)
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * When true, the feature's attributes are included in feature collection layers even when they are not needed for rendering.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#forceFeatureAttributes)
    */
  var forceFeatureAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The output format for the printed map.
    *
    * @default pdf
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#format)
    */
  var format: js.UndefOr[pdf | png32 | png8 | jpg | gif | eps | svg | svgz] = js.undefined
  
  /**
    * Map height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#height)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The layout used for the print output.
    *
    * @default letter-ansi-a-landscape
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout)
    */
  var layout: js.UndefOr[
    `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait`
  ] = js.undefined
  
  /**
    * When `false`, the legend is not displayed on the printout.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#legendEnabled)
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, the north arrow will be included on the printout.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#northArrowEnabled)
    */
  var northArrowEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The map scale of the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * Define whether the printed map should preserve map scale or map extent.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#scaleEnabled)
    */
  var scaleEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text used for the map title if the specified layout contains a title text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Map width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#width)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object TemplateOptionsProperties {
  
  inline def apply(): TemplateOptionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptionsProperties]
  }
  
  extension [Self <: TemplateOptionsProperties](x: Self) {
    
    inline def setAttributionEnabled(value: Boolean): Self = StObject.set(x, "attributionEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttributionEnabledUndefined: Self = StObject.set(x, "attributionEnabled", js.undefined)
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCustomTextElements(value: js.Array[Any]): Self = StObject.set(x, "customTextElements", value.asInstanceOf[js.Any])
    
    inline def setCustomTextElementsUndefined: Self = StObject.set(x, "customTextElements", js.undefined)
    
    inline def setCustomTextElementsVarargs(value: Any*): Self = StObject.set(x, "customTextElements", js.Array(value*))
    
    inline def setDpi(value: String): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setForceFeatureAttributes(value: Boolean): Self = StObject.set(x, "forceFeatureAttributes", value.asInstanceOf[js.Any])
    
    inline def setForceFeatureAttributesUndefined: Self = StObject.set(x, "forceFeatureAttributes", js.undefined)
    
    inline def setFormat(value: pdf | png32 | png8 | jpg | gif | eps | svg | svgz): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLayout(
      value: `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait`
    ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    inline def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    inline def setNorthArrowEnabled(value: Boolean): Self = StObject.set(x, "northArrowEnabled", value.asInstanceOf[js.Any])
    
    inline def setNorthArrowEnabledUndefined: Self = StObject.set(x, "northArrowEnabled", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleEnabled(value: Boolean): Self = StObject.set(x, "scaleEnabled", value.asInstanceOf[js.Any])
    
    inline def setScaleEnabledUndefined: Self = StObject.set(x, "scaleEnabled", js.undefined)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
