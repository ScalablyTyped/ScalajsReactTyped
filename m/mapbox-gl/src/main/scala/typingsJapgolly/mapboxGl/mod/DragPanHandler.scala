package typingsJapgolly.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "DragPanHandler")
@js.native
open class DragPanHandler protected () extends StObject {
  def this(map: Map) = this()
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  def enable(options: DragPanOptions): Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
}
