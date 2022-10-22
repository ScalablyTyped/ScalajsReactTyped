package typingsJapgolly.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vote extends StObject {
  
  var downs: Double
  
  var ups: Double
}
object Vote {
  
  inline def apply(downs: Double, ups: Double): Vote = {
    val __obj = js.Dynamic.literal(downs = downs.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vote]
  }
  
  extension [Self <: Vote](x: Self) {
    
    inline def setDowns(value: Double): Self = StObject.set(x, "downs", value.asInstanceOf[js.Any])
    
    inline def setUps(value: Double): Self = StObject.set(x, "ups", value.asInstanceOf[js.Any])
  }
}
