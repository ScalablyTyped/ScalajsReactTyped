package typingsJapgolly.typeFest

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.ReadonlyMap
import typingsJapgolly.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceReadonlyDeepMod {
  
  /**
  Test if the given function has multiple call signatures.
  Needed to handle the case of a single call signature with properties.
  Multiple call signatures cannot currently be supported due to a TypeScript limitation.
  @see https://github.com/microsoft/TypeScript/issues/29732
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends {None (arguments : infer A): unknown, None (arguments : ...any): unknown} ? std.Array<unknown> extends A ? false : true : false
    }}}
    */
  @js.native
  trait HasMultipleCallSignatures[T /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends type-fest.type-fest/source/internal.BuiltIns ? T : T extends (arguments : ...any): unknown ? {} extends type-fest.type-fest/source/readonly-deep.ReadonlyObjectDeep<T> ? T : type-fest.type-fest/source/readonly-deep.HasMultipleCallSignatures<T> extends true ? T : (arguments : std.Parameters<T>): std.ReturnType<T> & type-fest.type-fest/source/readonly-deep.ReadonlyObjectDeep<T> : T extends / * Inlined std.Readonly<std.ReadonlyMap<infer KeyType, infer ValueType>> * /
  {readonly entries (): std.IterableIterator<[infer KeyType, infer ValueType]>,  readonly size :number, readonly keys (): std.IterableIterator<infer KeyType>, readonly forEach (callbackfn : (value : infer ValueType, key : infer KeyType, map : std.ReadonlyMap<infer KeyType, infer ValueType>): void): void, readonly has (key : infer KeyType): boolean, readonly values (): std.IterableIterator<infer ValueType>, readonly get (key : infer KeyType): infer ValueType | undefined} ? type-fest.type-fest/source/readonly-deep.ReadonlyMapDeep<KeyType, ValueType> : T extends / * Inlined std.Readonly<std.ReadonlySet<infer ItemType>> * /
  {readonly entries (): std.IterableIterator<[infer ItemType, infer ItemType]>,  readonly size :number, readonly keys (): std.IterableIterator<infer ItemType>, readonly forEach (callbackfn : (value : infer ItemType, value2 : infer ItemType, set : std.ReadonlySet<infer ItemType>): void): void, readonly has (value : infer ItemType): boolean, readonly values (): std.IterableIterator<infer ItemType>} ? type-fest.type-fest/source/readonly-deep.ReadonlySetDeep<ItemType> : T extends object ? type-fest.type-fest/source/readonly-deep.ReadonlyObjectDeep<T> : unknown
    }}}
    */
  @js.native
  trait ReadonlyDeep[T] extends StObject
  
  /**
  Same as `ReadonlyDeep`, but accepts only `ReadonlyMap`s as inputs. Internal helper for `ReadonlyDeep`.
  */
  /* Inlined {} & std.Readonly<std.ReadonlyMap<type-fest.type-fest/source/readonly-deep.ReadonlyDeep<KeyType>, type-fest.type-fest/source/readonly-deep.ReadonlyDeep<ValueType>>> */
  trait ReadonlyMapDeep[KeyType, ValueType] extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]]]
    
    def forEach(
      callbackfn: js.Function3[
          /* value */ ReadonlyDeep[ValueType], 
          /* key */ ReadonlyDeep[KeyType], 
          /* map */ ReadonlyMap[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]], 
          Unit
        ]
    ): Unit
    
    def get(key: ReadonlyDeep[KeyType]): js.UndefOr[ReadonlyDeep[ValueType]]
    
    def has(key: ReadonlyDeep[KeyType]): Boolean
    
    def keys(): IterableIterator[ReadonlyDeep[KeyType]]
    
    val size: Double
    
    def values(): IterableIterator[ReadonlyDeep[ValueType]]
  }
  object ReadonlyMapDeep {
    
    inline def apply[KeyType, ValueType](
      entries: CallbackTo[IterableIterator[js.Tuple2[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]]]],
      forEach: js.Function3[
          /* value */ ReadonlyDeep[ValueType], 
          /* key */ ReadonlyDeep[KeyType], 
          /* map */ ReadonlyMap[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]], 
          Unit
        ] => Callback,
      get: ReadonlyDeep[KeyType] => js.UndefOr[ReadonlyDeep[ValueType]],
      has: ReadonlyDeep[KeyType] => Boolean,
      keys: CallbackTo[IterableIterator[ReadonlyDeep[KeyType]]],
      size: Double,
      values: CallbackTo[IterableIterator[ReadonlyDeep[ValueType]]]
    ): ReadonlyMapDeep[KeyType, ValueType] = {
      val __obj = js.Dynamic.literal(entries = entries.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function3[
          /* value */ ReadonlyDeep[ValueType], 
          /* key */ ReadonlyDeep[KeyType], 
          /* map */ ReadonlyMap[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]], 
          Unit
        ]) => forEach(t0).runNow()), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = keys.toJsFn, size = size.asInstanceOf[js.Any], values = values.toJsFn)
      __obj.asInstanceOf[ReadonlyMapDeep[KeyType, ValueType]]
    }
    
    extension [Self <: ReadonlyMapDeep[?, ?], KeyType, ValueType](x: Self & (ReadonlyMapDeep[KeyType, ValueType])) {
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setForEach(
        value: js.Function3[
              /* value */ ReadonlyDeep[ValueType], 
              /* key */ ReadonlyDeep[KeyType], 
              /* map */ ReadonlyMap[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]], 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[
              /* value */ ReadonlyDeep[ValueType], 
              /* key */ ReadonlyDeep[KeyType], 
              /* map */ ReadonlyMap[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]], 
              Unit
            ]) => value(t0).runNow()))
      
      inline def setGet(value: ReadonlyDeep[KeyType] => js.UndefOr[ReadonlyDeep[ValueType]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: ReadonlyDeep[KeyType] => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: CallbackTo[IterableIterator[ReadonlyDeep[KeyType]]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: CallbackTo[IterableIterator[ReadonlyDeep[ValueType]]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
  
  /**
  Same as `ReadonlyDeep`, but accepts only `object`s as inputs. Internal helper for `ReadonlyDeep`.
  */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {readonly [ KeyType in keyof ObjectType ]: type-fest.type-fest/source/readonly-deep.ReadonlyDeep<ObjectType[KeyType]>}
    }}}
    */
  @js.native
  trait ReadonlyObjectDeep[ObjectType /* <: js.Object */] extends StObject
  
  /**
  Same as `ReadonlyDeep`, but accepts only `ReadonlySet`s as inputs. Internal helper for `ReadonlyDeep`.
  */
  /* Inlined {} & std.Readonly<std.ReadonlySet<type-fest.type-fest/source/readonly-deep.ReadonlyDeep<ItemType>>> */
  trait ReadonlySetDeep[ItemType] extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[ReadonlyDeep[ItemType], ReadonlyDeep[ItemType]]]
    
    def forEach(
      callbackfn: js.Function3[
          /* value */ ReadonlyDeep[ItemType], 
          /* value2 */ ReadonlyDeep[ItemType], 
          /* set */ ReadonlySet[ReadonlyDeep[ItemType]], 
          Unit
        ]
    ): Unit
    
    def has(value: ReadonlyDeep[ItemType]): Boolean
    
    def keys(): IterableIterator[ReadonlyDeep[ItemType]]
    
    val size: Double
    
    def values(): IterableIterator[ReadonlyDeep[ItemType]]
  }
  object ReadonlySetDeep {
    
    inline def apply[ItemType](
      entries: CallbackTo[IterableIterator[js.Tuple2[ReadonlyDeep[ItemType], ReadonlyDeep[ItemType]]]],
      forEach: js.Function3[
          /* value */ ReadonlyDeep[ItemType], 
          /* value2 */ ReadonlyDeep[ItemType], 
          /* set */ ReadonlySet[ReadonlyDeep[ItemType]], 
          Unit
        ] => Callback,
      has: ReadonlyDeep[ItemType] => Boolean,
      keys: CallbackTo[IterableIterator[ReadonlyDeep[ItemType]]],
      size: Double,
      values: CallbackTo[IterableIterator[ReadonlyDeep[ItemType]]]
    ): ReadonlySetDeep[ItemType] = {
      val __obj = js.Dynamic.literal(entries = entries.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function3[
          /* value */ ReadonlyDeep[ItemType], 
          /* value2 */ ReadonlyDeep[ItemType], 
          /* set */ ReadonlySet[ReadonlyDeep[ItemType]], 
          Unit
        ]) => forEach(t0).runNow()), has = js.Any.fromFunction1(has), keys = keys.toJsFn, size = size.asInstanceOf[js.Any], values = values.toJsFn)
      __obj.asInstanceOf[ReadonlySetDeep[ItemType]]
    }
    
    extension [Self <: ReadonlySetDeep[?], ItemType](x: Self & ReadonlySetDeep[ItemType]) {
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[ReadonlyDeep[ItemType], ReadonlyDeep[ItemType]]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setForEach(
        value: js.Function3[
              /* value */ ReadonlyDeep[ItemType], 
              /* value2 */ ReadonlyDeep[ItemType], 
              /* set */ ReadonlySet[ReadonlyDeep[ItemType]], 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[
              /* value */ ReadonlyDeep[ItemType], 
              /* value2 */ ReadonlyDeep[ItemType], 
              /* set */ ReadonlySet[ReadonlyDeep[ItemType]], 
              Unit
            ]) => value(t0).runNow()))
      
      inline def setHas(value: ReadonlyDeep[ItemType] => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: CallbackTo[IterableIterator[ReadonlyDeep[ItemType]]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: CallbackTo[IterableIterator[ReadonlyDeep[ItemType]]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
}
