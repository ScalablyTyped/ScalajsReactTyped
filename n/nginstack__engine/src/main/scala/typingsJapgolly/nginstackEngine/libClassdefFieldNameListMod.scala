package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefFieldNameListMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/FieldNameList", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FieldNameList {
    
    /* private */ /* CompleteClass */
    var _items: Any = js.native
    
    /* private */ /* CompleteClass */
    var _nameToFieldId: Any = js.native
    
    /* CompleteClass */
    override def add(fieldName: String): Unit = js.native
    
    /* CompleteClass */
    override def assign(fieldNameList: FieldNameList): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def getCount(): Any = js.native
    
    /* private */ /* CompleteClass */
    var init_ : Any = js.native
    
    /* CompleteClass */
    override def map(func: js.Function2[/* arg0 */ String, /* repeated */ Any, Unit], args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def remove(fieldName: String): Unit = js.native
    
    /* CompleteClass */
    override def toArray(): js.Array[Any] = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/FieldNameList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldNameList extends StObject {
    
    /* private */ var _items: Any
    
    /* private */ var _nameToFieldId: Any
    
    def add(fieldName: String): Unit
    
    def assign(fieldNameList: FieldNameList): Unit
    
    def clear(): Unit
    
    def getCount(): Any
    
    /* private */ var init_ : Any
    
    def map(func: js.Function2[/* arg0 */ String, /* repeated */ Any, Unit], args: Any*): Unit
    
    def remove(fieldName: String): Unit
    
    def toArray(): js.Array[Any]
  }
  object FieldNameList {
    
    inline def apply(
      _items: Any,
      _nameToFieldId: Any,
      add: String => Callback,
      assign: FieldNameList => Callback,
      clear: Callback,
      getCount: CallbackTo[Any],
      init_ : Any,
      map: (js.Function2[/* arg0 */ String, /* repeated */ Any, Unit], /* repeated */ Any) => Callback,
      remove: String => Callback,
      toArray: CallbackTo[js.Array[Any]]
    ): FieldNameList = {
      val __obj = js.Dynamic.literal(_items = _items.asInstanceOf[js.Any], _nameToFieldId = _nameToFieldId.asInstanceOf[js.Any], add = js.Any.fromFunction1((t0: String) => add(t0).runNow()), assign = js.Any.fromFunction1((t0: FieldNameList) => assign(t0).runNow()), clear = clear.toJsFn, getCount = getCount.toJsFn, init_ = init_.asInstanceOf[js.Any], map = js.Any.fromFunction2((t0: js.Function2[/* arg0 */ String, /* repeated */ Any, Unit], t1: /* repeated */ Any) => (map(t0, t1)).runNow()), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), toArray = toArray.toJsFn)
      __obj.asInstanceOf[FieldNameList]
    }
    
    extension [Self <: FieldNameList](x: Self) {
      
      inline def setAdd(value: String => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAssign(value: FieldNameList => Callback): Self = StObject.set(x, "assign", js.Any.fromFunction1((t0: FieldNameList) => value(t0).runNow()))
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setGetCount(value: CallbackTo[Any]): Self = StObject.set(x, "getCount", value.toJsFn)
      
      inline def setInit_(value: Any): Self = StObject.set(x, "init_", value.asInstanceOf[js.Any])
      
      inline def setMap(value: (js.Function2[/* arg0 */ String, /* repeated */ Any, Unit], /* repeated */ Any) => Callback): Self = StObject.set(x, "map", js.Any.fromFunction2((t0: js.Function2[/* arg0 */ String, /* repeated */ Any, Unit], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setToArray(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "toArray", value.toJsFn)
      
      inline def set_items(value: Any): Self = StObject.set(x, "_items", value.asInstanceOf[js.Any])
      
      inline def set_nameToFieldId(value: Any): Self = StObject.set(x, "_nameToFieldId", value.asInstanceOf[js.Any])
    }
  }
}
