package typingsJapgolly.reactNativeDraggableFlatlist.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.FlatList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref[T] extends StObject {
  
  var ref: typingsJapgolly.react.mod.Ref[FlatList[T]]
  
  var simultaneousHandlers: js.UndefOr[
    typingsJapgolly.react.mod.Ref[Any] | js.Array[typingsJapgolly.react.mod.Ref[Any]]
  ] = js.undefined
}
object Ref {
  
  inline def apply[T](): Ref[T] = {
    val __obj = js.Dynamic.literal(ref = null)
    __obj.asInstanceOf[Ref[T]]
  }
  
  extension [Self <: Ref[?], T](x: Self & Ref[T]) {
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[FlatList[T]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: FlatList[T] | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: FlatList[T] | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setSimultaneousHandlers(value: typingsJapgolly.react.mod.Ref[Any] | js.Array[typingsJapgolly.react.mod.Ref[Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersFunction1(value: Any | Null => Callback): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    inline def setSimultaneousHandlersVarargs(value: typingsJapgolly.react.mod.Ref[Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
  }
}
