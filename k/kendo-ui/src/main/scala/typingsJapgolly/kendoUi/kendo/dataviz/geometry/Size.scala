package typingsJapgolly.kendoUi.kendo.dataviz.geometry

import typingsJapgolly.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Size")
@js.native
class Size () extends Observable_ {
  var height: Double = js.native
  var options: SizeOptions = js.native
  var width: Double = js.native
  def equals(other: typingsJapgolly.kendoUi.kendo.geometry.Size): Boolean = js.native
  def getHeight(): Double = js.native
  def getWidth(): Double = js.native
  def setHeight(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Size = js.native
  def setWidth(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Size = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Size")
@js.native
object Size extends js.Object {
  def create(width: js.Any, height: Double): typingsJapgolly.kendoUi.kendo.geometry.Size = js.native
  def create(width: Double, height: Double): typingsJapgolly.kendoUi.kendo.geometry.Size = js.native
  def create(width: typingsJapgolly.kendoUi.kendo.geometry.Size, height: Double): typingsJapgolly.kendoUi.kendo.geometry.Size = js.native
}

