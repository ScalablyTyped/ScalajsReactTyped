package typingsJapgolly.rdfDatasetIndexed

import typingsJapgolly.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad
import typingsJapgolly.rdfjsTypes.dataModelMod.DataFactory
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCore
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCoreFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[Q /* <: BaseQuad */](): DatasetIndexed[Q, Quad] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[DatasetIndexed[Q, Quad]]
  inline def apply[Q /* <: BaseQuad */](quads: js.Array[Q]): DatasetIndexed[Q, Quad] = ^.asInstanceOf[js.Dynamic].apply(quads.asInstanceOf[js.Any]).asInstanceOf[DatasetIndexed[Q, Quad]]
  inline def apply[Q /* <: BaseQuad */](
    quads: js.Array[Q],
    dataFactory: (DataFactory[Q, Q]) & (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])
  ): DatasetIndexed[Q, Quad] = (^.asInstanceOf[js.Dynamic].apply(quads.asInstanceOf[js.Any], dataFactory.asInstanceOf[js.Any])).asInstanceOf[DatasetIndexed[Q, Quad]]
  inline def apply[Q /* <: BaseQuad */](quads: Unit, dataFactory: (DataFactory[Q, Q]) & (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])): DatasetIndexed[Q, Quad] = (^.asInstanceOf[js.Dynamic].apply(quads.asInstanceOf[js.Any], dataFactory.asInstanceOf[js.Any])).asInstanceOf[DatasetIndexed[Q, Quad]]
  
  @JSImport("rdf-dataset-indexed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
