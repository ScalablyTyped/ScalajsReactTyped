package typingsJapgolly.typescriptLogic

import typingsJapgolly.typescriptLogic.typescriptLogicBooleans.`false`
import typingsJapgolly.typescriptLogic.typescriptLogicBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type And[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `true`, `false`, `false`, `false`]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Boolean extends true ? WhenTrue : WhenFalse
    }}}
    */
  @js.native
  trait If[Boolean /* <: scala.Boolean */, WhenTrue, WhenFalse] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    A extends true ? B extends true ? AB : AnB : B extends true ? nAB : nAnB
    }}}
    */
  @js.native
  trait LogicalTable[A /* <: Boolean */, B /* <: Boolean */, AB, AnB, nAB, nAnB] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    X extends true ? false : true
    }}}
    */
  @js.native
  trait Not[X /* <: Boolean */] extends StObject
  
  type Or[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `true`, `true`, `true`, `false`]
  
  type Xor[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `false`, `true`, `true`, `false`]
}
