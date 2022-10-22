package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outListInternalMod.Key
import typingsJapgolly.tsToolbelt.outListObjectOfMod.ObjectOf
import typingsJapgolly.tsToolbelt.outObjectListOfMod._ListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListPickMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L extends unknown ? ts-toolbelt.ts-toolbelt/out/List/Pick._Pick<L, K> : never
    }}}
    */
  @js.native
  trait Pick[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */] extends StObject
  
  type _Pick[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */] = _ListOf[
    typingsJapgolly.tsToolbelt.outObjectPickMod._Pick[ObjectOf[L], (/* template literal string: ${K&number} */ String) | K]
  ]
}
