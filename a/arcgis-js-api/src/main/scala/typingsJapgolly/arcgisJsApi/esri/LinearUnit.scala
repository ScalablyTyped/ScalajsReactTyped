package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearUnit
  extends Accessor
     with JSONSupport {
  /**
    * Specifies the value of the linear distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LinearUnit.html#distance)
    *
    * @default 0
    */
  var distance: Double = js.native
  /**
    * Specifies the unit type of the linear distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LinearUnit.html#units)
    */
  var units: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
}

@JSGlobal("__esri.LinearUnit")
@js.native
object LinearUnit extends TopLevel[LinearUnitConstructor]

