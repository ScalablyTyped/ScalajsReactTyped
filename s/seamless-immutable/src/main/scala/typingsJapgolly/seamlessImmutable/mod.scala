package typingsJapgolly.seamlessImmutable

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.seamlessImmutable.mod.ImmutableArray.Additions
import typingsJapgolly.seamlessImmutable.mod.ImmutableArray.Overrides
import typingsJapgolly.seamlessImmutable.mod.ImmutableArray.ReadOnlyIndexer
import typingsJapgolly.seamlessImmutable.mod.ImmutableArray.Remaining
import typingsJapgolly.seamlessImmutable.seamlessImmutableBooleans.`false`
import typingsJapgolly.seamlessImmutable.seamlessImmutableBooleans.`true`
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.concat
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.filter
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.forEach
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.map
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.merge
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.pop
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.push
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.reduce
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.reduceRight
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.replace
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.reverse
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.shift
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.slice
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.sort
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.splice
import typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.unshift
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Pick
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](obj: T): Immutable[T, js.Object] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Immutable[T, js.Object]]
  inline def apply[T](obj: T, options: Options): Immutable[T, js.Object] = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Immutable[T, js.Object]]
  
  @JSImport("seamless-immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ImmutableError(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ImmutableError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def asMutable[T](obj: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any]
  inline def asMutable[T](obj: T, opts: AsMutableOptions[Boolean]): T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any) = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any)]
  inline def asMutable[T](obj: js.Array[T] | ImmutableArray[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def asMutable[T](obj: js.Array[T] | ImmutableArray[T], opts: AsMutableOptions[Boolean]): js.Array[(Immutable[T, js.Object]) | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[(Immutable[T, js.Object]) | T]]
  inline def asMutable[T](obj: ImmutableObject[T]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any]
  inline def asMutable[T](obj: ImmutableObject[T], opts: AsMutableOptions[Boolean]): T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any) = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any)]
  
  inline def asMutable_false[T](obj: T, opts: AsMutableOptions[`false`]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any]
  inline def asMutable_false[T](obj: js.Array[T] | ImmutableArray[T], opts: AsMutableOptions[`false`]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def asMutable_false[T](obj: ImmutableObject[T], opts: AsMutableOptions[`false`]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any]
  
  inline def asMutable_true[T](obj: T, opts: AsMutableOptions[`true`]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def asMutable_true[T](obj: js.Array[T] | ImmutableArray[T], opts: AsMutableOptions[`true`]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def asMutable_true[T](obj: ImmutableObject[T], opts: AsMutableOptions[`true`]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def from[T](obj: T): Immutable[T, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[Immutable[T, js.Object]]
  inline def from[T](obj: T, options: Options): Immutable[T, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Immutable[T, js.Object]]
  
  inline def isImmutable[T](target: T): /* is seamless-immutable.seamless-immutable.Immutable<T, {}> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")(target.asInstanceOf[js.Any]).asInstanceOf[/* is seamless-immutable.seamless-immutable.Immutable<T, {}> */ Boolean]
  inline def isImmutable[T](target: Immutable[T, js.Object]): /* is seamless-immutable.seamless-immutable.Immutable<T, {}> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")(target.asInstanceOf[js.Any]).asInstanceOf[/* is seamless-immutable.seamless-immutable.Immutable<T, {}> */ Boolean]
  
  inline def replace[T, S](obj: Immutable[T, js.Object], valueObj: S): Immutable[S, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(obj.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any])).asInstanceOf[Immutable[S, js.Object]]
  inline def replace[T, S](obj: Immutable[T, js.Object], valueObj: S, options: ReplaceConfig): Immutable[S, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(obj.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Immutable[S, js.Object]]
  
  trait AsMutableOptions[TDeep /* <: Boolean */] extends StObject {
    
    var deep: TDeep
  }
  object AsMutableOptions {
    
    inline def apply[TDeep /* <: Boolean */](deep: TDeep): AsMutableOptions[TDeep] = {
      val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsMutableOptions[TDeep]]
    }
    
    extension [Self <: AsMutableOptions[?], TDeep /* <: Boolean */](x: Self & AsMutableOptions[TDeep]) {
      
      inline def setDeep(value: TDeep): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? seamless-immutable.seamless-immutable.DeepPartial<T[P]>}
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Promise<infer U> ? std.Promise<seamless-immutable.seamless-immutable.Immutable.MakeImmutable<U, O>> : seamless-immutable.seamless-immutable.Immutable.MakeImmutable<T, O>
    }}}
    */
  @js.native
  trait Immutable[T, O /* <: js.Object */] extends StObject
  object Immutable {
    
    type AlreadyImmutable[O /* <: js.Object */] = ImmutableObject[O] | ImmutableArray[Any] | ImmutableDate
    
    @js.native
    trait AnyFunction extends StObject {
      
      def apply(args: Any*): Any = js.native
    }
    
    type CannotMakeImmutable[O /* <: js.Object */] = AlreadyImmutable[O] | Primitive
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      T extends seamless-immutable.seamless-immutable.Immutable.CannotMakeImmutable<O> ? T : T extends std.Array<infer Element> ? seamless-immutable.seamless-immutable.ImmutableArray<Element> : T extends std.Date ? seamless-immutable.seamless-immutable.ImmutableDate : seamless-immutable.seamless-immutable.ImmutableObject<T>
      }}}
      */
    @js.native
    trait MakeImmutable[T, O /* <: js.Object */] extends StObject
    
    type Primitive = js.UndefOr[Boolean | Double | String | js.Symbol | AnyFunction | Null]
  }
  
  object ImmutableArray {
    
    /** NOTE: These methods mutate data, but seamless-immutable does not ban them. We will ban them in our type definitions. */
    /* Inlined std.Extract<std.Array<keyof any>, 'copyWithin' | 'fill'> */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.fill
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.copyWithin
    */
    trait AdditionalMutatingArrayMethods extends StObject
    object AdditionalMutatingArrayMethods {
      
      inline def copyWithin: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.copyWithin = "copyWithin".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.copyWithin]
      
      inline def fill: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.fill = "fill".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.fill]
    }
    
    /** New methods added by seamless-immutable. */
    @js.native
    trait Additions[T] extends StObject {
      
      def asMutable(): js.Array[Immutable[T, js.Object]] = js.native
      def asMutable(opts: AsMutableOptions[Boolean]): js.Array[(Immutable[T, js.Object]) | T] = js.native
      @JSName("asMutable")
      def asMutable_false(opts: AsMutableOptions[`false`]): js.Array[Immutable[T, js.Object]] = js.native
      @JSName("asMutable")
      def asMutable_true(opts: AsMutableOptions[`true`]): js.Array[T] = js.native
      
      def asObject[U /* <: js.Object */, K /* <: /* keyof U */ String */](
        toKeyValue: js.Function1[
              /* item */ T, 
              js.Tuple2[
                K, 
                /* import warning: importer.ImportType#apply Failed type conversion: U[K] */ js.Any
              ]
            ]
      ): Immutable[U, js.Object] = js.native
      
      def flatMap[TTarget](mapFunction: js.Function1[/* item */ T, TTarget]): Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: TTarget extends std.Array<any> ? TTarget : std.Array<TTarget> */ js.Any, 
            js.Object
          ] = js.native
    }
    
    /** These methods are banned by seamless-immutable. */
    type MutatingArrayMethods = Extract[
        js.Array[/* keyof any */ String], 
        push | pop | sort | splice | shift | unshift | reverse | Double
      ]
    
    /** Custom implementation of the array functions, which return Immutable. */
    @js.native
    trait Overrides[T] extends StObject {
      
      def concat(arr: (T | (js.Array[(Immutable[T, js.Object]) | T]) | (Immutable[js.Array[T] | T, js.Object]))*): Immutable[js.Array[T], js.Object] = js.native
      
      def filter(filterFunction: js.Function2[/* item */ Immutable[T, js.Object], /* index */ Double, Boolean]): Immutable[js.Array[T], js.Object] = js.native
      
      def forEach(
        callbackfn: js.Function3[
              /* value */ Immutable[T, js.Object], 
              /* index */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              Unit
            ]
      ): Unit = js.native
      def forEach(
        callbackfn: js.Function3[
              /* value */ Immutable[T, js.Object], 
              /* index */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              Unit
            ],
        thisArg: Any
      ): Unit = js.native
      
      def map[TTarget](
        mapFuction: js.Function3[
              /* item */ Immutable[T, js.Object], 
              /* index */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              TTarget
            ]
      ): Immutable[js.Array[TTarget], js.Object] = js.native
      
      def reduce(
        callbackfn: js.Function4[
              /* previousValue */ Immutable[T, js.Object], 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              T
            ]
      ): Immutable[T, js.Object] = js.native
      def reduce[TTarget](
        callbackfn: js.Function4[
              /* previousValue */ TTarget, 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              TTarget
            ],
        initialValue: TTarget
      ): Immutable[TTarget, js.Object] = js.native
      
      def reduceRight(
        callbackfn: js.Function4[
              /* previousValue */ Immutable[T, js.Object], 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              T
            ]
      ): Immutable[T, js.Object] = js.native
      def reduceRight[TTarget](
        callbackfn: js.Function4[
              /* previousValue */ TTarget, 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              TTarget
            ],
        initialValue: TTarget
      ): Immutable[TTarget, js.Object] = js.native
      @JSName("reduceRight")
      def reduceRight_TTarget[TTarget](
        callbackfn: js.Function4[
              /* previousValue */ TTarget, 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              TTarget
            ]
      ): Immutable[TTarget, js.Object] = js.native
      
      @JSName("reduce")
      def reduce_TTarget[TTarget](
        callbackfn: js.Function4[
              /* previousValue */ TTarget, 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              TTarget
            ]
      ): Immutable[TTarget, js.Object] = js.native
      
      def slice(): Immutable[js.Array[T], js.Object] = js.native
      def slice(start: Double): Immutable[js.Array[T], js.Object] = js.native
      def slice(start: Double, end: Double): Immutable[js.Array[T], js.Object] = js.native
      def slice(start: Unit, end: Double): Immutable[js.Array[T], js.Object] = js.native
    }
    
    /** Merging this into Overrides breaks stuff, so this is split out */
    type ReadOnlyIndexer[T] = NumberDictionary[Immutable[T, js.Object]]
    
    /** The remaining properties on Array<T>, after we remove the mutating functions and the wrapped non-mutating functions. */
    type Remaining[T] = Omit[
        js.Array[T], 
        MutatingArrayMethods | AdditionalMutatingArrayMethods | forEach | map | filter | slice | concat | reduce | reduceRight
      ]
  }
  /** An ImmutableArray provides read-only access to the array elements, and provides functions (such as `map()`) that return immutable data structures. */
  type ImmutableArray[T] = Remaining[T] & Additions[T] & Overrides[T] & ReadOnlyIndexer[T]
  
  /** An ImmutableDate disables the use of mutating functions like `setDate` and `setFullYear`. */
  /* Inlined seamless-immutable.seamless-immutable.ImmutableDate.Remaining & seamless-immutable.seamless-immutable.ImmutableDate.Additions */
  trait ImmutableDate extends StObject {
    
    def asMutable(): js.Date
    
    def getDate(): Double
    @JSName("getDate")
    var getDate_Original: js.Function0[Double]
    
    def getDay(): Double
    @JSName("getDay")
    var getDay_Original: js.Function0[Double]
    
    def getFullYear(): Double
    @JSName("getFullYear")
    var getFullYear_Original: js.Function0[Double]
    
    def getHours(): Double
    @JSName("getHours")
    var getHours_Original: js.Function0[Double]
    
    def getMilliseconds(): Double
    @JSName("getMilliseconds")
    var getMilliseconds_Original: js.Function0[Double]
    
    def getMinutes(): Double
    @JSName("getMinutes")
    var getMinutes_Original: js.Function0[Double]
    
    def getMonth(): Double
    @JSName("getMonth")
    var getMonth_Original: js.Function0[Double]
    
    def getSeconds(): Double
    @JSName("getSeconds")
    var getSeconds_Original: js.Function0[Double]
    
    def getTime(): Double
    @JSName("getTime")
    var getTime_Original: js.Function0[Double]
    
    def getTimezoneOffset(): Double
    @JSName("getTimezoneOffset")
    var getTimezoneOffset_Original: js.Function0[Double]
    
    def getUTCDate(): Double
    @JSName("getUTCDate")
    var getUTCDate_Original: js.Function0[Double]
    
    def getUTCDay(): Double
    @JSName("getUTCDay")
    var getUTCDay_Original: js.Function0[Double]
    
    def getUTCFullYear(): Double
    @JSName("getUTCFullYear")
    var getUTCFullYear_Original: js.Function0[Double]
    
    def getUTCHours(): Double
    @JSName("getUTCHours")
    var getUTCHours_Original: js.Function0[Double]
    
    def getUTCMilliseconds(): Double
    @JSName("getUTCMilliseconds")
    var getUTCMilliseconds_Original: js.Function0[Double]
    
    def getUTCMinutes(): Double
    @JSName("getUTCMinutes")
    var getUTCMinutes_Original: js.Function0[Double]
    
    def getUTCMonth(): Double
    @JSName("getUTCMonth")
    var getUTCMonth_Original: js.Function0[Double]
    
    def getUTCSeconds(): Double
    @JSName("getUTCSeconds")
    var getUTCSeconds_Original: js.Function0[Double]
    
    def getVarDate(): VarDate
    @JSName("getVarDate")
    var getVarDate_Original: js.Function0[VarDate]
    
    def toDateString(): String
    @JSName("toDateString")
    var toDateString_Original: js.Function0[String]
    
    def toISOString(): String
    @JSName("toISOString")
    var toISOString_Original: js.Function0[String]
    
    def toJSON(): String
    @JSName("toJSON")
    var toJSON_Original: js.Function0[String]
    
    def toLocaleDateString(): String
    @JSName("toLocaleDateString")
    var toLocaleDateString_Original: js.Function0[String]
    
    @JSName("toLocaleString")
    var toLocaleString_Original: js.Function0[String]
    
    def toLocaleTimeString(): String
    @JSName("toLocaleTimeString")
    var toLocaleTimeString_Original: js.Function0[String]
    
    @JSName("toString")
    var toString_Original: js.Function0[String]
    
    def toTimeString(): String
    @JSName("toTimeString")
    var toTimeString_Original: js.Function0[String]
    
    def toUTCString(): String
    @JSName("toUTCString")
    var toUTCString_Original: js.Function0[String]
    
    @JSName("valueOf")
    var valueOf_Original: js.Function0[Double]
  }
  object ImmutableDate {
    
    inline def apply(
      asMutable: CallbackTo[js.Date],
      getDate: CallbackTo[Double],
      getDay: CallbackTo[Double],
      getFullYear: CallbackTo[Double],
      getHours: CallbackTo[Double],
      getMilliseconds: CallbackTo[Double],
      getMinutes: CallbackTo[Double],
      getMonth: CallbackTo[Double],
      getSeconds: CallbackTo[Double],
      getTime: CallbackTo[Double],
      getTimezoneOffset: CallbackTo[Double],
      getUTCDate: CallbackTo[Double],
      getUTCDay: CallbackTo[Double],
      getUTCFullYear: CallbackTo[Double],
      getUTCHours: CallbackTo[Double],
      getUTCMilliseconds: CallbackTo[Double],
      getUTCMinutes: CallbackTo[Double],
      getUTCMonth: CallbackTo[Double],
      getUTCSeconds: CallbackTo[Double],
      getVarDate: CallbackTo[VarDate],
      toDateString: CallbackTo[String],
      toISOString: CallbackTo[String],
      toJSON: CallbackTo[String],
      toLocaleDateString: CallbackTo[String],
      toLocaleString: CallbackTo[String],
      toLocaleTimeString: CallbackTo[String],
      toString_ : CallbackTo[String],
      toTimeString: CallbackTo[String],
      toUTCString: CallbackTo[String],
      valueOf: CallbackTo[Double]
    ): ImmutableDate = {
      val __obj = js.Dynamic.literal(asMutable = asMutable.toJsFn, getDate = getDate.toJsFn, getDay = getDay.toJsFn, getFullYear = getFullYear.toJsFn, getHours = getHours.toJsFn, getMilliseconds = getMilliseconds.toJsFn, getMinutes = getMinutes.toJsFn, getMonth = getMonth.toJsFn, getSeconds = getSeconds.toJsFn, getTime = getTime.toJsFn, getTimezoneOffset = getTimezoneOffset.toJsFn, getUTCDate = getUTCDate.toJsFn, getUTCDay = getUTCDay.toJsFn, getUTCFullYear = getUTCFullYear.toJsFn, getUTCHours = getUTCHours.toJsFn, getUTCMilliseconds = getUTCMilliseconds.toJsFn, getUTCMinutes = getUTCMinutes.toJsFn, getUTCMonth = getUTCMonth.toJsFn, getUTCSeconds = getUTCSeconds.toJsFn, getVarDate = getVarDate.toJsFn, toDateString = toDateString.toJsFn, toISOString = toISOString.toJsFn, toJSON = toJSON.toJsFn, toLocaleDateString = toLocaleDateString.toJsFn, toLocaleString = toLocaleString.toJsFn, toLocaleTimeString = toLocaleTimeString.toJsFn, toTimeString = toTimeString.toJsFn, toUTCString = toUTCString.toJsFn, valueOf = valueOf.toJsFn)
      __obj.updateDynamic("toString")(toString_.toJsFn)
      __obj.asInstanceOf[ImmutableDate]
    }
    
    /** New functions added by seamless-immutable. */
    trait Additions extends StObject {
      
      def asMutable(): js.Date
    }
    object Additions {
      
      inline def apply(asMutable: CallbackTo[js.Date]): typingsJapgolly.seamlessImmutable.mod.ImmutableDate.Additions = {
        val __obj = js.Dynamic.literal(asMutable = asMutable.toJsFn)
        __obj.asInstanceOf[typingsJapgolly.seamlessImmutable.mod.ImmutableDate.Additions]
      }
      
      extension [Self <: typingsJapgolly.seamlessImmutable.mod.ImmutableDate.Additions](x: Self) {
        
        inline def setAsMutable(value: CallbackTo[js.Date]): Self = StObject.set(x, "asMutable", value.toJsFn)
      }
    }
    
    extension [Self <: ImmutableDate](x: Self) {
      
      inline def setAsMutable(value: CallbackTo[js.Date]): Self = StObject.set(x, "asMutable", value.toJsFn)
      
      inline def setGetDate(value: CallbackTo[Double]): Self = StObject.set(x, "getDate", value.toJsFn)
      
      inline def setGetDay(value: CallbackTo[Double]): Self = StObject.set(x, "getDay", value.toJsFn)
      
      inline def setGetFullYear(value: CallbackTo[Double]): Self = StObject.set(x, "getFullYear", value.toJsFn)
      
      inline def setGetHours(value: CallbackTo[Double]): Self = StObject.set(x, "getHours", value.toJsFn)
      
      inline def setGetMilliseconds(value: CallbackTo[Double]): Self = StObject.set(x, "getMilliseconds", value.toJsFn)
      
      inline def setGetMinutes(value: CallbackTo[Double]): Self = StObject.set(x, "getMinutes", value.toJsFn)
      
      inline def setGetMonth(value: CallbackTo[Double]): Self = StObject.set(x, "getMonth", value.toJsFn)
      
      inline def setGetSeconds(value: CallbackTo[Double]): Self = StObject.set(x, "getSeconds", value.toJsFn)
      
      inline def setGetTime(value: CallbackTo[Double]): Self = StObject.set(x, "getTime", value.toJsFn)
      
      inline def setGetTimezoneOffset(value: CallbackTo[Double]): Self = StObject.set(x, "getTimezoneOffset", value.toJsFn)
      
      inline def setGetUTCDate(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCDate", value.toJsFn)
      
      inline def setGetUTCDay(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCDay", value.toJsFn)
      
      inline def setGetUTCFullYear(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCFullYear", value.toJsFn)
      
      inline def setGetUTCHours(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCHours", value.toJsFn)
      
      inline def setGetUTCMilliseconds(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCMilliseconds", value.toJsFn)
      
      inline def setGetUTCMinutes(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCMinutes", value.toJsFn)
      
      inline def setGetUTCMonth(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCMonth", value.toJsFn)
      
      inline def setGetUTCSeconds(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCSeconds", value.toJsFn)
      
      inline def setGetVarDate(value: CallbackTo[VarDate]): Self = StObject.set(x, "getVarDate", value.toJsFn)
      
      inline def setToDateString(value: CallbackTo[String]): Self = StObject.set(x, "toDateString", value.toJsFn)
      
      inline def setToISOString(value: CallbackTo[String]): Self = StObject.set(x, "toISOString", value.toJsFn)
      
      inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "toJSON", value.toJsFn)
      
      inline def setToLocaleDateString(value: CallbackTo[String]): Self = StObject.set(x, "toLocaleDateString", value.toJsFn)
      
      inline def setToLocaleString(value: CallbackTo[String]): Self = StObject.set(x, "toLocaleString", value.toJsFn)
      
      inline def setToLocaleTimeString(value: CallbackTo[String]): Self = StObject.set(x, "toLocaleTimeString", value.toJsFn)
      
      inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
      
      inline def setToTimeString(value: CallbackTo[String]): Self = StObject.set(x, "toTimeString", value.toJsFn)
      
      inline def setToUTCString(value: CallbackTo[String]): Self = StObject.set(x, "toUTCString", value.toJsFn)
      
      inline def setValueOf(value: CallbackTo[Double]): Self = StObject.set(x, "valueOf", value.toJsFn)
    }
    
    // These methods are banned by seamless-immutable
    /* Inlined std.Extract<keyof std.Date, 'setDate' | 'setFullYear' | 'setHours' | 'setMilliseconds' | 'setMinutes' | 'setMonth' | 'setSeconds' | 'setTime' | 'setUTCDate' | 'setUTCFullYear' | 'setUTCHours' | 'setUTCMilliseconds' | 'setUTCMinutes' | 'setUTCMonth' | 'setUTCSeconds' | 'setYear'> */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setMilliseconds
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCSeconds
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCDate
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setTime
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setDate
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCMinutes
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCHours
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setMinutes
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCMilliseconds
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setFullYear
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setMonth
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setSeconds
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCFullYear
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setHours
      - typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCMonth
    */
    trait MutatingDateMethods extends StObject
    object MutatingDateMethods {
      
      inline def setDate: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setDate = "setDate".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setDate]
      
      inline def setFullYear: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setFullYear = "setFullYear".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setFullYear]
      
      inline def setHours: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setHours = "setHours".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setHours]
      
      inline def setMilliseconds: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setMilliseconds = "setMilliseconds".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setMilliseconds]
      
      inline def setMinutes: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setMinutes = "setMinutes".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setMinutes]
      
      inline def setMonth: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setMonth = "setMonth".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setMonth]
      
      inline def setSeconds: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setSeconds = "setSeconds".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setSeconds]
      
      inline def setTime: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setTime = "setTime".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setTime]
      
      inline def setUTCDate: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCDate = "setUTCDate".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCDate]
      
      inline def setUTCFullYear: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCFullYear = "setUTCFullYear".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCFullYear]
      
      inline def setUTCHours: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCHours = "setUTCHours".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCHours]
      
      inline def setUTCMilliseconds: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCMilliseconds = "setUTCMilliseconds".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCMilliseconds]
      
      inline def setUTCMinutes: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCMinutes = "setUTCMinutes".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCMinutes]
      
      inline def setUTCMonth: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCMonth = "setUTCMonth".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCMonth]
      
      inline def setUTCSeconds: typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCSeconds = "setUTCSeconds".asInstanceOf[typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.setUTCSeconds]
    }
    
    /** Only allows Date methods, which are the getters. */
    /* Inlined seamless-immutable.seamless-immutable.Omit<std.Date, seamless-immutable.seamless-immutable.ImmutableDate.MutatingDateMethods> */
    trait Remaining extends StObject {
      
      def getDate(): Double
      @JSName("getDate")
      var getDate_Original: js.Function0[Double]
      
      def getDay(): Double
      @JSName("getDay")
      var getDay_Original: js.Function0[Double]
      
      def getFullYear(): Double
      @JSName("getFullYear")
      var getFullYear_Original: js.Function0[Double]
      
      def getHours(): Double
      @JSName("getHours")
      var getHours_Original: js.Function0[Double]
      
      def getMilliseconds(): Double
      @JSName("getMilliseconds")
      var getMilliseconds_Original: js.Function0[Double]
      
      def getMinutes(): Double
      @JSName("getMinutes")
      var getMinutes_Original: js.Function0[Double]
      
      def getMonth(): Double
      @JSName("getMonth")
      var getMonth_Original: js.Function0[Double]
      
      def getSeconds(): Double
      @JSName("getSeconds")
      var getSeconds_Original: js.Function0[Double]
      
      def getTime(): Double
      @JSName("getTime")
      var getTime_Original: js.Function0[Double]
      
      def getTimezoneOffset(): Double
      @JSName("getTimezoneOffset")
      var getTimezoneOffset_Original: js.Function0[Double]
      
      def getUTCDate(): Double
      @JSName("getUTCDate")
      var getUTCDate_Original: js.Function0[Double]
      
      def getUTCDay(): Double
      @JSName("getUTCDay")
      var getUTCDay_Original: js.Function0[Double]
      
      def getUTCFullYear(): Double
      @JSName("getUTCFullYear")
      var getUTCFullYear_Original: js.Function0[Double]
      
      def getUTCHours(): Double
      @JSName("getUTCHours")
      var getUTCHours_Original: js.Function0[Double]
      
      def getUTCMilliseconds(): Double
      @JSName("getUTCMilliseconds")
      var getUTCMilliseconds_Original: js.Function0[Double]
      
      def getUTCMinutes(): Double
      @JSName("getUTCMinutes")
      var getUTCMinutes_Original: js.Function0[Double]
      
      def getUTCMonth(): Double
      @JSName("getUTCMonth")
      var getUTCMonth_Original: js.Function0[Double]
      
      def getUTCSeconds(): Double
      @JSName("getUTCSeconds")
      var getUTCSeconds_Original: js.Function0[Double]
      
      def getVarDate(): VarDate
      @JSName("getVarDate")
      var getVarDate_Original: js.Function0[VarDate]
      
      def toDateString(): String
      @JSName("toDateString")
      var toDateString_Original: js.Function0[String]
      
      def toISOString(): String
      @JSName("toISOString")
      var toISOString_Original: js.Function0[String]
      
      def toJSON(): String
      @JSName("toJSON")
      var toJSON_Original: js.Function0[String]
      
      def toLocaleDateString(): String
      @JSName("toLocaleDateString")
      var toLocaleDateString_Original: js.Function0[String]
      
      @JSName("toLocaleString")
      var toLocaleString_Original: js.Function0[String]
      
      def toLocaleTimeString(): String
      @JSName("toLocaleTimeString")
      var toLocaleTimeString_Original: js.Function0[String]
      
      @JSName("toString")
      var toString_Original: js.Function0[String]
      
      def toTimeString(): String
      @JSName("toTimeString")
      var toTimeString_Original: js.Function0[String]
      
      def toUTCString(): String
      @JSName("toUTCString")
      var toUTCString_Original: js.Function0[String]
      
      @JSName("valueOf")
      var valueOf_Original: js.Function0[Double]
    }
    object Remaining {
      
      inline def apply(
        getDate: CallbackTo[Double],
        getDay: CallbackTo[Double],
        getFullYear: CallbackTo[Double],
        getHours: CallbackTo[Double],
        getMilliseconds: CallbackTo[Double],
        getMinutes: CallbackTo[Double],
        getMonth: CallbackTo[Double],
        getSeconds: CallbackTo[Double],
        getTime: CallbackTo[Double],
        getTimezoneOffset: CallbackTo[Double],
        getUTCDate: CallbackTo[Double],
        getUTCDay: CallbackTo[Double],
        getUTCFullYear: CallbackTo[Double],
        getUTCHours: CallbackTo[Double],
        getUTCMilliseconds: CallbackTo[Double],
        getUTCMinutes: CallbackTo[Double],
        getUTCMonth: CallbackTo[Double],
        getUTCSeconds: CallbackTo[Double],
        getVarDate: CallbackTo[VarDate],
        toDateString: CallbackTo[String],
        toISOString: CallbackTo[String],
        toJSON: CallbackTo[String],
        toLocaleDateString: CallbackTo[String],
        toLocaleString: CallbackTo[String],
        toLocaleTimeString: CallbackTo[String],
        toString_ : CallbackTo[String],
        toTimeString: CallbackTo[String],
        toUTCString: CallbackTo[String],
        valueOf: CallbackTo[Double]
      ): typingsJapgolly.seamlessImmutable.mod.ImmutableDate.Remaining = {
        val __obj = js.Dynamic.literal(getDate = getDate.toJsFn, getDay = getDay.toJsFn, getFullYear = getFullYear.toJsFn, getHours = getHours.toJsFn, getMilliseconds = getMilliseconds.toJsFn, getMinutes = getMinutes.toJsFn, getMonth = getMonth.toJsFn, getSeconds = getSeconds.toJsFn, getTime = getTime.toJsFn, getTimezoneOffset = getTimezoneOffset.toJsFn, getUTCDate = getUTCDate.toJsFn, getUTCDay = getUTCDay.toJsFn, getUTCFullYear = getUTCFullYear.toJsFn, getUTCHours = getUTCHours.toJsFn, getUTCMilliseconds = getUTCMilliseconds.toJsFn, getUTCMinutes = getUTCMinutes.toJsFn, getUTCMonth = getUTCMonth.toJsFn, getUTCSeconds = getUTCSeconds.toJsFn, getVarDate = getVarDate.toJsFn, toDateString = toDateString.toJsFn, toISOString = toISOString.toJsFn, toJSON = toJSON.toJsFn, toLocaleDateString = toLocaleDateString.toJsFn, toLocaleString = toLocaleString.toJsFn, toLocaleTimeString = toLocaleTimeString.toJsFn, toTimeString = toTimeString.toJsFn, toUTCString = toUTCString.toJsFn, valueOf = valueOf.toJsFn)
        __obj.updateDynamic("toString")(toString_.toJsFn)
        __obj.asInstanceOf[typingsJapgolly.seamlessImmutable.mod.ImmutableDate.Remaining]
      }
      
      extension [Self <: typingsJapgolly.seamlessImmutable.mod.ImmutableDate.Remaining](x: Self) {
        
        inline def setGetDate(value: CallbackTo[Double]): Self = StObject.set(x, "getDate", value.toJsFn)
        
        inline def setGetDay(value: CallbackTo[Double]): Self = StObject.set(x, "getDay", value.toJsFn)
        
        inline def setGetFullYear(value: CallbackTo[Double]): Self = StObject.set(x, "getFullYear", value.toJsFn)
        
        inline def setGetHours(value: CallbackTo[Double]): Self = StObject.set(x, "getHours", value.toJsFn)
        
        inline def setGetMilliseconds(value: CallbackTo[Double]): Self = StObject.set(x, "getMilliseconds", value.toJsFn)
        
        inline def setGetMinutes(value: CallbackTo[Double]): Self = StObject.set(x, "getMinutes", value.toJsFn)
        
        inline def setGetMonth(value: CallbackTo[Double]): Self = StObject.set(x, "getMonth", value.toJsFn)
        
        inline def setGetSeconds(value: CallbackTo[Double]): Self = StObject.set(x, "getSeconds", value.toJsFn)
        
        inline def setGetTime(value: CallbackTo[Double]): Self = StObject.set(x, "getTime", value.toJsFn)
        
        inline def setGetTimezoneOffset(value: CallbackTo[Double]): Self = StObject.set(x, "getTimezoneOffset", value.toJsFn)
        
        inline def setGetUTCDate(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCDate", value.toJsFn)
        
        inline def setGetUTCDay(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCDay", value.toJsFn)
        
        inline def setGetUTCFullYear(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCFullYear", value.toJsFn)
        
        inline def setGetUTCHours(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCHours", value.toJsFn)
        
        inline def setGetUTCMilliseconds(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCMilliseconds", value.toJsFn)
        
        inline def setGetUTCMinutes(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCMinutes", value.toJsFn)
        
        inline def setGetUTCMonth(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCMonth", value.toJsFn)
        
        inline def setGetUTCSeconds(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCSeconds", value.toJsFn)
        
        inline def setGetVarDate(value: CallbackTo[VarDate]): Self = StObject.set(x, "getVarDate", value.toJsFn)
        
        inline def setToDateString(value: CallbackTo[String]): Self = StObject.set(x, "toDateString", value.toJsFn)
        
        inline def setToISOString(value: CallbackTo[String]): Self = StObject.set(x, "toISOString", value.toJsFn)
        
        inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "toJSON", value.toJsFn)
        
        inline def setToLocaleDateString(value: CallbackTo[String]): Self = StObject.set(x, "toLocaleDateString", value.toJsFn)
        
        inline def setToLocaleString(value: CallbackTo[String]): Self = StObject.set(x, "toLocaleString", value.toJsFn)
        
        inline def setToLocaleTimeString(value: CallbackTo[String]): Self = StObject.set(x, "toLocaleTimeString", value.toJsFn)
        
        inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
        
        inline def setToTimeString(value: CallbackTo[String]): Self = StObject.set(x, "toTimeString", value.toJsFn)
        
        inline def setToUTCString(value: CallbackTo[String]): Self = StObject.set(x, "toUTCString", value.toJsFn)
        
        inline def setValueOf(value: CallbackTo[Double]): Self = StObject.set(x, "valueOf", value.toJsFn)
      }
    }
  }
  
  type ImmutableObject[T] = ImmutableObjectMixin[T] & (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ P in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[P], {}>} */ js.Any)
  
  @js.native
  trait ImmutableObjectMixin[T] extends StObject {
    
    def asMutable(): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = js.native
    def asMutable(opts: AsMutableOptions[Boolean]): T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any) = js.native
    @JSName("asMutable")
    def asMutable_false(opts: AsMutableOptions[`false`]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = js.native
    @JSName("asMutable")
    def asMutable_true(opts: AsMutableOptions[`true`]): T = js.native
    
    def getIn(propertyPath: js.Array[String]): Immutable[Any, js.Object] = js.native
    def getIn[TValue](propertyPath: js.Array[String], defaultValue: TValue): Immutable[TValue, js.Object] = js.native
    def getIn[K /* <: /* keyof T */ String */](
      propertyPath: js.Array[K],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
        js.Object
      ] = js.native
    def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](propertyPath: js.Tuple2[K, L]): Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K][L] */ js.Any, 
        js.Object
      ] = js.native
    def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](
      propertyPath: js.Tuple2[K, L],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L] */ js.Any
    ): Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K][L] */ js.Any, 
        js.Object
      ] = js.native
    def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */](propertyPath: js.Tuple3[K, L, M]): Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M] */ js.Any, 
        js.Object
      ] = js.native
    def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */](propertyPath: js.Tuple4[K, L, M, N]): Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N] */ js.Any, 
        js.Object
      ] = js.native
    def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */](
      propertyPath: js.Tuple4[K, L, M, N],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N] */ js.Any
    ): Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N] */ js.Any, 
        js.Object
      ] = js.native
    def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */, O /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M][N] */ js.Any */](propertyPath: js.Tuple5[K, L, M, N, O]): Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N][O] */ js.Any, 
        js.Object
      ] = js.native
    def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */, O /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M][N] */ js.Any */](
      propertyPath: js.Tuple5[K, L, M, N, O],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N][O] */ js.Any
    ): Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N][O] */ js.Any, 
        js.Object
      ] = js.native
    @JSName("getIn")
    def getIn_K[K /* <: /* keyof T */ String */](propertyPath: js.Array[K]): Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
        js.Object
      ] = js.native
    
    def merge(part: DeepPartial[T | (Immutable[T, js.Object])]): Immutable[T, js.Object] = js.native
    def merge(part: DeepPartial[T | (Immutable[T, js.Object])], config: MergeConfig): Immutable[T, js.Object] = js.native
    
    def replace[S](valueObj: S): Immutable[S, js.Object] = js.native
    def replace[S](valueObj: S, options: ReplaceConfig): Immutable[S, js.Object] = js.native
    
    def set[K /* <: /* keyof T */ String */](
      property: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Immutable[T, js.Object] = js.native
    def set[TValue](property: String, value: TValue): Immutable[T, js.Object] = js.native
    
    def setIn[TValue](propertyPath: js.Array[String], value: TValue): Immutable[T, js.Object] = js.native
    def setIn[K /* <: /* keyof T */ String */](
      propertyPath: js.Array[K],
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Immutable[T, js.Object] = js.native
    def setIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](
      propertyPath: js.Tuple2[K, L],
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L] */ js.Any
    ): Immutable[T, js.Object] = js.native
    def setIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */](
      propertyPath: js.Tuple3[K, L, M],
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M] */ js.Any
    ): Immutable[T, js.Object] = js.native
    def setIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */](
      propertyPath: js.Tuple4[K, L, M, N],
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N] */ js.Any
    ): Immutable[T, js.Object] = js.native
    def setIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */, O /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M][N] */ js.Any */](
      propertyPath: js.Tuple5[K, L, M, N, O],
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N][O] */ js.Any
    ): Immutable[T, js.Object] = js.native
    
    def update[K /* <: /* keyof T */ String */](
      property: K,
      updaterFunction: js.Function2[
          /* value */ Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
            js.Object
          ], 
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    def update[TValue](
      property: String,
      updaterFunction: js.Function2[/* value */ Immutable[TValue, js.Object], /* repeated */ Any, Any],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    
    def updateIn[TValue](
      propertyPath: js.Array[String],
      updaterFunction: js.Function2[/* value */ TValue, /* repeated */ Any, Any],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](
      propertyPath: js.Tuple2[K, L],
      updaterFunction: js.Function2[
          /* value */ Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K][L] */ js.Any, 
            js.Object
          ], 
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */](
      propertyPath: js.Tuple3[K, L, M],
      updaterFunction: js.Function2[
          /* value */ Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M] */ js.Any, 
            js.Object
          ], 
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */](
      propertyPath: js.Tuple4[K, L, M, N],
      updaterFunction: js.Function2[
          /* value */ Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N] */ js.Any, 
            js.Object
          ], 
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */, O /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M][N] */ js.Any */](
      propertyPath: js.Tuple5[K, L, M, N, O],
      updaterFunction: js.Function2[
          /* value */ Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N][O] */ js.Any, 
            js.Object
          ], 
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    @JSName("updateIn")
    def updateIn_K[K /* <: /* keyof T */ String */](
      propertyPath: js.Array[K],
      updaterFunction: js.Function2[
          /* value */ Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
            js.Object
          ], 
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    
    def without[K /* <: /* keyof T */ String */](
      filter: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* value */ js.Any, 
          /* key */ K, 
          Boolean
        ]
    ): Immutable[T, js.Object] = js.native
    def without[K /* <: /* keyof T */ String */](properties: K*): Immutable[T, js.Object] = js.native
    def without[K /* <: /* keyof T */ String */](property: K): Immutable[T, js.Object] = js.native
  }
  
  trait MergeConfig extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.undefined
    
    var merger: js.UndefOr[js.Function3[/* a */ Any, /* b */ Any, /* config */ Any, Any]] = js.undefined
    
    var mode: js.UndefOr[replace | merge] = js.undefined
  }
  object MergeConfig {
    
    inline def apply(): MergeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeConfig]
    }
    
    extension [Self <: MergeConfig](x: Self) {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setMerger(value: (/* a */ Any, /* b */ Any, /* config */ Any) => Any): Self = StObject.set(x, "merger", js.Any.fromFunction3(value))
      
      inline def setMergerUndefined: Self = StObject.set(x, "merger", js.undefined)
      
      inline def setMode(value: replace | merge): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  /** From type T, take all properties except those specified by K. */
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait Options extends StObject
  
  trait ReplaceConfig extends StObject {
    
    var deep: Boolean
  }
  object ReplaceConfig {
    
    inline def apply(deep: Boolean): ReplaceConfig = {
      val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceConfig]
    }
    
    extension [Self <: ReplaceConfig](x: Self) {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    }
  }
}
