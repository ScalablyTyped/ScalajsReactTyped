package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.anon.Symbol
import typingsJapgolly.antvG2.libInterfaceMod.ShapeMarkerCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryShapeLineUtilMod {
  
  @JSImport("@antv/g2/lib/geometry/shape/line/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLineMarker(markerCfg: ShapeMarkerCfg, shapeType: String): Symbol = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineMarker")(markerCfg.asInstanceOf[js.Any], shapeType.asInstanceOf[js.Any])).asInstanceOf[Symbol]
}
