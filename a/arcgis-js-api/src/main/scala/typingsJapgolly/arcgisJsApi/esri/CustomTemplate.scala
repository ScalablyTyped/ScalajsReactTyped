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

@js.native
trait CustomTemplate
  extends StObject
     with Accessor {
  
  /**
    * The template's description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-CustomTemplate.html#description)
    */
  val description: String = js.native
  
  /**
    * The output format for the printed map.
    *
    * @default pdf
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-CustomTemplate.html#format)
    */
  var format: pdf | png32 | png8 | jpg | gif | eps | svg | svgz = js.native
  
  /**
    * The text that appears inside the [Print Widget's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html) `Select template` button.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-CustomTemplate.html#label)
    */
  val label: String = js.native
  
  /**
    * The layout used for the print output.
    *
    * @default letter-ansi-a-landscape
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-CustomTemplate.html#layout)
    */
  val layout: `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait` = js.native
  
  /**
    * Defines the layout elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-CustomTemplate.html#layoutOptions)
    */
  val layoutOptions: CustomTemplateLayoutOptions = js.native
}
