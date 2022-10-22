package typingsJapgolly.babylonjs

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type DataArray = js.Array[Double] | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends babylonjs.babylonjs/types.Primitive ? T : T extends std.Array<infer U> ? babylonjs.babylonjs/types.DeepImmutableArray<U> : babylonjs.babylonjs/types.DeepImmutableObject<T>
    }}}
    */
  @js.native
  trait DeepImmutable[T] extends StObject
  
  /** @internal */
  type DeepImmutableArray[T] = js.Array[DeepImmutable[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {readonly [ K in keyof T ]: babylonjs.babylonjs/types.DeepImmutable<T[K]>}
    }}}
    */
  @js.native
  trait DeepImmutableObject[T] extends StObject
  
  type FloatArray = js.Array[Double] | js.typedarray.Float32Array
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends babylonjs.babylonjs/types.Primitive ? T : T extends std.Array<infer U> ? std.ReadonlyArray<U> : babylonjs.babylonjs/types.DeepImmutable<T>
    }}}
    */
  @js.native
  trait Immutable[T] extends StObject
  
  type IndicesArray = js.Array[Double] | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint16Array
  
  type Nullable[T] = T | Null
  
  /**
    * Alias type for primitive types
    * @ignorenaming
    */
  type Primitive = js.UndefOr[Null | Boolean | String | Double | js.Function | Element]
  
  type double = Double
  
  type float = Double
  
  type int = Double
}
