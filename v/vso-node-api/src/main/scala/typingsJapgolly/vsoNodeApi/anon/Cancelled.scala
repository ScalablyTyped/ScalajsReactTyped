package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelled extends StObject {
  
  var cancelled: scala.Double
  
  var error: scala.Double
  
  var published: scala.Double
  
  var unpublished: scala.Double
}
object Cancelled {
  
  inline def apply(cancelled: scala.Double, error: scala.Double, published: scala.Double, unpublished: scala.Double): Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelled]
  }
  
  extension [Self <: Cancelled](x: Self) {
    
    inline def setCancelled(value: scala.Double): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setError(value: scala.Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPublished(value: scala.Double): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setUnpublished(value: scala.Double): Self = StObject.set(x, "unpublished", value.asInstanceOf[js.Any])
  }
}
