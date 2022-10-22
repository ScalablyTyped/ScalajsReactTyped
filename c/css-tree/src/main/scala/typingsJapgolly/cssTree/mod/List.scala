package typingsJapgolly.cssTree.mod

import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-tree", "List")
@js.native
open class List[TData] () extends StObject {
  
  def append(item: ListItem[TData]): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def appendData(data: TData): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def appendList(list: typingsJapgolly.cssTree.mod.List[TData]): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def clear(): Unit = js.native
  
  def copy(): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def createItem(data: TData): ListItem[TData] = js.native
  
  def filter(fn: IteratorFn[TData, Boolean, typingsJapgolly.cssTree.mod.List[TData]]): typingsJapgolly.cssTree.mod.List[TData] = js.native
  def filter[TContext](fn: IteratorFn[TData, Boolean, TContext], context: TContext): typingsJapgolly.cssTree.mod.List[TData] = js.native
  @JSName("filter")
  def filter_TContextTResult[TContext, TResult /* <: TData */](fn: FilterFn[TData, TResult, TContext], context: TContext): typingsJapgolly.cssTree.mod.List[TResult] = js.native
  @JSName("filter")
  def filter_TResult[TResult /* <: TData */](fn: FilterFn[TData, TResult, typingsJapgolly.cssTree.mod.List[TData]]): typingsJapgolly.cssTree.mod.List[TResult] = js.native
  
  def first: TData | Null = js.native
  
  def forEach(fn: IteratorFn[TData, Unit, typingsJapgolly.cssTree.mod.List[TData]]): Unit = js.native
  def forEach[TContext](fn: IteratorFn[TData, Unit, TContext], context: TContext): Unit = js.native
  
  def forEachRight(fn: IteratorFn[TData, Unit, typingsJapgolly.cssTree.mod.List[TData]]): Unit = js.native
  def forEachRight[TContext](fn: IteratorFn[TData, Unit, TContext], context: TContext): Unit = js.native
  
  def fromArray(array: js.Array[TData]): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def insert(item: ListItem[TData], before: ListItem[TData]): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def insertData(data: TData, before: ListItem[TData]): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def insertList(list: typingsJapgolly.cssTree.mod.List[TData], before: ListItem[TData]): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def isEmpty: Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[TData]] = js.native
  
  def last: TData | Null = js.native
  
  def map[TResult](fn: IteratorFn[TData, TResult, typingsJapgolly.cssTree.mod.List[TData]]): typingsJapgolly.cssTree.mod.List[TResult] = js.native
  def map[TContext, TResult](fn: IteratorFn[TData, TResult, TContext], context: TContext): typingsJapgolly.cssTree.mod.List[TResult] = js.native
  
  def nextUntil(start: ListItem[TData], fn: IteratorFn[TData, Boolean, typingsJapgolly.cssTree.mod.List[TData]]): Unit = js.native
  def nextUntil[TContext](start: ListItem[TData], fn: IteratorFn[TData, Boolean, TContext], context: TContext): Unit = js.native
  
  def pop(): js.UndefOr[ListItem[TData]] = js.native
  
  def prepend(item: ListItem[TData]): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def prependData(data: TData): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def prependList(list: typingsJapgolly.cssTree.mod.List[TData]): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def prevUntil(start: ListItem[TData], fn: IteratorFn[TData, Boolean, typingsJapgolly.cssTree.mod.List[TData]]): Unit = js.native
  def prevUntil[TContext](start: ListItem[TData], fn: IteratorFn[TData, Boolean, TContext], context: TContext): Unit = js.native
  
  def push(item: TData): Unit = js.native
  
  def reduce[TValue](fn: ReduceFn[TData, TValue, typingsJapgolly.cssTree.mod.List[TData]], initialValue: TValue): TValue = js.native
  def reduce[TValue, TContext](fn: ReduceFn[TData, TValue, TContext], initialValue: TValue, context: TContext): TValue = js.native
  
  def reduceRight[TValue](fn: ReduceFn[TData, TValue, typingsJapgolly.cssTree.mod.List[TData]], initialValue: TValue): TValue = js.native
  def reduceRight[TValue, TContext](fn: ReduceFn[TData, TValue, TContext], initialValue: TValue, context: TContext): TValue = js.native
  
  def remove(item: ListItem[TData]): ListItem[TData] = js.native
  
  def replace(oldItem: ListItem[TData], newItemOrList: typingsJapgolly.cssTree.mod.List[TData]): typingsJapgolly.cssTree.mod.List[TData] = js.native
  def replace(oldItem: ListItem[TData], newItemOrList: ListItem[TData]): typingsJapgolly.cssTree.mod.List[TData] = js.native
  
  def shift(): js.UndefOr[ListItem[TData]] = js.native
  
  def size: Double = js.native
  
  def some(fn: IteratorFn[TData, Boolean, typingsJapgolly.cssTree.mod.List[TData]]): Boolean = js.native
  def some[TContext](fn: IteratorFn[TData, Boolean, TContext], context: TContext): Boolean = js.native
  
  def toArray(): js.Array[TData] = js.native
  
  def toJSON(): js.Array[TData] = js.native
  
  def unshift(data: TData): Unit = js.native
}
