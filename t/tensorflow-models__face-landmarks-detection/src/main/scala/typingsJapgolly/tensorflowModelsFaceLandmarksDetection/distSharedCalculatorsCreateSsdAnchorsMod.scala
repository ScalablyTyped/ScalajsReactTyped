package typingsJapgolly.tensorflowModelsFaceLandmarksDetection

import typingsJapgolly.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.AnchorConfig
import typingsJapgolly.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsCreateSsdAnchorsMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/create_ssd_anchors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSsdAnchors(config: AnchorConfig): js.Array[Rect] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSsdAnchors")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[Rect]]
}
