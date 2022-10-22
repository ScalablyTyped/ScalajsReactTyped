package typingsJapgolly.stripeV3.stripe

import typingsJapgolly.stripeV3.stripeV3Strings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List[T] extends StObject {
  
  /**
    * An array containing the actual response elements, paginated by any request parameters.
    */
  var data: js.Array[T]
  
  /**
    * Whether or not there are more elements available after this set. If false, this set comprises the end of the list.
    */
  var has_more: Boolean
  
  /**
    * Value is 'list'
    */
  var `object`: list
  
  /**
    * The URL for accessing this list.
    */
  var url: String
}
object List {
  
  inline def apply[T](data: js.Array[T], has_more: Boolean, url: String): typingsJapgolly.stripeV3.stripe.List[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("list")
    __obj.asInstanceOf[typingsJapgolly.stripeV3.stripe.List[T]]
  }
  
  extension [Self <: typingsJapgolly.stripeV3.stripe.List[?], T](x: Self & typingsJapgolly.stripeV3.stripe.List[T]) {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setHas_more(value: Boolean): Self = StObject.set(x, "has_more", value.asInstanceOf[js.Any])
    
    inline def setObject(value: list): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
