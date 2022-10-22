package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListUnionizeMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof L ]: P extends K? L[P] | ts-toolbelt.ts-toolbelt/out/Any/At.At<L1, P> : L[P]}
    }}}
    */
  @js.native
  trait Unionize[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, L1 /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */] extends StObject
}
