package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle
  extends StObject
     with typingsJapgolly.kendoUi.kendo.drawing.Element {
  
  def fill(color: String): typingsJapgolly.kendoUi.kendo.drawing.Circle = js.native
  def fill(color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Circle = js.native
  
  def geometry(): typingsJapgolly.kendoUi.kendo.geometry.Circle = js.native
  def geometry(value: typingsJapgolly.kendoUi.kendo.geometry.Circle): Unit = js.native
  
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  
  def stroke(color: String): typingsJapgolly.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double): typingsJapgolly.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Unit, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Circle = js.native
}
