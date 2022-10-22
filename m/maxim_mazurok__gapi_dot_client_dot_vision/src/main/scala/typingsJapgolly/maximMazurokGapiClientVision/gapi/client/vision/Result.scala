package typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  /** The resource name of the image from the product that is the closest match to the query. */
  var image: js.UndefOr[String] = js.undefined
  
  /** The Product. */
  var product: js.UndefOr[Product] = js.undefined
  
  /** A confidence level on the match, ranging from 0 (no confidence) to 1 (full confidence). */
  var score: js.UndefOr[Double] = js.undefined
}
object Result {
  
  inline def apply(): Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
