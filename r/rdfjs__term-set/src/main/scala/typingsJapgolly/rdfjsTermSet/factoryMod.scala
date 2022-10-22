package typingsJapgolly.rdfjsTermSet

import typingsJapgolly.rdfjsTermSet.rdfjsTermSetStrings.termSet
import typingsJapgolly.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@rdfjs/term-set/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Factory
  /* static members */
  object default {
    
    @JSImport("@rdfjs/term-set/Factory", "default.exports")
    @js.native
    val exports: js.Array[termSet] = js.native
  }
  
  @js.native
  trait Factory extends StObject {
    
    def termSet[T /* <: Term */](): typingsJapgolly.rdfjsTermSet.mod.default[T] = js.native
    def termSet[T /* <: Term */](terms: js.Array[T]): typingsJapgolly.rdfjsTermSet.mod.default[T] = js.native
  }
}
