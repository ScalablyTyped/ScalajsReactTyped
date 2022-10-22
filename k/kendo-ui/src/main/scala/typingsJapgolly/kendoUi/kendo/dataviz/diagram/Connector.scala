package typingsJapgolly.kendoUi.kendo.dataviz.diagram

import typingsJapgolly.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connector
  extends StObject
     with Observable {
  
  var connections: Any = js.native
  
  var options: ConnectorOptions = js.native
  
  def position(): Point = js.native
  
  var shape: Shape = js.native
}
