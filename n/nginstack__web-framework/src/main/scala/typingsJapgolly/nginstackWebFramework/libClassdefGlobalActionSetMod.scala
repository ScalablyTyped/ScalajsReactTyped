package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefGlobalActionSetMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/GlobalActionSet", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GlobalActionSet {
    
    /* CompleteClass */
    override def add(action: Any): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def delete(name: String): Boolean = js.native
    
    /* CompleteClass */
    override def get(name: String): typingsJapgolly.nginstackWebFramework.libClassdefGlobalActionMod.^ = js.native
    
    /* CompleteClass */
    override def getAll(): js.Array[typingsJapgolly.nginstackWebFramework.libClassdefGlobalActionMod.^] = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var items_ : Any = js.native
    
    /* CompleteClass */
    var onShow: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^ = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/GlobalActionSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GlobalActionSet extends StObject {
    
    def add(action: Any): Unit
    
    def clear(): Unit
    
    def delete(name: String): Boolean
    
    def get(name: String): typingsJapgolly.nginstackWebFramework.libClassdefGlobalActionMod.^
    
    def getAll(): js.Array[typingsJapgolly.nginstackWebFramework.libClassdefGlobalActionMod.^]
    
    def isEmpty(): Boolean
    
    /* private */ var items_ : Any
    
    var onShow: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^
  }
  object GlobalActionSet {
    
    inline def apply(
      add: Any => Callback,
      clear: Callback,
      delete: String => Boolean,
      get: String => typingsJapgolly.nginstackWebFramework.libClassdefGlobalActionMod.^,
      getAll: CallbackTo[js.Array[typingsJapgolly.nginstackWebFramework.libClassdefGlobalActionMod.^]],
      isEmpty: CallbackTo[Boolean],
      items_ : Any,
      onShow: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^
    ): GlobalActionSet = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: Any) => add(t0).runNow()), clear = clear.toJsFn, delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAll = getAll.toJsFn, isEmpty = isEmpty.toJsFn, items_ = items_.asInstanceOf[js.Any], onShow = onShow.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalActionSet]
    }
    
    extension [Self <: GlobalActionSet](x: Self) {
      
      inline def setAdd(value: Any => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setDelete(value: String => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => typingsJapgolly.nginstackWebFramework.libClassdefGlobalActionMod.^): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetAll(value: CallbackTo[js.Array[typingsJapgolly.nginstackWebFramework.libClassdefGlobalActionMod.^]]): Self = StObject.set(x, "getAll", value.toJsFn)
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setItems_(value: Any): Self = StObject.set(x, "items_", value.asInstanceOf[js.Any])
      
      inline def setOnShow(value: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    }
  }
}
