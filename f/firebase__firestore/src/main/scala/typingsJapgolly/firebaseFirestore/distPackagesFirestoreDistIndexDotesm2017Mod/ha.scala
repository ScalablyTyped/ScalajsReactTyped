package typingsJapgolly.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The results of executing an aggregation query.
  */ trait ha extends StObject {
  
  var _data: Any
  
  /**
    * Returns the results of the aggregations performed over the underlying
    * query.
    *
    * The keys of the returned object will be the same as those of the
    * `AggregateSpec` object specified to the aggregation method, and the values
    * will be the corresponding aggregation result.
    *
    * @returns The results of the aggregations performed over the underlying
    * query.
    */ def data(): Any
  
  var query: Any
  
  /** A type string to uniquely identify instances of this class. */
  var `type`: String
}
object ha {
  
  inline def apply(_data: Any, data: CallbackTo[Any], query: Any, `type`: String): ha = {
    val __obj = js.Dynamic.literal(_data = _data.asInstanceOf[js.Any], data = data.toJsFn, query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ha]
  }
  
  extension [Self <: ha](x: Self) {
    
    inline def setData(value: CallbackTo[Any]): Self = StObject.set(x, "data", value.toJsFn)
    
    inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_data(value: Any): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
  }
}
