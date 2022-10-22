package typingsJapgolly.rdfjsTermSet

import typingsJapgolly.rdfjsTypes.dataModelMod.Term
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/term-set", JSImport.Default)
  @js.native
  open class default[T /* <: Term */] ()
    extends StObject
       with Set[T]
  
  type TermSet[T /* <: Term */] = Set[T]
}
