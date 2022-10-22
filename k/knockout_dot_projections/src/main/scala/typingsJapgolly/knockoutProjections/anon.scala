package typingsJapgolly.knockoutProjections

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dispose[TResult] extends StObject {
    
    def dispose(): Unit
    
    var mappedValue: TResult
  }
  object Dispose {
    
    inline def apply[TResult](dispose: Callback, mappedValue: TResult): Dispose[TResult] = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, mappedValue = mappedValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispose[TResult]]
    }
    
    extension [Self <: Dispose[?], TResult](x: Self & Dispose[TResult]) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setMappedValue(value: TResult): Self = StObject.set(x, "mappedValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisposeItem[T, TResult] extends StObject {
    
    var disposeItem: js.UndefOr[js.Function1[/* mappedItem */ TResult, Unit]] = js.undefined
    
    def mapping(value: T): TResult
  }
  object DisposeItem {
    
    inline def apply[T, TResult](mapping: T => TResult): DisposeItem[T, TResult] = {
      val __obj = js.Dynamic.literal(mapping = js.Any.fromFunction1(mapping))
      __obj.asInstanceOf[DisposeItem[T, TResult]]
    }
    
    extension [Self <: DisposeItem[?, ?], T, TResult](x: Self & (DisposeItem[T, TResult])) {
      
      inline def setDisposeItem(value: /* mappedItem */ TResult => Callback): Self = StObject.set(x, "disposeItem", js.Any.fromFunction1((t0: /* mappedItem */ TResult) => value(t0).runNow()))
      
      inline def setDisposeItemUndefined: Self = StObject.set(x, "disposeItem", js.undefined)
      
      inline def setMapping(value: T => TResult): Self = StObject.set(x, "mapping", js.Any.fromFunction1(value))
    }
  }
  
  trait MappingWithDisposeCallback[T, TResult] extends StObject {
    
    def mappingWithDisposeCallback(value: T): Dispose[TResult]
  }
  object MappingWithDisposeCallback {
    
    inline def apply[T, TResult](mappingWithDisposeCallback: T => Dispose[TResult]): MappingWithDisposeCallback[T, TResult] = {
      val __obj = js.Dynamic.literal(mappingWithDisposeCallback = js.Any.fromFunction1(mappingWithDisposeCallback))
      __obj.asInstanceOf[MappingWithDisposeCallback[T, TResult]]
    }
    
    extension [Self <: MappingWithDisposeCallback[?, ?], T, TResult](x: Self & (MappingWithDisposeCallback[T, TResult])) {
      
      inline def setMappingWithDisposeCallback(value: T => Dispose[TResult]): Self = StObject.set(x, "mappingWithDisposeCallback", js.Any.fromFunction1(value))
    }
  }
}
