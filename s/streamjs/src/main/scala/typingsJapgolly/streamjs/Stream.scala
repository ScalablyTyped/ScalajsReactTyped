package typingsJapgolly.streamjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Map
import typingsJapgolly.streamjs.Stream.Accumulator
import typingsJapgolly.streamjs.Stream.Collector
import typingsJapgolly.streamjs.Stream.Comparator
import typingsJapgolly.streamjs.Stream.Consumer
import typingsJapgolly.streamjs.Stream.GroupingResult
import typingsJapgolly.streamjs.Stream.JoinOptions
import typingsJapgolly.streamjs.Stream.Optional
import typingsJapgolly.streamjs.Stream.Predicate
import typingsJapgolly.streamjs.Stream.Sample
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream[T] extends StObject {
  
  def allMatch(predicate: Predicate[T]): Boolean = js.native
  def allMatch(regexp: js.RegExp): Boolean = js.native
  def allMatch(sample: Sample): Boolean = js.native
  
  def anyMatch(predicate: Predicate[T]): Boolean = js.native
  def anyMatch(regexp: js.RegExp): Boolean = js.native
  def anyMatch(sample: Sample): Boolean = js.native
  
  def average(): Double = js.native
  def average(path: String): Double = js.native
  
  def avg(): Double = js.native
  def avg(path: String): Double = js.native
  
  def collect(collector: Collector[T]): T = js.native
  
  def count(): Double = js.native
  
  def distinct(): Stream[T] = js.native
  
  def dropWhile(predicate: Predicate[T]): Stream[T] = js.native
  def dropWhile(regexp: js.RegExp): Stream[String] = js.native
  def dropWhile(sample: Sample): Stream[T] = js.native
  
  def each(consumer: Consumer[T]): Unit = js.native
  
  def filter(predicate: Predicate[T]): Stream[T] = js.native
  def filter(regexp: js.RegExp): Stream[String] = js.native
  def filter(sample: Sample): Stream[T] = js.native
  
  def findAny(): Optional[T] = js.native
  
  def findFirst(): Optional[T] = js.native
  
  def flatMap[U](mapper: js.Function): Stream[U] = js.native
  
  def forEach(consumer: Consumer[T]): Unit = js.native
  
  def groupBy(mapper: js.Function): GroupingResult[T] = js.native
  def groupBy(path: String): GroupingResult[T] = js.native
  
  def groupingBy(mapper: js.Function): GroupingResult[T] = js.native
  def groupingBy(path: String): GroupingResult[T] = js.native
  
  def indexBy(keyMapper: js.Function): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
  ] = js.native
  def indexBy(keyMapper: js.Function, mergeFunction: Accumulator[T]): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
  ] = js.native
  
  def iterator(): js.Iterator[T] = js.native
  
  def join(): String = js.native
  def join(delimiter: String): String = js.native
  def join(options: JoinOptions): String = js.native
  
  def joining(): String = js.native
  def joining(delimiter: String): String = js.native
  def joining(options: JoinOptions): String = js.native
  
  def limit(limit: Double): Stream[T] = js.native
  
  def map[U](mapper: js.Function): Stream[U] = js.native
  
  def max(): Optional[T] = js.native
  def max(comparator: Comparator[T]): Optional[T] = js.native
  def max(path: String): Optional[T] = js.native
  
  def min(): Optional[T] = js.native
  def min(comparator: Comparator[T]): Optional[T] = js.native
  def min(path: String): Optional[T] = js.native
  
  def noneMatch(predicate: js.Function1[/* elem */ T, Boolean]): Boolean = js.native
  def noneMatch(regexp: js.RegExp): Boolean = js.native
  
  def partitionBy(predicate: Predicate[T]): js.Array[js.Array[T]] = js.native
  def partitionBy(regexp: js.RegExp): js.Array[js.Array[T]] = js.native
  def partitionBy(sample: Sample): js.Array[js.Array[T]] = js.native
  def partitionBy(size: Double): js.Array[js.Array[T]] = js.native
  
  def partitioningBy(predicate: Predicate[T]): js.Array[js.Array[T]] = js.native
  def partitioningBy(regexp: js.RegExp): js.Array[js.Array[T]] = js.native
  def partitioningBy(sample: Sample): js.Array[js.Array[T]] = js.native
  def partitioningBy(size: Double): js.Array[js.Array[T]] = js.native
  
  def peek(consumer: Consumer[T]): Stream[T] = js.native
  
  def reduce(accumulator: Accumulator[T]): Optional[T] = js.native
  def reduce(identity: T, accumulator: Accumulator[T]): T = js.native
  
  def reverse(): Stream[T] = js.native
  
  def shuffle(): Stream[T] = js.native
  
  def size(): Double = js.native
  
  def skip(n: Double): Stream[T] = js.native
  
  def slice(begin: Double, end: Double): Stream[T] = js.native
  
  def sort(): Stream[T] = js.native
  def sort(comparator: Comparator[T]): Stream[T] = js.native
  def sort(path: String): Stream[T] = js.native
  
  def sorted(): Stream[T] = js.native
  def sorted(comparator: Comparator[T]): Stream[T] = js.native
  def sorted(path: String): Stream[T] = js.native
  
  def sum(): Double = js.native
  def sum(path: String): Double = js.native
  
  def takeWhile(predicate: Predicate[T]): Stream[T] = js.native
  def takeWhile(regexp: js.RegExp): Stream[String] = js.native
  def takeWhile(sample: Sample): Stream[T] = js.native
  
  def toArray(): js.Array[T] = js.native
  
  def toList(): js.Array[T] = js.native
  
  def toMap(keyMapper: js.Function): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
  ] = js.native
  def toMap(keyMapper: js.Function, mergeFunction: Accumulator[T]): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
  ] = js.native
  def toMap(path: String): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
  ] = js.native
  def toMap(path: String, mergeFunction: Accumulator[T]): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
  ] = js.native
}
object Stream {
  
  type Accumulator[T] = js.Function2[/* e1 */ T, /* e2 */ T, T]
  
  trait Collector[T] extends StObject {
    
    def accumulator(e1: T, e2: T): T
    @JSName("accumulator")
    var accumulator_Original: Accumulator[T]
    
    def finisher(elem: T): T
    @JSName("finisher")
    var finisher_Original: Function[T, T]
    
    def supplier(): T
    @JSName("supplier")
    var supplier_Original: Supplier[T]
  }
  object Collector {
    
    inline def apply[T](accumulator: (T, T) => T, finisher: T => T, supplier: CallbackTo[T]): Collector[T] = {
      val __obj = js.Dynamic.literal(accumulator = js.Any.fromFunction2(accumulator), finisher = js.Any.fromFunction1(finisher), supplier = supplier.toJsFn)
      __obj.asInstanceOf[Collector[T]]
    }
    
    extension [Self <: Collector[?], T](x: Self & Collector[T]) {
      
      inline def setAccumulator(value: (T, T) => T): Self = StObject.set(x, "accumulator", js.Any.fromFunction2(value))
      
      inline def setFinisher(value: T => T): Self = StObject.set(x, "finisher", js.Any.fromFunction1(value))
      
      inline def setSupplier(value: CallbackTo[T]): Self = StObject.set(x, "supplier", value.toJsFn)
    }
  }
  
  type Comparator[T] = js.Function2[/* e1 */ T, /* e2 */ T, Double]
  
  type Consumer[T] = js.Function1[/* elem */ T, Unit]
  
  type Function[T, U] = js.Function1[/* elem */ T, U]
  
  type GroupingResult[T] = StringDictionary[js.Array[T]]
  
  trait Iterator[T] extends StObject {
    
    var done: Boolean
    
    def next(): T
  }
  object Iterator {
    
    inline def apply[T](done: Boolean, next: CallbackTo[T]): Iterator[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], next = next.toJsFn)
      __obj.asInstanceOf[Iterator[T]]
    }
    
    extension [Self <: Iterator[?], T](x: Self & Iterator[T]) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setNext(value: CallbackTo[T]): Self = StObject.set(x, "next", value.toJsFn)
    }
  }
  
  trait JoinOptions extends StObject {
    
    var delimiter: String
    
    var prefix: String
    
    var suffix: String
  }
  object JoinOptions {
    
    inline def apply(delimiter: String, prefix: String, suffix: String): JoinOptions = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinOptions]
    }
    
    extension [Self <: JoinOptions](x: Self) {
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
  
  type Map[T] = StringDictionary[T]
  
  trait Optional[T] extends StObject {
    
    def filter(predicate: js.Function1[/* elem */ T, Boolean]): Optional[T]
    
    def flatMap[U](mapper: js.Function1[/* elem */ T, Optional[U]]): Optional[U]
    
    def get(): T
    
    def ifPresent(consumer: js.Function1[/* elem */ T, Unit]): Unit
    
    def isPresent(): Boolean
    
    def map[U](mapper: js.Function1[/* elem */ T, U]): Optional[U]
    
    def orElse(other: T): T
    
    def orElseGet(supplier: Supplier[T]): T
    
    def orElseThrow(error: Any): T
  }
  object Optional {
    
    inline def apply[T](
      filter: js.Function1[/* elem */ T, Boolean] => Optional[T],
      flatMap: js.Function1[/* elem */ T, Optional[Any]] => Optional[Any],
      get: CallbackTo[T],
      ifPresent: js.Function1[/* elem */ T, Unit] => Callback,
      isPresent: CallbackTo[Boolean],
      map: js.Function1[/* elem */ T, Any] => Optional[Any],
      orElse: T => T,
      orElseGet: Supplier[T] => T,
      orElseThrow: Any => T
    ): Optional[T] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), get = get.toJsFn, ifPresent = js.Any.fromFunction1((t0: js.Function1[/* elem */ T, Unit]) => ifPresent(t0).runNow()), isPresent = isPresent.toJsFn, map = js.Any.fromFunction1(map), orElse = js.Any.fromFunction1(orElse), orElseGet = js.Any.fromFunction1(orElseGet), orElseThrow = js.Any.fromFunction1(orElseThrow))
      __obj.asInstanceOf[Optional[T]]
    }
    
    extension [Self <: Optional[?], T](x: Self & Optional[T]) {
      
      inline def setFilter(value: js.Function1[/* elem */ T, Boolean] => Optional[T]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFlatMap(value: js.Function1[/* elem */ T, Optional[Any]] => Optional[Any]): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setGet(value: CallbackTo[T]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setIfPresent(value: js.Function1[/* elem */ T, Unit] => Callback): Self = StObject.set(x, "ifPresent", js.Any.fromFunction1((t0: js.Function1[/* elem */ T, Unit]) => value(t0).runNow()))
      
      inline def setIsPresent(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPresent", value.toJsFn)
      
      inline def setMap(value: js.Function1[/* elem */ T, Any] => Optional[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setOrElse(value: T => T): Self = StObject.set(x, "orElse", js.Any.fromFunction1(value))
      
      inline def setOrElseGet(value: Supplier[T] => T): Self = StObject.set(x, "orElseGet", js.Any.fromFunction1(value))
      
      inline def setOrElseThrow(value: Any => T): Self = StObject.set(x, "orElseThrow", js.Any.fromFunction1(value))
    }
  }
  
  type Predicate[T] = js.Function1[/* elem */ T, Boolean]
  
  type Sample = StringDictionary[Any]
  
  type Supplier[T] = js.Function0[T]
}
