package typingsJapgolly.kendoUi.kendo.dataviz.geometry

import typingsJapgolly.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle
  extends StObject
     with Observable {
  
  def bbox(matrix: typingsJapgolly.kendoUi.kendo.geometry.Matrix): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  
  var center: typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def equals(other: typingsJapgolly.kendoUi.kendo.geometry.Circle): Boolean = js.native
  
  def getCenter(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def getRadius(): Double = js.native
  
  var options: CircleOptions = js.native
  
  def pointAt(angle: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  var radius: Double = js.native
  
  def setCenter(value: Any): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def setCenter(value: typingsJapgolly.kendoUi.kendo.geometry.Point): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def setRadius(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Circle = js.native
}
