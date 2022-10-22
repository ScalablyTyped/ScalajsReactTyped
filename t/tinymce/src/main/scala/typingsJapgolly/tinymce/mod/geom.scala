package typingsJapgolly.tinymce.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geom {
  
  trait Rect extends StObject {
    
    def clamp(rect: Rect, clampRect: Rect, fixedSize: Boolean): Rect
    
    def create(x: Double, y: Double, w: Double, h: Double): Rect
    
    def findBestRelativePosition(rect: Rect, targetRect: Rect, constrainRect: Rect, rels: js.Array[Any]): Unit
    
    def fromClientRect(clientRect: ClientRect): Rect
    
    def inflate(rect: Rect, w: Double, h: Double): Rect
    
    def intersect(rect: Rect, cropRect: Rect): Rect
    
    def relativePosition(rect: Rect, targetRect: Rect, rel: String): Unit
  }
  object Rect {
    
    inline def apply(
      clamp: (Rect, Rect, Boolean) => Rect,
      create: (Double, Double, Double, Double) => Rect,
      findBestRelativePosition: (Rect, Rect, Rect, js.Array[Any]) => Callback,
      fromClientRect: ClientRect => Rect,
      inflate: (Rect, Double, Double) => Rect,
      intersect: (Rect, Rect) => Rect,
      relativePosition: (Rect, Rect, String) => Callback
    ): Rect = {
      val __obj = js.Dynamic.literal(clamp = js.Any.fromFunction3(clamp), create = js.Any.fromFunction4(create), findBestRelativePosition = js.Any.fromFunction4((t0: Rect, t1: Rect, t2: Rect, t3: js.Array[Any]) => (findBestRelativePosition(t0, t1, t2, t3)).runNow()), fromClientRect = js.Any.fromFunction1(fromClientRect), inflate = js.Any.fromFunction3(inflate), intersect = js.Any.fromFunction2(intersect), relativePosition = js.Any.fromFunction3((t0: Rect, t1: Rect, t2: String) => (relativePosition(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setClamp(value: (Rect, Rect, Boolean) => Rect): Self = StObject.set(x, "clamp", js.Any.fromFunction3(value))
      
      inline def setCreate(value: (Double, Double, Double, Double) => Rect): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
      
      inline def setFindBestRelativePosition(value: (Rect, Rect, Rect, js.Array[Any]) => Callback): Self = StObject.set(x, "findBestRelativePosition", js.Any.fromFunction4((t0: Rect, t1: Rect, t2: Rect, t3: js.Array[Any]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setFromClientRect(value: ClientRect => Rect): Self = StObject.set(x, "fromClientRect", js.Any.fromFunction1(value))
      
      inline def setInflate(value: (Rect, Double, Double) => Rect): Self = StObject.set(x, "inflate", js.Any.fromFunction3(value))
      
      inline def setIntersect(value: (Rect, Rect) => Rect): Self = StObject.set(x, "intersect", js.Any.fromFunction2(value))
      
      inline def setRelativePosition(value: (Rect, Rect, String) => Callback): Self = StObject.set(x, "relativePosition", js.Any.fromFunction3((t0: Rect, t1: Rect, t2: String) => (value(t0, t1, t2)).runNow()))
    }
  }
}
