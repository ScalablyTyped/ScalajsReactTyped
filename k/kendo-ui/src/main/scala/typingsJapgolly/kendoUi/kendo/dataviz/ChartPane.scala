package typingsJapgolly.kendoUi.kendo.dataviz

import typingsJapgolly.kendoUi.kendo.Observable
import typingsJapgolly.kendoUi.kendo.drawing.Group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartPane
  extends StObject
     with Observable {
  
  var chartsVisual: Group = js.native
  
  def findAxisByName(name: String): ChartAxis = js.native
  
  var options: ChartPaneOptions = js.native
  
  def series(): Any = js.native
  
  var visual: Group = js.native
}
