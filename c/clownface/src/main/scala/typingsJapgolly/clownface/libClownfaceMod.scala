package typingsJapgolly.clownface

import typingsJapgolly.clownface.mod.AnyContext
import typingsJapgolly.clownface.mod.AnyPointer
import typingsJapgolly.clownface.mod.ClownfaceInit
import typingsJapgolly.clownface.mod.ClownfaceInitWithTerms
import typingsJapgolly.clownface.mod.ClownfaceInitWithValue
import typingsJapgolly.clownface.mod.ClownfaceInitWithValues
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClownfaceMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("clownface/lib/Clownface", JSImport.Namespace)
  @js.native
  open class ^[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] protected ()
    extends StObject
       with AnyPointer[T, D] {
    def this(options: ClownfaceInit[D]) = this()
    def this(options: ClownfaceInitWithTerms[
            /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? @rdfjs/types.@rdfjs/types/data-model.Term | std.Array<@rdfjs/types.@rdfjs/types/data-model.Term> : T */ js.Any, 
            D
          ]) = this()
    def this(options: ClownfaceInitWithValue[D]) = this()
    def this(options: ClownfaceInitWithValues[D]) = this()
  }
  
  // tslint:disable-next-line no-unnecessary-class
  type ClownfaceImpl[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] = AnyPointer[T, D]
}
