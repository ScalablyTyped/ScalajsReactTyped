package typingsJapgolly.kendoUi.kendo.dataviz.geometry

import typingsJapgolly.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point
  extends StObject
     with Observable {
  
  def distanceTo(point: typingsJapgolly.kendoUi.kendo.geometry.Point): Double = js.native
  
  def equals(other: typingsJapgolly.kendoUi.kendo.geometry.Point): Boolean = js.native
  
  def getX(): Double = js.native
  
  def getY(): Double = js.native
  
  def move(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  var options: PointOptions = js.native
  
  def rotate(angle: Double, center: Any): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: typingsJapgolly.kendoUi.kendo.geometry.Point): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def round(digits: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def scale(scaleX: Double, scaleY: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def scaleCopy(scaleX: Double, scaleY: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def setX(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def setY(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def toArray(digits: Double): Any = js.native
  
  def toString(digits: Double, separator: String): String = js.native
  
  def transform(tansformation: typingsJapgolly.kendoUi.kendo.geometry.Transformation): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def transformCopy(tansformation: typingsJapgolly.kendoUi.kendo.geometry.Transformation): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def translate(dx: Double, dy: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def translateWith(vector: Any): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def translateWith(vector: typingsJapgolly.kendoUi.kendo.geometry.Point): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
