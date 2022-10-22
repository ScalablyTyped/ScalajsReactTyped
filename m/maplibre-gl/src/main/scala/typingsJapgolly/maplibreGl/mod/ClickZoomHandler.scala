package typingsJapgolly.maplibreGl.mod

import org.scalajs.dom.MouseEvent
import typingsJapgolly.mapboxPointGeometry.mod.^
import typingsJapgolly.maplibreGl.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ClickZoomHandler")
@js.native
open class ClickZoomHandler () extends StObject {
  
  var _active: Boolean = js.native
  
  var _enabled: Boolean = js.native
  
  def dblclick(e: MouseEvent, point: ^): `0` = js.native
  
  def disable(): scala.Unit = js.native
  
  def enable(): scala.Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
  
  def reset(): scala.Unit = js.native
}
