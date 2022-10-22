package typingsJapgolly.typeFest

import typingsJapgolly.std.PropertyKey
import typingsJapgolly.std.Record
import typingsJapgolly.typeFest.sourcePrimitiveMod.Primitive
import typingsJapgolly.typeFest.typeFestStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceInternalMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TArray extends [unknown, ...infer TTail] ? TTail : []
    }}}
    */
  @js.native
  trait ArrayTail[TArray /* <: UnknownArrayOrTuple */] extends StObject
  
  /**
  Create a tuple type of the given length `<L>`.
  @link https://itnext.io/implementing-arithmetic-within-typescripts-type-system-a1ef140a6f6f
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends { readonly length :L} ? T : type-fest.type-fest/source/internal.BuildTuple<L, [...T, unknown]>
    }}}
    */
  @js.native
  trait BuildTuple[L /* <: Double */, T /* <: js.Array[Any] */] extends StObject
  
  type BuiltIns = Primitive | js.Date | js.RegExp
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TArray extends [infer THead, ...std.Array<unknown>] ? THead : never
    }}}
    */
  @js.native
  trait FirstArrayElement[TArray /* <: UnknownArrayOrTuple */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    FirstType extends BaseType ? SecondType extends BaseType ? true : false : false
    }}}
    */
  @js.native
  trait IsBothExtends[BaseType, FirstType, SecondType] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    <G>(): G extends T ? 1 : 2 extends <G>(): G extends U ? 1 : 2 ? true : false
    }}}
    */
  @js.native
  trait IsEqual[T, U] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends T ? keyof T : never
    }}}
    */
  @js.native
  trait KeysOfUnion[T] extends StObject
  
  type NonEmptyTuple = Array[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typeFest.typeFestStrings.`0`
    - typingsJapgolly.typeFest.typeFestStrings.`1`
    - typingsJapgolly.typeFest.typeFestStrings.`2`
    - typingsJapgolly.typeFest.typeFestStrings.`3`
    - typingsJapgolly.typeFest.typeFestStrings.`4`
    - typingsJapgolly.typeFest.typeFestStrings.`5`
    - typingsJapgolly.typeFest.typeFestStrings.`6`
    - typingsJapgolly.typeFest.typeFestStrings.`7`
    - typingsJapgolly.typeFest.typeFestStrings.`8`
    - typingsJapgolly.typeFest.typeFestStrings.`9`
  */
  trait StringDigit extends StObject
  object StringDigit {
    
    inline def `0`: typingsJapgolly.typeFest.typeFestStrings.`0` = "0".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`0`]
    
    inline def `1`: typingsJapgolly.typeFest.typeFestStrings.`1` = "1".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`1`]
    
    inline def `2`: typingsJapgolly.typeFest.typeFestStrings.`2` = "2".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`2`]
    
    inline def `3`: typingsJapgolly.typeFest.typeFestStrings.`3` = "3".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`3`]
    
    inline def `4`: typingsJapgolly.typeFest.typeFestStrings.`4` = "4".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`4`]
    
    inline def `5`: typingsJapgolly.typeFest.typeFestStrings.`5` = "5".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`5`]
    
    inline def `6`: typingsJapgolly.typeFest.typeFestStrings.`6` = "6".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`6`]
    
    inline def `7`: typingsJapgolly.typeFest.typeFestStrings.`7` = "7".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`7`]
    
    inline def `8`: typingsJapgolly.typeFest.typeFestStrings.`8` = "8".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`8`]
    
    inline def `9`: typingsJapgolly.typeFest.typeFestStrings.`9` = "9".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`9`]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    type-fest.type-fest/source/internal.BuildTuple<A, []> extends [...infer U, ...type-fest.type-fest/source/internal.BuildTuple<B, []>] ? type-fest.type-fest/source/internal.TupleLength<U> : never
    }}}
    */
  @js.native
  trait Subtract[A /* <: Double */, B /* <: Double */] extends StObject
  
  /**
  Infer the length of the given array `<T>`.
  @link https://itnext.io/implementing-arithmetic-within-typescripts-type-system-a1ef140a6f6f
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends { readonly length :infer L} ? L : never
    }}}
    */
  @js.native
  trait TupleLength[T /* <: js.Array[Any] */] extends StObject
  
  type UnknownArrayOrTuple = Array[Any]
  
  type UnknownRecord = Record[PropertyKey, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typeFest.typeFestStrings.A
    - typingsJapgolly.typeFest.typeFestStrings.B
    - typingsJapgolly.typeFest.typeFestStrings.C
    - typingsJapgolly.typeFest.typeFestStrings.D
    - typingsJapgolly.typeFest.typeFestStrings.E
    - typingsJapgolly.typeFest.typeFestStrings.F
    - typingsJapgolly.typeFest.typeFestStrings.G
    - typingsJapgolly.typeFest.typeFestStrings.H
    - typingsJapgolly.typeFest.typeFestStrings.I
    - typingsJapgolly.typeFest.typeFestStrings.J
    - typingsJapgolly.typeFest.typeFestStrings.K
    - typingsJapgolly.typeFest.typeFestStrings.L
    - typingsJapgolly.typeFest.typeFestStrings.M
    - typingsJapgolly.typeFest.typeFestStrings.N
    - typingsJapgolly.typeFest.typeFestStrings.O
    - typingsJapgolly.typeFest.typeFestStrings.P
    - typingsJapgolly.typeFest.typeFestStrings.Q
    - typingsJapgolly.typeFest.typeFestStrings.R
    - typingsJapgolly.typeFest.typeFestStrings.S
    - typingsJapgolly.typeFest.typeFestStrings.T
    - typingsJapgolly.typeFest.typeFestStrings.U
    - typingsJapgolly.typeFest.typeFestStrings.V
    - typingsJapgolly.typeFest.typeFestStrings.W
    - typingsJapgolly.typeFest.typeFestStrings.X
    - typingsJapgolly.typeFest.typeFestStrings.Y
    - typingsJapgolly.typeFest.typeFestStrings.Z
  */
  trait UpperCaseCharacters extends StObject
  object UpperCaseCharacters {
    
    inline def A: typingsJapgolly.typeFest.typeFestStrings.A = "A".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.A]
    
    inline def B: typingsJapgolly.typeFest.typeFestStrings.B = "B".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.B]
    
    inline def C: typingsJapgolly.typeFest.typeFestStrings.C = "C".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.C]
    
    inline def D: typingsJapgolly.typeFest.typeFestStrings.D = "D".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.D]
    
    inline def E: typingsJapgolly.typeFest.typeFestStrings.E = "E".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.E]
    
    inline def F: typingsJapgolly.typeFest.typeFestStrings.F = "F".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.F]
    
    inline def G: typingsJapgolly.typeFest.typeFestStrings.G = "G".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.G]
    
    inline def H: typingsJapgolly.typeFest.typeFestStrings.H = "H".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.H]
    
    inline def I: typingsJapgolly.typeFest.typeFestStrings.I = "I".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.I]
    
    inline def J: typingsJapgolly.typeFest.typeFestStrings.J = "J".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.J]
    
    inline def K: typingsJapgolly.typeFest.typeFestStrings.K = "K".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.K]
    
    inline def L: typingsJapgolly.typeFest.typeFestStrings.L = "L".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.L]
    
    inline def M: typingsJapgolly.typeFest.typeFestStrings.M = "M".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.M]
    
    inline def N: typingsJapgolly.typeFest.typeFestStrings.N = "N".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.N]
    
    inline def O: typingsJapgolly.typeFest.typeFestStrings.O = "O".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.O]
    
    inline def P: typingsJapgolly.typeFest.typeFestStrings.P = "P".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.P]
    
    inline def Q: typingsJapgolly.typeFest.typeFestStrings.Q = "Q".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.Q]
    
    inline def R: typingsJapgolly.typeFest.typeFestStrings.R = "R".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.R]
    
    inline def S: typingsJapgolly.typeFest.typeFestStrings.S = "S".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.S]
    
    inline def T: typingsJapgolly.typeFest.typeFestStrings.T = "T".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.T]
    
    inline def U: typingsJapgolly.typeFest.typeFestStrings.U = "U".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.U]
    
    inline def V: typingsJapgolly.typeFest.typeFestStrings.V = "V".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.V]
    
    inline def W: typingsJapgolly.typeFest.typeFestStrings.W = "W".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.W]
    
    inline def X: typingsJapgolly.typeFest.typeFestStrings.X = "X".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.X]
    
    inline def Y: typingsJapgolly.typeFest.typeFestStrings.Y = "Y".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.Y]
    
    inline def Z: typingsJapgolly.typeFest.typeFestStrings.Z = "Z".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.Z]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typeFest.typeFestStrings.`-_`
    - typingsJapgolly.typeFest.typeFestStrings._underscore
    - typingsJapgolly.typeFest.typeFestStrings.Space
  */
  trait WordSeparators extends StObject
  object WordSeparators {
    
    inline def Space: typingsJapgolly.typeFest.typeFestStrings.Space = (" ").asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.Space]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
    
    inline def _underscore: typingsJapgolly.typeFest.typeFestStrings._underscore = "_".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings._underscore]
  }
}
