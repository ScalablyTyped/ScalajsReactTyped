package typingsJapgolly.sortablejs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.sortablejs.mod.Sortable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Get extends StObject {
    
    def get(sortable: Sortable): js.Array[String]
    
    def set(sortable: Sortable): Unit
  }
  object Get {
    
    inline def apply(get: Sortable => js.Array[String], set: Sortable => Callback): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1((t0: Sortable) => set(t0).runNow()))
      __obj.asInstanceOf[Get]
    }
    
    extension [Self <: Get](x: Self) {
      
      inline def setGet(value: Sortable => js.Array[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: Sortable => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Sortable) => value(t0).runNow()))
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var multiDragElement: HTMLElement
  }
  object Index {
    
    inline def apply(index: Double, multiDragElement: HTMLElement): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], multiDragElement = multiDragElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMultiDragElement(value: HTMLElement): Self = StObject.set(x, "multiDragElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
