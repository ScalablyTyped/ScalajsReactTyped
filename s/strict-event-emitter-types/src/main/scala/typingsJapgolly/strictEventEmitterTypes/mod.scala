package typingsJapgolly.strictEventEmitterTypes

import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends keyof T ? strict-event-emitter-types.strict-event-emitter-types.InnerEEMethodReturnType<T[S], TValue, FValue> : FValue
    }}}
    */
  @js.native
  trait EEMethodReturnType[T, S /* <: String */, TValue, FValue] extends StObject
  
  type EmitEventNames[TEmitter /* <: TypeRecord[Any, Any, Any] */, TEventRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = /* keyof TEmitRecord */ String
  
  type EventNames[TEmitter /* <: TypeRecord[Any, Any, Any] */, TEventRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = /* keyof TEmitRecord */ String
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (args : ...any): any ? std.ReturnType<T> extends void | undefined ? FValue : TValue : FValue
    }}}
    */
  @js.native
  trait InnerEEMethodReturnType[T, TValue, FValue] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [(args : infer U): any] ? U : [T] extends [void] ? [] : [T]
    }}}
    */
  @js.native
  trait ListenerType[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    K extends TRecord[K] extends TMatch ? K : never ? K : never
    }}}
    */
  @js.native
  trait MatchingKeys[TRecord, TMatch, K /* <: /* keyof TRecord */ String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends undefined ? never : T
    }}}
    */
  @js.native
  trait NoUndefined[T] extends StObject
  
  type OnEventNames[TEmitter /* <: TypeRecord[Any, Any, Any] */, TEventRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = /* keyof TEventRecord */ String
  
  /* keyof strict-event-emitter-types.strict-event-emitter-types.OverriddenMethods<any, any, any> */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.on
    - typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.addListener
    - typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.addEventListener
    - typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.removeListener
    - typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.removeEventListener
    - typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.once
    - typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.emit
  */
  trait OverriddenKeys extends StObject
  
  @js.native
  trait OverriddenMethods[TEmitter, TEventRecord, TEmitRecord] extends StObject {
    
    def addEventListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    def addEventListener[P /* <: /* keyof TEventRecord */ String */, T](
      event: P,
      listener: js.Function1[
          /* args */ ListenerType[
            /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
          ], 
          Unit
        ]
    ): EEMethodReturnType[
        TEmitter, 
        typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.addEventListener, 
        T, 
        Unit
      ] = js.native
    
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    def addListener[P /* <: /* keyof TEventRecord */ String */, T](
      event: P,
      listener: js.Function1[
          /* args */ ListenerType[
            /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
          ], 
          Unit
        ]
    ): EEMethodReturnType[
        TEmitter, 
        typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.addListener, 
        T, 
        Unit
      ] = js.native
    
    def emit(event: js.Symbol, args: Any*): Unit = js.native
    def emit[P /* <: /* keyof TEmitRecord */ String */, T](
      event: P,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ListenerType<TEmitRecord[P]> is not an array type */ args: ListenerType[
          /* import warning: importer.ImportType#apply Failed type conversion: TEmitRecord[P] */ js.Any
        ]
    ): EEMethodReturnType[
        TEmitter, 
        typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.emit, 
        T, 
        Unit
      ] = js.native
    
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    def on[P /* <: /* keyof TEventRecord */ String */, T](
      event: P,
      listener: js.Function1[
          /* args */ ListenerType[
            /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
          ], 
          Unit
        ]
    ): EEMethodReturnType[
        TEmitter, 
        typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.on, 
        T, 
        Unit
      ] = js.native
    
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    def once[P /* <: /* keyof TEventRecord */ String */, T](
      event: P,
      listener: js.Function1[
          /* args */ ListenerType[
            /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
          ], 
          Unit
        ]
    ): EEMethodReturnType[
        TEmitter, 
        typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.once, 
        T, 
        Unit
      ] = js.native
    
    def removeEventListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    def removeEventListener[P /* <: /* keyof TEventRecord */ String */, T](event: P, listener: js.Function1[/* repeated */ Any, Any]): EEMethodReturnType[
        TEmitter, 
        typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.removeEventListener, 
        T, 
        Unit
      ] = js.native
    
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    def removeListener[P /* <: /* keyof TEventRecord */ String */, T](event: P, listener: js.Function1[/* repeated */ Any, Any]): EEMethodReturnType[
        TEmitter, 
        typingsJapgolly.strictEventEmitterTypes.strictEventEmitterTypesStrings.removeListener, 
        T, 
        Unit
      ] = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (args : ...any): any ? std.ReturnType<T> : void
    }}}
    */
  @js.native
  trait ReturnTypeOfMethod[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends keyof T ? strict-event-emitter-types.strict-event-emitter-types.ReturnTypeOfMethod<T[S]> : void
    }}}
    */
  @js.native
  trait ReturnTypeOfMethodIfExists[T, S /* <: String */] extends StObject
  
  @js.native
  trait StrictBroadcast[TEmitter /* <: TypeRecord[Any, Any, Any] */, TEmitRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */, VK /* <: VoidKeys[TEmitRecord] */, NVK /* <: Exclude[/* keyof TEmitRecord */ String, VK] */] extends StObject {
    
    def apply[E /* <: VK */](event: E): Any = js.native
    def apply[E /* <: NVK */](
      event: E,
      request: /* import warning: importer.ImportType#apply Failed type conversion: TEmitRecord[E] */ js.Any
    ): Any = js.native
  }
  
  type StrictEventEmitter[TEmitterType, TEventRecord, TEmitRecord, UnneededMethods /* <: Exclude[OverriddenKeys, /* keyof TEmitterType */ String] */, NeededMethods /* <: Exclude[OverriddenKeys, UnneededMethods] */] = (TypeRecord[TEmitterType, TEventRecord, TEmitRecord]) & (Pick[TEmitterType, Exclude[/* keyof TEmitterType */ String, OverriddenKeys]]) & (Pick[OverriddenMethods[TEmitterType, TEventRecord, TEmitRecord], NeededMethods])
  
  trait TypeRecord[T, U, V] extends StObject {
    
    @JSName(" _emitType")
    var Space_emitType: js.UndefOr[V] = js.undefined
    
    @JSName(" _emitterType")
    var Space_emitterType: js.UndefOr[T] = js.undefined
    
    @JSName(" _eventsType")
    var Space_eventsType: js.UndefOr[U] = js.undefined
  }
  object TypeRecord {
    
    inline def apply[T, U, V](): TypeRecord[T, U, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeRecord[T, U, V]]
    }
    
    extension [Self <: TypeRecord[?, ?, ?], T, U, V](x: Self & (TypeRecord[T, U, V])) {
      
      inline def setSpace_emitType(value: V): Self = StObject.set(x, " _emitType", value.asInstanceOf[js.Any])
      
      inline def setSpace_emitTypeUndefined: Self = StObject.set(x, " _emitType", js.undefined)
      
      inline def setSpace_emitterType(value: T): Self = StObject.set(x, " _emitterType", value.asInstanceOf[js.Any])
      
      inline def setSpace_emitterTypeUndefined: Self = StObject.set(x, " _emitterType", js.undefined)
      
      inline def setSpace_eventsType(value: U): Self = StObject.set(x, " _eventsType", value.asInstanceOf[js.Any])
      
      inline def setSpace_eventsTypeUndefined: Self = StObject.set(x, " _eventsType", js.undefined)
    }
  }
  
  type VoidKeys[Record] = MatchingKeys[Record, Unit, /* keyof Record */ String]
}
