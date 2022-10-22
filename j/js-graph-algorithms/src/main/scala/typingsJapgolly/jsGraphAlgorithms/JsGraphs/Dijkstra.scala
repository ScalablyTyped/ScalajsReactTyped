package typingsJapgolly.jsGraphAlgorithms.JsGraphs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dijkstra extends StObject {
  
  /* private */ var cost: Any
  
  def distanceTo(v: Double): Double
  
  /* private */ var edgeTo: Any
  
  def hasPathTo(v: Double): Boolean
  
  /* private */ var marked: Any
  
  def pathTo(v: Double): js.Array[Edge]
  
  /* private */ var pq: Any
  
  def relax(e: Edge): Unit
  
  /* private */ var s: Any
}
object Dijkstra {
  
  inline def apply(
    cost: Any,
    distanceTo: Double => Double,
    edgeTo: Any,
    hasPathTo: Double => Boolean,
    marked: Any,
    pathTo: Double => js.Array[Edge],
    pq: Any,
    relax: Edge => Callback,
    s: Any
  ): Dijkstra = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], distanceTo = js.Any.fromFunction1(distanceTo), edgeTo = edgeTo.asInstanceOf[js.Any], hasPathTo = js.Any.fromFunction1(hasPathTo), marked = marked.asInstanceOf[js.Any], pathTo = js.Any.fromFunction1(pathTo), pq = pq.asInstanceOf[js.Any], relax = js.Any.fromFunction1((t0: Edge) => relax(t0).runNow()), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dijkstra]
  }
  
  extension [Self <: Dijkstra](x: Self) {
    
    inline def setCost(value: Any): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setDistanceTo(value: Double => Double): Self = StObject.set(x, "distanceTo", js.Any.fromFunction1(value))
    
    inline def setEdgeTo(value: Any): Self = StObject.set(x, "edgeTo", value.asInstanceOf[js.Any])
    
    inline def setHasPathTo(value: Double => Boolean): Self = StObject.set(x, "hasPathTo", js.Any.fromFunction1(value))
    
    inline def setMarked(value: Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    inline def setPathTo(value: Double => js.Array[Edge]): Self = StObject.set(x, "pathTo", js.Any.fromFunction1(value))
    
    inline def setPq(value: Any): Self = StObject.set(x, "pq", value.asInstanceOf[js.Any])
    
    inline def setRelax(value: Edge => Callback): Self = StObject.set(x, "relax", js.Any.fromFunction1((t0: Edge) => value(t0).runNow()))
    
    inline def setS(value: Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
