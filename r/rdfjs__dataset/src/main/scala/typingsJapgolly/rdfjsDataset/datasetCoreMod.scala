package typingsJapgolly.rdfjsDataset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasetCoreMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("@rdfjs/dataset/DatasetCore", JSImport.Default)
  @js.native
  open class default[Q] ()
    extends StObject
       with typingsJapgolly.rdfjsTypes.datasetMod.DatasetCore[Q, Q] {
    def this(quads: js.Array[Q]) = this()
  }
  
  // tslint:disable-next-line no-unnecessary-class
  type DatasetCore[Q] = typingsJapgolly.rdfjsTypes.datasetMod.DatasetCore[Q, Q]
}
