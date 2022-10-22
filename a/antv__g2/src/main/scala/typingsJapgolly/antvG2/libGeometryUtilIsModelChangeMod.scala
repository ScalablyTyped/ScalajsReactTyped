package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.libInterfaceMod.ShapeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryUtilIsModelChangeMod {
  
  @JSImport("@antv/g2/lib/geometry/util/is-model-change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isModelChange(currentModel: ShapeInfo, preModel: ShapeInfo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModelChange")(currentModel.asInstanceOf[js.Any], preModel.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
