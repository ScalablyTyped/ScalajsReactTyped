package typingsJapgolly.lodash

import typingsJapgolly.lodash.mod.ArrayIterator
import typingsJapgolly.lodash.mod.Collection
import typingsJapgolly.lodash.mod.ListIterator
import typingsJapgolly.lodash.mod.MapCacheConstructor
import typingsJapgolly.lodash.mod.MemoizedFunction
import typingsJapgolly.lodash.mod.ObjectIterator
import typingsJapgolly.lodash.mod.Primitive
import typingsJapgolly.lodash.mod.StringIterator
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply[T /* <: js.Function1[/* args */ Any, Any] */](func: T): T & MemoizedFunction = js.native
    def apply[T /* <: js.Function1[/* args */ Any, Any] */](func: T, resolver: js.Function1[/* args */ Parameters[T], Any]): T & MemoizedFunction = js.native
    
    var Cache: MapCacheConstructor = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(collection: String): String = js.native
    def apply(collection: String, iteratee: StringIterator[Any]): String = js.native
    def apply[T /* <: js.Object */](): js.UndefOr[T | Null] = js.native
    def apply[T /* <: js.Object */](collection: T): js.UndefOr[T | Null] = js.native
    def apply[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, Any]): js.UndefOr[T | Null] = js.native
    def apply[T](collection: js.Array[T]): js.Array[T] = js.native
    def apply[T](collection: js.Array[T], iteratee: ArrayIterator[T, Any]): js.Array[T] = js.native
    def apply[T /* <: js.Object */](collection: Null, iteratee: ObjectIterator[T, Any]): js.UndefOr[T | Null] = js.native
    def apply[T /* <: js.Object */](collection: Unit, iteratee: ObjectIterator[T, Any]): js.UndefOr[T | Null] = js.native
    def apply[T](collection: typingsJapgolly.lodash.mod.List[T]): typingsJapgolly.lodash.mod.List[T] = js.native
    def apply[T](collection: typingsJapgolly.lodash.mod.List[T], iteratee: ListIterator[T, Any]): typingsJapgolly.lodash.mod.List[T] = js.native
    def apply[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: Unit & TArray): TArray = js.native
    def apply[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: Null & TArray): TArray = js.native
  }
  
  trait Length extends StObject {
    
    var length: Double
  }
  object Length {
    
    inline def apply(length: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait LodashAnyHack extends StObject {
    
    var __lodashAnyHack: Any
  }
  object LodashAnyHack {
    
    inline def apply(__lodashAnyHack: Any): LodashAnyHack = {
      val __obj = js.Dynamic.literal(__lodashAnyHack = __lodashAnyHack.asInstanceOf[js.Any])
      __obj.asInstanceOf[LodashAnyHack]
    }
    
    extension [Self <: LodashAnyHack](x: Self) {
      
      inline def set__lodashAnyHack(value: Any): Self = StObject.set(x, "__lodashAnyHack", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrapAny extends StObject {
    
    var __trapAny: Any
  }
  object TrapAny {
    
    inline def apply(__trapAny: Any): TrapAny = {
      val __obj = js.Dynamic.literal(__trapAny = __trapAny.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrapAny]
    }
    
    extension [Self <: TrapAny](x: Self) {
      
      inline def set__trapAny(value: Any): Self = StObject.set(x, "__trapAny", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeoflodash extends StObject {
    
    def apply(): typingsJapgolly.lodash.mod.String = js.native
    def apply(value: String): typingsJapgolly.lodash.mod.String = js.native
    def apply[T /* <: js.UndefOr[Null] */](value: T): Primitive[T] = js.native
    def apply[T](value: typingsJapgolly.lodash.mod.List[T]): Collection[T] = js.native
  }
}
