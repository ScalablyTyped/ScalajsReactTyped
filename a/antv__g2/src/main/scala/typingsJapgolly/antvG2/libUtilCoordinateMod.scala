package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.anon.Attrs
import typingsJapgolly.antvG2.anon.EndState
import typingsJapgolly.antvG2.libDependentsMod.Coordinate
import typingsJapgolly.antvG2.libInterfaceMod.Point
import typingsJapgolly.antvG2.libUtilBboxMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCoordinateMod {
  
  @JSImport("@antv/g2/lib/util/coordinate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAngleByPoint(coordinate: Coordinate, point: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngleByPoint")(coordinate.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getCoordinateBBox(coordinate: Coordinate): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoordinateBBox")(coordinate.asInstanceOf[js.Any]).asInstanceOf[BBox]
  inline def getCoordinateBBox(coordinate: Coordinate, margin: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("getCoordinateBBox")(coordinate.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[BBox]
  
  inline def getCoordinateClipCfg(coordinate: Coordinate): Attrs | EndState = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoordinateClipCfg")(coordinate.asInstanceOf[js.Any]).asInstanceOf[Attrs | EndState]
  inline def getCoordinateClipCfg(coordinate: Coordinate, margin: Double): Attrs | EndState = (^.asInstanceOf[js.Dynamic].applyDynamic("getCoordinateClipCfg")(coordinate.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Attrs | EndState]
  
  inline def getDistanceToCenter(coordinate: Coordinate, point: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceToCenter")(coordinate.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getXDimensionLength(coordinate: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getXDimensionLength")(coordinate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isFullCircle(coordinate: Coordinate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullCircle")(coordinate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPointInCoordinate(coordinate: Coordinate, point: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInCoordinate")(coordinate.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
