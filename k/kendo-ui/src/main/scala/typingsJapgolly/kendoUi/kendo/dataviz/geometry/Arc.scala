package typingsJapgolly.kendoUi.kendo.dataviz.geometry

import typingsJapgolly.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arc
  extends StObject
     with Observable {
  
  var anticlockwise: Boolean = js.native
  
  def bbox(matrix: typingsJapgolly.kendoUi.kendo.geometry.Matrix): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  
  var center: typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  var endAngle: Double = js.native
  
  def getAnticlockwise(): Boolean = js.native
  
  def getCenter(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def getEndAngle(): Double = js.native
  
  def getRadiusX(): Double = js.native
  
  def getRadiusY(): Double = js.native
  
  def getStartAngle(): Double = js.native
  
  var options: ArcOptions = js.native
  
  def pointAt(angle: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  var radiusX: Double = js.native
  
  var radiusY: Double = js.native
  
  def setAnticlockwise(value: Boolean): typingsJapgolly.kendoUi.kendo.geometry.Arc = js.native
  
  def setCenter(value: typingsJapgolly.kendoUi.kendo.geometry.Point): typingsJapgolly.kendoUi.kendo.geometry.Arc = js.native
  
  def setEndAngle(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Arc = js.native
  
  def setRadiusX(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Arc = js.native
  
  def setRadiusY(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Arc = js.native
  
  def setStartAngle(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Arc = js.native
  
  var startAngle: Double = js.native
}
