package typingsJapgolly.forgeViewer.global.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Autodesk.Viewing.AggregatedView")
@js.native
open class AggregatedView ()
  extends StObject
     with typingsJapgolly.forgeViewer.Autodesk.Viewing.AggregatedView
object AggregatedView {
  
  @JSGlobal("Autodesk.Viewing.AggregatedView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def findDiffSupportModel(sheetNode: typingsJapgolly.forgeViewer.Autodesk.Viewing.BubbleNode): typingsJapgolly.forgeViewer.Autodesk.Viewing.BubbleNode = ^.asInstanceOf[js.Dynamic].applyDynamic("findDiffSupportModel")(sheetNode.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.forgeViewer.Autodesk.Viewing.BubbleNode]
  
  /* static member */
  inline def findDiffSupportModels(diffConfig: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("findDiffSupportModels")(diffConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
