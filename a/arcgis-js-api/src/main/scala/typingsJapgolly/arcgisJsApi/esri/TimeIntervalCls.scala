package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.centuries
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.days
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.decades
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hours
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.milliseconds
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.minutes
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.months
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.seconds
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.weeks
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.TimeInterval")
@js.native
class TimeIntervalCls () extends TimeInterval {
  def this(properties: TimeIntervalProperties) = this()
  /**
    * Temporal units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    *
    * @default milliseconds
    */
  /* CompleteClass */
  override var unit: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries = js.native
  /**
    * The numerical value of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#value)
    *
    * @default 0
    */
  /* CompleteClass */
  override var value: Double = js.native
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

