package typingsJapgolly.antvGBase

import typingsJapgolly.antvGBase.anon.PartialBBox
import typingsJapgolly.antvGBase.libTypesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilBoxMod {
  
  @JSImport("@antv/g-base/lib/util/box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBBox(x: Double, y: Double, width: Double, height: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("createBBox")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[BBox]
  
  inline def intersectBBox(box1: PartialBBox, box2: PartialBBox): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectBBox")(box1.asInstanceOf[js.Any], box2.asInstanceOf[js.Any])).asInstanceOf[BBox]
}
