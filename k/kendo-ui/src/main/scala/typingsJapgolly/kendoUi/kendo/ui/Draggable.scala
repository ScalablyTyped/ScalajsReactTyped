package typingsJapgolly.kendoUi.kendo.ui

import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draggable
  extends StObject
     with Widget {
  
  def cancelHold(): Unit = js.native
  
  var currentTarget: JQuery = js.native
  
  @JSName("options")
  var options_Draggable: DraggableOptions = js.native
}
