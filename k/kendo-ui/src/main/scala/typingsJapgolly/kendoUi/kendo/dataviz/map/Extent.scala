package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extent
  extends StObject
     with Class {
  
  def center(): Location
  
  def contains(location: Location): Boolean
  
  def containsAny(locations: Any): Boolean
  
  def edges(): Any
  
  def include(location: Location): Unit
  
  def includeAll(locations: Any): Unit
  
  var nw: Location
  
  var options: ExtentOptions
  
  def overlaps(extent: Extent): Boolean
  
  var se: Location
  
  def toArray(): Any
}
object Extent {
  
  inline def apply(
    center: CallbackTo[Location],
    contains: Location => Boolean,
    containsAny: Any => Boolean,
    edges: CallbackTo[Any],
    include: Location => Callback,
    includeAll: Any => Callback,
    nw: Location,
    options: ExtentOptions,
    overlaps: Extent => Boolean,
    se: Location,
    toArray: CallbackTo[Any]
  ): Extent = {
    val __obj = js.Dynamic.literal(center = center.toJsFn, contains = js.Any.fromFunction1(contains), containsAny = js.Any.fromFunction1(containsAny), edges = edges.toJsFn, include = js.Any.fromFunction1((t0: Location) => include(t0).runNow()), includeAll = js.Any.fromFunction1((t0: Any) => includeAll(t0).runNow()), nw = nw.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], overlaps = js.Any.fromFunction1(overlaps), se = se.asInstanceOf[js.Any], toArray = toArray.toJsFn)
    __obj.asInstanceOf[Extent]
  }
  
  extension [Self <: Extent](x: Self) {
    
    inline def setCenter(value: CallbackTo[Location]): Self = StObject.set(x, "center", value.toJsFn)
    
    inline def setContains(value: Location => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setContainsAny(value: Any => Boolean): Self = StObject.set(x, "containsAny", js.Any.fromFunction1(value))
    
    inline def setEdges(value: CallbackTo[Any]): Self = StObject.set(x, "edges", value.toJsFn)
    
    inline def setInclude(value: Location => Callback): Self = StObject.set(x, "include", js.Any.fromFunction1((t0: Location) => value(t0).runNow()))
    
    inline def setIncludeAll(value: Any => Callback): Self = StObject.set(x, "includeAll", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setNw(value: Location): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ExtentOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOverlaps(value: Extent => Boolean): Self = StObject.set(x, "overlaps", js.Any.fromFunction1(value))
    
    inline def setSe(value: Location): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
    
    inline def setToArray(value: CallbackTo[Any]): Self = StObject.set(x, "toArray", value.toJsFn)
  }
}
