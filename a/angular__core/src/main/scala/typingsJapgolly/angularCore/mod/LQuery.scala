package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface that represents query-related information specific to a view instance. Most notably
  * it contains:
  * - materialized query matches;
  * - a pointer to a QueryList where materialized query results should be reported.
  */
trait LQuery[T] extends StObject {
  
  /**
    * Materialized query matches for a given view only (!). Results are initialized lazily so the
    * array of matches is set to `null` initially.
    */
  var matches: (js.Array[T | Null]) | Null
  
  /**
    * A QueryList where materialized query results should be reported.
    */
  var queryList: QueryList[T]
  
  /**
    * Called when an embedded view, impacting results of this query, is inserted or removed.
    */
  def setDirty(): Unit
}
object LQuery {
  
  inline def apply[T](queryList: QueryList[T], setDirty: Callback): LQuery[T] = {
    val __obj = js.Dynamic.literal(queryList = queryList.asInstanceOf[js.Any], setDirty = setDirty.toJsFn, matches = null)
    __obj.asInstanceOf[LQuery[T]]
  }
  
  extension [Self <: LQuery[?], T](x: Self & LQuery[T]) {
    
    inline def setMatches(value: js.Array[T | Null]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesNull: Self = StObject.set(x, "matches", null)
    
    inline def setMatchesVarargs(value: (T | Null)*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setQueryList(value: QueryList[T]): Self = StObject.set(x, "queryList", value.asInstanceOf[js.Any])
    
    inline def setSetDirty(value: Callback): Self = StObject.set(x, "setDirty", value.toJsFn)
  }
}
