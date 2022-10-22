package typingsJapgolly.rdfjsToNtriples

import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetMod {
  
  inline def apply(dataset: DatasetCore[Quad, Quad], toNT: js.Function1[/* quad */ Quad, String]): String = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], toNT.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@rdfjs/to-ntriples/lib/dataset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
