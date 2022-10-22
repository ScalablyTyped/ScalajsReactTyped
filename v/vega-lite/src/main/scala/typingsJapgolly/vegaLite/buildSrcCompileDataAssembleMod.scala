package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileDataFacetMod.FacetNode
import typingsJapgolly.vegaLite.buildSrcCompileDataMod.DataComponent
import typingsJapgolly.vegaLite.buildSrcDataMod.InlineDataset
import typingsJapgolly.vegaLite.buildSrcUtilMod.Dict
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/data/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleFacetData(root: FacetNode): js.Array[VgData] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleFacetData")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[VgData]]
  
  inline def assembleRootData(dataComponent: DataComponent, datasets: Dict[InlineDataset]): js.Array[VgData] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleRootData")(dataComponent.asInstanceOf[js.Any], datasets.asInstanceOf[js.Any])).asInstanceOf[js.Array[VgData]]
}
