package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyInternalMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUnionFilterMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    U extends unknown ? {  0 :U & M}[ts-toolbelt.ts-toolbelt/out/Any/Is.Is<U, M, match>] : never
    }}}
    */
  @js.native
  trait Filter[U /* <: Any */, M /* <: Any */, `match` /* <: Match */] extends StObject
}
