package typingsJapgolly.rdfjsTermMap

import typingsJapgolly.rdfjsTypes.dataModelMod.Term
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/term-map", JSImport.Default)
  @js.native
  open class default[T /* <: Term */, V] ()
    extends StObject
       with Map[T, V] {
    def this(entries: js.Array[js.Tuple2[Term, V]]) = this()
  }
  
  type TermMap[T /* <: Term */, V] = Map[T, V]
}
