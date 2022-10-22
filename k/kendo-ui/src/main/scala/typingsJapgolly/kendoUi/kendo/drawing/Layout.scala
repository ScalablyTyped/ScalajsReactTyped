package typingsJapgolly.kendoUi.kendo.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout
  extends StObject
     with Group {
  
  @JSName("options")
  var options_Layout: LayoutOptions = js.native
  
  def rect(): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def rect(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect): Unit = js.native
  
  def reflow(): Unit = js.native
}
