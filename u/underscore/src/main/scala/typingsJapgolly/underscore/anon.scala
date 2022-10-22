package typingsJapgolly.underscore

import typingsJapgolly.underscore.mod.Chain
import typingsJapgolly.underscore.mod.ChainSingle
import typingsJapgolly.underscore.mod.Collection
import typingsJapgolly.underscore.mod.CollectionIterator
import typingsJapgolly.underscore.mod.Iteratee
import typingsJapgolly.underscore.mod.IterateeResult
import typingsJapgolly.underscore.mod.MemoCollectionIterator
import typingsJapgolly.underscore.mod.TypeOfCollection
import typingsJapgolly.underscore.mod.TypeOfList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0[V] extends StObject {
    
    def apply[TResult](
      iteratee: MemoCollectionIterator[
          TypeOfCollection[V, scala.Nothing], 
          TResult | (TypeOfCollection[V, scala.Nothing]), 
          V
        ]
    ): ChainSingle[js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])]] = js.native
    def apply[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
    def apply[TResult](
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
    ): ChainSingle[TResult] = js.native
  }
  
  @js.native
  trait Fn1[T] extends StObject {
    
    def apply(): ChainSingle[js.UndefOr[T]] = js.native
    def apply(n: Double): Chain[T, js.Array[T]] = js.native
  }
  
  @js.native
  trait FnCall[T, V] extends StObject {
    
    def apply(): js.Array[IterateeResult[Null, T]] = js.native
    def apply(iteratee: String): js.Array[IterateeResult[String, T]] = js.native
    def apply(iteratee: String, context: Any): js.Array[IterateeResult[String, T]] = js.native
    def apply(iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
    def apply(iteratee: js.Array[String | Double], context: Any): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
    def apply(iteratee: Double): js.Array[IterateeResult[Double, T]] = js.native
    def apply(iteratee: Double, context: Any): js.Array[IterateeResult[Double, T]] = js.native
    def apply(iteratee: Null, context: Any): js.Array[IterateeResult[Null, T]] = js.native
    def apply(iteratee: Unit, context: Any): js.Array[IterateeResult[Unit, T]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]} */ js.Any) */](iteratee: I): js.Array[IterateeResult[I, T]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]} */ js.Any) */](iteratee: I, context: Any): js.Array[IterateeResult[I, T]] = js.native
  }
  
  @js.native
  trait FnCallCollectionIterateeContext extends StObject {
    
    def apply[V /* <: Collection[Any] */](collection: V): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[Any] */](collection: V, iteratee: String): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[Any] */](collection: V, iteratee: String, context: Any): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[Any] */](collection: V, iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[Any] */](collection: V, iteratee: js.Array[String | Double], context: Any): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[Any] */](collection: V, iteratee: Double): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[Any] */](collection: V, iteratee: Double, context: Any): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[Any] */](collection: V, iteratee: Null, context: Any): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): js.Array[IterateeResult[Unit, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[Any] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]} */ js.Any) */](collection: V, iteratee: I): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[Any] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]} */ js.Any) */](collection: V, iteratee: I, context: Any): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
  }
  
  @js.native
  trait FnCallCollectionIterateeMemoContext extends StObject {
    
    def apply[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[
          TypeOfCollection[V, scala.Nothing], 
          TResult | (TypeOfCollection[V, scala.Nothing]), 
          V
        ]
    ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
    def apply[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult
    ): TResult = js.native
    def apply[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
    ): TResult = js.native
  }
  
  @js.native
  trait FnCallIsSortedIterateeContext[V, T] extends StObject {
    
    def apply(): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Boolean): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Boolean, iteratee: Unit, context: Any): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Unit, iteratee: Any | (Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]])): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Unit, iteratee: Unit, context: Any): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Unit, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    def apply(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def apply(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
  }
  
  @js.native
  trait FnCallIsSortedIterateeCotext[V, T] extends StObject {
    
    def apply(): js.Array[T] = js.native
    def apply(isSorted: Boolean): js.Array[T] = js.native
    def apply(isSorted: Boolean, iteratee: Unit, cotext: Any): js.Array[T] = js.native
    def apply(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def apply(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], cotext: Any): js.Array[T] = js.native
    def apply(isSorted: Unit, iteratee: Any | (Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]])): js.Array[T] = js.native
    def apply(isSorted: Unit, iteratee: Unit, cotext: Any): js.Array[T] = js.native
    def apply(isSorted: Unit, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], cotext: Any): js.Array[T] = js.native
    def apply(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def apply(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallIterateeContext[T, V] extends StObject {
    
    def apply(): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
    def apply(iteratee: String): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
    def apply(iteratee: String, context: Any): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
    def apply(iteratee: js.Array[String | Double]): Chain[
        IterateeResult[js.Array[String | Double], T], 
        js.Array[IterateeResult[js.Array[String | Double], T]]
      ] = js.native
    def apply(iteratee: js.Array[String | Double], context: Any): Chain[
        IterateeResult[js.Array[String | Double], T], 
        js.Array[IterateeResult[js.Array[String | Double], T]]
      ] = js.native
    def apply(iteratee: Double): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
    def apply(iteratee: Double, context: Any): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
    def apply(iteratee: Null, context: Any): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
    def apply(iteratee: Unit, context: Any): Chain[IterateeResult[Unit, T], js.Array[IterateeResult[Unit, T]]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]} */ js.Any) */](iteratee: I): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]} */ js.Any) */](iteratee: I, context: Any): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
  }
  
  @js.native
  trait FnCallIterateeMemoContext[V] extends StObject {
    
    def apply[TResult](
      iteratee: MemoCollectionIterator[
          TypeOfCollection[V, scala.Nothing], 
          TResult | (TypeOfCollection[V, scala.Nothing]), 
          V
        ]
    ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
    def apply[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): TResult = js.native
    def apply[TResult](
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
    ): TResult = js.native
  }
  
  @js.native
  trait FnCallListIsSortedIterateeContext extends StObject {
    
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](list: V): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](list: V, isSorted: Boolean): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](list: V, isSorted: Boolean, iteratee: Unit, context: Any): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](list: V, isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](
      list: V,
      isSorted: Boolean,
      iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]],
      context: Any
    ): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](list: V, isSorted: Unit, iteratee: Any | (Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]])): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](list: V, isSorted: Unit, iteratee: Unit, context: Any): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](
      list: V,
      isSorted: Unit,
      iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]],
      context: Any
    ): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](list: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](list: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[TypeOfList[V]] = js.native
  }
  
  @js.native
  trait FnCallListN extends StObject {
    
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
    def apply[V /* <: typingsJapgolly.underscore.mod.List[Any] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
  }
  
  @js.native
  trait FnCallN[T] extends StObject {
    
    def apply(): js.UndefOr[T] = js.native
    def apply(n: Double): js.Array[T] = js.native
  }
}
