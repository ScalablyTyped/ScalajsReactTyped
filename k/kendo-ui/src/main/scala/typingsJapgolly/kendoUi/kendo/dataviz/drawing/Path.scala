package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import typingsJapgolly.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path
  extends StObject
     with typingsJapgolly.kendoUi.kendo.drawing.Element {
  
  def close(): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  
  def curveTo(controlOut: Any, controlIn: Any, endPoint: Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Any, controlIn: Any, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Any, controlIn: Point, endPoint: Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Any, controlIn: Point, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Any, endPoint: Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Any, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  
  def fill(color: String): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def fill(color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  
  def lineTo(x: Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Any, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Point, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  
  def moveTo(x: Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Any, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Point, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  
  @JSName("options")
  var options_Path: PathOptions = js.native
  
  var segments: Any = js.native
  
  def stroke(color: String): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Unit, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
}
