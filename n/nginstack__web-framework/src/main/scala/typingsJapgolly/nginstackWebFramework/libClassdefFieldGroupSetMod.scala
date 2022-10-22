package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefFieldGroupSetMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/FieldGroupSet", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FieldGroupSet {
    
    /* private */ /* CompleteClass */
    var _find: Any = js.native
    
    /* CompleteClass */
    override def add(fieldGroup: Any): Unit = js.native
    
    /* CompleteClass */
    override def assign(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def findByName(name: String): Any = js.native
    
    /* CompleteClass */
    var items: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/FieldGroupSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldGroupSet extends StObject {
    
    /* private */ var _find: Any
    
    def add(fieldGroup: Any): Unit
    
    def assign(obj: Any): Unit
    
    def findByName(name: String): Any
    
    var items: Any
  }
  object FieldGroupSet {
    
    inline def apply(_find: Any, add: Any => Callback, assign: Any => Callback, findByName: String => Any, items: Any): FieldGroupSet = {
      val __obj = js.Dynamic.literal(_find = _find.asInstanceOf[js.Any], add = js.Any.fromFunction1((t0: Any) => add(t0).runNow()), assign = js.Any.fromFunction1((t0: Any) => assign(t0).runNow()), findByName = js.Any.fromFunction1(findByName), items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldGroupSet]
    }
    
    extension [Self <: FieldGroupSet](x: Self) {
      
      inline def setAdd(value: Any => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setAssign(value: Any => Callback): Self = StObject.set(x, "assign", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setFindByName(value: String => Any): Self = StObject.set(x, "findByName", js.Any.fromFunction1(value))
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def set_find(value: Any): Self = StObject.set(x, "_find", value.asInstanceOf[js.Any])
    }
  }
}
