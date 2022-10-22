package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group
  extends StObject
     with typingsJapgolly.kendoUi.kendo.drawing.Element {
  
  def append(element: typingsJapgolly.kendoUi.kendo.drawing.Element): Unit = js.native
  
  var children: Any = js.native
  
  def clear(): Unit = js.native
  
  def insert(position: Double, element: typingsJapgolly.kendoUi.kendo.drawing.Element): Unit = js.native
  
  @JSName("options")
  var options_Group: GroupOptions = js.native
  
  def remove(element: typingsJapgolly.kendoUi.kendo.drawing.Element): Unit = js.native
  
  def removeAt(index: Double): Unit = js.native
}
