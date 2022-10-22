package typingsJapgolly.rdfUtilsDataset

import typingsJapgolly.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typingsJapgolly.rdfUtilsDataset.anon.FnCall
import typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad
import typingsJapgolly.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-utils-dataset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rdf-utils-dataset", "resource")
  @js.native
  def resource: FnCall = js.native
  inline def resource[D /* <: DatasetIndexed[BaseQuad, BaseQuad] */](input: D, subject: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("resource")(input.asInstanceOf[js.Any], subject.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def resource_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resource")(x.asInstanceOf[js.Any])
}
