package typingsJapgolly.waypoints

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaypointOptions
  extends StObject
     with WaypointOptionsBase {
  
  var context: js.UndefOr[HTMLElement] = js.native
  
  var element: HTMLElement = js.native
  
  def handler(): Unit = js.native
  def handler(direction: String): Unit = js.native
}
