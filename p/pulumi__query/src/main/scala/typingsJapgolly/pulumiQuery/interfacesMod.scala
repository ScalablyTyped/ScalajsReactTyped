package typingsJapgolly.pulumiQuery

import typingsJapgolly.std.IteratorResult
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @JSImport("@pulumi/query/interfaces", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAsyncIterable[T](o: Any): /* is @pulumi/query.@pulumi/query/interfaces.AsyncIterable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsyncIterable")(o.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/query.@pulumi/query/interfaces.AsyncIterable<T> */ Boolean]
  
  inline def isIterable[T](o: Any): /* is std.Iterable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(o.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<T> */ Boolean]
  
  @js.native
  trait AsyncIterable[T] extends StObject
  
  @js.native
  trait AsyncIterableIterator[T]
    extends StObject
       with AsyncIterator[T]
  
  @js.native
  trait AsyncIterator[T] extends StObject {
    
    def next(): js.Promise[IteratorResult[T, Any]] = js.native
    def next(value: Any): js.Promise[IteratorResult[T, Any]] = js.native
    
    var `return`: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], js.Promise[IteratorResult[T, Any]]]] = js.native
    
    var `throw`: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], js.Promise[IteratorResult[T, Any]]]] = js.native
  }
  
  type AsyncQuerySource[TSource] = js.Iterable[TSource] | AsyncIterable[TSource] | (js.Function0[js.Iterable[TSource] | AsyncIterable[TSource]])
  
  @js.native
  trait AsyncQueryable[TSource]
    extends StObject
       with AsyncIterable[TSource] {
    
    /**
      * Accumulates a value over a sequence. `func` is applied to each element in the sequence, an
      * the result of `func` becomes the `acc` argument in the next application. The first `acc`
      * takes the value `seed`.
      * @param seed Value of `acc` in the first call to `func`.
      * @param func Accumulates a result.
      */
    def aggregate[TAccumulate](
      seed: TAccumulate,
      func: js.Function2[/* acc */ TAccumulate, /* t */ TSource, TAccumulate | js.Promise[TAccumulate]]
    ): js.Promise[TAccumulate] = js.native
    
    /**
      * Returns `true` if all elements of a sequence satisfy `predicate`.
      * @param predicate Boolean function to check against elements of the sequence.
      */
    def all(predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): js.Promise[Boolean] = js.native
    
    /**
      * Retruns `true` if any element of a sequence exists or satisfies `predicate`.
      * @param predicate Boolean function to check against elements of the sequence.
      */
    def any(): js.Promise[Boolean] = js.native
    def any(predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): js.Promise[Boolean] = js.native
    
    /**
      * Averages the numbers of a sequence.
      */
    def average(): /* import warning: importer.ImportType#apply Failed type conversion: TSource extends number ? std.Promise<number> : never */ js.Any = js.native
    def average(selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): js.Promise[Double] = js.native
    /**
      * Applies `selector` to each element in a sequence, and then averages the resulting numbers.
      * @param selector Function mapping elements of a sequence to numbers.
      */
    @JSName("average")
    def average_Promise(): js.Promise[Double] = js.native
    
    /**
      * Concatenates two sequences.
      * @param second Sequence to concatenate to `this` sequence.
      */
    def concat[TSource2](second: AsyncQuerySource[TSource2]): AsyncQueryable[TSource | TSource2] = js.native
    
    /**
      * Returns `true` of sequence contains element equal to `value`.
      * @param value Element to check the sequence contains.
      */
    def contains(value: TSource): js.Promise[Boolean] = js.native
    
    /**
      * Counts the number of elements in a sequence, or the number of elements that satisfy
      * `predicate`.
      * @param predicate Function to check against elements of the sequence.
      */
    def count(): js.Promise[Double] = js.native
    def count(predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): js.Promise[Double] = js.native
    
    /**
      * Return `this` sequence, or a sequence containing only `defaultValue` if the sequence is
      * empty.
      * @param defaultValue Default value to return if sequence is empty.
      */
    def defaultIfEmpty(defaultValue: TSource): AsyncQueryable[TSource] = js.native
    
    /**
      * Suppresses duplicate elements in a sequence.
      */
    def distinct(): AsyncQueryable[TSource] = js.native
    
    /**
      * Return element at `index` in sequence. If `index` is out of range, throw an exception.
      * @param index Zero-based index of the element to return.
      */
    def elementAt(index: Double): js.Promise[TSource] = js.native
    
    def elementAtOrDefault(defaultValue: TSource, index: js.Promise[Double]): js.Promise[TSource] = js.native
    /**
      * Return element at `index` in sequence, or the provided default value if the index does not exist.
      * @param defaultValue Default value to return if element cannot be found.
      * @param index Zero-based index of the element to return.
      */
    def elementAtOrDefault(defaultValue: TSource, index: Double): js.Promise[TSource] = js.native
    
    /**
      * Produces the set difference of two sequences.
      * @param second Sequence to diff with `this` sequence.
      * @example
      * await from([1, 2]).except([1, 1, 1, 2, 3, 1, 1]).toArray(); // == [3]
      */
    def except(second: AsyncQuerySource[TSource]): AsyncQueryable[TSource] = js.native
    
    /**
      * Filters out all elements in a sequence for which `predicate` does not return true.
      * @param predicate
      * @example
      * await range(0, 3).filter(x => x < 2).toArray(); // == [0, 1]
      */
    def filter(predicate: js.Function2[/* t */ TSource, /* i */ Double, Boolean | js.Promise[Boolean]]): AsyncQueryable[TSource] = js.native
    
    /**
      * Find first element in sequence, or first element in sequence that satisfies `predicate`. If
      * sequence is empty or no elements satisfy this condition, throw an exception.
      * @param predicate Optional test for elements in the sequence.
      */
    def first(): js.Promise[TSource] = js.native
    def first(predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): js.Promise[TSource] = js.native
    
    /**
      * Find first element in sequence, or first element in sequence that satisfies `predicate`, or
      * return provided default value.
      * @param defaultValue Default value to return if element cannot be found.
      * @param predicate Optional test for elements in the sequence.
      */
    def firstOrDefault(defaultValue: TSource): js.Promise[TSource] = js.native
    def firstOrDefault(defaultValue: TSource, predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): js.Promise[TSource] = js.native
    
    /**
      * Transforms each element in a sequence of `TSource` to some number of `TResult`, flattening
      * the result into a single sequence of `TResult`.
      *
      * `transform` performs this transformation. An optional transformation,
      * `intermediateTransform`, pairs each element of the flattened sequence with the input that was
      * passed to `transform` to generate it, and returning some arbitrary transformation. See
      * examples for where this is useful.
      * @param transform Function performing the transformation of one `TSource` element into many
      * `TResult`.
      * @param intermediateTransform Optionally allows transformation of each element of the
      * flattened list resulting from `transform`.
      * @example
      * await from([[1], [2], [3]]).flatMap(x => x).toArray(); // == [1, 2, 3]
      * @example
      * // Take a sequence of customers, then for each order, produce a tuple `[customer, order]`.
      * await customers.flatMap(customer => customer.orders, (customer, order) => [customer, order]);
      */
    def flatMap[TInner, TResult](
      transform: js.Function2[
          /* t */ TSource, 
          /* index */ Double, 
          AsyncQuerySource[TInner] | js.Promise[AsyncQuerySource[TInner]]
        ]
    ): AsyncQueryable[TResult] = js.native
    def flatMap[TInner, TResult](
      transform: js.Function2[
          /* t */ TSource, 
          /* index */ Double, 
          AsyncQuerySource[TInner] | js.Promise[AsyncQuerySource[TInner]]
        ],
      // TODO: Make this iterable.
    resultTransform: js.Function2[/* t */ TSource, /* ti */ TInner, TResult | js.Promise[TResult]]
    ): AsyncQueryable[TResult] = js.native
    
    /**
      * Evaluate a function `f` on each element of a sequence.
      * @param f Function to run on each element of the sequence.
      */
    def forEach(f: js.Function1[/* t */ TSource, Unit | js.Promise[Unit]]): Unit = js.native
    
    /**
      * Collect elements in a sequence into groups whose keys match.
      * @param keySelector Maps an element of the sequence into the key used for grouping.
      * @param elementSelector Optionally transforms each element of the sequence from `TSource` to
      * `TResult`.
      * @example
      * await from([1, 2, 1]).groupBy(x => x).map(g => g.toArray()).toArray(); // [[1, 1], [2]]
      */
    def groupBy[TKey, TResult](keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]]): AsyncQueryable[AsyncQueryableGrouping[TKey, TResult]] = js.native
    def groupBy[TKey, TResult](
      keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]],
      elementSelector: js.Function1[/* t */ TSource, TResult | js.Promise[TResult]]
    ): AsyncQueryable[AsyncQueryableGrouping[TKey, TResult]] = js.native
    
    def groupJoin[TInner, TKey, TResult](
      inner: AsyncQuerySource[TInner],
      outerKeySelector: js.Function1[/* to */ TSource, TKey | js.Promise[TKey]],
      innerKeySelector: js.Function1[/* ti */ TInner, TKey | js.Promise[TKey]],
      resultSelector: js.Function2[/* to */ TSource, /* ti */ AsyncQueryable[TInner], TResult | js.Promise[TResult]]
    ): AsyncQueryable[TResult] = js.native
    
    /**
      * Produces the set intersection of two sequences.
      * @param second Sequence to intersect with `this` sequence.
      * @example
      * await from([1, 2, 3]).intersection([1, 1, 1, 1, 1]).toArray(); // == [1]
      */
    def intersect(second: AsyncQuerySource[TSource]): AsyncQueryable[TSource] = js.native
    
    def join[TInner, TKey, TResult](
      inner: AsyncQuerySource[TInner],
      outerKeySelector: js.Function1[/* to */ TSource, TKey | js.Promise[TKey]],
      innerKeySelector: js.Function1[/* ti */ TInner, TKey | js.Promise[TKey]],
      resultSelector: js.Function2[/* to */ TSource, /* ti */ TInner, TResult | js.Promise[TResult]]
    ): AsyncQueryable[TResult] = js.native
    
    /**
      * Find last element in sequence, or last element in sequence that satisfies `predicate`. If
      * sequence is empty or no elements satisfy this condition, throw an exception.
      * @param predicate Optional test for elements in the sequence.
      */
    def last(): js.Promise[TSource] = js.native
    def last(predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): js.Promise[TSource] = js.native
    
    /**
      * Find last element in sequence, or last element in sequence that satisfies `predicate`, or
      * return provided default value.
      * @param defaultValue Default value to return if element cannot be found.
      * @param predicate Optional test for elements in the sequence.
      */
    def lastOrDefault(defaultValue: TSource): js.Promise[TSource] = js.native
    def lastOrDefault(defaultValue: TSource, predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): js.Promise[TSource] = js.native
    
    /**
      * Transforms a sequence of `TSource` into a sequence of `TResult` by calling `transform` on
      * every element in the sequence.
      * @param transform Function performing the transformation of `TSource` to `TResult`.
      * @example
      * await range(0, 2).map(x => x * x).toArray(); // == [0, 1, 4]
      */
    def map[TResult](transform: js.Function2[/* t */ TSource, /* i */ Double, TResult | js.Promise[TResult]]): AsyncQueryable[TResult] = js.native
    
    /**
      * Finds the maximum number in a sequence.
      */
    def max(): /* import warning: importer.ImportType#apply Failed type conversion: TSource extends number ? std.Promise<number> : never */ js.Any = js.native
    def max(selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): js.Promise[Double] = js.native
    /**
      * Applies `selector` to each element in a sequence, and then finds the maximum of the resulting
      * numbers.
      * @param selector Function mapping elements of a sequence to numbers.
      */
    @JSName("max")
    def max_Promise(): js.Promise[Double] = js.native
    
    /**
      * Finds the minimum number in a sequence.
      */
    def min(): /* import warning: importer.ImportType#apply Failed type conversion: TSource extends number ? std.Promise<number> : never */ js.Any = js.native
    def min(selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): js.Promise[Double] = js.native
    /**
      * Applies `selector` to each element in a sequence, and then finds the minimum of the resulting
      * numbers.
      * @param selector Function mapping elements of a sequence to numbers.
      */
    @JSName("min")
    def min_Promise(): js.Promise[Double] = js.native
    
    /**
      * Filter out everything in the sequence that is not of type `TResult`, returning a sequence of
      * type `TResult`.
      * @param typeGuard Checks whether element is of type `TResult`.
      */
    def ofType[TResult](typeGuard: js.Function1[/* o */ Any, /* is TResult */ Boolean]): AsyncQueryable[TResult] = js.native
    
    /**
      * Sorts the elements of a sequence in ascending order.
      *
      * Unlike JavaScript's `Array#sort`, which coerces all objects to string and sorts them
      * lexically, this method requires `keySelector` to perform any conversions explicitly. Among
      * other things, this means that numbers are sorted numerically rather than lexically.
      * @param keySelector Maps an element of the sequence to the key used for sorting.
      */
    def orderBy(keySelector: js.Function1[/* t */ TSource, OrderKey | js.Promise[OrderKey]]): AsyncQueryable[TSource] = js.native
    
    /**
      * Sorts the elements of a sequence in descending order.
      *
      * Unlike JavaScript's `Array#sort`, which coerces all objects to string and sorts them
      * lexically, this method requires `keySelector` to perform any conversions explicitly. Among
      * other things, this means that numbers are sorted numerically rather than lexically.
      * @param keySelector Maps an element of the sequence to the key used for sorting.
      */
    def orderByDescending(keySelector: js.Function1[/* t */ TSource, OrderKey | js.Promise[OrderKey]]): AsyncQueryable[TSource] = js.native
    
    def pipe(): AsyncQueryable[TSource] = js.native
    def pipe[TResult](op: Operator[TSource, TResult]): AsyncQueryable[TResult] = js.native
    def pipe[TResult1, TResult2](op1: Operator[TSource, TResult1], op2: Operator[TResult1, TResult2]): AsyncQueryable[TResult2] = js.native
    def pipe[TResult1, TResult2, TResult3](
      op1: Operator[TSource, TResult1],
      op2: Operator[TResult1, TResult2],
      op3: Operator[TResult2, TResult3]
    ): AsyncQueryable[TResult3] = js.native
    def pipe[TResult1, TResult2, TResult3, TResult4](
      op1: Operator[TSource, TResult1],
      op2: Operator[TResult1, TResult2],
      op3: Operator[TResult2, TResult3],
      op4: Operator[TResult3, TResult4]
    ): AsyncQueryable[TResult4] = js.native
    def pipe[TResult1, TResult2, TResult3, TResult4, TResult5](
      op1: Operator[TSource, TResult1],
      op2: Operator[TResult1, TResult2],
      op3: Operator[TResult2, TResult3],
      op4: Operator[TResult3, TResult4],
      op5: Operator[TResult4, TResult5]
    ): AsyncQueryable[TResult5] = js.native
    def pipe[TResult1, TResult2, TResult3, TResult4, TResult5, TResult6](
      op1: Operator[TSource, TResult1],
      op2: Operator[TResult1, TResult2],
      op3: Operator[TResult2, TResult3],
      op4: Operator[TResult3, TResult4],
      op5: Operator[TResult4, TResult5],
      op6: Operator[TResult5, TResult6]
    ): AsyncQueryable[TResult6] = js.native
    def pipe[TResult1, TResult2, TResult3, TResult4, TResult5, TResult6, TResult7](
      op1: Operator[TSource, TResult1],
      op2: Operator[TResult1, TResult2],
      op3: Operator[TResult2, TResult3],
      op4: Operator[TResult3, TResult4],
      op5: Operator[TResult4, TResult5],
      op6: Operator[TResult5, TResult6],
      op7: Operator[TResult6, TResult7]
    ): AsyncQueryable[TResult7] = js.native
    def pipe[TResult1, TResult2, TResult3, TResult4, TResult5, TResult6, TResult7, TResult8](
      op1: Operator[TSource, TResult1],
      op2: Operator[TResult1, TResult2],
      op3: Operator[TResult2, TResult3],
      op4: Operator[TResult3, TResult4],
      op5: Operator[TResult4, TResult5],
      op6: Operator[TResult5, TResult6],
      op7: Operator[TResult6, TResult7],
      op8: Operator[TResult7, TResult8]
    ): AsyncQueryable[TResult8] = js.native
    def pipe[TResult1, TResult2, TResult3, TResult4, TResult5, TResult6, TResult7, TResult8, TResult9](
      op1: Operator[TSource, TResult1],
      op2: Operator[TResult1, TResult2],
      op3: Operator[TResult2, TResult3],
      op4: Operator[TResult3, TResult4],
      op5: Operator[TResult4, TResult5],
      op6: Operator[TResult5, TResult6],
      op7: Operator[TResult6, TResult7],
      op8: Operator[TResult7, TResult8],
      op9: Operator[TResult8, TResult9],
      ops: (Operator[Any, Any])*
    ): AsyncQueryable[TResult9] = js.native
    
    /**
      * Enumerates the elements of a sequence in reverse order.
      */
    def reverse(): AsyncQueryable[TSource] = js.native
    
    /**
      * Return single element in sequence, or single element in sequence that satisfies `predicate`.
      * If sequence is empty or no elements satisfy this condition, throw an exception.
      * @param predicate Optional test for elements in the sequence.
      */
    def single(): js.Promise[TSource] = js.native
    def single(predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): js.Promise[TSource] = js.native
    
    /**
      * Find single element in sequence, or single element in sequence that satisfies `predicate`, or
      * return provided default value.
      * @param defaultValue Default value to return if element cannot be found.
      * @param predicate Optional test for elements in the sequence.
      */
    def singleOrDefault(defaultValue: TSource): js.Promise[TSource] = js.native
    def singleOrDefault(defaultValue: TSource, predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): js.Promise[TSource] = js.native
    
    /**
      * Skips `n` elements of a sequence, then yields the remainder of the sequence.
      * @param n Number of elements to skip
      * @example
      * await range(0, 3).skip(2).toArray(); // == [2]
      */
    def skip(n: Double): AsyncQueryable[TSource] = js.native
    
    /**
      * Skips elements in a sequence while `predicate` returns `true` and then yields the rest of the
      * sequence without testing `predicate` again.
      * @param predicate Tests whether we should keep skipping elements
      * @example
      * await from([1, 2, 3, 4]).skipWhile(x => x < 2).toArray() // == [2, 3, 4]
      */
    def skipWhile(predicate: js.Function2[/* t */ TSource, /* i */ Double, Boolean | js.Promise[Boolean]]): AsyncQueryable[TSource] = js.native
    
    /**
      * Sums all the numbers in a sequence.
      */
    def sum(): /* import warning: importer.ImportType#apply Failed type conversion: TSource extends number ? std.Promise<number> : never */ js.Any = js.native
    def sum(selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): js.Promise[Double] = js.native
    /**
      * Applies `selector` to each element in a sequence, and then sums the resulting numbers.
      * @param selector Function mapping elements of a sequence to numbers.
      */
    @JSName("sum")
    def sum_Promise(): js.Promise[Double] = js.native
    
    /**
      * Takes `n` elements of a sequence, then skips the remainder of the sequence.
      * @param n Number of elements to take from the sequence
      * @example
      * await range(0, 3).take(2).toArray(); // == [0, 1]
      */
    def take(n: Double): AsyncQueryable[TSource] = js.native
    
    /**
      * Takes  elements in a sequence while `predicate` returns `true` and then skips the rest of
      * the sequence without testing `predicate` again.
      * @param predicate Tests whether we should keep taking elements
      * @example
      * await from([1, 2, 3, 4]).takeWhile(x => x < 2).toArray() // == [1]
      */
    def takeWhile(predicate: js.Function2[/* t */ TSource, /* i */ Double, Boolean | js.Promise[Boolean]]): AsyncQueryable[TSource] = js.native
    
    /**
      * Transforms a sequence of `TSource` to a `Promise<TSource[]>`.
      */
    def toArray(): js.Promise[js.Array[TSource]] = js.native
    
    /**
      * Transforms a sequence into a `Map`.
      * @param keySelector Maps elements in the sequence to keys that will be used in the resulting
      * `Map`.
      * @param elementSelector Optionally maps elements in the sequence into the values used in teh
      * resulting `Map`.
      */
    def toMap[TKey, TResult](keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]]): js.Promise[Map[TKey, TResult]] = js.native
    def toMap[TKey, TResult](
      keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]],
      elementSelector: js.Function1[/* t */ TSource, TResult | js.Promise[TResult]]
    ): js.Promise[Map[TKey, TResult]] = js.native
    
    /**
      * Produces the set union of two sequences.
      * @param second Sequence to union with `this` sequence.
      * @example
      * await from([1, 2, 3]).union([1, 1, 1, 1, 1]).toArray(); // == [1, 2, 3]
      */
    def union(second: AsyncQuerySource[TSource]): AsyncQueryable[TSource] = js.native
  }
  
  @js.native
  trait AsyncQueryableGrouping[TKey, TSource]
    extends StObject
       with AsyncQueryable[TSource] {
    
    var key: TKey = js.native
  }
  
  type Evaluator[TSource, TResult] = js.Function1[/* source */ AsyncIterable[TSource], js.Promise[TResult]]
  
  @js.native
  trait GroupedAsyncIterable[TKey, TSource]
    extends StObject
       with AsyncIterable[TSource] {
    
    var key: TKey = js.native
  }
  
  type Operator[TSource, TResult] = js.Function1[/* source */ AsyncIterable[TSource], AsyncIterable[TResult]]
  
  type OrderKey = String | Double
  
  object global {
    
    trait SymbolConstructor extends StObject {
      
      val asyncIterator: js.Symbol
    }
    object SymbolConstructor {
      
      inline def apply(asyncIterator: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(asyncIterator = asyncIterator.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      extension [Self <: SymbolConstructor](x: Self) {
        
        inline def setAsyncIterator(value: js.Symbol): Self = StObject.set(x, "asyncIterator", value.asInstanceOf[js.Any])
      }
    }
  }
}
