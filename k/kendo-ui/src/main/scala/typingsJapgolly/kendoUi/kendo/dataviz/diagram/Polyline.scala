package typingsJapgolly.kendoUi.kendo.dataviz.diagram

import typingsJapgolly.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline
  extends StObject
     with Observable {
  
  var drawingElement: typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  
  var options: PolylineOptions = js.native
  
  def points(): Any = js.native
  def points(points: Any): Unit = js.native
  
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}
