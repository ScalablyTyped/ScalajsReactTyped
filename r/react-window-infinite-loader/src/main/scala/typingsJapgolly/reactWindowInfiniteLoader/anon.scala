package typingsJapgolly.reactWindowInfiniteLoader

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactWindow.mod.ListOnItemsRenderedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OnItemsRendered extends StObject {
    
    var onItemsRendered: typingsJapgolly.reactWindowInfiniteLoader.mod.OnItemsRendered
    
    def ref(ref: Any): Unit
  }
  object OnItemsRendered {
    
    inline def apply(onItemsRendered: /* props */ ListOnItemsRenderedProps => Any, ref: Any => Callback): OnItemsRendered = {
      val __obj = js.Dynamic.literal(onItemsRendered = js.Any.fromFunction1(onItemsRendered), ref = js.Any.fromFunction1((t0: Any) => ref(t0).runNow()))
      __obj.asInstanceOf[OnItemsRendered]
    }
    
    extension [Self <: OnItemsRendered](x: Self) {
      
      inline def setOnItemsRendered(value: /* props */ ListOnItemsRenderedProps => Any): Self = StObject.set(x, "onItemsRendered", js.Any.fromFunction1(value))
      
      inline def setRef(value: Any => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
