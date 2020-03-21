package typingsJapgolly.canvasjs.mod

import typingsJapgolly.canvasjs.AnonX1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTitle extends ChartTitleOptions {
  /**
    * Can be accessed via get method or dot notation.
    */
  val bounds: AnonX1 = js.native
  /**
    * Returns the specified property of title.
    * @param propertyName Name of the property.
    */
  def get(propertyName: String): String | Double | Boolean = js.native
  /**
    * Removes title of the chart.
    */
  def remove(): Unit = js.native
  /**
    * Sets the specified property of Title.
    * @param propertyName Name of the property.
    * @param value value to be set on property.
    * @param updateChart When true, Updates the chart automatically after setting the value. Defaults to true.
    */
  def set(propertyName: String, value: String, updateChart: Boolean): Unit = js.native
  def set(propertyName: String, value: Boolean, updateChart: Boolean): Unit = js.native
  def set(propertyName: String, value: Double, updateChart: Boolean): Unit = js.native
}

