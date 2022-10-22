package typingsJapgolly.kendoUi.kendo.dataviz.geometry

import typingsJapgolly.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformation
  extends StObject
     with Observable {
  
  def equals(other: typingsJapgolly.kendoUi.kendo.geometry.Transformation): Boolean = js.native
  
  def matrix(): typingsJapgolly.kendoUi.kendo.geometry.Matrix = js.native
  
  def multiply(transformation: typingsJapgolly.kendoUi.kendo.geometry.Transformation): typingsJapgolly.kendoUi.kendo.geometry.Transformation = js.native
  
  var options: TransformationOptions = js.native
  
  def rotate(angle: Double, center: Any): typingsJapgolly.kendoUi.kendo.geometry.Transformation = js.native
  def rotate(angle: Double, center: typingsJapgolly.kendoUi.kendo.geometry.Point): typingsJapgolly.kendoUi.kendo.geometry.Transformation = js.native
  
  def scale(scaleX: Double, scaleY: Double): typingsJapgolly.kendoUi.kendo.geometry.Transformation = js.native
  
  def translate(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.geometry.Transformation = js.native
}
