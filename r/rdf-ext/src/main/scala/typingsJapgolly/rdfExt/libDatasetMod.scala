package typingsJapgolly.rdfExt

import typingsJapgolly.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typingsJapgolly.rdfExt.libPropTypeMod.PropType
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetMod {
  
  // tslint:disable-next-line:no-unnecessary-class
  @JSImport("rdf-ext/lib/Dataset", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DatasetExt {
    def this(quads: js.Array[Quad]) = this()
  }
  
  // tslint:disable-next-line:no-unnecessary-class
  @js.native
  trait DatasetExt
    extends StObject
       with DatasetIndexed[typingsJapgolly.rdfExt.libQuadMod.^, Quad] {
    
    def equals(other: this.type): Boolean = js.native
    
    def toCanonical(): String = js.native
    
    def toJSON(): js.Array[
        ReturnType[
          PropType[typingsJapgolly.rdfExt.libQuadMod.^, typingsJapgolly.rdfExt.rdfExtStrings.toJSON]
        ]
      ] = js.native
  }
}
