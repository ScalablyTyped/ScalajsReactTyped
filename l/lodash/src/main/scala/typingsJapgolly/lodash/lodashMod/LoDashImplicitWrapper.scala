package typingsJapgolly.lodash.lodashMod

import typingsJapgolly.lodash.Typeoflodash
import typingsJapgolly.lodash.lodashNumbers.`0`
import typingsJapgolly.lodash.lodashNumbers.`false`
import typingsJapgolly.lodash.lodashNumbers.`true`
import typingsJapgolly.lodash.lodashStrings.Empty
import typingsJapgolly.lodash.lodashStrings.asc
import typingsJapgolly.lodash.lodashStrings.desc
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Pick
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prototype.plant
@js.native
trait LoDashImplicitWrapper[TValue] extends LoDashWrapper[TValue] {
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  var partialRight_Original: ImplicitPartialRight = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  var partial_Original: ImplicitPartial = js.native
  /**
    * @see _.add
    */
  def add(addend: Double): Double = js.native
  /**
    * @see _.after
    **/
  def after[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): LoDashImplicitWrapper[TFunc] = js.native
  /**
    * @see _.ary
    */
  def ary(): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def ary(n: Double): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.assign
    */
  def assign(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.assign
    */
  def assign(otherArgs: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource](source: TSource): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TResult](otherArgs: js.Any*): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource](source: TSource): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TResult](otherArgs: js.Any*): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TResult](otherArgs: js.Any*): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.at
    */
  def at[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], props: Many[String]*): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.at
    */
  @JSName("at")
  def at_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    props: PropertyPath*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.attempt
    */
  def attempt[TResult](args: js.Any*): TResult | js.Error = js.native
  /**
    * @see _.before
    **/
  def before[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): LoDashImplicitWrapper[TFunc] = js.native
  /**
    * @see _.bind
    */
  def bind(thisArg: js.Any, partials: js.Any*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.bindKey
    */
  def bindKey(key: String, partials: js.Any*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.camelCase
    */
  def camelCase(): String = js.native
  /**
    * @see _.capitalize
    */
  def capitalize(): String = js.native
  /**
    * @see _.castArray
    */
  def castArray[T](`this`: LoDashImplicitWrapper[Many[T]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.ceil
    */
  def ceil(): Double = js.native
  def ceil(precision: Double): Double = js.native
  /**
    * @see _.chain
    */
  def chain(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.chunk
    */
  def chunk[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[js.Array[T]]] = js.native
  def chunk[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], size: Double): LoDashImplicitWrapper[js.Array[js.Array[T]]] = js.native
  /**
    * @see _.clamp
    */
  def clamp(lower: Double, upper: Double): Double = js.native
  def clamp(upper: Double): Double = js.native
  /**
    * @see _.cloneDeep
    */
  def cloneDeep(): TValue = js.native
  /**
    * @see _.cloneDeepWith
    */
  def cloneDeepWith(): TValue = js.native
  /**
    * @see _.cloneDeepWith
    */
  def cloneDeepWith(customizer: CloneDeepWithCustomizer[TValue]): js.Any = js.native
  /**
    * @see _.cloneWith
    */
  def cloneWith(): TValue = js.native
  /**
    * @see _.cloneWith
    */
  def cloneWith[TResult /* <: js.Object | String | Double | Boolean | Null */](customizer: CloneWithCustomizer[TValue, TResult]): TResult = js.native
  /**
    * @see _.cloneWith
    */
  @JSName("cloneWith")
  def cloneWith_TResult_Union[TResult](customizer: CloneWithCustomizer[TValue, js.UndefOr[TResult]]): TResult | TValue = js.native
  /**
    * @see _.compact
    */
  def compact[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[(List[js.UndefOr[T | Null | `false` | Empty | `0`]]) | Null]]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.compact
    */
  def concat[T](`this`: LoDashImplicitWrapper[Many[T]], values: Many[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.conforms
    */
  def conforms[T](`this`: LoDashImplicitWrapper[ConformsPredicateObject[T]]): LoDashImplicitWrapper[js.Function1[/* value */ T, Boolean]] = js.native
  /**
    * @see _.conformsTo
    */
  def conformsTo[T](`this`: LoDashImplicitWrapper[T], source: ConformsPredicateObject[T]): Boolean = js.native
  /**
    * @see _.constant
    */
  def constant(): LoDashImplicitWrapper[js.Function0[TValue]] = js.native
  /**
    * @see _.countBy
    */
  def countBy[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[Dictionary[Double]] = js.native
  def countBy[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashImplicitWrapper[Dictionary[Double]] = js.native
  /**
    * @see _.countBy
    */
  @JSName("countBy")
  def countBy_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[Dictionary[Double]] = js.native
  @JSName("countBy")
  def countBy_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[Dictionary[Double]] = js.native
  /**
    * @see _.create
    */
  def create[U /* <: js.Object */](): LoDashImplicitWrapper[TValue with U] = js.native
  def create[U /* <: js.Object */](properties: U): LoDashImplicitWrapper[TValue with U] = js.native
  /**
    * @see _.curry
    **/
  def curry(): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def curry(arity: Double): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.curry
    **/
  def curry[T1, R](`this`: LoDashImplicitWrapper[js.Function1[/* t1 */ T1, R]]): LoDashImplicitWrapper[CurriedFunction1[T1, R]] = js.native
  def curry[T1, R](`this`: LoDashImplicitWrapper[js.Function1[/* t1 */ T1, R]], arity: Double): LoDashImplicitWrapper[CurriedFunction1[T1, R]] = js.native
  /**
    * @see _.curryRight
    **/
  def curryRight(): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def curryRight(arity: Double): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.curryRight
    **/
  def curryRight[T1, R](`this`: LoDashImplicitWrapper[js.Function1[/* t1 */ T1, R]]): LoDashImplicitWrapper[RightCurriedFunction1[T1, R]] = js.native
  def curryRight[T1, R](`this`: LoDashImplicitWrapper[js.Function1[/* t1 */ T1, R]], arity: Double): LoDashImplicitWrapper[RightCurriedFunction1[T1, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]]): LoDashImplicitWrapper[RightCurriedFunction2[T1, T2, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]], arity: Double): LoDashImplicitWrapper[RightCurriedFunction2[T1, T2, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]]): LoDashImplicitWrapper[RightCurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](
    `this`: LoDashImplicitWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]],
    arity: Double
  ): LoDashImplicitWrapper[RightCurriedFunction3[T1, T2, T3, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]]): LoDashImplicitWrapper[RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]],
    arity: Double
  ): LoDashImplicitWrapper[RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashImplicitWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]]
  ): LoDashImplicitWrapper[RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashImplicitWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]],
    arity: Double
  ): LoDashImplicitWrapper[RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]]): LoDashImplicitWrapper[CurriedFunction2[T1, T2, R]] = js.native
  @JSName("curry")
  def curry_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[js.Function2[/* t1 */ T1, /* t2 */ T2, R]], arity: Double): LoDashImplicitWrapper[CurriedFunction2[T1, T2, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]]): LoDashImplicitWrapper[CurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3R[T1, T2, T3, R](
    `this`: LoDashImplicitWrapper[js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]],
    arity: Double
  ): LoDashImplicitWrapper[CurriedFunction3[T1, T2, T3, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]]): LoDashImplicitWrapper[CurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3T4R[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]],
    arity: Double
  ): LoDashImplicitWrapper[CurriedFunction4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashImplicitWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]]
  ): LoDashImplicitWrapper[CurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  @JSName("curry")
  def curry_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    `this`: LoDashImplicitWrapper[js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]],
    arity: Double
  ): LoDashImplicitWrapper[CurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  /**
    * @see _.debounce
    */
  def debounce(): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  def debounce(wait: Double): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  def debounce(wait: Double, options: DebounceSettings): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  /**
    * @see _.deburr
    */
  def deburr(): String = js.native
  /**
    * @see _.defaultTo
    */
  def defaultTo[T](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], defaultValue: T): T = js.native
  /**
    * @see _.defaultTo
    */
  @JSName("defaultTo")
  def defaultTo_TTDefault_Union[T, TDefault](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], defaultValue: TDefault): T | TDefault = js.native
  /**
    * @see _.defaults
    */
  def defaults(): LoDashImplicitWrapper[NonNullable[TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults(sources: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource](source: TSource): LoDashImplicitWrapper[NonNullable[TSource with TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashImplicitWrapper[NonNullable[TSource2 with TSource1 with TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashImplicitWrapper[NonNullable[TSource3 with TSource2 with TSource1 with TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashImplicitWrapper[NonNullable[TSource4 with TSource3 with TSource2 with TSource1 with TValue]] = js.native
  /**
    * @see _.defaultsDeep
    **/
  def defaultsDeep(sources: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.defer
    */
  def defer(args: js.Any*): LoDashImplicitWrapper[Double] = js.native
  /**
    * @see _.delay
    */
  def delay(wait: Double, args: js.Any*): LoDashImplicitWrapper[Double] = js.native
  /**
    * @see _.difference
    */
  def difference[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], values: List[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], values: List[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values: List[T2],
    iteratee: ValueIteratee[T1 | T2]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    iteratee: ValueIteratee[T1 | T2 | T3]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5, T6](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5, T6, T7](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    values: (List[T7] | (ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6 | T7]))*
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], values: List[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values: List[T2],
    comparator: Comparator2[T1, T2]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2, T3](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    comparator: Comparator2[T1, T2 | T3]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2, T3, T4](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.divide
    */
  def divide(divisor: Double): Double = js.native
  /**
    * @see _.drop
    */
  def drop[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def drop[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], n: Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.dropRight
    */
  def dropRight[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def dropRight[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], n: Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.dropRightWhile
    */
  def dropRightWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def dropRightWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.dropWhile
    */
  def dropWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def dropWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.endsWith
    */
  def endsWith(): Boolean = js.native
  def endsWith(target: String): Boolean = js.native
  def endsWith(target: String, position: Double): Boolean = js.native
  /**
    * @see _.toPairs
    */
  def entries(): LoDashImplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  /**
    * @see _.toPairs
    */
  def entries[T](`this`: LoDashImplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashImplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  /**
    * @see _.entriesIn
    */
  def entriesIn(): LoDashImplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  /**
    * @see _.entriesIn
    */
  def entriesIn[T](`this`: LoDashImplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashImplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  /**
    * @see _.eq
    */
  def eq(other: js.Any): Boolean = js.native
  /**
    * @see _.escape
    */
  def escape(): String = js.native
  /**
    * @see _.escapeRegExp
    */
  def escapeRegExp(): String = js.native
  /**
    * @see _.every
    */
  def every[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): Boolean = js.native
  def every[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): Boolean = js.native
  /**
    * @see _.every
    */
  @JSName("every")
  def every_T_Object[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): Boolean = js.native
  @JSName("every")
  def every_T_Object[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): Boolean = js.native
  /**
    * @see _.extend
    */
  def extend(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.extend
    */
  def extend(otherArgs: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource](source: TSource): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith(): LoDashImplicitWrapper[TValue] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith(otherArgs: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.fill
    */
  def fill[T](`this`: LoDashImplicitWrapper[js.UndefOr[js.Array[_] | List[_] | Null]], value: T): LoDashImplicitWrapper[js.Array[T]] = js.native
  def fill[T, U](`this`: LoDashImplicitWrapper[js.UndefOr[js.Array[U] | List[U] | Null]], value: T, start: Double): LoDashImplicitWrapper[js.Array[T | U]] = js.native
  def fill[T, U](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[U] | List[U] | Null]],
    value: T,
    start: Double,
    end: Double
  ): LoDashImplicitWrapper[js.Array[T | U]] = js.native
  /**
    * @see _.fill
    */
  @JSName("fill")
  def fill_TU[T, U](`this`: LoDashImplicitWrapper[js.UndefOr[js.Array[U] | List[U] | Null]], value: T): LoDashImplicitWrapper[js.Array[T | U]] = js.native
  /**
    * @see _.filter
    */
  def filter(`this`: LoDashImplicitWrapper[js.UndefOr[String | Null]]): LoDashImplicitWrapper[js.Array[String]] = js.native
  def filter(`this`: LoDashImplicitWrapper[js.UndefOr[String | Null]], predicate: StringIterator[Boolean]): LoDashImplicitWrapper[js.Array[String]] = js.native
  def filter[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  @JSName("filter")
  def filter_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_TS_T[T, S /* <: T */](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratorTypeGuard[T, S]): LoDashImplicitWrapper[js.Array[S]] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T_Object[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIteratorTypeGuard[T, S]): LoDashImplicitWrapper[js.Array[S]] = js.native
  /**
    * @see _.find
    */
  def find[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def find[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def find[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    predicate: ObjectIterateeCustom[T, Boolean],
    fromIndex: Double
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * @see _.find
    */
  def find[T, S /* <: T */](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def find[T, S /* <: T */](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIteratorTypeGuard[T, S],
    fromIndex: Double
  ): js.UndefOr[S] = js.native
  /**
    * @see _.findIndex
    */
  def findIndex[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): Double = js.native
  def findIndex[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): Double = js.native
  def findIndex[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean],
    fromIndex: Double
  ): Double = js.native
  /**
    * @see _.findKey
    */
  def findKey[T](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): js.UndefOr[String] = js.native
  def findKey[T](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIteratee[T]): js.UndefOr[String] = js.native
  /**
    * @see _.findLast
    */
  def findLast[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def findLast[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def findLast[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    predicate: ObjectIterateeCustom[T, Boolean],
    fromIndex: Double
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * @see _.findLast
    */
  def findLast[T, S /* <: T */](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def findLast[T, S /* <: T */](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIteratorTypeGuard[T, S],
    fromIndex: Double
  ): js.UndefOr[S] = js.native
  /**
    * @see _.findLastIndex
    */
  def findLastIndex[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): Double = js.native
  def findLastIndex[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): Double = js.native
  def findLastIndex[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean],
    fromIndex: Double
  ): Double = js.native
  /**
    * @see _.findLastKey
    */
  def findLastKey[T](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): js.UndefOr[String] = js.native
  def findLastKey[T](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIteratee[T]): js.UndefOr[String] = js.native
  /**
    * @see _.findLast
    */
  @JSName("findLast")
  def findLast_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  @JSName("findLast")
  def findLast_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): js.UndefOr[T] = js.native
  @JSName("findLast")
  def findLast_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean],
    fromIndex: Double
  ): js.UndefOr[T] = js.native
  /**
    * @see _.findLast
    */
  @JSName("findLast")
  def findLast_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  @JSName("findLast")
  def findLast_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    predicate: ObjectIteratorTypeGuard[T, S],
    fromIndex: Double
  ): js.UndefOr[S] = js.native
  /**
    * @see _.find
    */
  @JSName("find")
  def find_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  @JSName("find")
  def find_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): js.UndefOr[T] = js.native
  @JSName("find")
  def find_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean],
    fromIndex: Double
  ): js.UndefOr[T] = js.native
  /**
    * @see _.find
    */
  @JSName("find")
  def find_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  @JSName("find")
  def find_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    predicate: ObjectIteratorTypeGuard[T, S],
    fromIndex: Double
  ): js.UndefOr[S] = js.native
  /**
    * @see _.head
    */
  def first[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: String): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: js.Object): LoDashImplicitWrapper[js.Array[Boolean]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[T](
    `this`: LoDashImplicitWrapper[
      js.UndefOr[List[Many[T]] | Dictionary[Many[T]] | NumericDictionary[Many[T]] | Null]
    ]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: ListIterator[T, Many[TResult]]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(`this`: LoDashImplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: String): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(`this`: LoDashImplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: js.Object): LoDashImplicitWrapper[js.Array[Boolean]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[T](
    `this`: LoDashImplicitWrapper[
      js.UndefOr[
        (List[ListOfRecursiveArraysOrValues[T] | T]) | (Dictionary[ListOfRecursiveArraysOrValues[T] | T]) | (NumericDictionary[ListOfRecursiveArraysOrValues[T] | T]) | Null
      ]
    ]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDeep
    */
  @JSName("flatMapDeep")
  def flatMapDeep_T_ObjectTResult[T /* <: js.Object */, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(`this`: LoDashImplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: String): LoDashImplicitWrapper[js.Array[_]] = js.native
  def flatMapDepth(`this`: LoDashImplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: String, depth: Double): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(`this`: LoDashImplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: js.Object): LoDashImplicitWrapper[js.Array[Boolean]] = js.native
  def flatMapDepth(`this`: LoDashImplicitWrapper[js.UndefOr[js.Object | Null]], iteratee: js.Object, depth: Double): LoDashImplicitWrapper[js.Array[Boolean]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[T](
    `this`: LoDashImplicitWrapper[
      js.UndefOr[
        (List[ListOfRecursiveArraysOrValues[T] | T]) | (Dictionary[ListOfRecursiveArraysOrValues[T] | T]) | (NumericDictionary[ListOfRecursiveArraysOrValues[T] | T]) | Null
      ]
    ]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  def flatMapDepth[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDepth
    */
  @JSName("flatMapDepth")
  def flatMapDepth_T_ObjectTResult[T /* <: js.Object */, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_T_ObjectTResult[T /* <: js.Object */, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMap
    */
  @JSName("flatMap")
  def flatMap_T_ObjectTResult[T /* <: js.Object */, TResult](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, Many[TResult]]): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatten
    */
  def flatten[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[Many[T]] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flattenDeep
    */
  def flattenDeep[T](`this`: LoDashImplicitWrapper[js.UndefOr[ListOfRecursiveArraysOrValues[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flattenDeep
    */
  def flattenDepth[T](`this`: LoDashImplicitWrapper[js.UndefOr[ListOfRecursiveArraysOrValues[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def flattenDepth[T](`this`: LoDashImplicitWrapper[js.UndefOr[ListOfRecursiveArraysOrValues[T] | Null]], depth: Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.floor
    */
  def floor(): Double = js.native
  def floor(precision: Double): Double = js.native
  def flow(
    `this`: LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]],
    funcs: js.Array[Many[js.Function1[/* a */ _, _]]]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.flow
    */
  // 0-argument first function
  def flow[R1, R2](`this`: LoDashImplicitWrapper[js.Function0[R1]], f2: js.Function1[/* a */ R1, R2]): LoDashImplicitWrapper[js.Function0[R2]] = js.native
  def flow[R1, R2, R3](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashImplicitWrapper[js.Function0[R3]] = js.native
  def flow[R1, R2, R3, R4](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashImplicitWrapper[js.Function0[R4]] = js.native
  def flow[R1, R2, R3, R4, R5](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashImplicitWrapper[js.Function0[R5]] = js.native
  def flow[R1, R2, R3, R4, R5, R6](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashImplicitWrapper[js.Function0[R6]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashImplicitWrapper[js.Function0[R7]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function0[R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashImplicitWrapper[js.Function0[_]] = js.native
  def flowRight(
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ _, _]],
    f6: js.Function1[/* a */ js.Any, _],
    f5: js.Function1[/* a */ js.Any, _],
    f4: js.Function1[/* a */ js.Any, _],
    f3: js.Function1[/* a */ js.Any, _],
    f2: js.Function1[/* a */ js.Any, _],
    f1: js.Function0[_],
    funcs: (Many[js.Function1[/* repeated */ _, _]])*
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def flowRight(
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ _, _]],
    funcs: js.Array[Many[js.Function1[/* repeated */ _, _]]]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.flowRight
    */
  // 0-argument first function
  def flowRight[R2, R1](`this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]], f1: js.Function0[R1]): LoDashImplicitWrapper[js.Function0[R2]] = js.native
  // any-argument first function
  def flowRight[R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R2]] = js.native
  def flowRight[R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashImplicitWrapper[js.Function0[R3]] = js.native
  def flowRight[R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R3]] = js.native
  // 2-argument first function
  def flowRight[A1, A2, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  def flowRight[R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashImplicitWrapper[js.Function0[R4]] = js.native
  def flowRight[R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R4]] = js.native
  // 3-argument first function
  def flowRight[A1, A2, A3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  def flowRight[A1, A2, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashImplicitWrapper[js.Function0[R5]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R5]] = js.native
  // 4-argument first function
  def flowRight[A1, A2, A3, A4, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  def flowRight[A1, A2, A3, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  def flowRight[A1, A2, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashImplicitWrapper[js.Function0[R6]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  def flowRight[A1, A2, A3, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  def flowRight[A1, A2, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashImplicitWrapper[js.Function0[R7]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  def flowRight[A1, A2, A3, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  def flowRight[A1, A2, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  def flowRight[A1, A2, A3, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  def flowRight[A1, A2, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  def flowRight[A1, A2, A3, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  // 1-argument first function
  @JSName("flowRight")
  def flowRight_A1R2R1[A1, R2, R1](`this`: LoDashImplicitWrapper[js.Function1[/* a */ R1, R2]], f1: js.Function1[/* a1 */ A1, R1]): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flowRight")
  def flowRight_A1R3R2R1[A1, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R2, R3]],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flowRight")
  def flowRight_A1R4R3R2R1[A1, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R3, R4]],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flowRight")
  def flowRight_A1R5R4R3R2R1[A1, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R4, R5]],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flowRight")
  def flowRight_A1R6R5R4R3R2R1[A1, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R5, R6]],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flowRight")
  def flowRight_A1R7R6R5R4R3R2R1[A1, R7, R6, R5, R4, R3, R2, R1](
    `this`: LoDashImplicitWrapper[js.Function1[/* a */ R6, R7]],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  // 4-argument first function
  // any-argument first function
  @JSName("flow")
  def flow_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5[A1, A2, A3, A4, R1, R2, R3, R4, R5](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[
      (js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]) | (js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ _, R1])
    ],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashImplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, _]] = js.native
  // 3-argument first function
  @JSName("flow")
  def flow_A1A2A3R1R2[A1, A2, A3, R1, R2](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5[A1, A2, A3, R1, R2, R3, R4, R5](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6[A1, A2, A3, R1, R2, R3, R4, R5, R6](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashImplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, _]] = js.native
  // 2-argument first function
  @JSName("flow")
  def flow_A1A2R1R2[A1, A2, R1, R2](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3[A1, A2, R1, R2, R3](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5[A1, A2, R1, R2, R3, R4, R5](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6[A1, A2, R1, R2, R3, R4, R5, R6](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, _]] = js.native
  // 1-argument first function
  @JSName("flow")
  def flow_A1R1R2[A1, R1, R2](`this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]], f2: js.Function1[/* a */ R1, R2]): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3[A1, R1, R2, R3](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4[A1, R1, R2, R3, R4](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5[A1, R1, R2, R3, R4, R5](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6[A1, R1, R2, R3, R4, R5, R6](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    `this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, R1]],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, _]] = js.native
  /**
    @see _.fromPairs
    */
  def fromPairs(`this`: LoDashImplicitWrapper[js.UndefOr[List[js.Array[_]] | Null]]): LoDashImplicitWrapper[Dictionary[_]] = js.native
  /**
    * @see _.fromPairs
    */
  @JSName("fromPairs")
  def fromPairs_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[(List[js.Tuple2[PropertyName, T]]) | Null]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.functions
    */
  def functions(): LoDashImplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.functionsIn
    */
  def functionsIn(): LoDashImplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.get
    */
  def get(`this`: LoDashImplicitWrapper[js.UndefOr[Null]], path: PropertyPath): js.UndefOr[scala.Nothing] = js.native
  /**
    * @see _.get
    */
  def get[TKey /* <: String */](path: TKey): /* import warning: importer.ImportType#apply Failed type conversion: TValue[TKey] */ js.Any = js.native
  def get[TKey /* <: String */](path: js.Array[TKey]): /* import warning: importer.ImportType#apply Failed type conversion: TValue[TKey] */ js.Any = js.native
  /**
    * @see _.get
    */
  def get[TResult](path: PropertyPath): js.Any = js.native
  def get[TResult](path: PropertyPath, defaultValue: js.Any): js.Any = js.native
  /**
    * @see _.get
    */
  def get[T](`this`: LoDashImplicitWrapper[js.UndefOr[NumericDictionary[T] | Null]], path: Double): js.UndefOr[T] = js.native
  /**
    * @see _.get
    */
  def get[TDefault](`this`: LoDashImplicitWrapper[js.UndefOr[Null]], path: PropertyPath, defaultValue: TDefault): TDefault = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TValue[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): /* import warning: importer.ImportType#apply Failed type conversion: TValue[TKey1][TKey2] */ js.Any = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey /* <: String */](`this`: LoDashImplicitWrapper[js.UndefOr[TObject | Null]], path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: String */](`this`: LoDashImplicitWrapper[js.UndefOr[TObject | Null]], path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[T, TDefault](
    `this`: LoDashImplicitWrapper[js.UndefOr[NumericDictionary[T] | Null]],
    path: Double,
    defaultValue: TDefault
  ): T | TDefault = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey /* <: String */, TDefault](`this`: LoDashImplicitWrapper[js.UndefOr[TObject | Null]], path: TKey, defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey /* <: String */, TDefault](
    `this`: LoDashImplicitWrapper[js.UndefOr[TObject | Null]],
    path: js.Array[TKey],
    defaultValue: TDefault
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](`this`: LoDashImplicitWrapper[js.UndefOr[TObject | Null]], path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TValue[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TValue[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TValue[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): /* import warning: importer.ImportType#apply Failed type conversion: TValue[TKey1][TKey2][TKey3][TKey4] */ js.Any = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](
    `this`: LoDashImplicitWrapper[js.UndefOr[TObject | Null]],
    path: js.Tuple3[TKey1, TKey2, TKey3],
    defaultValue: TDefault
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](
    `this`: LoDashImplicitWrapper[js.UndefOr[TObject | Null]],
    path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](
    `this`: LoDashImplicitWrapper[js.UndefOr[TObject | Null]],
    path: js.Tuple4[TKey1, TKey2, TKey3, TKey4],
    defaultValue: TDefault
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_T_T[T](`this`: LoDashImplicitWrapper[NumericDictionary[T]], path: Double): T = js.native
  /**
    * @see _.groupBy
    */
  def groupBy[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[
    Dictionary[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ] = js.native
  def groupBy[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashImplicitWrapper[
    Dictionary[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ] = js.native
  /**
    * @see _.groupBy
    */
  @JSName("groupBy")
  def groupBy_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[Dictionary[js.Array[T]]] = js.native
  @JSName("groupBy")
  def groupBy_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[Dictionary[js.Array[T]]] = js.native
  /**
    * @see _.gt
    */
  def gt(other: js.Any): Boolean = js.native
  /**
    * @see _.gte
    */
  def gte(other: js.Any): Boolean = js.native
  /**
    * @see _.has
    */
  def has(path: PropertyPath): Boolean = js.native
  /**
    * @see _.hasIn
    */
  def hasIn(path: PropertyPath): Boolean = js.native
  /**
    * @see _.head
    */
  def head[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.identity
    */
  def identity(): TValue = js.native
  /**
    * @see _.inRange
    */
  def inRange(start: Double): Boolean = js.native
  def inRange(start: Double, end: Double): Boolean = js.native
  /**
    * @see _.includes
    */
  def includes[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    target: T
  ): Boolean = js.native
  def includes[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    target: T,
    fromIndex: Double
  ): Boolean = js.native
  /**
    * @see _.indexOf
    */
  def indexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T): Double = js.native
  def indexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T, fromIndex: Double): Double = js.native
  /**
    * @see _.initial
    */
  def initial[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.intersection
    */
  def intersection[T](`this`: LoDashImplicitWrapper[List[T]], arrays: List[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values: (List[T2] | (ValueIteratee[T1 | T2]))*
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values: List[T2],
    iteratee: ValueIteratee[T1 | T2]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2, T3](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    iteratee: ValueIteratee[T1 | T2 | T3]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2, T3, T4](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (ValueIteratee[T1 | T2 | T3 | T4]))*
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], values: List[T]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values: List[T2],
    comparator: Comparator2[T1, T2]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2, T3](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    comparator: Comparator2[T1, T2 | T3]
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2, T3, T4](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T1] | Null]],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): LoDashImplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.invert
    */
  def invert(): LoDashImplicitWrapper[Dictionary[String]] = js.native
  /**
    * @see _.invertBy
    */
  def invertBy[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[Dictionary[js.Array[String]]] = js.native
  def invertBy[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    interatee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashImplicitWrapper[Dictionary[js.Array[String]]] = js.native
  /**
    * @see _.invertBy
    */
  @JSName("invertBy")
  def invertBy_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]]): LoDashImplicitWrapper[Dictionary[js.Array[String]]] = js.native
  @JSName("invertBy")
  def invertBy_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    interatee: ValueIteratee[T]
  ): LoDashImplicitWrapper[Dictionary[js.Array[String]]] = js.native
  /**
    * @see _.invoke
    **/
  def invoke(path: PropertyPath, args: js.Any*): js.Any = js.native
  /**
    * @see _.invokeMap
    **/
  def invokeMap(methodName: String, args: js.Any*): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.invokeMap
    **/
  def invokeMap[TResult](method: js.Function1[/* repeated */ js.Any, TResult], args: js.Any*): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.isArguments
    */
  def isArguments(): Boolean = js.native
  /**
    * @see _.isArray
    */
  def isArray(): Boolean = js.native
  /**
    * @see _.isArrayBuffer
    */
  def isArrayBuffer(): Boolean = js.native
  /**
    * @see _.isArrayLike
    */
  def isArrayLike(): Boolean = js.native
  /**
    * @see _.isArrayLikeObject
    */
  def isArrayLikeObject(): Boolean = js.native
  /**
    * @see _.isBoolean
    */
  def isBoolean(): Boolean = js.native
  /**
    * @see _.isBuffer
    */
  def isBuffer(): Boolean = js.native
  /**
    * @see _.isDate
    */
  def isDate(): Boolean = js.native
  /**
    * @see _.isElement
    */
  def isElement(): Boolean = js.native
  /**
    * @see _.isEmpty
    */
  def isEmpty(): Boolean = js.native
  /**
    * @see _.isEqual
    */
  def isEqual(other: js.Any): Boolean = js.native
  /**
    * @see _.isEqualWith
    */
  def isEqualWith(other: js.Any): Boolean = js.native
  def isEqualWith(other: js.Any, customizer: IsEqualCustomizer): Boolean = js.native
  /**
    * @see _.isError
    */
  def isError(): Boolean = js.native
  /**
    * @see _.isFinite
    */
  def isFinite(): Boolean = js.native
  /**
    * @see _.isFunction
    */
  def isFunction(): Boolean = js.native
  /**
    * @see _.isInteger
    */
  def isInteger(): Boolean = js.native
  /**
    * @see _.isLength
    */
  def isLength(): Boolean = js.native
  /**
    * @see _.isMap
    */
  def isMap(): Boolean = js.native
  /**
    * @see _.isMatch
    */
  def isMatch(source: js.Object): Boolean = js.native
  /**
    * @see _.isMatchWith
    */
  def isMatchWith(source: js.Object, customizer: isMatchWithCustomizer): Boolean = js.native
  /**
    * @see _.isNaN
    */
  def isNaN(): Boolean = js.native
  /**
    * see _.isNative
    */
  def isNative(): Boolean = js.native
  /**
    * see _.isNil
    */
  def isNil(): Boolean = js.native
  /**
    * see _.isNull
    */
  def isNull(): Boolean = js.native
  /**
    * see _.isNumber
    */
  def isNumber(): Boolean = js.native
  /**
    * see _.isObject
    */
  def isObject(): /* is lodash.lodash.LoDashImplicitWrapper<object> */ Boolean = js.native
  /**
    * see _.isObjectLike
    */
  def isObjectLike(): Boolean = js.native
  /**
    * see _.isPlainObject
    */
  def isPlainObject(): Boolean = js.native
  /**
    * see _.isRegExp
    */
  def isRegExp(): Boolean = js.native
  /**
    * see _.isSafeInteger
    */
  def isSafeInteger(): Boolean = js.native
  /**
    * @see _.isSet
    */
  def isSet(): Boolean = js.native
  /**
    * see _.isString
    */
  def isString(): Boolean = js.native
  /**
    * see _.isSymbol
    */
  def isSymbol(): Boolean = js.native
  /**
    * see _.isTypedArray
    */
  def isTypedArray(): Boolean = js.native
  /**
    * see _.isUndefined
    */
  def isUndefined(): Boolean = js.native
  /**
    * @see _.isSet
    */
  def isWeakMap(): Boolean = js.native
  /**
    * @see _.isWeakSet
    */
  def isWeakSet(): Boolean = js.native
  /**
    * @see _.iteratee
    */
  def iteratee[TFunction /* <: js.Function1[/* repeated */ js.Any, _] */](`this`: LoDashImplicitWrapper[TFunction | String | js.Object]): LoDashImplicitWrapper[TFunction] = js.native
  /**
    * @see _.join
    */
  def join(): String = js.native
  def join(separator: String): String = js.native
  /**
    * @see _.kebabCase
    */
  def kebabCase(): String = js.native
  /**
    * @see _.keyBy
    */
  def keyBy[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def keyBy[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ]
  ): LoDashImplicitWrapper[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.keyBy
    */
  @JSName("keyBy")
  def keyBy_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  @JSName("keyBy")
  def keyBy_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: ValueIterateeCustom[T, PropertyName]
  ): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.keys
    */
  def keys(): LoDashImplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.keysIn
    */
  def keysIn(): LoDashImplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.last
    */
  def last[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.indexOf
    */
  def lastIndexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T): Double = js.native
  def lastIndexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T, fromIndex: Double): Double = js.native
  @JSName("lastIndexOf")
  def lastIndexOf_true[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T, fromIndex: `true`): Double = js.native
  /**
    * @see _.lowerCase
    */
  def lowerCase(): String = js.native
  /**
    * @see _.lowerFirst
    */
  def lowerFirst(): String = js.native
  /**
    * @see _.lt
    */
  def lt(other: js.Any): Boolean = js.native
  /**
    * @see _.lte
    */
  def lte(other: js.Any): Boolean = js.native
  /**
    * @see _.map
    */
  def map[T](`this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | List[T] | Null | NumericDictionary[T]]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def map[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: String
  ): LoDashImplicitWrapper[js.Array[_]] = js.native
  def map[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: js.Object
  ): LoDashImplicitWrapper[js.Array[Boolean]] = js.native
  /** @see _.map */
  def map[T, K /* <: String */](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: K
  ): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.map
    */
  def map[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    iteratee: (ArrayIterator[T, TResult]) | (ListIterator[T, TResult])
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.mapKeys
    */
  def mapKeys[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def mapKeys[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], iteratee: ObjectIteratee[T]): LoDashImplicitWrapper[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.mapKeys
    */
  @JSName("mapKeys")
  def mapKeys_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  @JSName("mapKeys")
  def mapKeys_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ListIteratee[T]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues(`this`: LoDashImplicitWrapper[js.UndefOr[String | Null]]): LoDashImplicitWrapper[NumericDictionary[String]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TResult](`this`: LoDashImplicitWrapper[js.UndefOr[String | Null]], callback: StringIterator[TResult]): LoDashImplicitWrapper[NumericDictionary[TResult]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], iteratee: String): LoDashImplicitWrapper[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsJapgolly.lodash.lodashStrings.LoDashImplicitWrapper with js.Any
  ] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], iteratee: js.Object): LoDashImplicitWrapper[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typingsJapgolly.lodash.lodashStrings.LoDashImplicitWrapper with js.Any
  ] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T, TKey /* <: String */](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: TKey
  ): LoDashImplicitWrapper[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: String
  ): LoDashImplicitWrapper[Dictionary[_]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null]],
    iteratee: js.Object
  ): LoDashImplicitWrapper[Dictionary[Boolean]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_TTResult[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null]],
    callback: DictionaryIterator[T, TResult]
  ): LoDashImplicitWrapper[Dictionary[TResult]] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_T_Object[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[Null | T]]): LoDashImplicitWrapper[T] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_T_ObjectTResult[T /* <: js.Object */, TResult](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], callback: ObjectIterator[T, TResult]): LoDashImplicitWrapper[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typingsJapgolly.lodash.lodashStrings.LoDashImplicitWrapper with js.Any
  ] = js.native
  /**
    * @see _.map
    */
  @JSName("map")
  def map_T_ObjectTResult[T /* <: js.Object */, TResult](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, TResult]): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.matches
    */
  def matches[V](): LoDashImplicitWrapper[js.Function1[/* value */ V, Boolean]] = js.native
  /**
    * @see _.matchesProperty
    */
  def matchesProperty[SrcValue](srcValue: SrcValue): LoDashImplicitWrapper[js.Function1[/* value */ _, Boolean]] = js.native
  /**
    * @see _.matchesProperty
    */
  @JSName("matchesProperty")
  def matchesProperty_SrcValueValue[SrcValue, Value](srcValue: SrcValue): LoDashImplicitWrapper[js.Function1[/* value */ Value, Boolean]] = js.native
  /**
    * @see _.max
    */
  def max[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.maxBy
    */
  def maxBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  def maxBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  /**
    * @see _.mean
    */
  def mean(): Double = js.native
  /**
    * @see _.meanBy
    */
  def meanBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): Double = js.native
  def meanBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): Double = js.native
  /**
    * @see _.memoize
    */
  def memoize(): LoDashImplicitWrapper[TValue with MemoizedFunction] = js.native
  def memoize(resolver: js.Function1[/* repeated */ js.Any, _]): LoDashImplicitWrapper[TValue with MemoizedFunction] = js.native
  /**
    * @see _.merge
    */
  def merge(otherArgs: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource](source: TSource): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith(otherArgs: js.Any*): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource](source: TSource, customizer: MergeWithCustomizer): LoDashImplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: MergeWithCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: MergeWithCustomizer): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeWithCustomizer
  ): LoDashImplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  /**
    * @see _.method
    */
  def method(args: js.Any*): LoDashImplicitWrapper[js.Function1[/* object */ _, _]] = js.native
  /**
    * @see _.methodOf
    */
  def methodOf(args: js.Any*): LoDashImplicitWrapper[js.Function1[/* path */ PropertyPath, _]] = js.native
  /**
    * @see _.min
    */
  def min[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.minBy
    */
  def minBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  def minBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  /**
    * @see _.mixin
    */
  def mixin(): LoDashImplicitWrapper[LoDashStatic] = js.native
  def mixin(options: MixinOptions): LoDashImplicitWrapper[LoDashStatic] = js.native
  /**
    * @see _.mixin
    */
  def mixin(source: Dictionary[js.Function1[/* repeated */ _, _]]): this.type = js.native
  def mixin(source: Dictionary[js.Function1[/* repeated */ _, _]], options: MixinOptions): this.type = js.native
  /**
    * @see _.multiply
    */
  def multiply(multiplicand: Double): Double = js.native
  /**
    * @see _.negate
    */
  def negate(`this`: LoDashImplicitWrapper[js.Function0[Boolean] | (js.Function1[/* repeated */ _, _])]): LoDashImplicitWrapper[js.Function0[Boolean]] = js.native
  @JSName("negate")
  def negate_A1[A1](`this`: LoDashImplicitWrapper[js.Function1[/* a1 */ A1, Boolean]]): LoDashImplicitWrapper[js.Function1[/* a1 */ A1, Boolean]] = js.native
  @JSName("negate")
  def negate_A1A2[A1, A2](`this`: LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, Boolean]]): LoDashImplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, Boolean]] = js.native
  /**
    * @see _.noConflict
    */
  def noConflict(): Typeoflodash = js.native
  /**
    * @see _.noop
    */
  def noop(args: js.Any*): Unit = js.native
  /**
    * @see _.now
    */
  def now(): Double = js.native
  /**
    * @see _.nth
    */
  def nth[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  def nth[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], n: Double): js.UndefOr[T] = js.native
  /**
    * @see _.nthArg
    */
  def nthArg(): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.omit
    */
  def omit[T /* <: AnyKindOfDictionary */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], paths: Many[PropertyName]*): LoDashImplicitWrapper[T] = js.native
  /**
    * @see _.omitBy
    */
  def omitBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | Null | NumericDictionary[T]]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.omitBy
    */
  def omitBy[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashImplicitWrapper[PartialObject[T]] = js.native
  @JSName("omitBy")
  def omitBy_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | Null | NumericDictionary[T]]],
    predicate: ValueKeyIteratee[T]
  ): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_T_Object[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], paths: Many[PropertyName]*): LoDashImplicitWrapper[PartialObject[T]] = js.native
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_T_ObjectK_String[T /* <: js.Object */, K /* <: String */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], paths: Many[K]*): LoDashImplicitWrapper[Omit[T, K]] = js.native
  /**
    * @see _.orderBy
    */
  def orderBy[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def orderBy[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[Null | T]],
    iteratees: Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])]
  ): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def orderBy[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[Null | T]],
    iteratees: Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])],
    orders: Many[Boolean | asc | desc]
  ): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.orderBy
    */
  @JSName("orderBy")
  def orderBy_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  @JSName("orderBy")
  def orderBy_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratees: Many[ListIteratee[T] | (ListIterator[T, NotVoid])]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  @JSName("orderBy")
  def orderBy_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratees: Many[ListIteratee[T] | (ListIterator[T, NotVoid])],
    orders: Many[Boolean | asc | desc]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.over
    */
  def over[TResult](
    `this`: LoDashImplicitWrapper[Many[js.Function1[/* repeated */ _, TResult]]],
    iteratees: (Many[js.Function1[/* repeated */ _, TResult]])*
  ): LoDashImplicitWrapper[js.Function1[/* repeated */ _, js.Array[TResult]]] = js.native
  /**
    * @see _.overArgs
    */
  def overArgs(transforms: (Many[js.Function1[/* repeated */ _, _]])*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.overEvery
    */
  def overEvery[T](predicates: (Many[js.Function1[/* repeated */ T, Boolean]])*): LoDashImplicitWrapper[js.Function1[/* repeated */ T, Boolean]] = js.native
  /**
    * @see _.overSome
    */
  def overSome[T](predicates: (Many[js.Function1[/* repeated */ T, Boolean]])*): LoDashImplicitWrapper[js.Function1[/* repeated */ T, Boolean]] = js.native
  /**
    * @see _.pad
    */
  def pad(): String = js.native
  def pad(length: Double): String = js.native
  def pad(length: Double, chars: String): String = js.native
  /**
    * @see _.padEnd
    */
  def padEnd(): String = js.native
  def padEnd(length: Double): String = js.native
  def padEnd(length: Double, chars: String): String = js.native
  /**
    * @see _.padStart
    */
  def padStart(): String = js.native
  def padStart(length: Double): String = js.native
  def padStart(length: Double, chars: String): String = js.native
  /**
    * @see _.parseInt
    */
  def parseInt(): Double = js.native
  def parseInt(radix: Double): Double = js.native
  // catch-all
  /**
    * @see _.partial
    */
  def partial(args: js.Any*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  // arity 0
  /**
    * @see _.partial
    */
  def partial[R](`this`: LoDashImplicitWrapper[Function0[R]]): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, R](`this`: LoDashImplicitWrapper[Function1[T1, R]], arg1: T1): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], arg1: T1, arg2: T2): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], plc1: __, arg2: T2): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2, arg3: T3): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, plc2: __, arg3: T3): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], plc1: __, arg2: T2, arg3: T3): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], plc1: __, plc2: __, arg3: T3): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    arg2: T2,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    plc2: __,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    plc1: __,
    plc2: __,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  // catch-all
  /**
    * @see _.partialRight
    */
  def partialRight(args: js.Any*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  // arity 0
  /**
    * @see _.partialRight
    */
  def partialRight[R](`this`: LoDashImplicitWrapper[Function0[R]]): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, R](`this`: LoDashImplicitWrapper[Function1[T1, R]], arg1: T1): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], arg1: T1, arg2: T2): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], arg1: T1, plc2: __): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2, arg3: T3): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2, plc3: __): LoDashImplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, plc2: __, arg3: T3): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, plc2: __, plc3: __): LoDashImplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    plc4: __
  ): LoDashImplicitWrapper[Function1[T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    arg2: T2,
    plc3: __,
    plc4: __
  ): LoDashImplicitWrapper[Function2[T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    arg3: T3,
    arg4: T4
  ): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    arg3: T3,
    plc4: __
  ): LoDashImplicitWrapper[Function2[T2, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    plc3: __,
    arg4: T4
  ): LoDashImplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](
    `this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]],
    arg1: T1,
    plc2: __,
    plc3: __,
    plc4: __
  ): LoDashImplicitWrapper[Function3[T2, T3, T4, R]] = js.native
  // arity 1
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1R[T1, R](`this`: LoDashImplicitWrapper[Function1[T1, R]]): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  // arity 2
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]]): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], arg2: T2): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  // arity 3
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]]): LoDashImplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg2: T2, arg3: T3): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg2: T2, plc3: __): LoDashImplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg3: T3): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  // arity 4
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]]): LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, arg3: T3, arg4: T4): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, arg3: T3, plc4: __): LoDashImplicitWrapper[Function2[T1, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, plc3: __, arg4: T4): LoDashImplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg2: T2, plc3: __, plc4: __): LoDashImplicitWrapper[Function3[T1, T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg3: T3, arg4: T4): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg3: T3, plc4: __): LoDashImplicitWrapper[Function3[T1, T2, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg4: T4): LoDashImplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  // arity 1
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1R[T1, R](`this`: LoDashImplicitWrapper[Function1[T1, R]]): LoDashImplicitWrapper[Function1[T1, R]] = js.native
  // arity 2
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]]): LoDashImplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2R[T1, T2, R](`this`: LoDashImplicitWrapper[Function2[T1, T2, R]], arg1: T1): LoDashImplicitWrapper[Function1[T2, R]] = js.native
  // arity 3
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]]): LoDashImplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1): LoDashImplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], arg1: T1, arg2: T2): LoDashImplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](`this`: LoDashImplicitWrapper[Function3[T1, T2, T3, R]], plc1: __, arg2: T2): LoDashImplicitWrapper[Function2[T1, T3, R]] = js.native
  // arity 4
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]]): LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1): LoDashImplicitWrapper[Function3[T2, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1, arg2: T2): LoDashImplicitWrapper[Function2[T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1, arg2: T2, arg3: T3): LoDashImplicitWrapper[Function1[T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], arg1: T1, plc2: __, arg3: T3): LoDashImplicitWrapper[Function2[T2, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], plc1: __, arg2: T2): LoDashImplicitWrapper[Function3[T1, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], plc1: __, arg2: T2, arg3: T3): LoDashImplicitWrapper[Function2[T1, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](`this`: LoDashImplicitWrapper[Function4[T1, T2, T3, T4, R]], plc1: __, plc2: __, arg3: T3): LoDashImplicitWrapper[Function3[T1, T2, T4, R]] = js.native
  /**
    * @see _.partition
    */
  def partition[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null | T]],
    callback: ValueIteratee[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): LoDashImplicitWrapper[js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  /**
    * @see _.partition
    */
  def partition[T, U /* <: T */](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], callback: ValueIteratorTypeGuard[T, U]): LoDashImplicitWrapper[js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]]] = js.native
  /**
    * @see _.pick
    */
  def pick[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], props: PropertyPath*): LoDashImplicitWrapper[PartialObject[T]] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[PartialObject[T]] = js.native
  def pickBy[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashImplicitWrapper[PartialObject[T]] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[T, S /* <: T */](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | Null | NumericDictionary[T]]],
    predicate: ValueKeyIterateeTypeGuard[T, S]
  ): LoDashImplicitWrapper[Dictionary[S]] = js.native
  /**
    * @see _.pickBy
    */
  @JSName("pickBy")
  def pickBy_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | Null | NumericDictionary[T]]]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  @JSName("pickBy")
  def pickBy_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | Null | NumericDictionary[T]]],
    predicate: ValueKeyIteratee[T]
  ): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.pick
    */
  @JSName("pick")
  def pick_T_ObjectU_String[T /* <: js.Object */, U /* <: String */](`this`: LoDashImplicitWrapper[T], props: Many[U]*): LoDashImplicitWrapper[Pick[T, U]] = js.native
  /**
    * Creates a clone of the chained sequence planting value as the wrapped value.
    * @param value The value to plant as the wrapped value.
    * @return Returns the new lodash wrapper instance.
    */
  def plant[T](value: T): LoDashImplicitWrapper[T] = js.native
  def pop[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.property
    */
  def property[TObj, TResult](): LoDashImplicitWrapper[js.Function1[/* obj */ TObj, TResult]] = js.native
  /**
    * @see _.propertyOf
    */
  def propertyOf(): LoDashImplicitWrapper[js.Function1[/* path */ PropertyPath, _]] = js.native
  /**
    * @see _.pull
    */
  def pull[T](`this`: LoDashImplicitWrapper[List[T]], values: T*): this.type = js.native
  /**
    * @see _.pullAll
    */
  def pullAll[T](`this`: LoDashImplicitWrapper[List[T]]): this.type = js.native
  def pullAll[T](`this`: LoDashImplicitWrapper[List[T]], values: List[T]): this.type = js.native
  def push[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], items: T*): this.type = js.native
  /**
    * @see _.random
    */
  def random(): Double = js.native
  def random(floating: Boolean): Double = js.native
  /**
    * @see _.random
    */
  def random(max: Double): Double = js.native
  def random(max: Double, floating: Boolean): Double = js.native
  /**
    * @see _.range
    */
  def range(): LoDashImplicitWrapper[js.Array[Double]] = js.native
  def range(end: Double): LoDashImplicitWrapper[js.Array[Double]] = js.native
  def range(end: Double, step: Double): LoDashImplicitWrapper[js.Array[Double]] = js.native
  /**
    * @see _.rangeRight
    */
  def rangeRight(): LoDashImplicitWrapper[js.Array[Double]] = js.native
  def rangeRight(end: Double): LoDashImplicitWrapper[js.Array[Double]] = js.native
  def rangeRight(end: Double, step: Double): LoDashImplicitWrapper[js.Array[Double]] = js.native
  /**
    * @see _.rearg
    */
  def rearg(indexes: Many[Double]*): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.reduce
    **/
  def reduce[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * @see _.reduce
    **/
  /**
    * @see _.reduce
    **/
  def reduce[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    callback: MemoListIterator[T, TResult, js.Array[T] | List[T]],
    accumulator: TResult
  ): TResult = js.native
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T /* <: js.Object */](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    callback: MemoListIterator[T, TResult, js.Array[T] | List[T]],
    accumulator: TResult
  ): TResult = js.native
  /**
    * @see _.reduceRight
    **/
  @JSName("reduceRight")
  def reduceRight_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    callback: MemoListIterator[T, T, js.Array[T] | List[T]]
  ): js.UndefOr[T] = js.native
  /**
    * @see _.reduceRight
    **/
  @JSName("reduceRight")
  def reduceRight_T_ObjectTResult[T /* <: js.Object */, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  /**
    * @see _.reduce
    **/
  @JSName("reduce")
  def reduce_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    callback: MemoListIterator[T, T, js.Array[T] | List[T]]
  ): js.UndefOr[T] = js.native
  /**
    * @see _.reduce
    **/
  @JSName("reduce")
  def reduce_T_ObjectTResult[T /* <: js.Object */, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[T | Null]],
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  /**
    * @see _.reject
    */
  def reject(`this`: LoDashImplicitWrapper[js.UndefOr[String | Null]]): LoDashImplicitWrapper[js.Array[String]] = js.native
  def reject(`this`: LoDashImplicitWrapper[js.UndefOr[String | Null]], predicate: StringIterator[Boolean]): LoDashImplicitWrapper[js.Array[String]] = js.native
  def reject[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.reject
    */
  @JSName("reject")
  def reject_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  @JSName("reject")
  def reject_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.reject
    */
  @JSName("reject")
  def reject_T_Object[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.remove
    */
  def remove[T](`this`: LoDashImplicitWrapper[List[T]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def remove[T](`this`: LoDashImplicitWrapper[List[T]], predicate: ListIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.repeat
    */
  def repeat(): String = js.native
  def repeat(n: Double): String = js.native
  def replace(pattern: String, replacement: String): String = js.native
  def replace(pattern: String, replacement: ReplaceFunction): String = js.native
  def replace(pattern: RegExp, replacement: String): String = js.native
  /**
    * @see _.replace
    */
  def replace(pattern: RegExp, replacement: ReplaceFunction): String = js.native
  def replace(replacement: String): String = js.native
  /**
    * @see _.replace
    */
  def replace(replacement: ReplaceFunction): String = js.native
  /**
    * @see _.rest
    */
  def rest(): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def rest(start: Double): LoDashImplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.result
    */
  def result[TResult](path: PropertyPath): TResult = js.native
  def result[TResult](path: PropertyPath, defaultValue: TResult): TResult = js.native
  def result[TResult](path: PropertyPath, defaultValue: js.Function1[/* repeated */ js.Any, TResult]): TResult = js.native
  /**
    * @see _.round
    */
  def round(): Double = js.native
  def round(precision: Double): Double = js.native
  /**
    * @see _.runInContext
    */
  def runInContext(): LoDashStatic = js.native
  /**
    * @see _.sample
    */
  def sample[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * @see _.sampleSize
    */
  def sampleSize[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def sampleSize[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], n: Double): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.sampleSize
    */
  @JSName("sampleSize")
  def sampleSize_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  @JSName("sampleSize")
  def sampleSize_T[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]],
    n: Double
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.sample
    */
  @JSName("sample")
  def sample_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.set
    */
  def set(path: PropertyPath, value: js.Any): this.type = js.native
  /**
    * @see _.setWith
    */
  def setWith(path: PropertyPath, value: js.Any): this.type = js.native
  def setWith(path: PropertyPath, value: js.Any, customizer: SetWithCustomizer[TValue]): this.type = js.native
  /**
    * @see _.setWith
    */
  @JSName("setWith")
  def setWith_TResult_LoDashImplicitWrapper[TResult](path: PropertyPath, value: js.Any): LoDashImplicitWrapper[TResult] = js.native
  @JSName("setWith")
  def setWith_TResult_LoDashImplicitWrapper[TResult](path: PropertyPath, value: js.Any, customizer: SetWithCustomizer[TValue]): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.set
    */
  @JSName("set")
  def set_TResult_LoDashImplicitWrapper[TResult](path: PropertyPath, value: js.Any): LoDashImplicitWrapper[TResult] = js.native
  def shift[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): js.UndefOr[T] = js.native
  /**
    * @see _.shuffle
    */
  def shuffle[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.shuffle
    */
  @JSName("shuffle")
  def shuffle_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.size
    */
  def size(): Double = js.native
  /**
    * @see _.slice
    */
  def slice[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def slice[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], start: Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  def slice[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], start: Double, end: Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.snakeCase
    */
  def snakeCase(): String = js.native
  /**
    * @see _.some
    */
  def some[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): Boolean = js.native
  def some[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    predicate: ListIterateeCustom[T, Boolean]
  ): Boolean = js.native
  /**
    * @see _.some
    */
  @JSName("some")
  def some_T_Object[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): Boolean = js.native
  @JSName("some")
  def some_T_Object[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], predicate: ObjectIterateeCustom[T, Boolean]): Boolean = js.native
  def sort[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): this.type = js.native
  def sort[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    compareFn: js.Function2[/* a */ T, /* b */ T, Double]
  ): this.type = js.native
  /**
    * @see _.sortBy
    */
  def sortBy[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]], iteratees: Many[ObjectIteratee[T]]*): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.sortBy
    */
  @JSName("sortBy")
  def sortBy_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratees: Many[ListIteratee[T]]*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.sortedIndex
    */
  def sortedIndex[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T): Double = js.native
  /**
    * @see _.sortedIndexBy
    */
  def sortedIndexBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T): Double = js.native
  def sortedIndexBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T, iteratee: ValueIteratee[T]): Double = js.native
  /**
    * @see _.sortedIndexOf
    */
  def sortedIndexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T): Double = js.native
  /**
    * @see _.sortedLastIndex
    */
  def sortedLastIndex[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T): Double = js.native
  /**
    * @see _.sortedLastIndexBy
    */
  def sortedLastIndexBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T, iteratee: ValueIteratee[T]): Double = js.native
  /**
    * @see _.sortedLastIndexOf
    */
  def sortedLastIndexOf[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], value: T): Double = js.native
  /**
    * @see _.sortedUniq
    */
  def sortedUniq[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.sortedUniqBy
    */
  def sortedUniqBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def splice[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], start: Double): this.type = js.native
  def splice[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    start: Double,
    deleteCount: Double,
    items: T*
  ): this.type = js.native
  /**
    * @see _.split
    */
  def split(): LoDashImplicitWrapper[js.Array[String]] = js.native
  def split(separator: String): LoDashImplicitWrapper[js.Array[String]] = js.native
  def split(separator: String, limit: Double): LoDashImplicitWrapper[js.Array[String]] = js.native
  def split(separator: RegExp): LoDashImplicitWrapper[js.Array[String]] = js.native
  def split(separator: RegExp, limit: Double): LoDashImplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.spread
    */
  def spread[TResult](`this`: LoDashImplicitWrapper[js.Function1[/* repeated */ _, TResult]]): LoDashImplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  /**
    * @see _.spread
    */
  def spread[TResult](`this`: LoDashImplicitWrapper[js.Function1[/* repeated */ _, TResult]], start: Double): LoDashImplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  /**
    * @see _.startCase
    */
  def startCase(): String = js.native
  /**
    * @see _.startsWith
    */
  def startsWith(): Boolean = js.native
  def startsWith(target: String): Boolean = js.native
  def startsWith(target: String, position: Double): Boolean = js.native
  /**
    * @see _.stubArray
    */
  def stubArray(): js.Array[_] = js.native
  /**
    * @see _.stubFalse
    */
  def stubFalse(): `false` = js.native
  /**
    * @see _.stubObject
    */
  def stubObject(): js.Any = js.native
  /**
    * @see _.stubString
    */
  def stubString(): String = js.native
  /**
    * @see _.stubTrue
    */
  def stubTrue(): `true` = js.native
  /**
    * @see _.subtract
    */
  def subtract(subtrahend: Double): Double = js.native
  /**
    * @see _.sum
    */
  def sum(): Double = js.native
  /**
    * @see _.sumBy
    */
  def sumBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): Double = js.native
  def sumBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: String): Double = js.native
  def sumBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: js.Function1[/* value */ T, Double]
  ): Double = js.native
  /**
    * @see _.tail
    */
  def tail[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.take
    */
  def take[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def take[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], n: Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.takeRight
    */
  def takeRight[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def takeRight[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], n: Double): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.takeRightWhile
    */
  def takeRightWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def takeRightWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.takeWhile
    */
  def takeWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def takeWhile[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], predicate: ListIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.template
    */
  def template(): TemplateExecutor = js.native
  def template(options: TemplateOptions): TemplateExecutor = js.native
  /**
    * @see _.throttle
    */
  def throttle(): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  def throttle(wait: Double): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  def throttle(wait: Double, options: ThrottleSettings): LoDashImplicitWrapper[TValue with Cancelable] = js.native
  /**
    * @see _.thru
    */
  def thru[TResult](interceptor: js.Function1[/* value */ TValue, TResult]): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.times
    */
  def times(): js.Array[Double] = js.native
  /**
    * @see _.times
    */
  def times[TResult](iteratee: js.Function1[/* num */ Double, TResult]): js.Array[TResult] = js.native
  /**
    * @see _.toArray
    */
  def toArray[T /* <: js.Object */](`this`: LoDashImplicitWrapper[T]): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.toArray
    */
  @JSName("toArray")
  def toArray_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.toFinite
    */
  def toFinite(): Double = js.native
  /**
    * @see _.toInteger
    */
  def toInteger(): Double = js.native
  /**
    * @see _.toLength
    */
  def toLength(): Double = js.native
  /**
    * @see _.toLower
    */
  def toLower(): String = js.native
  /**
    * @see _.toNumber
    */
  def toNumber(): Double = js.native
  /**
    * @see _.toPairs
    */
  def toPairs(): LoDashImplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  /**
    * @see _.toPairs
    */
  def toPairs[T](`this`: LoDashImplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashImplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  /**
    * @see _.toPairsIn
    */
  def toPairsIn(): LoDashImplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  /**
    * @see _.toPairsIn
    */
  def toPairsIn[T](`this`: LoDashImplicitWrapper[Dictionary[T] | NumericDictionary[T]]): LoDashImplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  /**
    * @see _.toPath
    */
  def toPath(): LoDashImplicitWrapper[js.Array[String]] = js.native
  /**
    * @see _.toPlainObject
    */
  def toPlainObject(): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.toSafeInteger
    */
  def toSafeInteger(): Double = js.native
  /**
    * @see _.toUpper
    */
  def toUpper(): String = js.native
  /**
    * @see _.transform
    */
  def transform(): LoDashImplicitWrapper[Dictionary[_]] = js.native
  /**
    * @see _.transform
    */
  def transform(`this`: LoDashImplicitWrapper[js.Array[_]]): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.transform
    */
  def transform[T, TResult](
    `this`: LoDashImplicitWrapper[js.Array[T] | Dictionary[T]],
    iteratee: (MemoVoidArrayIterator[T, js.Array[TResult]]) | (MemoVoidDictionaryIterator[T, Dictionary[TResult]])
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.transform
    */
  def transform[T, TResult](
    `this`: LoDashImplicitWrapper[js.Array[T] | Dictionary[T]],
    iteratee: (MemoVoidArrayIterator[T, js.Array[TResult]]) | (MemoVoidDictionaryIterator[T, js.Array[TResult]]),
    accumulator: js.Array[TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.transform
    */
  def transform[T, TResult](
    `this`: LoDashImplicitWrapper[js.Array[T] | Dictionary[T]],
    iteratee: (MemoVoidArrayIterator[T, Dictionary[TResult]]) | (MemoVoidDictionaryIterator[T, Dictionary[TResult]]),
    accumulator: Dictionary[TResult]
  ): LoDashImplicitWrapper[Dictionary[TResult]] = js.native
  /**
    * @see _.trim
    */
  def trim(): String = js.native
  def trim(chars: String): String = js.native
  /**
    * @see _.trimEnd
    */
  def trimEnd(): String = js.native
  def trimEnd(chars: String): String = js.native
  /**
    * @see _.trimStart
    */
  def trimStart(): String = js.native
  def trimStart(chars: String): String = js.native
  /**
    * @see _.truncate
    */
  def truncate(): String = js.native
  def truncate(options: TruncateOptions): String = js.native
  /**
    * @see _.unary
    */
  def unary[T, TResult](`this`: LoDashImplicitWrapper[js.Function2[/* arg1 */ T, /* repeated */ _, TResult]]): LoDashImplicitWrapper[js.Function1[/* arg1 */ T, TResult]] = js.native
  /**
    * @see _.unescape
    */
  def unescape(): String = js.native
  /**
    * @see _.union
    */
  def union[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], arrays: (js.UndefOr[List[T] | Null])*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: Null,
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: Null, arrays3: List[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: List[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: Null,
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: List[T], arrays3: List[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    arrays4: List[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    arrays4: List[T],
    arrays5: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    arrays4: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: List[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], comparator: Comparator[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniq
    */
  def uniq[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniqBy
    */
  def uniqBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniqWith
    */
  def uniqWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def uniqWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], comparator: Comparator[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.uniqueId
    */
  def uniqueId(): String = js.native
  /**
    * @see _.unset
    */
  def unset(path: PropertyPath): LoDashImplicitWrapper[Boolean] = js.native
  def unshift[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], items: T*): this.type = js.native
  /**
    * @see _.unzip
    */
  def unzip[T](`this`: LoDashImplicitWrapper[js.UndefOr[js.Array[js.Array[T]] | List[List[T]] | Null]]): LoDashImplicitWrapper[js.Array[js.Array[T]]] = js.native
  /**
    * @see _.unzipWith
    */
  def unzipWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[List[T]] | Null]]): LoDashImplicitWrapper[js.Array[js.Array[T]]] = js.native
  /**
    * @see _.unzipWith
    */
  def unzipWith[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[List[T]] | Null]],
    iteratee: js.Function1[/* repeated */ T, TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.update
    */
  def update(path: PropertyPath, updater: js.Function1[/* value */ js.Any, _]): LoDashImplicitWrapper[_] = js.native
  /**
    * @see _.updateWith
    */
  def updateWith(path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): this.type = js.native
  def updateWith(
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: SetWithCustomizer[TValue]
  ): this.type = js.native
  /**
    * @see _.updateWith
    */
  @JSName("updateWith")
  def updateWith_TResult_LoDashImplicitWrapper[TResult](path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): LoDashImplicitWrapper[TResult] = js.native
  @JSName("updateWith")
  def updateWith_TResult_LoDashImplicitWrapper[TResult](
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: SetWithCustomizer[TValue]
  ): LoDashImplicitWrapper[TResult] = js.native
  /**
    * @see _.upperCase
    */
  def upperCase(): String = js.native
  /**
    * @see _.upperFirst
    */
  def upperFirst(): String = js.native
  /**
    * @see _.values
    */
  def values(): LoDashImplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.values
    */
  def values[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.valuesIn
    */
  def valuesIn[T /* <: js.Object */](`this`: LoDashImplicitWrapper[js.UndefOr[T | Null]]): LoDashImplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.valuesIn
    */
  @JSName("valuesIn")
  def valuesIn_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.values
    */
  @JSName("values")
  def values_T[T](`this`: LoDashImplicitWrapper[js.UndefOr[Dictionary[T] | NumericDictionary[T] | List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.without
    */
  def without[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], values: T*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.words
    */
  def words(): js.Array[String] = js.native
  def words(pattern: String): js.Array[String] = js.native
  def words(pattern: RegExp): js.Array[String] = js.native
  /**
    * @see _.wrap
    */
  def wrap[TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */ js.Any, TResult]): LoDashImplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  /**
    * @see _.wrap
    */
  @JSName("wrap")
  def wrap_TArgsTResult[TArgs, TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */ TArgs, TResult]): LoDashImplicitWrapper[js.Function1[/* repeated */ TArgs, TResult]] = js.native
  /**
    * @see _.xor
    */
  def xor[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], arrays: (js.UndefOr[List[T] | Null])*): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xor
    */
  def xorBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorBy
    */
  def xorBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: List[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorBy
    */
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    iteratee: ValueIteratee[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], iteratee: ValueIteratee[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]]): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: js.UndefOr[scala.Nothing],
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: Null,
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], arrays2: List[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    arrays2: List[T],
    comparator: Comparator[T]
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], comparator: Comparator[T]): LoDashImplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.zip
    */
  def zip[T](`this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]], arrays: (js.UndefOr[List[T] | Null])*): LoDashImplicitWrapper[js.Array[js.Array[js.UndefOr[T]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2](`this`: LoDashImplicitWrapper[List[T1]], arrays2: List[T2]): LoDashImplicitWrapper[js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3](`this`: LoDashImplicitWrapper[List[T1]], arrays2: List[T2], arrays3: List[T3]): LoDashImplicitWrapper[js.Array[js.Tuple3[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3, T4](`this`: LoDashImplicitWrapper[List[T1]], arrays2: List[T2], arrays3: List[T3], arrays4: List[T4]): LoDashImplicitWrapper[
    js.Array[js.Tuple4[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4]]]
  ] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3, T4, T5](
    `this`: LoDashImplicitWrapper[List[T1]],
    arrays2: List[T2],
    arrays3: List[T3],
    arrays4: List[T4],
    arrays5: List[T5]
  ): LoDashImplicitWrapper[
    js.Array[
      js.Tuple5[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4], js.UndefOr[T5]]
    ]
  ] = js.native
  /**
    * @see _.zipObject
    */
  def zipObject(`this`: LoDashImplicitWrapper[List[PropertyName]]): LoDashImplicitWrapper[Dictionary[js.UndefOr[scala.Nothing]]] = js.native
  /**
    * @see _.zipObject
    */
  def zipObject[T](`this`: LoDashImplicitWrapper[List[PropertyName]], values: List[T]): LoDashImplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.zipObjectDeep
    */
  def zipObjectDeep(`this`: LoDashImplicitWrapper[List[PropertyPath]]): LoDashImplicitWrapper[js.Object] = js.native
  def zipObjectDeep(`this`: LoDashImplicitWrapper[List[PropertyPath]], values: List[_]): LoDashImplicitWrapper[js.Object] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T, TResult](
    `this`: LoDashImplicitWrapper[js.UndefOr[List[T] | Null]],
    iteratee: (js.UndefOr[(js.Function1[/* repeated */ T, TResult]) | List[T] | Null])*
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T, TResult](`this`: LoDashImplicitWrapper[List[T]], iteratee: js.Function1[/* value1 */ T, TResult]): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, TResult](
    `this`: LoDashImplicitWrapper[List[T1]],
    arrays2: List[T2],
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, TResult](
    `this`: LoDashImplicitWrapper[List[T1]],
    arrays2: List[T2],
    arrays3: List[T3],
    iteratee: js.Function3[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, T4, TResult](
    `this`: LoDashImplicitWrapper[List[T1]],
    arrays2: List[T2],
    arrays3: List[T3],
    arrays4: List[T4],
    iteratee: js.Function4[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, /* value4 */ T4, TResult]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, T4, T5, TResult](
    `this`: LoDashImplicitWrapper[List[T1]],
    arrays2: List[T2],
    arrays3: List[T3],
    arrays4: List[T4],
    arrays5: List[T5],
    iteratee: js.Function5[
      /* value1 */ T1, 
      /* value2 */ T2, 
      /* value3 */ T3, 
      /* value4 */ T4, 
      /* value5 */ T5, 
      TResult
    ]
  ): LoDashImplicitWrapper[js.Array[TResult]] = js.native
}

