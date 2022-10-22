package typingsJapgolly.backbone.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.jquery.JQueryXHR
import typingsJapgolly.std.Record
import typingsJapgolly.underscore.mod.Dictionary
import typingsJapgolly.underscore.mod.ListIterator
import typingsJapgolly.underscore.mod.MemoIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone", "Collection")
@js.native
open class Collection[TModel /* <: Model[Any, ModelSetOptions, Any] */] () extends StObject {
  def this(models: js.Array[(Record[String, Any]) | TModel]) = this()
  def this(models: js.Array[(Record[String, Any]) | TModel], options: Any) = this()
  def this(models: Unit, options: Any) = this()
  
  /* private */ def _isModel(obj: Any): /* is backbone.backbone.Model<any, backbone.backbone.ModelSetOptions, any> */ Boolean = js.native
  
  /* private */ def _onModelEvent(event: String, model: TModel, collection: Collection[TModel], options: Any): Unit = js.native
  
  /* private */ def _prepareModel(): Any = js.native
  /* private */ def _prepareModel(attributes: Any): Any = js.native
  /* private */ def _prepareModel(attributes: Any, options: Any): Any = js.native
  /* private */ def _prepareModel(attributes: Unit, options: Any): Any = js.native
  
  /* private */ def _removeReference(model: TModel): Unit = js.native
  
  def add(model: TModel): TModel = js.native
  def add(model: TModel, options: AddOptions): TModel = js.native
  def add(model: js.Object): TModel = js.native
  def add(model: js.Object, options: AddOptions): TModel = js.native
  def add(models: js.Array[js.Object | TModel]): js.Array[TModel] = js.native
  def add(models: js.Array[js.Object | TModel], options: AddOptions): js.Array[TModel] = js.native
  
  // mixins from underscore
  def all(): Boolean = js.native
  def all(iterator: Unit, context: Any): Boolean = js.native
  def all(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): Boolean = js.native
  def all(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]], context: Any): Boolean = js.native
  
  def any(): Boolean = js.native
  def any(iterator: Unit, context: Any): Boolean = js.native
  def any(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): Boolean = js.native
  def any(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]], context: Any): Boolean = js.native
  
  def at(index: Double): TModel = js.native
  
  def chain(): Any = js.native
  
  def collect[TResult](iterator: ListIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]]): js.Array[TResult] = js.native
  def collect[TResult](iterator: ListIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]], context: Any): js.Array[TResult] = js.native
  
  /**
    * Specify a model attribute name (string) or function that will be used to sort the collection.
    */
  var comparator: String | (js.Function1[/* element */ TModel, Double | String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], Double]) = js.native
  
  def contains(value: TModel): Boolean = js.native
  
  def countBy(): Dictionary[Double] = js.native
  def countBy(iterator: String): Dictionary[Double] = js.native
  def countBy(iterator: ListIterator[TModel, Any, typingsJapgolly.underscore.mod.List[TModel]]): Dictionary[Double] = js.native
  
  def create(attributes: Any): TModel = js.native
  def create(attributes: Any, options: ModelSaveOptions): TModel = js.native
  
  def detect(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): TModel = js.native
  def detect(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]], context: Any): TModel = js.native
  
  def difference(others: js.Array[TModel]): js.Array[TModel] = js.native
  
  def drop(): js.Array[TModel] = js.native
  def drop(n: Double): js.Array[TModel] = js.native
  
  def each(iterator: ListIterator[TModel, Unit, typingsJapgolly.underscore.mod.List[TModel]]): js.Array[TModel] = js.native
  def each(iterator: ListIterator[TModel, Unit, typingsJapgolly.underscore.mod.List[TModel]], context: Any): js.Array[TModel] = js.native
  
  def entries(): js.Iterator[js.Tuple2[Any, TModel]] = js.native
  
  def every(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): Boolean = js.native
  def every(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]], context: Any): Boolean = js.native
  
  def fetch(): JQueryXHR = js.native
  def fetch(options: CollectionFetchOptions): JQueryXHR = js.native
  
  def filter(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): js.Array[TModel] = js.native
  def filter(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]], context: Any): js.Array[TModel] = js.native
  
  def find(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): TModel = js.native
  def find(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]], context: Any): TModel = js.native
  
  def findIndex(predicate: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): Double = js.native
  def findIndex(
    predicate: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]],
    context: Any
  ): Double = js.native
  
  def findLastIndex(predicate: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): Double = js.native
  def findLastIndex(
    predicate: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]],
    context: Any
  ): Double = js.native
  
  def findWhere(properties: Any): TModel = js.native
  
  def first(): TModel = js.native
  def first(n: Double): js.Array[TModel] = js.native
  
  def foldl[TResult](iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]]): TResult = js.native
  def foldl[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: TResult
  ): TResult = js.native
  def foldl[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: TResult,
    context: Any
  ): TResult = js.native
  def foldl[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: Unit,
    context: Any
  ): TResult = js.native
  
  def foldr[TResult](iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]]): TResult = js.native
  def foldr[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: TResult
  ): TResult = js.native
  def foldr[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: TResult,
    context: Any
  ): TResult = js.native
  def foldr[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: Unit,
    context: Any
  ): TResult = js.native
  
  def forEach(iterator: ListIterator[TModel, Unit, typingsJapgolly.underscore.mod.List[TModel]]): js.Array[TModel] = js.native
  def forEach(iterator: ListIterator[TModel, Unit, typingsJapgolly.underscore.mod.List[TModel]], context: Any): js.Array[TModel] = js.native
  
  def get(id: String): TModel = js.native
  /**
    * Get a model from a collection, specified by an id, a cid, or by passing in a model.
    */
  def get(id: Double): TModel = js.native
  def get(id: Model[Any, ModelSetOptions, Any]): TModel = js.native
  
  def groupBy(iterator: String): Dictionary[js.Array[TModel]] = js.native
  def groupBy(iterator: String, context: Any): Dictionary[js.Array[TModel]] = js.native
  def groupBy(iterator: ListIterator[TModel, Any, typingsJapgolly.underscore.mod.List[TModel]]): Dictionary[js.Array[TModel]] = js.native
  def groupBy(iterator: ListIterator[TModel, Any, typingsJapgolly.underscore.mod.List[TModel]], context: Any): Dictionary[js.Array[TModel]] = js.native
  
  def has(key: String): Boolean = js.native
  def has(key: Double): Boolean = js.native
  def has(key: Model[Any, ModelSetOptions, Any]): Boolean = js.native
  
  def head(): TModel = js.native
  def head(n: Double): js.Array[TModel] = js.native
  
  def include(value: TModel): Boolean = js.native
  
  def includes(value: TModel): Boolean = js.native
  
  def indexBy(iterator: String): Dictionary[TModel] = js.native
  def indexBy(iterator: String, context: Any): Dictionary[TModel] = js.native
  def indexBy(iterator: ListIterator[TModel, Any, typingsJapgolly.underscore.mod.List[TModel]]): Dictionary[TModel] = js.native
  def indexBy(iterator: ListIterator[TModel, Any, typingsJapgolly.underscore.mod.List[TModel]], context: Any): Dictionary[TModel] = js.native
  
  def indexOf(value: TModel): Double = js.native
  def indexOf(value: TModel, isSorted: Boolean): Double = js.native
  
  def initial(): TModel = js.native
  def initial(n: Double): js.Array[TModel] = js.native
  
  def initialize(): Unit = js.native
  def initialize(models: js.Array[(Record[String, Any]) | TModel]): Unit = js.native
  def initialize(models: js.Array[(Record[String, Any]) | TModel], options: Any): Unit = js.native
  def initialize(models: Unit, options: Any): Unit = js.native
  
  def inject[TResult](iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]]): TResult = js.native
  def inject[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: TResult
  ): TResult = js.native
  def inject[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: TResult,
    context: Any
  ): TResult = js.native
  def inject[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: Unit,
    context: Any
  ): TResult = js.native
  
  def invoke(methodName: String, args: Any*): Any = js.native
  
  def isEmpty(): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[TModel]] = js.native
  
  def keys(): js.Iterator[Any] = js.native
  
  def last(): TModel = js.native
  def last(n: Double): js.Array[TModel] = js.native
  
  def lastIndexOf(value: TModel): Double = js.native
  def lastIndexOf(value: TModel, from: Double): Double = js.native
  
  var length: Double = js.native
  
  def map[TResult](iterator: ListIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]]): js.Array[TResult] = js.native
  def map[TResult](iterator: ListIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]], context: Any): js.Array[TResult] = js.native
  
  def max(): TModel = js.native
  def max(iterator: Unit, context: Any): TModel = js.native
  def max(iterator: ListIterator[TModel, Any, typingsJapgolly.underscore.mod.List[TModel]]): TModel = js.native
  def max(iterator: ListIterator[TModel, Any, typingsJapgolly.underscore.mod.List[TModel]], context: Any): TModel = js.native
  
  def min(): TModel = js.native
  def min(iterator: Unit, context: Any): TModel = js.native
  def min(iterator: ListIterator[TModel, Any, typingsJapgolly.underscore.mod.List[TModel]]): TModel = js.native
  def min(iterator: ListIterator[TModel, Any, typingsJapgolly.underscore.mod.List[TModel]], context: Any): TModel = js.native
  
  var model: Instantiable1[/* args (repeated) */ Any, TModel] = js.native
  
  def modelId(attrs: Any): Any = js.native
  
  var models: js.Array[TModel] = js.native
  
  def partition(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): js.Array[js.Array[TModel]] = js.native
  
  def pluck(attribute: String): js.Array[Any] = js.native
  
  def pop(): TModel = js.native
  def pop(options: Silenceable): TModel = js.native
  
  /**
    * For use with collections as ES classes. If you define a preinitialize
    * method, it will be invoked when the Collection is first created and
    * before any instantiation logic is run for the Collection.
    * @see https://backbonejs.org/#Collection-preinitialize
    */
  def preinitialize(): Unit = js.native
  def preinitialize(models: js.Array[(Record[String, Any]) | TModel]): Unit = js.native
  def preinitialize(models: js.Array[(Record[String, Any]) | TModel], options: Any): Unit = js.native
  def preinitialize(models: Unit, options: Any): Unit = js.native
  
  def push(model: TModel): TModel = js.native
  def push(model: TModel, options: AddOptions): TModel = js.native
  
  def reduce[TResult](iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]]): TResult = js.native
  def reduce[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: TResult
  ): TResult = js.native
  def reduce[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: TResult,
    context: Any
  ): TResult = js.native
  def reduce[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: Unit,
    context: Any
  ): TResult = js.native
  
  def reduceRight[TResult](iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]]): TResult = js.native
  def reduceRight[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: TResult
  ): TResult = js.native
  def reduceRight[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: TResult,
    context: Any
  ): TResult = js.native
  def reduceRight[TResult](
    iterator: MemoIterator[TModel, TResult, typingsJapgolly.underscore.mod.List[TModel]],
    memo: Unit,
    context: Any
  ): TResult = js.native
  
  def reject(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): js.Array[TModel] = js.native
  def reject(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]], context: Any): js.Array[TModel] = js.native
  
  def remove(model: TModel): TModel = js.native
  def remove(model: TModel, options: Silenceable): TModel = js.native
  def remove(model: js.Object): TModel = js.native
  def remove(model: js.Object, options: Silenceable): TModel = js.native
  def remove(models: js.Array[js.Object | TModel]): js.Array[TModel] = js.native
  def remove(models: js.Array[js.Object | TModel], options: Silenceable): js.Array[TModel] = js.native
  
  def reset(): js.Array[TModel] = js.native
  def reset(models: js.Array[js.Object | TModel]): js.Array[TModel] = js.native
  def reset(models: js.Array[js.Object | TModel], options: Silenceable): js.Array[TModel] = js.native
  def reset(models: Unit, options: Silenceable): js.Array[TModel] = js.native
  
  def rest(): js.Array[TModel] = js.native
  def rest(n: Double): js.Array[TModel] = js.native
  
  def sample(): TModel = js.native
  def sample(n: Double): js.Array[TModel] = js.native
  
  def select(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): js.Array[TModel] = js.native
  def select(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]], context: Any): js.Array[TModel] = js.native
  
  /**
    *
    * The set method performs a "smart" update of the collection with the passed list of models.
    * If a model in the list isn't yet in the collection it will be added; if the model is already in the
    * collection its attributes will be merged; and if the collection contains any models that aren't present
    * in the list, they'll be removed. All of the appropriate "add", "remove", and "change" events are fired as
    * this happens. Returns the touched models in the collection. If you'd like to customize the behavior, you can
    * disable it with options: {add: false}, {remove: false}, or {merge: false}.
    * @param models
    * @param options
    */
  def set(): js.Array[TModel] = js.native
  def set(models: js.Array[js.Object | TModel]): js.Array[TModel] = js.native
  def set(models: js.Array[js.Object | TModel], options: CollectionSetOptions): js.Array[TModel] = js.native
  def set(models: Unit, options: CollectionSetOptions): js.Array[TModel] = js.native
  
  def shift(): TModel = js.native
  def shift(options: Silenceable): TModel = js.native
  
  def shuffle(): js.Array[TModel] = js.native
  
  def size(): Double = js.native
  
  /**
    * Return a shallow copy of this collection's models, using the same options as native Array#slice.
    */
  def slice(): js.Array[TModel] = js.native
  def slice(min: Double): js.Array[TModel] = js.native
  def slice(min: Double, max: Double): js.Array[TModel] = js.native
  def slice(min: Unit, max: Double): js.Array[TModel] = js.native
  
  def some(): Boolean = js.native
  def some(iterator: Unit, context: Any): Boolean = js.native
  def some(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]]): Boolean = js.native
  def some(iterator: ListIterator[TModel, Boolean, typingsJapgolly.underscore.mod.List[TModel]], context: Any): Boolean = js.native
  
  def sort(): this.type = js.native
  def sort(options: Silenceable): this.type = js.native
  
  def sortBy(): js.Array[TModel] = js.native
  def sortBy(iterator: String): js.Array[TModel] = js.native
  def sortBy(iterator: String, context: Any): js.Array[TModel] = js.native
  def sortBy(iterator: Unit, context: Any): js.Array[TModel] = js.native
  def sortBy(iterator: ListIterator[TModel, Any, typingsJapgolly.underscore.mod.List[TModel]]): js.Array[TModel] = js.native
  def sortBy(iterator: ListIterator[TModel, Any, typingsJapgolly.underscore.mod.List[TModel]], context: Any): js.Array[TModel] = js.native
  
  def tail(): js.Array[TModel] = js.native
  def tail(n: Double): js.Array[TModel] = js.native
  
  def take(): TModel = js.native
  def take(n: Double): js.Array[TModel] = js.native
  
  def toArray(): js.Array[TModel] = js.native
  
  def unshift(model: TModel): TModel = js.native
  def unshift(model: TModel, options: AddOptions): TModel = js.native
  
  /**
    * Sets the url property (or function) on a collection to reference its location on the server.
    */
  var url: Result[String] = js.native
  
  def values(): js.Iterator[TModel] = js.native
  
  def where(properties: Any): js.Array[TModel] = js.native
  
  def without(values: TModel*): js.Array[TModel] = js.native
}
object Collection {
  
  @JSImport("backbone", "Collection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Do not use, prefer TypeScript's extend functionality.
    */
  /* static member */
  inline def extend(properties: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def extend(properties: Any, classProperties: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
}
