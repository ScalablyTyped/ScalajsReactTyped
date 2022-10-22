package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.libConstantMod.DIRECTION
import typingsJapgolly.antvG2.libInterfaceMod.FacetTitle
import typingsJapgolly.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilFacetMod {
  
  @JSImport("@antv/g2/lib/util/facet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnglePoint(center: Point, r: Double, angle: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnglePoint")(center.asInstanceOf[js.Any], r.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def getFactTitleConfig(direction: DIRECTION): FacetTitle = ^.asInstanceOf[js.Dynamic].applyDynamic("getFactTitleConfig")(direction.asInstanceOf[js.Any]).asInstanceOf[FacetTitle]
}
