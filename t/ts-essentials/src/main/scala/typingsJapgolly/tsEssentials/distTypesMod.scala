package typingsJapgolly.tsEssentials

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type AnyArray[T] = js.Array[T]
  
  type AnyRecord[T] = Record[KeyofBase, T]
  
  type ArrayOrSingle[T] = T | js.Array[T]
  
  type AsyncOrSync[T] = PromiseLike[T] | T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends ts-essentials.ts-essentials/dist/types.AsyncOrSync<infer PT> ? PT : never
    }}}
    */
  @js.native
  trait AsyncOrSyncType[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.PromiseLike<infer PT> ? PT : never
    }}}
    */
  @js.native
  trait Awaited[T] extends StObject
  
  type Buildable[T] = DeepPartial[DeepWritable[T]]
  
  type Builtin = Primitive | js.Function | js.Date | js.Error | js.RegExp
  
  type DeepModify[T] = /* import warning: importer.ImportType#apply Failed type conversion: T extends ts-essentials.ts-essentials/dist/types.AnyRecord<any> ? {[ K in keyof T ]:? undefined extends {[ K2 in keyof T ]: K2}[K]? ts-essentials.ts-essentials/dist/types.NonUndefinable<T[K]> extends object? true | ts-essentials.ts-essentials/dist/types.DeepModify<ts-essentials.ts-essentials/dist/types.NonUndefinable<T[K]>> : true : T[K] extends object? true | ts-essentials.ts-essentials/dist/types.DeepModify<T[K]> : true} : never */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends ts-essentials.ts-essentials/dist/types.Builtin ? std.NonNullable<T> : T extends std.Map<infer K, infer V> ? std.Map<ts-essentials.ts-essentials/dist/types.DeepNonNullable<K>, ts-essentials.ts-essentials/dist/types.DeepNonNullable<V>> : T extends std.ReadonlyMap<infer K, infer V> ? std.ReadonlyMap<ts-essentials.ts-essentials/dist/types.DeepNonNullable<K>, ts-essentials.ts-essentials/dist/types.DeepNonNullable<V>> : T extends std.WeakMap<infer K, infer V> ? std.WeakMap<ts-essentials.ts-essentials/dist/types.DeepNonNullable<K>, ts-essentials.ts-essentials/dist/types.DeepNonNullable<V>> : T extends std.Set<infer U> ? std.Set<ts-essentials.ts-essentials/dist/types.DeepNonNullable<U>> : T extends std.ReadonlySet<infer U> ? std.ReadonlySet<ts-essentials.ts-essentials/dist/types.DeepNonNullable<U>> : T extends std.WeakSet<infer U> ? std.WeakSet<ts-essentials.ts-essentials/dist/types.DeepNonNullable<U>> : T extends std.Promise<infer U> ? std.Promise<ts-essentials.ts-essentials/dist/types.DeepNonNullable<U>> : T extends {} ? {[ K in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepNonNullable<T[K]>} : std.NonNullable<T>
    }}}
    */
  @js.native
  trait DeepNonNullable[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends ts-essentials.ts-essentials/dist/types.Builtin ? T | null : T extends std.Map<infer K, infer V> ? std.Map<ts-essentials.ts-essentials/dist/types.DeepNullable<K>, ts-essentials.ts-essentials/dist/types.DeepNullable<V>> : T extends std.ReadonlyMap<infer K, infer V> ? std.ReadonlyMap<ts-essentials.ts-essentials/dist/types.DeepNullable<K>, ts-essentials.ts-essentials/dist/types.DeepNullable<V>> : T extends std.WeakMap<infer K, infer V> ? std.WeakMap<ts-essentials.ts-essentials/dist/types.DeepNullable<K>, ts-essentials.ts-essentials/dist/types.DeepNullable<V>> : T extends std.Set<infer U> ? std.Set<ts-essentials.ts-essentials/dist/types.DeepNullable<U>> : T extends std.ReadonlySet<infer U> ? std.ReadonlySet<ts-essentials.ts-essentials/dist/types.DeepNullable<U>> : T extends std.WeakSet<infer U> ? std.WeakSet<ts-essentials.ts-essentials/dist/types.DeepNullable<U>> : T extends std.Array<infer U> ? T extends ts-essentials.ts-essentials/dist/types.IsTuple<T> ? {[ K in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepNullable<T[K]> | null} : std.Array<ts-essentials.ts-essentials/dist/types.DeepNullable<U>> : T extends std.Promise<infer U> ? std.Promise<ts-essentials.ts-essentials/dist/types.DeepNullable<U>> : T extends {} ? {[ K in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepNullable<T[K]>} : T | null
    }}}
    */
  @js.native
  trait DeepNullable[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends ts-essentials.ts-essentials/dist/types.Builtin ? T : T extends std.Map<infer KeyType, infer ValueType> ? Filter extends std.Map<KeyType, infer FilterValueType> ? FilterValueType extends ts-essentials.ts-essentials/dist/types.DeepModify<ValueType> ? std.Map<KeyType, ts-essentials.ts-essentials/dist/types.DeepOmit<ValueType, FilterValueType>> : T : T : T extends std.ReadonlyMap<infer KeyType, infer ValueType> ? Filter extends std.ReadonlyMap<KeyType, infer FilterValueType> ? FilterValueType extends ts-essentials.ts-essentials/dist/types.DeepModify<ValueType> ? std.ReadonlyMap<KeyType, ts-essentials.ts-essentials/dist/types.DeepOmit<ValueType, FilterValueType>> : T : T : T extends std.WeakMap<infer KeyType, infer ValueType> ? Filter extends std.WeakMap<KeyType, infer FilterValueType> ? FilterValueType extends ts-essentials.ts-essentials/dist/types.DeepModify<ValueType> ? std.WeakMap<KeyType, ts-essentials.ts-essentials/dist/types.DeepOmit<ValueType, FilterValueType>> : T : T : T extends std.Set<infer ItemType> ? Filter extends std.Set<infer FilterItemType> ? FilterItemType extends ts-essentials.ts-essentials/dist/types.DeepModify<ItemType> ? std.Set<ts-essentials.ts-essentials/dist/types.DeepOmit<ItemType, FilterItemType>> : T : T : T extends std.ReadonlySet<infer ItemType> ? Filter extends std.ReadonlySet<infer FilterItemType> ? FilterItemType extends ts-essentials.ts-essentials/dist/types.DeepModify<ItemType> ? std.ReadonlySet<ts-essentials.ts-essentials/dist/types.DeepOmit<ItemType, FilterItemType>> : T : T : T extends std.WeakSet<infer ItemType> ? Filter extends std.WeakSet<infer FilterItemType> ? FilterItemType extends ts-essentials.ts-essentials/dist/types.DeepModify<ItemType> ? std.WeakSet<ts-essentials.ts-essentials/dist/types.DeepOmit<ItemType, FilterItemType>> : T : T : T extends std.Array<infer ItemType> ? Filter extends std.Array<infer FilterItemType> ? FilterItemType extends ts-essentials.ts-essentials/dist/types.DeepModify<ItemType> ? std.Array<ts-essentials.ts-essentials/dist/types.DeepOmit<ItemType, FilterItemType>> : T : T : T extends std.Promise<infer ItemType> ? Filter extends std.Promise<infer FilterItemType> ? FilterItemType extends ts-essentials.ts-essentials/dist/types.DeepModify<ItemType> ? std.Promise<ts-essentials.ts-essentials/dist/types.DeepOmit<ItemType, FilterItemType>> : T : T : Filter extends ts-essentials.ts-essentials/dist/types.AnyRecord<any> ? {[ K in keyof T as K extends keyof Filter? Filter[K] extends true? never : K : K ]: K extends keyof Filter? Filter[K] extends ts-essentials.ts-essentials/dist/types.DeepModify<T[K]>? ts-essentials.ts-essentials/dist/types.DeepOmit<T[K], Filter[K]> : T[K] : T[K]} : never
    }}}
    */
  @js.native
  trait DeepOmit[T, Filter /* <: DeepModify[T] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends ts-essentials.ts-essentials/dist/types.Builtin ? T : T extends std.Map<infer K, infer V> ? std.Map<ts-essentials.ts-essentials/dist/types.DeepPartial<K>, ts-essentials.ts-essentials/dist/types.DeepPartial<V>> : T extends std.ReadonlyMap<infer K, infer V> ? std.ReadonlyMap<ts-essentials.ts-essentials/dist/types.DeepPartial<K>, ts-essentials.ts-essentials/dist/types.DeepPartial<V>> : T extends std.WeakMap<infer K, infer V> ? std.WeakMap<ts-essentials.ts-essentials/dist/types.DeepPartial<K>, ts-essentials.ts-essentials/dist/types.DeepPartial<V>> : T extends std.Set<infer U> ? std.Set<ts-essentials.ts-essentials/dist/types.DeepPartial<U>> : T extends std.ReadonlySet<infer U> ? std.ReadonlySet<ts-essentials.ts-essentials/dist/types.DeepPartial<U>> : T extends std.WeakSet<infer U> ? std.WeakSet<ts-essentials.ts-essentials/dist/types.DeepPartial<U>> : T extends std.Array<infer U> ? T extends ts-essentials.ts-essentials/dist/types.IsTuple<T> ? {[ K in keyof T ]:? ts-essentials.ts-essentials/dist/types.DeepPartial<T[K]>} : std.Array<ts-essentials.ts-essentials/dist/types.DeepPartial<U> | undefined> : T extends std.Promise<infer U> ? std.Promise<ts-essentials.ts-essentials/dist/types.DeepPartial<U>> : T extends {} ? {[ K in keyof T ]:? ts-essentials.ts-essentials/dist/types.DeepPartial<T[K]>} : ts-essentials.ts-essentials/dist/types.IsUnknown<T> extends true ? unknown : std.Partial<T>
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends ts-essentials.ts-essentials/dist/types.Builtin ? T : T extends std.Map<infer KeyType, infer ValueType> ? Filter extends std.Map<KeyType, infer FilterValueType> ? FilterValueType extends ts-essentials.ts-essentials/dist/types.DeepModify<ValueType> ? std.Map<KeyType, ts-essentials.ts-essentials/dist/types.DeepPick<ValueType, FilterValueType>> : T : T : T extends std.ReadonlyMap<infer KeyType, infer ValueType> ? Filter extends std.ReadonlyMap<KeyType, infer FilterValueType> ? FilterValueType extends ts-essentials.ts-essentials/dist/types.DeepModify<ValueType> ? std.ReadonlyMap<KeyType, ts-essentials.ts-essentials/dist/types.DeepPick<ValueType, FilterValueType>> : T : T : T extends std.WeakMap<infer KeyType, infer ValueType> ? Filter extends std.WeakMap<KeyType, infer FilterValueType> ? FilterValueType extends ts-essentials.ts-essentials/dist/types.DeepModify<ValueType> ? std.WeakMap<KeyType, ts-essentials.ts-essentials/dist/types.DeepPick<ValueType, FilterValueType>> : T : T : T extends std.Set<infer ItemType> ? Filter extends std.Set<infer FilterItemType> ? FilterItemType extends ts-essentials.ts-essentials/dist/types.DeepModify<ItemType> ? std.Set<ts-essentials.ts-essentials/dist/types.DeepPick<ItemType, FilterItemType>> : T : T : T extends std.ReadonlySet<infer ItemType> ? Filter extends std.ReadonlySet<infer FilterItemType> ? FilterItemType extends ts-essentials.ts-essentials/dist/types.DeepModify<ItemType> ? std.ReadonlySet<ts-essentials.ts-essentials/dist/types.DeepPick<ItemType, FilterItemType>> : T : T : T extends std.WeakSet<infer ItemType> ? Filter extends std.WeakSet<infer FilterItemType> ? FilterItemType extends ts-essentials.ts-essentials/dist/types.DeepModify<ItemType> ? std.WeakSet<ts-essentials.ts-essentials/dist/types.DeepPick<ItemType, FilterItemType>> : T : T : T extends std.Array<infer ItemType> ? Filter extends std.Array<infer FilterItemType> ? FilterItemType extends ts-essentials.ts-essentials/dist/types.DeepModify<ItemType> ? std.Array<ts-essentials.ts-essentials/dist/types.DeepPick<ItemType, FilterItemType>> : T : T : T extends std.Promise<infer ItemType> ? Filter extends std.Promise<infer FilterItemType> ? FilterItemType extends ts-essentials.ts-essentials/dist/types.DeepModify<ItemType> ? std.Promise<ts-essentials.ts-essentials/dist/types.DeepPick<ItemType, FilterItemType>> : T : T : Filter extends ts-essentials.ts-essentials/dist/types.AnyRecord<any> ? {[ K in keyof T as K extends keyof Filter? K : never ]: Filter[K & keyof Filter] extends true? T[K] : K extends keyof Filter? Filter[K] extends ts-essentials.ts-essentials/dist/types.DeepModify<T[K]>? ts-essentials.ts-essentials/dist/types.DeepPick<T[K], Filter[K]> : never : never} : never
    }}}
    */
  @js.native
  trait DeepPick[T, Filter /* <: DeepModify[T] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends ts-essentials.ts-essentials/dist/types.Builtin ? T : T extends std.Map<infer K, infer V> ? std.ReadonlyMap<ts-essentials.ts-essentials/dist/types.DeepReadonly<K>, ts-essentials.ts-essentials/dist/types.DeepReadonly<V>> : T extends std.ReadonlyMap<infer K, infer V> ? std.ReadonlyMap<ts-essentials.ts-essentials/dist/types.DeepReadonly<K>, ts-essentials.ts-essentials/dist/types.DeepReadonly<V>> : T extends std.WeakMap<infer K, infer V> ? std.WeakMap<ts-essentials.ts-essentials/dist/types.DeepReadonly<K>, ts-essentials.ts-essentials/dist/types.DeepReadonly<V>> : T extends std.Set<infer U> ? std.ReadonlySet<ts-essentials.ts-essentials/dist/types.DeepReadonly<U>> : T extends std.ReadonlySet<infer U> ? std.ReadonlySet<ts-essentials.ts-essentials/dist/types.DeepReadonly<U>> : T extends std.WeakSet<infer U> ? std.WeakSet<ts-essentials.ts-essentials/dist/types.DeepReadonly<U>> : T extends std.Promise<infer U> ? std.Promise<ts-essentials.ts-essentials/dist/types.DeepReadonly<U>> : T extends ts-essentials.ts-essentials/dist/types.AnyArray<infer U> ? T extends ts-essentials.ts-essentials/dist/types.IsTuple<T> ? {readonly [ K in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepReadonly<T[K]>} : std.ReadonlyArray<ts-essentials.ts-essentials/dist/types.DeepReadonly<U>> : T extends {} ? {readonly [ K in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepReadonly<T[K]>} : ts-essentials.ts-essentials/dist/types.IsUnknown<T> extends true ? unknown : std.Readonly<T>
    }}}
    */
  @js.native
  trait DeepReadonly[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Error ? std.Required<T> : T extends ts-essentials.ts-essentials/dist/types.Builtin ? T : T extends std.Map<infer K, infer V> ? std.Map<ts-essentials.ts-essentials/dist/types.DeepRequired<K>, ts-essentials.ts-essentials/dist/types.DeepRequired<V>> : T extends std.ReadonlyMap<infer K, infer V> ? std.ReadonlyMap<ts-essentials.ts-essentials/dist/types.DeepRequired<K>, ts-essentials.ts-essentials/dist/types.DeepRequired<V>> : T extends std.WeakMap<infer K, infer V> ? std.WeakMap<ts-essentials.ts-essentials/dist/types.DeepRequired<K>, ts-essentials.ts-essentials/dist/types.DeepRequired<V>> : T extends std.Set<infer U> ? std.Set<ts-essentials.ts-essentials/dist/types.DeepRequired<U>> : T extends std.ReadonlySet<infer U> ? std.ReadonlySet<ts-essentials.ts-essentials/dist/types.DeepRequired<U>> : T extends std.WeakSet<infer U> ? std.WeakSet<ts-essentials.ts-essentials/dist/types.DeepRequired<U>> : T extends std.Promise<infer U> ? std.Promise<ts-essentials.ts-essentials/dist/types.DeepRequired<U>> : T extends {} ? {[ K in keyof T ]: -? ts-essentials.ts-essentials/dist/types.DeepRequired<T[K]>} : std.Required<T>
    }}}
    */
  @js.native
  trait DeepRequired[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends ts-essentials.ts-essentials/dist/types.Builtin ? T | undefined : T extends std.Map<infer K, infer V> ? std.Map<ts-essentials.ts-essentials/dist/types.DeepUndefinable<K>, ts-essentials.ts-essentials/dist/types.DeepUndefinable<V>> : T extends std.ReadonlyMap<infer K, infer V> ? std.ReadonlyMap<ts-essentials.ts-essentials/dist/types.DeepUndefinable<K>, ts-essentials.ts-essentials/dist/types.DeepUndefinable<V>> : T extends std.WeakMap<infer K, infer V> ? std.WeakMap<ts-essentials.ts-essentials/dist/types.DeepUndefinable<K>, ts-essentials.ts-essentials/dist/types.DeepUndefinable<V>> : T extends std.Set<infer U> ? std.Set<ts-essentials.ts-essentials/dist/types.DeepUndefinable<U>> : T extends std.ReadonlySet<infer U> ? std.ReadonlySet<ts-essentials.ts-essentials/dist/types.DeepUndefinable<U>> : T extends std.WeakSet<infer U> ? std.WeakSet<ts-essentials.ts-essentials/dist/types.DeepUndefinable<U>> : T extends std.Array<infer U> ? T extends ts-essentials.ts-essentials/dist/types.IsTuple<T> ? {[ K in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepUndefinable<T[K]> | undefined} : std.Array<ts-essentials.ts-essentials/dist/types.DeepUndefinable<U>> : T extends std.Promise<infer U> ? std.Promise<ts-essentials.ts-essentials/dist/types.DeepUndefinable<U>> : T extends {} ? {[ K in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepUndefinable<T[K]>} : T | undefined
    }}}
    */
  @js.native
  trait DeepUndefinable[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends ts-essentials.ts-essentials/dist/types.Builtin ? T : T extends std.Map<infer K, infer V> ? std.Map<ts-essentials.ts-essentials/dist/types.DeepWritable<K>, ts-essentials.ts-essentials/dist/types.DeepWritable<V>> : T extends std.ReadonlyMap<infer K, infer V> ? std.Map<ts-essentials.ts-essentials/dist/types.DeepWritable<K>, ts-essentials.ts-essentials/dist/types.DeepWritable<V>> : T extends std.WeakMap<infer K, infer V> ? std.WeakMap<ts-essentials.ts-essentials/dist/types.DeepWritable<K>, ts-essentials.ts-essentials/dist/types.DeepWritable<V>> : T extends std.Set<infer U> ? std.Set<ts-essentials.ts-essentials/dist/types.DeepWritable<U>> : T extends std.ReadonlySet<infer U> ? std.Set<ts-essentials.ts-essentials/dist/types.DeepWritable<U>> : T extends std.WeakSet<infer U> ? std.WeakSet<ts-essentials.ts-essentials/dist/types.DeepWritable<U>> : T extends std.Promise<infer U> ? std.Promise<ts-essentials.ts-essentials/dist/types.DeepWritable<U>> : T extends {} ? {-readonly [ K in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepWritable<T[K]>} : T
    }}}
    */
  @js.native
  trait DeepWritable[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in K ]: T}
    }}}
    */
  @js.native
  trait Dictionary[T, K /* <: KeyofBase */] extends StObject
  
  type DictionaryValues[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<infer ET> ? ET : never
    }}}
    */
  @js.native
  trait ElementOf[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends SHAPE ? std.Exclude<keyof T, keyof SHAPE> extends never ? T : never : never
    }}}
    */
  @js.native
  trait Exact[T, SHAPE] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T['length'] extends 0 ? never : T[0]
    }}}
    */
  @js.native
  trait Head[T /* <: AnyArray[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    0 extends 1 & T ? true : false
    }}}
    */
  @js.native
  trait IsAny[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    <T>(): T extends X ? 1 : 2 extends <T>(): T extends Y ? 1 : 2 ? true : false
    }}}
    */
  @js.native
  trait IsEqualConsideringWritability[X, Y] extends StObject
  
  type IsFullyWritable[T /* <: js.Object */] = IsEqualConsideringWritability[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Q in keyof T ]: T[Q]} */ js.Any, 
    Writable[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ Q in keyof T ]: T[Q]} */ js.Any
    ]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [never] ? true : false
    }}}
    */
  @js.native
  trait IsNever[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<any> ? std.Array<any> extends T ? never : T : never
    }}}
    */
  @js.native
  trait IsTuple[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-essentials.ts-essentials/dist/types.IsAny<T> extends true ? false : unknown extends T ? true : false
    }}}
    */
  @js.native
  trait IsUnknown[T] extends StObject
  
  type KeyofBase = /* keyof any */ String
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends T ? std.Omit<T, K> & std.Partial<std.Pick<T, K>> : never
    }}}
    */
  @js.native
  trait MarkOptional[T, K /* <: /* keyof T */ String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends T ? std.Omit<T, K> & std.Readonly<std.Pick<T, K>> : never
    }}}
    */
  @js.native
  trait MarkReadonly[T, K /* <: /* keyof T */ String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends T ? std.Omit<T, RK> & std.Required<std.Pick<T, RK>> : never
    }}}
    */
  @js.native
  trait MarkRequired[T, RK /* <: /* keyof T */ String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends T ? std.Omit<T, K> & ts-essentials.ts-essentials/dist/types.Writable<std.Pick<T, K>> : never
    }}}
    */
  @js.native
  trait MarkWritable[T, K /* <: /* keyof T */ String */] extends StObject
  
  type Merge[M, N] = (Omit[M, /* keyof N */ String]) & N
  
  type MergeN[T /* <: js.Array[Any] */] = _MergeN[T, js.Object]
  
  @js.native
  trait Newable[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
  
  type NonEmptyArray[T] = Array[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    keyof T extends never ? never : T
    }}}
    */
  @js.native
  trait NonEmptyObject[T /* <: js.Object */] extends StObject
  
  type NonNever[T /* <: js.Object */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends never? never : K}[keyof T] */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends undefined ? never : T
    }}}
    */
  @js.native
  trait NonUndefinable[T] extends StObject
  
  type OmitProperties[T, P] = Omit[T, PickKeysByValue[T, P]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Token extends ts-essentials.ts-essentials/dist/types.StringLiteral<Token> ? Type & {readonly [__OPAQUE_TYPE__] : Token} : never
    }}}
    */
  @js.native
  trait Opaque[Type, Token /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends unknown ? {[ K in keyof T ]: -? undefined extends {[ K2 in keyof T ]: K2}[K]? K : never}[keyof T] : never
    }}}
    */
  @js.native
  trait OptionalKeys[T] extends StObject
  
  type PickKeys[T, P] = Exclude[
    /* keyof ts-essentials.ts-essentials/dist/types.PickProperties<T, P> */ String, 
    Unit
  ]
  
  type PickKeysByValue[T, V] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends V? K : never}[keyof T] */ js.Any
  
  type PickProperties[T, P] = Pick[T, PickKeysByValue[T, P]]
  
  @js.native
  trait PredicateFunction extends StObject {
    
    def apply(x: Any, _z: Any*): /* is any */ Boolean = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (target : any, rest : ...any): target is infer P ? P : never
    }}}
    */
  @js.native
  trait PredicateType[T /* <: PredicateFunction */] extends StObject
  
  type Primitive = js.UndefOr[String | Double | Boolean | js.BigInt | js.Symbol | Null]
  
  type ReadonlyArrayOrSingle[T] = T | js.Array[T]
  
  type ReadonlyKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? ts-essentials.ts-essentials/dist/types.IsFullyWritable<std.Pick<T, P>> extends true? never : P}[keyof T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends unknown ? std.Exclude<keyof T, ts-essentials.ts-essentials/dist/types.OptionalKeys<T>> : never
    }}}
    */
  @js.native
  trait RequiredKeys[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in K ]:? T}
    }}}
    */
  @js.native
  trait SafeDictionary[T, K /* <: KeyofBase */] extends StObject
  
  type StrictExclude[T, U /* <: T */] = Exclude[T, U]
  
  type StrictExtract[T, U /* <: Partial[T] */] = Extract[T, U]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends ts-essentials.ts-essentials/dist/types.AnyArray<any> ? never : std.Omit<T, K>
    }}}
    */
  @js.native
  trait StrictOmit[T /* <: AnyRecord[Any] */, K /* <: /* keyof T */ String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends string ? string extends T ? never : T : never
    }}}
    */
  @js.native
  trait StringLiteral[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [any, ...infer Rest] ? Rest : never
    }}}
    */
  @js.native
  trait Tail[T /* <: AnyArray[Any] */] extends StObject
  
  type Tuple[T] = js.Array[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    U extends any ? (k : U): void : never extends (k : infer I): void ? I : never
    }}}
    */
  @js.native
  trait UnionToIntersection[U] extends StObject
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  /** Mark some properties which only the former including as optional and set the value to never */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in std.Exclude<keyof T, keyof U> ]:? never}
    }}}
    */
  @js.native
  trait Without[T, U] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {-readonly [ P in keyof T ]: T[P]}
    }}}
    */
  type Writable[T] = T
  
  type WritableKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? ts-essentials.ts-essentials/dist/types.IsFullyWritable<std.Pick<T, P>> extends true? P : never}[keyof T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T | U extends object ? ts-essentials.ts-essentials/dist/types.Without<T, U> & U | ts-essentials.ts-essentials/dist/types.Without<U, T> & T : T | U
    }}}
    */
  @js.native
  trait XOR[T, U] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [infer Head, ...infer Tail] ? ts-essentials.ts-essentials/dist/types._MergeN<Tail, ts-essentials.ts-essentials/dist/types.Merge<Result, Head>> : Result
    }}}
    */
  @js.native
  trait _MergeN[T /* <: js.Array[Any] */, Result] extends StObject
}
