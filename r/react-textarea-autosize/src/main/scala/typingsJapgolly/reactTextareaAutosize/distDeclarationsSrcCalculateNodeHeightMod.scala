package typingsJapgolly.reactTextareaAutosize

import typingsJapgolly.reactTextareaAutosize.distDeclarationsSrcGetSizingDataMod.SizingData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCalculateNodeHeightMod {
  
  @JSImport("react-textarea-autosize/dist/declarations/src/calculateNodeHeight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(sizingData: SizingData, value: String): CalculatedNodeHeights = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sizingData.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[CalculatedNodeHeights]
  inline def default(sizingData: SizingData, value: String, minRows: Double): CalculatedNodeHeights = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sizingData.asInstanceOf[js.Any], value.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any])).asInstanceOf[CalculatedNodeHeights]
  inline def default(sizingData: SizingData, value: String, minRows: Double, maxRows: Double): CalculatedNodeHeights = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sizingData.asInstanceOf[js.Any], value.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CalculatedNodeHeights]
  inline def default(sizingData: SizingData, value: String, minRows: Unit, maxRows: Double): CalculatedNodeHeights = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sizingData.asInstanceOf[js.Any], value.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CalculatedNodeHeights]
  
  type CalculatedNodeHeights = js.Array[Double]
}
