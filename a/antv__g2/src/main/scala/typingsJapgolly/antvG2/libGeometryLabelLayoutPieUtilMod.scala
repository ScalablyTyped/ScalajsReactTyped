package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.anon.MaxX
import typingsJapgolly.antvG2.libGeometryLabelInterfaceMod.PolarLabelItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLabelLayoutPieUtilMod {
  
  @JSImport("@antv/g2/lib/geometry/label/layout/pie/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def antiCollision(items: js.Array[PolarLabelItem], labelHeight: Double, plotRange: MaxX): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("antiCollision")(items.asInstanceOf[js.Any], labelHeight.asInstanceOf[js.Any], plotRange.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
