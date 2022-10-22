package typingsJapgolly.kendoUi.kendo.drawing

import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Surface
  extends StObject
     with Observable {
  
  def clear(): Unit = js.native
  
  def draw(element: Element): Unit = js.native
  
  var element: JQuery = js.native
  
  def eventTarget(e: Any): Element = js.native
  
  def hideTooltip(): Unit = js.native
  
  var options: SurfaceOptions = js.native
  
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  
  def showTooltip(element: Element): Unit = js.native
  def showTooltip(element: Element, options: Any): Unit = js.native
}
