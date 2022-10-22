package typingsJapgolly.kendoUi.kendo.dataviz.diagram

import typingsJapgolly.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout
  extends StObject
     with Observable {
  
  def append(element: Any): Unit = js.native
  
  def clear(): Unit = js.native
  
  var drawingElement: typingsJapgolly.kendoUi.kendo.drawing.Layout = js.native
  
  var options: LayoutOptions = js.native
  
  def rect(): Rect = js.native
  def rect(rect: Rect): Unit = js.native
  
  def reflow(): Unit = js.native
  
  def remove(element: Any): Unit = js.native
  
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}
