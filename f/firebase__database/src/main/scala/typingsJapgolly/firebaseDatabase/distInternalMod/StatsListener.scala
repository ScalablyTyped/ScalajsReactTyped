package typingsJapgolly.firebaseDatabase.distInternalMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns the delta from the previous call to get stats.
  *
  * @param collection_ - The collection to "listen" to.
  */
trait StatsListener extends StObject {
  
  /* private */ var collection_ : Any
  
  def get(): StringDictionary[Double]
  
  /* private */ var last_ : Any
}
object StatsListener {
  
  inline def apply(collection_ : Any, get: CallbackTo[StringDictionary[Double]], last_ : Any): StatsListener = {
    val __obj = js.Dynamic.literal(collection_ = collection_.asInstanceOf[js.Any], get = get.toJsFn, last_ = last_.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsListener]
  }
  
  extension [Self <: StatsListener](x: Self) {
    
    inline def setCollection_(value: Any): Self = StObject.set(x, "collection_", value.asInstanceOf[js.Any])
    
    inline def setGet(value: CallbackTo[StringDictionary[Double]]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setLast_(value: Any): Self = StObject.set(x, "last_", value.asInstanceOf[js.Any])
  }
}
