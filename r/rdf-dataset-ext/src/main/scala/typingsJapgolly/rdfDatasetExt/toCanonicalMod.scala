package typingsJapgolly.rdfDatasetExt

import typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toCanonicalMod {
  
  /**
    * Returns the canonical representation of the dataset as string.
    */
  inline def apply(dataset: DatasetCore[BaseQuad, BaseQuad]): String = ^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("rdf-dataset-ext/toCanonical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
