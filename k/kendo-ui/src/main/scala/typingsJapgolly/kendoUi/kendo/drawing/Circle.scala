package typingsJapgolly.kendoUi.kendo.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle
  extends StObject
     with Element {
  
  def fill(color: String): Circle = js.native
  def fill(color: String, opacity: Double): Circle = js.native
  
  def geometry(): typingsJapgolly.kendoUi.kendo.geometry.Circle = js.native
  def geometry(value: typingsJapgolly.kendoUi.kendo.geometry.Circle): Unit = js.native
  
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  
  def stroke(color: String): Circle = js.native
  def stroke(color: String, width: Double): Circle = js.native
  def stroke(color: String, width: Double, opacity: Double): Circle = js.native
  def stroke(color: String, width: Unit, opacity: Double): Circle = js.native
}
