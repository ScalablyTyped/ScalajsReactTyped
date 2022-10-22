package typingsJapgolly.maplibreGl.mod

import typingsJapgolly.mapboxPointGeometry.mod.^
import typingsJapgolly.maplibreGl.anon.PinchAround
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TouchRotateHandler")
@js.native
open class TouchRotateHandler () extends TwoTouchHandler {
  
  def _isBelowThreshold(vector: ^): Boolean = js.native
  
  var _minDiameter: Double = js.native
  
  def _move(points: js.Tuple2[^, ^], pinchAround: ^): PinchAround = js.native
}
