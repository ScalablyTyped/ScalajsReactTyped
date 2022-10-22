package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outNumberGreaterMod._Greater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outNumberLowerMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    N1 extends unknown ? N2 extends unknown ? ts-toolbelt.ts-toolbelt/out/Number/Lower._Lower<ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<N1>, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<N2>> : never : never
    }}}
    */
  @js.native
  trait Lower[N1 /* <: Double */, N2 /* <: Double */] extends StObject
  
  type _Lower[N1 /* <: Iteration */, N2 /* <: Iteration */] = _Greater[N2, N1]
}
